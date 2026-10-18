package e0;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.os.Build;
import b2.w0;
import e9.x1;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static Bitmap a(int i10, int i11, byte[] bArr) {
        BitmapFactory.Options options;
        int i12 = 0;
        if (i11 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i11; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw w0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            r1.g gVar = new r1.g(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (gVar.c()) {
                case 3:
                case 4:
                    i12 = 180;
                    break;
                case 5:
                case 8:
                    i12 = 270;
                    break;
                case 6:
                case 7:
                    i12 = 90;
                    break;
            }
            if (i12 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i12);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static e9.n0 b(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            e9.l0 l0Var = e9.n0.b;
            return x1.e;
        }
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new k2.f(0))));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor b10 = j2.e.b(it.next());
            if (b10.getStandard() == 1) {
                byte[] descriptor = b10.getDescriptor();
                if (descriptor.length != 3) {
                    e2.a.l("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b11 = descriptor[0];
                    int i10 = (b11 & 7) + 1;
                    if (((b11 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(e2.m0.t(i10)));
                    }
                }
            }
        }
        return e9.n0.u(treeSet);
    }

    public static Bitmap c(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static boolean d(MediaDrm mediaDrm, String str, int i10) {
        return mediaDrm.requiresSecureDecoder(str, i10);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void f(MediaDrm mediaDrm, byte[] bArr, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(a2);
    }

    public static void g(com.google.firebase.messaging.l lVar, j2.k kVar) {
        LogSessionId logSessionId;
        LogSessionId a2 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) lVar.b).setString("log-session-id", a2.getStringId());
    }

    public static void h(n4.s sVar, ComponentName componentName) {
        try {
            MediaSession mediaSession = ((n4.n) sVar.b).a;
            mediaSession.getClass();
            mediaSession.setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            e2.a.d("MediaSessionLegacyStub", "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }
}
