package f6;

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
import bi.u6;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import e0.k;
import e0.t;
import e6.q;
import java.util.ArrayList;
import java.util.Arrays;
import n6.l;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import v7.x6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g {
    public static final g6.b u = new g6.b("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final e6.f c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final u6 i;
    public final Resources j;
    public f k;
    public of.b l;
    public k m;
    public k n;
    public k o;
    public k p;
    public k q;
    public k r;
    public k s;
    public k t;

    public g(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        g6.b bVar = d6.a.l;
        l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        d6.b bVar2 = aVar.e;
        l.h(bVar2);
        e6.a aVar2 = bVar2.f;
        l.h(aVar2);
        e6.f fVar = aVar2.d;
        l.h(fVar);
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
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.H);
        this.i = new u6(context.getApplicationContext(), new e6.b(1, dimensionPixelSize, dimensionPixelSize));
        if (u6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        f2.a(f1.u0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j3 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        e6.f fVar = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.r == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, a0.a | TLObject.FLAG_27);
                        g6.b bVar = j.a;
                        int i12 = fVar.y;
                        if (j3 == 10000) {
                            i12 = fVar.E;
                        } else if (j3 == 30000) {
                            i12 = fVar.F;
                        }
                        int i13 = fVar.R;
                        if (j3 == 10000) {
                            i13 = fVar.S;
                        } else if (j3 == 30000) {
                            i13 = fVar.T;
                        }
                        this.r = new e0.j(i12, resources.getString(i13), broadcast).b();
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
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, a0.a);
                        }
                        this.o = new e0.j(fVar.r, resources.getString(fVar.M), pendingIntent).b();
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
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, a0.a);
                        }
                        this.p = new e0.j(fVar.s, resources.getString(fVar.N), pendingIntent).b();
                    }
                    return this.p;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.t == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        this.t = new e0.j(fVar.G, resources.getString(fVar.U), PendingIntent.getBroadcast(context, 0, intent4, a0.a)).b();
                    }
                    return this.t;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.s == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        this.s = new e0.j(fVar.G, resources.getString(fVar.U, ""), PendingIntent.getBroadcast(context, 0, intent5, a0.a)).b();
                    }
                    return this.s;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    f fVar2 = this.k;
                    int i14 = fVar2.a;
                    if (!fVar2.b) {
                        if (this.m == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            this.m = new e0.j(fVar.n, resources.getString(fVar.L), PendingIntent.getBroadcast(context, 0, intent6, a0.a)).b();
                        }
                        return this.m;
                    }
                    if (this.n == null) {
                        if (i14 == 2) {
                            i10 = fVar.f;
                            i11 = fVar.J;
                        } else {
                            i10 = fVar.h;
                            i11 = fVar.K;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        this.n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent7, a0.a)).b();
                    }
                    return this.n;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.q == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, a0.a | TLObject.FLAG_27);
                        g6.b bVar2 = j.a;
                        int i15 = fVar.v;
                        if (j3 == 10000) {
                            i15 = fVar.w;
                        } else if (j3 == 30000) {
                            i15 = fVar.x;
                        }
                        int i16 = fVar.O;
                        if (j3 == 10000) {
                            i16 = fVar.P;
                        } else if (j3 == 30000) {
                            i16 = fVar.Q;
                        }
                        this.q = new e0.j(i15, resources.getString(i16), broadcast2).b();
                    }
                    return this.q;
                }
                break;
        }
        g6.b bVar3 = u;
        Log.e(bVar3.a, bVar3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        k a2;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        of.b bVar = this.l;
        Bitmap bitmap = bVar == null ? null : (Bitmap) bVar.c;
        Context context = this.a;
        t tVar = new t(context, "cast_media_notification");
        tVar.j(bitmap);
        e6.f fVar = this.c;
        tVar.E.icon = fVar.e;
        tVar.e = t.d((String) this.k.f);
        int i10 = 0;
        tVar.f = t.d(this.j.getString(fVar.I, (String) this.k.g));
        tVar.h(2, true);
        tVar.k = false;
        tVar.x = 1;
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
                    for (Intent a10 = x6.a(context, component); a10 != null; a10 = x6.a(context, a10.getComponent())) {
                        arrayList.add(size, a10);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            int i11 = a0.a | TLObject.FLAG_27;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
        }
        if (activities != null) {
            tVar.g = activities;
        }
        q qVar = fVar.V;
        g6.b bVar2 = u;
        if (qVar != null) {
            bVar2.b("actionsProvider != null", new Object[0]);
            int[] b10 = j.b(qVar);
            this.g = b10 == null ? null : (int[]) b10.clone();
            ArrayList a11 = j.a(qVar);
            this.f = new ArrayList();
            if (a11 != null) {
                int size2 = a11.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = a11.get(i12);
                    i12++;
                    e6.d dVar = (e6.d) obj;
                    String str = dVar.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a2 = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a2 = new e0.j(dVar.b, dVar.c, PendingIntent.getBroadcast(context, 0, intent2, a0.a)).b();
                    }
                    if (a2 != null) {
                        this.f.add(a2);
                    }
                }
            }
        } else {
            bVar2.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            ArrayList arrayList2 = fVar.a;
            int size3 = arrayList2.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                k a12 = a((String) obj2);
                if (a12 != null) {
                    this.f.add(a12);
                }
            }
            int[] iArr = fVar.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f;
        int size4 = arrayList3.size();
        while (i10 < size4) {
            Object obj3 = arrayList3.get(i10);
            i10++;
            k kVar = (k) obj3;
            if (kVar != null) {
                tVar.b.add(kVar);
            }
        }
        z1.c cVar = new z1.c();
        cVar.e = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            cVar.e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
        if (mediaSessionCompat$Token != null) {
            cVar.f = mediaSessionCompat$Token;
        }
        tVar.n(cVar);
        notificationManager.notify("castMediaNotification", 1, tVar.b());
    }
}
