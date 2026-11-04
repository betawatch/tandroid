package h6;

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
import b8.jb;
import b8.ke;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.b2;
import e0.q;
import g6.o;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public static final i6.b u = new i6.b("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final g6.f c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final ke i;
    public final Resources j;
    public df.d k;
    public tf.b l;
    public e0.h m;
    public e0.h n;
    public e0.h o;
    public e0.h p;
    public e0.h q;
    public e0.h r;
    public e0.h s;
    public e0.h t;

    public f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        i6.b bVar = f6.a.l;
        m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.n;
        m.g(aVar);
        m.d("Must be called from the main thread.");
        f6.b bVar2 = aVar.e;
        m.g(bVar2);
        g6.a aVar2 = bVar2.f;
        m.g(aVar2);
        g6.f fVar = aVar2.d;
        m.g(fVar);
        this.c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.a);
        String str = fVar.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = fVar.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.I);
        this.i = new ke(context.getApplicationContext(), new g6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (w6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        b2.a(b1.v0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final e0.h a(String str) {
        int i3;
        int i10;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        g6.f fVar = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.r == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        i6.b bVar = i.a;
                        int i11 = fVar.E;
                        if (j10 == 10000) {
                            i11 = fVar.F;
                        } else if (j10 == 30000) {
                            i11 = fVar.G;
                        }
                        int i12 = fVar.S;
                        if (j10 == 10000) {
                            i12 = fVar.T;
                        } else if (j10 == 30000) {
                            i12 = fVar.U;
                        }
                        this.r = new e0.g(i11, broadcast, resources.getString(i12)).b();
                    }
                    return this.r;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z10 = this.k.c;
                    if (this.o == null) {
                        if (z10) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        }
                        this.o = new e0.g(fVar.r, pendingIntent, resources.getString(fVar.N)).b();
                    }
                    return this.o;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z11 = this.k.d;
                    if (this.p == null) {
                        if (z11) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        }
                        this.p = new e0.g(fVar.s, pendingIntent, resources.getString(fVar.O)).b();
                    }
                    return this.p;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        this.t = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(fVar.V)).b();
                    }
                    return this.t;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.s == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        this.s = new e0.g(fVar.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(fVar.V, "")).b();
                    }
                    return this.s;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    df.d dVar = this.k;
                    int i13 = dVar.b;
                    if (!dVar.a) {
                        if (this.m == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            this.m = new e0.g(fVar.n, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(fVar.M)).b();
                        }
                        return this.m;
                    }
                    if (this.n == null) {
                        if (i13 == 2) {
                            i3 = fVar.f;
                            i10 = fVar.K;
                        } else {
                            i3 = fVar.h;
                            i10 = fVar.L;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        this.n = new e0.g(i3, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(i10)).b();
                    }
                    return this.n;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.q == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        i6.b bVar2 = i.a;
                        int i14 = fVar.w;
                        if (j10 == 10000) {
                            i14 = fVar.x;
                        } else if (j10 == 30000) {
                            i14 = fVar.y;
                        }
                        int i15 = fVar.P;
                        if (j10 == 10000) {
                            i15 = fVar.Q;
                        } else if (j10 == 30000) {
                            i15 = fVar.R;
                        }
                        this.q = new e0.g(i14, broadcast2, resources.getString(i15)).b();
                    }
                    return this.q;
                }
                break;
        }
        i6.b bVar3 = u;
        Log.e(bVar3.a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        e0.h a10;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        tf.b bVar = this.l;
        Bitmap bitmap = bVar == null ? null : (Bitmap) bVar.b;
        Context context = this.a;
        q qVar = new q(context, "cast_media_notification");
        qVar.j(bitmap);
        g6.f fVar = this.c;
        qVar.F.icon = fVar.e;
        qVar.e = q.d((String) this.k.f);
        int i3 = 0;
        qVar.f = q.d(this.j.getString(fVar.J, (String) this.k.g));
        qVar.h(2, true);
        qVar.k = false;
        qVar.x = 1;
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
                    for (Intent a11 = jb.a(context, component); a11 != null; a11 = jb.a(context, a11.getComponent())) {
                        arrayList.add(size, a11);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e10);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
        }
        if (activities != null) {
            qVar.g = activities;
        }
        o oVar = fVar.W;
        i6.b bVar2 = u;
        if (oVar != null) {
            bVar2.b("actionsProvider != null", new Object[0]);
            int[] b10 = i.b(oVar);
            this.g = b10 == null ? null : (int[]) b10.clone();
            ArrayList a12 = i.a(oVar);
            this.f = new ArrayList();
            if (a12 != null) {
                int size2 = a12.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = a12.get(i10);
                    i10++;
                    g6.d dVar = (g6.d) obj;
                    String str = dVar.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a10 = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a10 = new e0.g(dVar.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), dVar.c).b();
                    }
                    if (a10 != null) {
                        this.f.add(a10);
                    }
                }
            }
        } else {
            bVar2.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            ArrayList arrayList2 = fVar.a;
            int size3 = arrayList2.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e0.h a13 = a((String) obj2);
                if (a13 != null) {
                    this.f.add(a13);
                }
            }
            int[] iArr = fVar.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f;
        int size4 = arrayList3.size();
        while (i3 < size4) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            e0.h hVar = (e0.h) obj3;
            if (hVar != null) {
                qVar.b.add(hVar);
            }
        }
        b2.c cVar = new b2.c();
        cVar.e = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            cVar.e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
        if (mediaSessionCompat$Token != null) {
            cVar.f = mediaSessionCompat$Token;
        }
        qVar.n(cVar);
        notificationManager.notify("castMediaNotification", 1, qVar.b());
    }
}
