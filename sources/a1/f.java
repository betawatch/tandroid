package a1;

import a3.o;
import ai.j2;
import ai.o1;
import ai.o4;
import ai.q2;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.a0;
import bi.a1;
import bi.j0;
import bi.s;
import bi.t;
import bi.x;
import c3.i0;
import d2.a2;
import g2.n0;
import ii.y3;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import k2.b0;
import k2.c0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.hm0;
import p4.q;
import v0.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0310, code lost:
    
        if (r8 == null) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        RLottieNative rLottieNative;
        bi.e eVar;
        int i3 = 2;
        Bitmap bitmap = null;
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z10 = false;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((v0.h) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((v0.h) this.b, (r) this.c);
                return;
            case 2:
                ai.f fVar = (ai.f) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                fVar.getClass();
                onClickListener.onClick(fVar);
                return;
            case 3:
                ((j2) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 4:
                q2 q2Var = (q2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                q2Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                q2Var.G.setVisibility(8);
                return;
            case 5:
                vp0 vp0Var = (vp0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                vp0Var.h(tL_starGiftCollection.title, new o1(i3, vp0Var, tL_starGiftCollection));
                return;
            case 6:
                o4 o4Var = (o4) this.b;
                g0.g((String) this.c);
                fc.a0(o4Var.a.a).k(false).j();
                return;
            case 7:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 8:
                ((v0.h) this.b).a(this.c);
                return;
            case 9:
                ((v0.h) this.b).onResult((n) this.c);
                return;
            case 10:
                s sVar = (s) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    sVar.e();
                    return;
                } else {
                    sVar.getClass();
                    return;
                }
            case 11:
                t tVar = (t) this.b;
                File file = (File) this.c;
                int i11 = tVar.c;
                try {
                    rLottieNative = RLottieNative.a(file.getAbsolutePath(), null, null, null, 0, null);
                    if (rLottieNative != null) {
                        try {
                            Bitmap.Config config = Bitmap.Config.ARGB_8888;
                            Bitmap createBitmap = Bitmap.createBitmap(i11, i11, config);
                            rLottieNative.c(0, createBitmap, true);
                            Bitmap createBitmap2 = Bitmap.createBitmap(i11, i11, config);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            new Canvas(createBitmap2).drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                            createBitmap.recycle();
                            createBitmap2.setHasMipMap(true);
                            rLottieNative.d();
                            bitmap = createBitmap2;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                a8.g(th, true);
                                break;
                            } finally {
                                if (rLottieNative != null) {
                                    rLottieNative.d();
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rLottieNative = null;
                }
                g0.h3(new f(12, tVar, bitmap));
                return;
            case 12:
                t tVar2 = (t) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                tVar2.h = true;
                if (tVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        tVar2.d.a(bitmap2);
                        return;
                    }
                    return;
                }
            case 13:
                a0 a0Var = (a0) this.b;
                q qVar = (q) this.c;
                if (a0Var.W) {
                    return;
                }
                a0Var.e();
                a0Var.a.o((String) qVar.a);
                return;
            case 14:
                o oVar = (o) this.b;
                q qVar2 = (q) this.c;
                a0 a0Var2 = (a0) oVar.b;
                if (a0Var2.m0 || a0Var2.W || a0Var2.V) {
                    return;
                }
                a0Var2.m0 = true;
                a0Var2.i0 = false;
                a0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) qVar2.b;
                r4 = pointFArr.length >= 3 ? 1 : 0;
                if (r4 != 0) {
                    a0Var2.n0 = pointFArr;
                    a0Var2.invalidate();
                }
                g0.i3(new f(13, a0Var2, qVar2), r4 != 0 ? 450L : 0L);
                return;
            case 15:
                j0.Z((j0) this.b, (AnimatorSet) this.c);
                return;
            case 16:
                j0 j0Var = (j0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(g0.E0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                bitmap3.recycle();
                if (z10) {
                    g0.h3(new f(18, j0Var, file2));
                    return;
                }
                return;
            case 17:
                final j0 j0Var2 = (j0) this.b;
                a0 a0Var3 = (a0) this.c;
                if (a0.d(j0Var2.getParentActivity())) {
                    a0Var3.e();
                    x xVar = new x(i10);
                    u10 u10Var = new u10() { // from class: bi.e0
                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            int i12 = r2;
                            j0 j0Var3 = j0Var2;
                            switch (i12) {
                                case 0:
                                    String str = (String) obj;
                                    if (j0Var3.getParentActivity() != null) {
                                        sf.c.t(j0Var3.getParentActivity(), str);
                                        break;
                                    }
                                    break;
                                default:
                                    a1 a1Var = j0Var3.d;
                                    if (a1Var != null && !j0Var3.isFinished) {
                                        a1Var.d1(R.drawable.msg_download, bd.M0(2131746479, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    hm0 hm0Var = new hm0(10, false, false, null);
                    hm0Var.H = 1;
                    hm0Var.I = false;
                    hm0Var.y = false;
                    hm0Var.W = new android.support.v4.media.session.a0(xVar, j0Var2, u10Var, 11);
                    j0Var2.presentFragment(hm0Var);
                    return;
                }
                return;
            case 18:
                final j0 j0Var3 = (j0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = j0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new u10() { // from class: bi.e0
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        int i12 = i10;
                        j0 j0Var32 = j0Var3;
                        switch (i12) {
                            case 0:
                                String str = (String) obj;
                                if (j0Var32.getParentActivity() != null) {
                                    sf.c.t(j0Var32.getParentActivity(), str);
                                    break;
                                }
                                break;
                            default:
                                a1 a1Var = j0Var32.d;
                                if (a1Var != null && !j0Var32.isFinished) {
                                    a1Var.d1(R.drawable.msg_download, bd.M0(2131746479, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 19:
                a1 a1Var = (a1) this.b;
                bi.e eVar2 = (bi.e) this.c;
                bi.f fVar2 = a1Var.t0;
                if (fVar2.q == 2 && fVar2.o < 1.0f) {
                    fVar2.m = eVar2;
                    a1Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                a1Var.q2 = a1.j(a1Var.o2, 0.03f, 0.005f);
                a1Var.o2 = currentAnimationTimeMillis;
                bi.e eVar3 = fVar2.m;
                if (eVar3 == null) {
                    fVar2.m = eVar2;
                    fVar2.n = null;
                    fVar2.o = 1.0f;
                    return;
                }
                int i12 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (fVar2.o < 1.0f && (eVar = fVar2.n) != null) {
                    eVar3 = eVar;
                }
                fVar2.n = eVar3;
                fVar2.m = eVar2;
                fVar2.o = 0.0f;
                fVar2.q = i12;
                fVar2.p = System.currentTimeMillis();
                boolean[] zArr = fVar2.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i13 = fVar2.n.e;
                    if (length >= i13 * i13) {
                        Arrays.fill(zArr, false);
                        fVar2.G = i12 == 1;
                        return;
                    }
                }
                int i14 = fVar2.n.e;
                fVar2.s = new boolean[i14 * i14];
                fVar2.G = i12 == 1;
                return;
            case 20:
                g0.h3(new f(21, (u10) this.c, bi.f.c((String) this.b, g0.L(240.0f), dc.b.c, 0.75f, null)));
                return;
            case 21:
                ((u10) this.b).a((bi.e) this.c);
                return;
            case 22:
                ((c1.e) this.b).e().a(((r) this.c).a);
                return;
            case 23:
                ((c1.e) this.b).e().a((w0.h) this.c);
                return;
            case 24:
                ((c1.e) this.b).e().onResult((n) this.c);
                return;
            case 25:
                ((c3.e) ((q) this.b).b).h.f((a2) this.c);
                return;
            case 26:
                tf.b bVar = (tf.b) this.b;
                k2.c cVar = (k2.c) this.c;
                i0 i0Var = (i0) bVar.b;
                String str = n0.a;
                q.d(((c0) i0Var).a.G, cVar);
                return;
            case 27:
                tf.b bVar2 = (tf.b) this.b;
                a2 a2Var = (a2) this.c;
                i0 i0Var2 = (i0) bVar2.b;
                String str2 = n0.a;
                k2.i0 i0Var3 = ((c0) i0Var2).a;
                i0Var3.k0 = a2Var;
                i0Var3.m.e(25, new b0(a2Var));
                return;
            case 28:
                tf.b bVar3 = (tf.b) this.b;
                Exception exc = (Exception) this.c;
                i0 i0Var4 = (i0) bVar3.b;
                String str3 = n0.a;
                l2.f fVar3 = ((c0) i0Var4).a.s;
                l2.a U = fVar3.U();
                fVar3.V(U, 1030, new y3(U, exc, 19));
                return;
            default:
                tf.b bVar4 = (tf.b) this.b;
                String str4 = (String) this.c;
                i0 i0Var5 = (i0) bVar4.b;
                String str5 = n0.a;
                l2.f fVar4 = ((c0) i0Var5).a.s;
                l2.a U2 = fVar4.U();
                fVar4.V(U2, 1019, new y3(U2, str4, 26));
                return;
        }
    }
}
