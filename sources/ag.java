// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ag implements fd, ef7, id3, bm3, gc7, i5c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ag(v4b v4bVar, icc iccVar, Context context, boolean z) {
        this.a = (byte) 8;
        this.d = v4bVar;
        this.e = iccVar;
        this.c = context;
        this.b = z;
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        e eVar = (e) this.e;
        RectF rectF = ProfileActivity.Z6;
        return profileActivity.E2(zArr, this.b, eVar, tL_error);
    }

    @Override // bm3
    public final void c(TLRPC.TL_error tL_error, String str) {
        bn3 bn3Var = (bn3) this.c;
        cm3 cm3Var = (cm3) this.d;
        cm3 cm3Var2 = (cm3) this.e;
        if (bn3Var.r != 4) {
            return;
        }
        if (str != null) {
            hl.d3(new cv2(bn3Var, str, cm3Var2, (byte) 12), Math.max(0L, (bn3Var.W + 1200) - SystemClock.uptimeMillis()));
            return;
        }
        bn3Var.J(3);
        bn3Var.K = cm3Var;
        bn3Var.F.f(false);
        bn3Var.l(0L, 240L);
        if (!this.b) {
            bn3Var.J = null;
        }
        bn3Var.w.e(cm3Var.a(), false);
        bn3Var.w.setRevert(bn3Var.J != null);
        bn3Var.G(false);
        bn3.K(tL_error);
    }

    @Override // i5c
    public final void d(Exception exc) {
        rb9 rb9Var = (rb9) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        d80 d80Var = (d80) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new z09(rb9Var, countDownLatch, (byte) 13)).start();
            ExecutorService executorService = ucc.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            j = nanoTime - System.nanoTime();
                            z2 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(d80Var);
    }

    @Override // id3
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        ld3 ld3Var = (ld3) this.c;
        gd3 gd3Var = (gd3) this.d;
        int[] iArr2 = (int[]) this.e;
        ld3Var.getClass();
        bd3 bd3Var = new bd3(ld3Var, gd3Var);
        int i2 = iArr2[i];
        mo5 p = po5.p();
        for (int i3 = 0; i3 < t1cVar.a; i3++) {
            p.c(new cd3(i, t1cVar, i3, gd3Var, iArr[i3], this.b, bd3Var, i2));
        }
        return p.f();
    }

    @Override // ef7
    public final void run(long j) {
        qn2 qn2Var = (qn2) this.c;
        id idVar = (id) this.d;
        String str = (String) this.e;
        idVar.dismiss();
        if (j == 0) {
            return;
        }
        qn2Var.b = -j;
        qn2Var.c = qn2Var.getMessagesController().M0(Long.valueOf(j));
        qn2Var.Y(str, this.b);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                pt2 pt2Var = (pt2) this.e;
                if (!z) {
                    atomicBoolean.set(true);
                    pt2Var.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
            case 1:
                zu1 zu1Var = (zu1) this.c;
                uc7 uc7Var = (uc7) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z2 = this.b;
                zu1Var.getClass();
                uc7Var.z2 = 1;
                uc7.e1().edit().putInt("secretWebpage2", zu1Var.getMessagesController().z2).commit();
                zu1Var.Z5 = null;
                zu1Var.ub(charSequence, z2);
                break;
            case 7:
                boolean z3 = this.b;
                lb7 lb7Var = (lb7) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                mi9 mi9Var = (mi9) this.e;
                int i2 = mi9Var.b;
                if (!z3) {
                    lb7Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = mi9Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i2 < 0 || i2 >= d.buttons.size()) ? null : d.buttons.get(i2);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d2 = mi9Var.d();
                            TL_keyboard.PageButton pageButton2 = (d2 == null || i2 < 0 || i2 >= d2.buttons.size()) ? null : d2.buttons.get(i2);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            mi9Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            default:
                v4b v4bVar = (v4b) this.d;
                icc iccVar = (icc) this.e;
                Context context2 = (Context) this.c;
                boolean z4 = this.b;
                String trim2 = v4bVar.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(hl.I3(trim2.toString()))) {
                    hl.t1(v4bVar);
                    id idVar2 = new id(3, z4 ? null : new x53(), context2);
                    idVar2.q(250L);
                    iccVar.a(trim2, new v58((Object) idVar2, (Object) idVar, (Object) v4bVar, (byte) 10));
                    break;
                } else {
                    v4bVar.setErrorText(".");
                    hl.A3(-6.0f, v4bVar, null);
                    yw0.E.a();
                    hl.E3(v4bVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ag(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ ag(e eVar, fn7 fn7Var, CharSequence charSequence, boolean z, byte b) {
        this.a = b;
        this.c = eVar;
        this.d = fn7Var;
        this.e = charSequence;
        this.b = z;
    }

    public /* synthetic */ ag(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
