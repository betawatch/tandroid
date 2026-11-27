package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class a {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.b);
        this.a = mediaController;
        if (mediaSessionCompat$Token.a() == null) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(null);
            mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, mediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e;
        if (mediaSessionCompat$Token.a() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yu6 yu6Var = (yu6) obj;
            wo6 wo6Var = new wo6(yu6Var);
            this.d.put(yu6Var, wo6Var);
            yu6Var.c = wo6Var;
            try {
                mediaSessionCompat$Token.a().F(wo6Var);
                yu6Var.e(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(yu6 yu6Var) {
        this.a.unregisterCallback(yu6Var.a);
        synchronized (this.b) {
            if (this.e.a() != null) {
                try {
                    wo6 wo6Var = (wo6) this.d.remove(yu6Var);
                    if (wo6Var != null) {
                        yu6Var.c = null;
                        this.e.a().C(wo6Var);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(yu6Var);
            }
        }
    }
}
