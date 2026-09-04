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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c0 {
    public static int d;
    public final v a;
    public final pf.b b;
    public final ArrayList c = new ArrayList();

    public c0(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i10 = p4.e0.b;
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
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.a = new z(context, str);
        } else if (i11 >= 28) {
            this.a = new x(context, str);
        } else if (i11 >= 22) {
            this.a = new w(context, str);
        } else {
            this.a = new v(context, str);
        }
        d(new p(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.a.a.setMediaButtonReceiver(pendingIntent);
        this.b = new pf.b(context, this.a.c);
        if (d == 0) {
            d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(c0.class.getClassLoader());
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
        v vVar = this.a;
        MediaSession mediaSession = vVar.a;
        vVar.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e7) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
            }
        }
        mediaSession.setCallback(null);
        vVar.b.a.set(null);
        mediaSession.release();
    }

    public final void c(boolean z10) {
        this.a.a.setActive(z10);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p4.a) obj).getClass();
        }
    }

    public final void d(s sVar, Handler handler) {
        v vVar = this.a;
        if (sVar == null) {
            vVar.f(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        vVar.f(sVar, handler);
    }

    public final void e(MediaMetadataCompat mediaMetadataCompat) {
        v vVar = this.a;
        vVar.h = mediaMetadataCompat;
        MediaSession mediaSession = vVar.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public final void f(PlaybackStateCompat playbackStateCompat) {
        PlaybackState playbackState;
        v vVar = this.a;
        vVar.f = playbackStateCompat;
        synchronized (vVar.d) {
            for (int beginBroadcast = vVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) vVar.e.getBroadcastItem(beginBroadcast)).D0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            vVar.e.finishBroadcast();
        }
        MediaSession mediaSession = vVar.a;
        if (playbackStateCompat == null) {
            playbackState = null;
        } else {
            if (playbackStateCompat.w == null) {
                PlaybackState.Builder d10 = d0.d();
                d0.x(d10, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.n);
                d0.u(d10, playbackStateCompat.c);
                d0.s(d10, playbackStateCompat.e);
                d0.v(d10, playbackStateCompat.h);
                ArrayList arrayList = playbackStateCompat.r;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj;
                    PlaybackState.CustomAction customAction2 = customAction.e;
                    if (customAction2 == null) {
                        PlaybackState.CustomAction.Builder e7 = d0.e(customAction.a, customAction.b, customAction.c);
                        d0.w(e7, customAction.d);
                        customAction2 = d0.b(e7);
                    }
                    d0.a(d10, customAction2);
                }
                d0.t(d10, playbackStateCompat.s);
                if (Build.VERSION.SDK_INT >= 22) {
                    e0.b(d10, playbackStateCompat.v);
                }
                playbackStateCompat.w = d0.c(d10);
            }
            playbackState = playbackStateCompat.w;
        }
        mediaSession.setPlaybackState(playbackState);
    }

    public final void g(ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) obj;
                if (mediaSessionCompat$QueueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                long j3 = mediaSessionCompat$QueueItem.b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    Log.e("MediaSessionCompat", a4.a.o(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        v vVar = this.a;
        MediaSession mediaSession = vVar.a;
        vVar.g = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem2 = (MediaSessionCompat$QueueItem) obj2;
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem2.c;
            if (queueItem == null) {
                queueItem = a0.a(mediaSessionCompat$QueueItem2.a.b(), mediaSessionCompat$QueueItem2.b);
                mediaSessionCompat$QueueItem2.c = queueItem;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public final void h(int i10) {
        v vVar = this.a;
        if (vVar.i != i10) {
            vVar.i = i10;
            synchronized (vVar.d) {
                for (int beginBroadcast = vVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) vVar.e.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i10);
                    } catch (RemoteException unused) {
                    }
                }
                vVar.e.finishBroadcast();
            }
        }
    }

    public final void i(int i10) {
        v vVar = this.a;
        if (vVar.j != i10) {
            vVar.j = i10;
            synchronized (vVar.d) {
                for (int beginBroadcast = vVar.e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((b) vVar.e.getBroadcastItem(beginBroadcast)).h(i10);
                    } catch (RemoteException unused) {
                    }
                }
                vVar.e.finishBroadcast();
            }
        }
    }
}
