package a3;

import aa.c0;
import aa.f0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.m1;
import fi.f6;
import h9.i0;
import h9.s1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oi.n3;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.np;
import org.telegram.messenger.p2;
import org.telegram.messenger.qr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t0;
import org.telegram.messenger.yo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements p, l5.g, qr, q1, yo {
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
            new Thread(new f6(25, bVar, countDownLatch)).start();
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

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        return ProfileActivity.d0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (e2) this.e, tL_error);
    }

    @Override // a3.p
    public s1 f(int i7, m1 m1Var, int[] iArr) {
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
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                boolean z10 = this.b;
                c0 c0Var = (c0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                n3 n3Var = (n3) this.e;
                int i10 = n3Var.b;
                if (!z10) {
                    c0Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = n3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d2 = n3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d2 == null || i10 < 0 || i10 >= d2.buttons.size()) ? null : d2.buttons.get(i10);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            n3Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 4:
                an anVar = (an) this.c;
                np npVar = (np) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z11 = this.b;
                npVar.H2 = 1;
                np.e1().edit().putInt("secretWebpage2", anVar.getMessagesController().H2).commit();
                anVar.Y5 = null;
                anVar.Cb(charSequence, z11);
                break;
            case 5:
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
                ew0 ew0Var = (ew0) this.c;
                s10 s10Var = (s10) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.b;
                String trim2 = ew0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(g0.N3(trim2.toString()))) {
                    g0.v1(ew0Var);
                    t1 t1Var2 = new t1(3, context2, z13 ? null : new fi.b());
                    t1Var2.r(250L);
                    s10Var.a(trim2, new bi.j(t1Var2, t1Var, ew0Var, 11));
                    break;
                } else {
                    ew0Var.setErrorText(".");
                    g0.F3(-6.0f, ew0Var, null);
                    p2.E.a();
                    g0.J3(ew0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        li.e eVar = (li.e) this.c;
        t1 t1Var = (t1) this.d;
        String str = (String) this.e;
        eVar.getClass();
        t1Var.dismiss();
        if (j3 == 0) {
            return;
        }
        eVar.b = -j3;
        eVar.c = eVar.getMessagesController().M0(Long.valueOf(j3));
        eVar.a0(str, this.b);
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
