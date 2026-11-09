package a3;

import aa.d0;
import aa.g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bi.v3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.m1;
import h9.f0;
import h9.i0;
import h9.t1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import li.q3;
import org.telegram.messenger.a8;
import org.telegram.messenger.bp;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p, l5.g, tr, r1, bp {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z9;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.d0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (f2) this.e, tL_error);
    }

    @Override // l5.g
    public void b(Exception exc) {
        ha.c cVar = (ha.c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        aa.b bVar = (aa.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            int i7 = 1;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            int i10 = 0;
            new Thread(new ha.b(i10, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = g0.a;
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
                            if (i7 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                i7 = i10;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                boolean z9 = this.b;
                d0 d0Var = (d0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                q3 q3Var = (q3) this.e;
                int i10 = q3Var.b;
                if (!z9) {
                    d0Var.run();
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
            case 4:
                cn cnVar = (cn) this.c;
                qp qpVar = (qp) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z10 = this.b;
                qpVar.G2 = 1;
                qp.e1().edit().putInt("secretWebpage2", cnVar.getMessagesController().G2).commit();
                cnVar.X5 = null;
                cnVar.Bb(charSequence, z10);
                break;
            case 5:
                boolean z11 = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (!z11) {
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
                cw0 cw0Var = (cw0) this.c;
                v10 v10Var = (v10) this.d;
                Context context2 = (Context) this.e;
                boolean z12 = this.b;
                String trim2 = cw0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(org.telegram.messenger.g0.O3(trim2.toString()))) {
                    org.telegram.messenger.g0.v1(cw0Var);
                    u1 u1Var2 = new u1(3, context2, z12 ? null : new di.b());
                    u1Var2.r(250L);
                    v10Var.a(trim2, new v3(u1Var2, u1Var, cw0Var, 9));
                    break;
                } else {
                    cw0Var.setErrorText(".");
                    org.telegram.messenger.g0.G3(-6.0f, cw0Var, null);
                    p2.D.a();
                    org.telegram.messenger.g0.K3(cw0Var);
                    break;
                }
                break;
        }
    }

    @Override // a3.p
    public t1 h(int i7, m1 m1Var, int[] iArr) {
        s sVar = (s) this.c;
        n nVar = (n) this.d;
        int[] iArr2 = (int[]) this.e;
        sVar.getClass();
        e eVar = new e(sVar, nVar);
        int i10 = iArr2[i7];
        f0 p10 = i0.p();
        for (int i11 = 0; i11 < m1Var.a; i11++) {
            p10.c(new i(i7, m1Var, i11, nVar, iArr[i11], this.b, eVar, i10));
        }
        return p10.f();
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        ii.f fVar = (ii.f) this.c;
        u1 u1Var = (u1) this.d;
        String str = (String) this.e;
        fVar.getClass();
        u1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        fVar.b = -j3;
        fVar.c = fVar.getMessagesController().M0(Long.valueOf(j3));
        fVar.a0(str, this.b);
    }

    public /* synthetic */ g(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
        this.e = obj3;
    }

    public /* synthetic */ g(boolean z9, Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = z9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
