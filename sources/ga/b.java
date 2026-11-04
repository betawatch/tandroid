package ga;

import ai.m;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import ci.u8;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.o1;
import g9.f0;
import g9.i0;
import g9.s1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k5.g;
import mi.q3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.lr;
import org.telegram.messenger.n10;
import org.telegram.messenger.p2;
import org.telegram.messenger.so;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
import z2.d;
import z2.e;
import z2.i;
import z2.k;
import z2.n;
import z9.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, lr, p1, so, k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        return ProfileActivity.f0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (d2) this.e, tL_error);
    }

    @Override // k5.g
    public void b(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        z9.b bVar = (z9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new g2.c(6, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = y.a;
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
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // z2.k
    public s1 c(int i3, o1 o1Var, int[] iArr) {
        n nVar = (n) this.c;
        i iVar = (i) this.d;
        int[] iArr2 = (int[]) this.e;
        nVar.getClass();
        d dVar = new d(nVar, iVar);
        int i10 = iArr2[i3];
        f0 p10 = i0.p();
        for (int i11 = 0; i11 < o1Var.a; i11++) {
            p10.c(new e(i3, o1Var, i11, iVar, iArr[i11], this.b, dVar, i10));
        }
        return p10.f();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 2:
                boolean z10 = this.b;
                u8 u8Var = (u8) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                q3 q3Var = (q3) this.e;
                int i10 = q3Var.b;
                if (!z10) {
                    u8Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = q3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = q3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i10 < 0 || i10 >= d10.buttons.size()) ? null : d10.buttons.get(i10);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            q3Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 3:
                wm wmVar = (wm) this.c;
                hp hpVar = (hp) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z11 = this.b;
                hpVar.H2 = 1;
                hp.e1().edit().putInt("secretWebpage2", wmVar.getMessagesController().H2).commit();
                wmVar.Y5 = null;
                wmVar.yb(charSequence, z11);
                break;
            case 4:
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
                aw0 aw0Var = (aw0) this.c;
                n10 n10Var = (n10) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.b;
                String trim2 = aw0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(g0.O3(trim2.toString()))) {
                    g0.v1(aw0Var);
                    org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, context2, z13 ? null : new ei.b());
                    s1Var2.r(250L);
                    n10Var.a(trim2, new m(s1Var2, s1Var, aw0Var, 11));
                    break;
                } else {
                    aw0Var.setErrorText(".");
                    g0.G3(-6.0f, aw0Var, null);
                    p2.E.a();
                    g0.K3(aw0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.lr
    public void run(long j10) {
        ji.e eVar = (ji.e) this.c;
        org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.d;
        String str = (String) this.e;
        eVar.getClass();
        s1Var.dismiss();
        if (j10 == 0) {
            return;
        }
        eVar.b = -j10;
        eVar.c = eVar.getMessagesController().M0(Long.valueOf(j10));
        eVar.a0(str, this.b);
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ b(boolean z10, Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
