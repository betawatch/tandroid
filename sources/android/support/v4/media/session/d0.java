package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import c2.k0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 {
    public static int d;
    public final w a;
    public final p b;
    public final ArrayList c = new ArrayList();

    public d0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i9 = k0.a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (queryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.a = new a0(context, str);
        } else if (i10 >= 28) {
            this.a = new y(context, str);
        } else if (i10 >= 22) {
            this.a = new x(context, str);
        } else {
            this.a = new w(context, str);
        }
        d(new q(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.a.a.setMediaButtonReceiver(pendingIntent);
        this.b = new p(context, this);
        if (d == 0) {
            d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(d0.class.getClassLoader());
        }
    }

    public static Bundle j(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final void b() {
        w wVar = this.a;
        MediaSession mediaSession = wVar.a;
        wVar.d = true;
        wVar.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        mediaSession.setCallback(null);
        mediaSession.release();
    }

    public final void c(boolean z10) {
        this.a.a.setActive(z10);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((c2.a) obj).getClass();
        }
    }

    public final void d(t tVar, Handler handler) {
        w wVar = this.a;
        if (tVar == null) {
            wVar.f(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        wVar.f(tVar, handler);
    }

    public final void e(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        w wVar = this.a;
        wVar.h = mediaMetadataCompat;
        MediaSession mediaSession = wVar.a;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.b == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.b;
        }
        mediaSession.setMetadata(mediaMetadata);
    }

    public final void f(PlaybackStateCompat playbackStateCompat) {
        PlaybackState playbackState;
        w wVar = this.a;
        wVar.f = playbackStateCompat;
        synchronized (wVar.c) {
            for (int beginBroadcast = wVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) wVar.e.getBroadcastItem(beginBroadcast)).C0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            wVar.e.finishBroadcast();
        }
        MediaSession mediaSession = wVar.a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.w == null) {
                PlaybackState.Builder d9 = e0.d();
                e0.x(d9, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.n);
                e0.u(d9, playbackStateCompat.c);
                e0.s(d9, playbackStateCompat.e);
                e0.v(d9, playbackStateCompat.h);
                ArrayList arrayList = playbackStateCompat.r;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj;
                    PlaybackState.CustomAction customAction2 = customAction.e;
                    if (customAction2 == null) {
                        PlaybackState.CustomAction.Builder e10 = e0.e(customAction.a, customAction.b, customAction.c);
                        e0.w(e10, customAction.d);
                        customAction2 = e0.b(e10);
                    }
                    e0.a(d9, customAction2);
                }
                e0.t(d9, playbackStateCompat.s);
                if (Build.VERSION.SDK_INT >= 22) {
                    f0.b(d9, playbackStateCompat.v);
                }
                playbackStateCompat.w = e0.c(d9);
            }
            playbackState = playbackStateCompat.w;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void g(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it.next();
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j10 = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    Log.e("MediaSessionCompat", aa.d.m(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        w wVar = this.a;
        MediaSession mediaSession = wVar.a;
        wVar.g = list;
        if (list == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
            if (queueItem == null) {
                queueItem = b0.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList.add(queueItem);
        }
        mediaSession.setQueue(arrayList);
    }

    public final void h(int i9) {
        w wVar = this.a;
        if (wVar.i != i9) {
            wVar.i = i9;
            synchronized (wVar.c) {
                for (int beginBroadcast = wVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) wVar.e.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i9);
                    } catch (RemoteException unused) {
                    }
                }
                wVar.e.finishBroadcast();
            }
        }
    }

    public final void i(int i9) {
        w wVar = this.a;
        if (wVar.j != i9) {
            wVar.j = i9;
            synchronized (wVar.c) {
                for (int beginBroadcast = wVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) wVar.e.getBroadcastItem(beginBroadcast)).l0(i9);
                    } catch (RemoteException unused) {
                    }
                }
                wVar.e.finishBroadcast();
            }
        }
    }
}
