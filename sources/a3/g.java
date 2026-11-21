package a3;

import aa.c0;
import aa.f0;
import ai.p0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.m1;
import fi.l4;
import h9.i0;
import h9.t1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oi.q3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.or;
import org.telegram.messenger.q10;
import org.telegram.messenger.q2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p, ai.f, l5.g, or, q1, xo {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // l5.g
    public void a(Exception exc) {
        ha.b bVar = (ha.b) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        aa.b bVar2 = (aa.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new l4(29, bVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = f0.a;
            boolean z11 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
            }
        }
        taskCompletionSource.trySetResult(bVar2);
    }

    @Override // ai.f
    public void c(TLRPC.TL_error tL_error, String str) {
        p0 p0Var = (p0) this.c;
        ai.g gVar = (ai.g) this.d;
        ai.g gVar2 = (ai.g) this.e;
        if (p0Var.r != 4) {
            return;
        }
        if (str != null) {
            g0.h3(new aa.r(p0Var, str, gVar2, 4), Math.max(0L, (p0Var.V + 1200) - SystemClock.uptimeMillis()));
            return;
        }
        p0Var.r = 3;
        p0Var.K = gVar;
        p0Var.F.f(false);
        p0Var.f(0L, 240L);
        if (!this.b) {
            p0Var.J = null;
        }
        p0Var.w.d(gVar.a(), false);
        p0Var.w.setRevert(p0Var.J != null);
        p0Var.D(false);
        p0.G(tL_error);
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        return ProfileActivity.d0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (g2) this.e, tL_error);
    }

    @Override // a3.p
    public t1 f(int i7, m1 m1Var, int[] iArr) {
        s sVar = (s) this.c;
        n nVar = (n) this.d;
        int[] iArr2 = (int[]) this.e;
        sVar.getClass();
        e eVar = new e(sVar, nVar);
        int i10 = iArr2[i7];
        h9.f0 p10 = i0.p();
        for (int i11 = 0; i11 < m1Var.a; i11++) {
            p10.c(new i(i7, m1Var, i11, nVar, iArr[i11], this.b, eVar, i10));
        }
        return p10.f();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 4:
                boolean z10 = this.b;
                c0 c0Var = (c0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                q3 q3Var = (q3) this.e;
                int i10 = q3Var.b;
                if (!z10) {
                    c0Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = q3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d2 = q3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d2 == null || i10 < 0 || i10 >= d2.buttons.size()) ? null : d2.buttons.get(i10);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            q3Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 5:
                bn bnVar = (bn) this.c;
                mp mpVar = (mp) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z11 = this.b;
                mpVar.J2 = 1;
                mp.g1().edit().putInt("secretWebpage2", bnVar.getMessagesController().J2).commit();
                bnVar.Z5 = null;
                bnVar.Cb(charSequence, z11);
                break;
            case 6:
                boolean z12 = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (!z12) {
                    atomicBoolean.set(true);
                    aVar.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + t0.b.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
            default:
                nw0 nw0Var = (nw0) this.c;
                q10 q10Var = (q10) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.b;
                String trim2 = nw0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(g0.M3(trim2.toString()))) {
                    g0.v1(nw0Var);
                    org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, context2, z13 ? null : new fi.b());
                    t1Var2.r(250L);
                    q10Var.a(trim2, new bi.j(t1Var2, t1Var, nw0Var, 14));
                    break;
                } else {
                    nw0Var.setErrorText(".");
                    g0.E3(-6.0f, nw0Var, null);
                    q2.E.a();
                    g0.I3(nw0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        li.g gVar = (li.g) this.c;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.d;
        String str = (String) this.e;
        gVar.getClass();
        t1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        gVar.b = -j3;
        gVar.c = gVar.getMessagesController().O0(Long.valueOf(j3));
        gVar.a0(str, this.b);
    }

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ g(boolean z10, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
