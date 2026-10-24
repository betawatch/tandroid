package ei;

import ai.xc;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.a = 15;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Bitmap bitmap = null;
        int i10 = 2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = ecVar.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(ecVar.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(ecVar.f, ecVar.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(ecVar.f / bitmap.getWidth(), ecVar.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (ecVar.h) {
                            if (ecVar.m == null) {
                                ecVar.m = new Path();
                            }
                            ecVar.m.rewind();
                            ecVar.m.addCircle(ecVar.f / 2.0f, ecVar.g / 2.0f, Math.min(ecVar.f, ecVar.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(ecVar.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, ecVar.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new p6(12, ecVar, bitmap));
                return;
            case 1:
                xc xcVar = (xc) this.b;
                xcVar.getClass();
                try {
                    mm0 currentListView = ((fi.g) xcVar.M0).T.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((gi.f0) this.b).invalidateSelf();
                return;
            case 3:
                ((gi.g0) this.b).invalidateSelf();
                return;
            case 4:
                ((gi.i0) this.b).d();
                return;
            case 5:
                ((gi.v0) this.b).c();
                return;
            case 6:
                ((gi.v0) this.b).c();
                return;
            case 7:
                ((gi.w0) this.b).a();
                return;
            case 8:
                ((gi.x0) this.b).a();
                return;
            case 9:
                ((gi.c3) this.b).invalidate();
                return;
            case 10:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 11:
                gi.e4 e4Var = (gi.e4) this.b;
                e4Var.Q = e4Var.r;
                return;
            case 12:
                ((e2.j0) this.b).getClass();
                return;
            case 13:
                ci.t6 t6Var = ((hg.n1) this.b).y;
                if (t6Var != null) {
                    t6Var.p(3, true);
                    return;
                }
                return;
            case 14:
                i2.h0 h0Var = (i2.h0) this.b;
                e2.c cVar = h0Var.C;
                Context context = h0Var.e;
                String str = e2.m0.a;
                int generateAudioSessionId = c2.i.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.c).a.getLooper()) {
                    obj = cVar.e;
                } else {
                    v7.u6.p(myLooper == ((e2.i0) cVar.b).a.getLooper());
                    obj = cVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, i11);
                    e2.i0 i0Var = (e2.i0) cVar.c;
                    if (i0Var.a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    h0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    h0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 15:
                i2.h0 h0Var2 = ((i2.b0) this.b).a;
                h0Var2.x1(null);
                h0Var2.q1(0, 0);
                return;
            case 16:
                try {
                    i2.q0.h((i2.l1) this.b);
                    return;
                } catch (i2.m e7) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 17:
                ig.c cVar2 = (ig.c) this.b;
                cVar2.d.Z2.N(true);
                cVar2.V(true);
                return;
            case 18:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.xc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 19:
                ig.j0 j0Var = (ig.j0) this.b;
                b71 b71Var = j0Var.e0;
                if (b71Var != null) {
                    b71Var.N(true);
                }
                j0Var.T(true);
                return;
            case 20:
                ig.s0 s0Var = (ig.s0) ((a6.i) this.b).b;
                s0Var.e.Z2.N(true);
                s0Var.b0();
                return;
            case 21:
                ig.u0 u0Var = (ig.u0) this.b;
                u0Var.d.Z2.N(true);
                u0Var.V(true);
                return;
            case 22:
                ig.e1 e1Var = (ig.e1) this.b;
                e1Var.a.Z2.N(true);
                e1Var.Y(true);
                return;
            case 23:
                ((ci.y2) this.b).run(Boolean.FALSE);
                return;
            case 24:
                NotificationCenter.getInstance(((ig.z1) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                j2.e eVar = (j2.e) this.b;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1028, new ih.l(l4));
                eVar.f.d();
                return;
            case 26:
                ((k2.e) this.b).c();
                return;
            case 27:
                e2.r rVar = (e2.r) this.b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.a) {
                    rVar.e(-1, new k2.f(i10));
                    return;
                }
                return;
            case 28:
                k2.t0 t0Var = (k2.t0) this.b;
                if (t0Var.a0 >= 300000) {
                    t0Var.n.j();
                    t0Var.a0 = 0L;
                    return;
                }
                return;
            default:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.b).d;
                f3Var.requestFocus();
                AndroidUtilities.showKeyboard(f3Var);
                return;
        }
    }

    public /* synthetic */ bc(i2.q0 q0Var, i2.l1 l1Var) {
        this.a = 16;
        this.b = l1Var;
    }

    public /* synthetic */ bc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
