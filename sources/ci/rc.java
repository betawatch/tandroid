package ci;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.a = 1;
        this.b = intent;
    }

    private final void a() {
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.b;
        y2.e eVar = (y2.e) tVar.a.get();
        if (eVar != null) {
            int b10 = tVar.c.b();
            y2.f fVar = eVar.a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i10 = fVar.n;
                    if (i10 == 0 || fVar.e) {
                        if (i10 != b10 || fVar.o == null) {
                            fVar.n = b10;
                            if (b10 != 1 && b10 != 0 && b10 != 8) {
                                if (fVar.o == null) {
                                    Context context = fVar.a;
                                    String str = e2.d0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            c10 = v7.s6.c(networkCountryIso);
                                            fVar.o = c10;
                                        }
                                    }
                                    c10 = v7.s6.c(Locale.getDefault().getCountry());
                                    fVar.o = c10;
                                }
                                fVar.l = fVar.a(b10);
                                fVar.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fVar.c(fVar.g > 0 ? (int) (elapsedRealtime - fVar.h) : 0, fVar.i, fVar.l);
                                fVar.h = elapsedRealtime;
                                fVar.i = 0L;
                                fVar.k = 0L;
                                fVar.j = 0L;
                                y2.q qVar = fVar.f;
                                qVar.a.clear();
                                qVar.c = -1;
                                qVar.d = 0;
                                qVar.e = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 3;
        Bitmap bitmap = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                uc ucVar = (uc) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = ucVar.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(ucVar.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(ucVar.f, ucVar.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(ucVar.f / bitmap.getWidth(), ucVar.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (ucVar.h) {
                            if (ucVar.m == null) {
                                ucVar.m = new Path();
                            }
                            ucVar.m.rewind();
                            ucVar.m.addCircle(ucVar.f / 2.0f, ucVar.g / 2.0f, Math.min(ucVar.f, ucVar.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(ucVar.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, ucVar.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new y8(i10, ucVar, bitmap));
                return;
            case 1:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 2:
                cf.c cVar = (cf.c) this.b;
                synchronized (((ArrayDeque) cVar.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.a).edit();
                    String str = (String) cVar.b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) cVar.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) cVar.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 3:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.a.getAction() + " finishing.");
                e0Var.b.trySetResult(null);
                return;
            case 4:
                di.f fVar = (di.f) this.b;
                fVar.getClass();
                try {
                    wl0 currentListView = ((di.i) fVar.M0).R.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                ((ei.h0) this.b).invalidateSelf();
                return;
            case 7:
                ((ei.i0) this.b).invalidateSelf();
                return;
            case 8:
                ((ei.k0) this.b).d();
                return;
            case 9:
                ((ei.x0) this.b).c();
                return;
            case 10:
                ((ei.x0) this.b).c();
                return;
            case 11:
                ((ei.y0) this.b).a();
                return;
            case 12:
                ((ei.z0) this.b).a();
                return;
            case 13:
                ((ei.j3) this.b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 15:
                ei.p4 p4Var = (ei.p4) this.b;
                p4Var.Q = p4Var.r;
                return;
            case 16:
                ai.v8 v8Var = ((gg.o1) this.b).y;
                if (v8Var != null) {
                    v8Var.p(3, true);
                    return;
                }
                return;
            case 17:
                ((e2.a0) this.b).getClass();
                return;
            case 18:
                hg.d dVar = (hg.d) this.b;
                dVar.c.Y2.N(true);
                dVar.V(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.m0 m0Var = (hg.m0) this.b;
                j61 j61Var = m0Var.d0;
                if (j61Var != null) {
                    j61Var.N(true);
                }
                m0Var.T(true);
                return;
            case 21:
                hg.v0 v0Var = (hg.v0) ((a6.m) this.b).b;
                v0Var.c.Y2.N(true);
                v0Var.b0();
                return;
            case 22:
                hg.x0 x0Var = (hg.x0) this.b;
                x0Var.c.Y2.N(true);
                x0Var.V(true);
                return;
            case 23:
                hg.h1 h1Var = (hg.h1) this.b;
                h1Var.a.Y2.N(true);
                h1Var.Y(true);
                return;
            case 24:
                ((ai.e4) this.b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.c2) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 26:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                ((Context) mVar.b).unregisterReceiver((i2.b) mVar.c);
                return;
            case 27:
                i2.b bVar = (i2.b) this.b;
                if (bVar.c.a) {
                    bVar.a.a.y1(3, false);
                    return;
                }
                return;
            case 28:
                i2.f0 f0Var = (i2.f0) this.b;
                e2.c cVar2 = f0Var.E;
                Context context = f0Var.e;
                String str2 = e2.d0.a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar2.f = valueOf;
                e2.b bVar2 = new e2.b(cVar2, valueOf, i11);
                e2.z zVar = (e2.z) cVar2.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            default:
                i2.f0 f0Var2 = ((i2.c0) this.b).a;
                f0Var2.t1(null);
                f0Var2.m1(0, 0);
                return;
        }
    }

    public /* synthetic */ rc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.a = 29;
        this.b = c0Var;
    }

    public /* synthetic */ rc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
