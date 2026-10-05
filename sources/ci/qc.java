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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qc(com.google.firebase.messaging.k kVar, Intent intent) {
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
                                            c10 = v7.r6.c(networkCountryIso);
                                            fVar.o = c10;
                                        }
                                    }
                                    c10 = v7.r6.c(Locale.getDefault().getCountry());
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
                tc tcVar = (tc) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = tcVar.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(tcVar.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(tcVar.f, tcVar.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(tcVar.f / bitmap.getWidth(), tcVar.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (tcVar.h) {
                            if (tcVar.m == null) {
                                tcVar.m = new Path();
                            }
                            tcVar.m.rewind();
                            tcVar.m.addCircle(tcVar.f / 2.0f, tcVar.g / 2.0f, Math.min(tcVar.f, tcVar.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(tcVar.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, tcVar.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x8(i10, tcVar, bitmap));
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
                di.k kVar = (di.k) this.b;
                bw0 bw0Var = kVar.S;
                if (bw0Var == null || kVar.Y == -1) {
                    return;
                }
                bw0Var.a();
                return;
            case 5:
                a();
                return;
            case 6:
                ((ei.i0) this.b).invalidateSelf();
                return;
            case 7:
                ((ei.j0) this.b).invalidateSelf();
                return;
            case 8:
                ((ei.l0) this.b).d();
                return;
            case 9:
                ((ei.y0) this.b).c();
                return;
            case 10:
                ((ei.y0) this.b).c();
                return;
            case 11:
                ((ei.z0) this.b).a();
                return;
            case 12:
                ((ei.a1) this.b).a();
                return;
            case 13:
                ((ei.k3) this.b).invalidate();
                return;
            case 14:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 15:
                ei.q4 q4Var = (ei.q4) this.b;
                q4Var.Q = q4Var.r;
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
                dVar.c.f3.N(true);
                dVar.T(true);
                return;
            case 19:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 20:
                hg.l0 l0Var = (hg.l0) this.b;
                w61 w61Var = l0Var.d0;
                if (w61Var != null) {
                    w61Var.N(true);
                }
                l0Var.R(true);
                return;
            case 21:
                hg.u0 u0Var = (hg.u0) ((xa.c) this.b).b;
                u0Var.c.f3.N(true);
                u0Var.b0();
                return;
            case 22:
                hg.w0 w0Var = (hg.w0) this.b;
                w0Var.c.f3.N(true);
                w0Var.T(true);
                return;
            case 23:
                hg.g1 g1Var = (hg.g1) this.b;
                g1Var.a.f3.N(true);
                g1Var.X(true);
                return;
            case 24:
                ((ai.e4) this.b).run(Boolean.FALSE);
                return;
            case 25:
                NotificationCenter.getInstance(((hg.b2) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
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

    public /* synthetic */ qc(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.a = 29;
        this.b = c0Var;
    }

    public /* synthetic */ qc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
