package a1;

import a8.ra;
import aa.f0;
import aa.q;
import aa.u;
import aa.w;
import ab.d0;
import ab.l;
import ai.c0;
import ai.h;
import ai.i0;
import ai.l1;
import ai.s0;
import ai.x;
import ai.y;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.ab;
import bi.ea;
import bi.k0;
import bi.k7;
import bi.l0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import m.q3;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mm0;
import v0.o;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0410, code lost:
    
        if (r6 == null) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        RLottieNative rLottieNative;
        ai.g gVar;
        TLRPC.Chat M0;
        int i7 = 10;
        Bitmap bitmap = null;
        boolean z9 = false;
        r10 = false;
        r10 = false;
        r10 = false;
        boolean z10 = false;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((v0.g) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((v0.g) this.b, (r) this.c);
                return;
            case 2:
                ((q) this.b).d((String) this.c, Boolean.FALSE);
                return;
            case 3:
                u uVar = (u) this.b;
                String str = (String) this.c;
                q3 q3Var = uVar.f.d;
                q3Var.getClass();
                String b10 = ca.e.b(1024, str);
                synchronized (((AtomicMarkableReference) q3Var.g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) q3Var.g).getReference();
                        if (b10 != null) {
                            z9 = b10.equals(str2);
                        } else if (str2 == null) {
                            z9 = true;
                        }
                        if (z9) {
                            return;
                        }
                        ((AtomicMarkableReference) q3Var.g).set(b10, true);
                        ((ba.e) q3Var.b).b.a(new ab(q3Var, 6));
                        return;
                    } finally {
                    }
                }
            case 4:
                u uVar2 = (u) this.b;
                Throwable th2 = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                q qVar = uVar2.f;
                Thread currentThread = Thread.currentThread();
                qVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                w wVar = qVar.n;
                if (wVar == null || !wVar.e.get()) {
                    long j3 = currentTimeMillis / 1000;
                    String g10 = qVar.g();
                    if (g10 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    ca.c cVar = new ca.c(g10, j3, map);
                    f0 f0Var = qVar.m;
                    f0Var.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(g10);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    f0Var.g(th2, currentThread, "error", cVar, false);
                    return;
                }
                return;
            case 5:
                ((l) this.b).a((Intent) this.c);
                return;
            case 6:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                d0 d0Var = FirebaseMessaging.m;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 7:
                ab.u uVar3 = (ab.u) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(uVar3.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 8:
                x xVar = (x) this.b;
                if (((TLRPC.Document) this.c) != null) {
                    xVar.e();
                    return;
                } else {
                    xVar.getClass();
                    return;
                }
            case 9:
                y yVar = (y) this.b;
                File file = (File) this.c;
                int i11 = yVar.c;
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
                        } catch (Throwable th3) {
                            th = th3;
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
                } catch (Throwable th4) {
                    th = th4;
                    rLottieNative = null;
                }
                g0.h3(new e(i7, yVar, bitmap));
                return;
            case 10:
                y yVar2 = (y) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                yVar2.h = true;
                if (yVar2.e) {
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        return;
                    }
                    return;
                } else {
                    if (bitmap2 != null) {
                        yVar2.d.a(bitmap2);
                        return;
                    }
                    return;
                }
            case 11:
                i0 i0Var = (i0) this.b;
                q4.q qVar2 = (q4.q) this.c;
                if (i0Var.V) {
                    return;
                }
                i0Var.e();
                i0Var.a.m((String) qVar2.b);
                return;
            case 12:
                ra raVar = (ra) this.b;
                q4.q qVar3 = (q4.q) this.c;
                i0 i0Var2 = (i0) raVar.b;
                if (i0Var2.l0 || i0Var2.V || i0Var2.U) {
                    return;
                }
                i0Var2.l0 = true;
                i0Var2.h0 = false;
                i0Var2.performHapticFeedback(3, 2);
                PointF[] pointFArr = (PointF[]) qVar3.c;
                Object[] objArr = pointFArr.length >= 3 ? 1 : null;
                if (objArr != null) {
                    i0Var2.m0 = pointFArr;
                    i0Var2.invalidate();
                }
                g0.i3(new e(11, i0Var2, qVar3), objArr != null ? 450L : 0L);
                return;
            case 13:
                s0.Z((s0) this.b, (AnimatorSet) this.c);
                return;
            case 14:
                s0 s0Var = (s0) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                File file2 = new File(g0.E0(), "qr_code_" + System.currentTimeMillis() + ".png");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        z10 = bitmap3.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                bitmap3.recycle();
                if (z10) {
                    g0.h3(new e(16, s0Var, file2));
                    return;
                }
                return;
            case 15:
                final s0 s0Var2 = (s0) this.b;
                i0 i0Var3 = (i0) this.c;
                if (i0.d(s0Var2.getParentActivity())) {
                    i0Var3.e();
                    c0 c0Var = new c0(i10);
                    final int i12 = z9 ? 1 : 0;
                    c20 c20Var = new c20() { // from class: ai.l0
                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            int i13 = i12;
                            s0 s0Var3 = s0Var2;
                            switch (i13) {
                                case 0:
                                    String str3 = (String) obj;
                                    if (s0Var3.getParentActivity() != null) {
                                        vf.c.t(s0Var3.getParentActivity(), str3);
                                        break;
                                    }
                                    break;
                                default:
                                    l1 l1Var = s0Var3.d;
                                    if (l1Var != null && !s0Var3.isFinished) {
                                        l1Var.d1(R.drawable.msg_download, hd.M0(2131746470, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    mm0 mm0Var = new mm0(10, false, false, null);
                    mm0Var.G = 1;
                    mm0Var.H = false;
                    mm0Var.y = false;
                    mm0Var.V = new a0(c0Var, s0Var2, c20Var, false, 7);
                    s0Var2.presentFragment(mm0Var);
                    return;
                }
                return;
            case 16:
                final s0 s0Var3 = (s0) this.b;
                File file3 = (File) this.c;
                Activity parentActivity = s0Var3.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                MediaController.d0(file3.getAbsolutePath(), parentActivity, 0, file3.getName(), "image/png", new c20() { // from class: ai.l0
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        int i13 = i10;
                        s0 s0Var32 = s0Var3;
                        switch (i13) {
                            case 0:
                                String str3 = (String) obj;
                                if (s0Var32.getParentActivity() != null) {
                                    vf.c.t(s0Var32.getParentActivity(), str3);
                                    break;
                                }
                                break;
                            default:
                                l1 l1Var = s0Var32.d;
                                if (l1Var != null && !s0Var32.isFinished) {
                                    l1Var.d1(R.drawable.msg_download, hd.M0(2131746470, null), null);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return;
            case 17:
                l1 l1Var = (l1) this.b;
                ai.g gVar2 = (ai.g) this.c;
                h hVar = l1Var.s0;
                if (hVar.q == 2 && hVar.o < 1.0f) {
                    hVar.m = gVar2;
                    l1Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                l1Var.p2 = l1.j(l1Var.n2, 0.03f, 0.005f);
                l1Var.n2 = currentAnimationTimeMillis;
                ai.g gVar3 = hVar.m;
                if (gVar3 == null) {
                    hVar.m = gVar2;
                    hVar.n = null;
                    hVar.o = 1.0f;
                    return;
                }
                int i13 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (hVar.o < 1.0f && (gVar = hVar.n) != null) {
                    gVar3 = gVar;
                }
                hVar.n = gVar3;
                hVar.m = gVar2;
                hVar.o = 0.0f;
                hVar.q = i13;
                hVar.p = System.currentTimeMillis();
                boolean[] zArr = hVar.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i14 = hVar.n.e;
                    if (length >= i14 * i14) {
                        Arrays.fill(zArr, false);
                        hVar.G = i13 == 1;
                        return;
                    }
                }
                int i15 = hVar.n.e;
                hVar.s = new boolean[i15 * i15];
                hVar.G = i13 == 1;
                return;
            case 18:
                g0.h3(new e(19, (c20) this.c, h.c((String) this.b, g0.L(240.0f), gc.b.c, 0.75f, null)));
                return;
            case 19:
                ((c20) this.b).a((ai.g) this.c);
                return;
            case 20:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 21:
                ((v0.g) this.b).a(this.c);
                return;
            case 22:
                ((v0.g) this.b).onResult((o) this.c);
                return;
            case 23:
                k0 k0Var = (k0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i16 = k0Var.a;
                ArrayList arrayList = k0Var.e;
                k0Var.i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    qp.s1(i16).Y3(connectedstarrefbots.users, false);
                    if (k0Var.c <= 0) {
                        arrayList.clear();
                    }
                    k0Var.c = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    k0Var.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= k0Var.c;
                } else {
                    k0Var.h = true;
                    k0Var.d = true;
                }
                k0Var.g = false;
                qs.f(i16).k(qs.L3, Long.valueOf(k0Var.b));
                return;
            case 24:
                l0 l0Var = (l0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i17 = l0Var.a;
                ArrayList arrayList2 = l0Var.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    qp.s1(i17).Y3(suggestedstarrefbots.users, false);
                    if (l0Var.c <= 0) {
                        arrayList2.clear();
                    }
                    l0Var.c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    l0Var.j = suggestedstarrefbots.next_offset;
                    l0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList2.size() >= l0Var.c;
                } else {
                    l0Var.i = true;
                    l0Var.d = true;
                }
                l0Var.h = false;
                qs.f(i17).k(qs.K3, Long.valueOf(l0Var.b));
                return;
            case 25:
                k7.g1((k7) this.b, (TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 26:
                u1 u1Var = (u1) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                u1Var.dismiss();
                f2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error == null || !"STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        k5.o(null, 2131743882, hc.a0(T), R.raw.error, 36);
                        return;
                    } else {
                        k5.o(null, 2131743881, hc.a0(T), R.raw.fire_on, 36);
                        return;
                    }
                }
                return;
            case 27:
                k7 k7Var = (k7) this.b;
                Long l10 = (Long) this.c;
                String str3 = "";
                if (l10.longValue() < 0 && (M0 = qp.s1(k7Var.a).M0(Long.valueOf(-l10.longValue()))) != null) {
                    str3 = M0.title;
                }
                cc Q = k7Var.k().Q(R.raw.contact_check, 36, g0.X2(TextUtils.isEmpty(str3) ? hd.M0(2131749615, null) : hd.a0(null, null, 2131749616, str3)));
                Q.t = true;
                Q.j();
                return;
            case 28:
                k7 k7Var2 = (k7) this.b;
                if (((ea) this.c).e) {
                    k7Var2.c2.setLoading(false);
                    k7Var2.t1();
                    return;
                } else {
                    cc Q2 = k7Var2.k().Q(R.raw.error, 36, hd.a0(null, null, 2131743879, "NO_BALANCE"));
                    Q2.t = true;
                    Q2.j();
                    return;
                }
            default:
                qp.s1(((k7) this.b).a).O3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
        }
    }

    public /* synthetic */ e(u uVar, Throwable th2) {
        this.a = 4;
        Map map = Collections.EMPTY_MAP;
        this.b = uVar;
        this.c = th2;
    }
}
