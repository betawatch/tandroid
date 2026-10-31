package bi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cs;
import org.telegram.messenger.f8;
import org.telegram.messenger.gp;
import org.telegram.messenger.j20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements org.telegram.ui.ActionBar.u1, i5.g, gp, x2.l, cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o4(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.gp
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.e0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (org.telegram.ui.ActionBar.k2) this.e, tL_error);
    }

    @Override // x2.l
    public e9.x1 b(int i10, b2.p1 p1Var, int[] iArr) {
        x2.o oVar = (x2.o) this.c;
        x2.j jVar = (x2.j) this.d;
        int[] iArr2 = (int[]) this.e;
        oVar.getClass();
        x2.d dVar = new x2.d(oVar, jVar);
        int i11 = iArr2[i10];
        e9.k0 t10 = e9.n0.t();
        for (int i12 = 0; i12 < p1Var.a; i12++) {
            t10.c(new x2.f(i10, p1Var, i12, jVar, iArr[i12], this.b, dVar, i11));
        }
        return t10.f();
    }

    @Override // i5.g
    public void c(Exception exc) {
        da.b bVar = (da.b) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        x9.b bVar2 = (x9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new d1.e(1, bVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x9.x.a;
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

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                n4 n4Var = (n4) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                a4 a4Var = (a4) this.e;
                int i11 = a4Var.b;
                if (!z10) {
                    n4Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = a4Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = a4Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            a4Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 1:
            default:
                fx0 fx0Var = (fx0) this.c;
                j20 j20Var = (j20) this.d;
                Context context = (Context) this.e;
                boolean z11 = this.b;
                String trim2 = fx0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(org.telegram.messenger.i0.N3(trim2.toString()))) {
                    org.telegram.messenger.i0.v1(fx0Var);
                    org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, context, z11 ? null : new th.b());
                    x1Var2.r(250L);
                    j20Var.a(trim2, new kg.d0(x1Var2, x1Var, fx0Var, 4));
                    break;
                } else {
                    fx0Var.setErrorText(".");
                    org.telegram.messenger.i0.F3(-6.0f, fx0Var, null);
                    org.telegram.messenger.t2.D.a();
                    org.telegram.messenger.i0.J3(fx0Var);
                    break;
                }
                break;
            case 2:
                un unVar = (un) this.c;
                vp vpVar = (vp) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z12 = this.b;
                vpVar.G2 = 1;
                vp.d1().edit().putInt("secretWebpage2", unVar.getMessagesController().G2).commit();
                unVar.X5 = null;
                unVar.ob(charSequence, z12);
                break;
            case 3:
                boolean z13 = this.b;
                Context context2 = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (!z13) {
                    atomicBoolean.set(true);
                    aVar.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                        context2.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
        }
    }

    @Override // org.telegram.messenger.cs
    public void run(long j10) {
        yh.e eVar = (yh.e) this.c;
        org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
        String str = (String) this.e;
        eVar.getClass();
        x1Var.dismiss();
        if (j10 == 0) {
            return;
        }
        eVar.b = -j10;
        eVar.c = eVar.getMessagesController().L0(Long.valueOf(j10));
        eVar.Z(str, this.b);
    }

    public /* synthetic */ o4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ o4(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
