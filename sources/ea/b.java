package ea;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.q1;
import bi.s9;
import bi.v3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.q0;
import f9.f0;
import f9.i0;
import f9.s1;
import j5.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import li.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
import x2.d;
import x2.f;
import x2.j;
import x2.l;
import x2.o;
import y9.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, MessagesStorage.LongCallback, b2, MessagesController.ErrorDelegate, l {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // x2.l
    public s1 a(int i10, q1 q1Var, int[] iArr) {
        o oVar = (o) this.c;
        j jVar = (j) this.d;
        int[] iArr2 = (int[]) this.e;
        oVar.getClass();
        d dVar = new d(oVar, jVar);
        int i11 = iArr2[i10];
        f0 t10 = i0.t();
        for (int i12 = 0; i12 < q1Var.a; i12++) {
            t10.c(new f(i10, q1Var, i12, jVar, iArr[i12], this.b, dVar, i11));
        }
        return t10.f();
    }

    @Override // j5.g
    public void d(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        y9.b bVar = (y9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            int i10 = 1;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new q0(i10, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x.a;
            int i11 = 0;
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
                            if (i10 != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        i11 = 1;
                    }
                }
                if (i11 != 0) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                i10 = i11;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 2:
                boolean z10 = this.b;
                s9 s9Var = (s9) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                s3 s3Var = (s3) this.e;
                int i11 = s3Var.b;
                if (!z10) {
                    s9Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = s3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = s3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            s3Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 3:
                wn wnVar = (wn) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z11 = this.b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", wnVar.getMessagesController().secretWebpagePreview).commit();
                wnVar.X5 = null;
                wnVar.lb(charSequence, z11);
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
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            default:
                gz0 gz0Var = (gz0) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.b;
                String trim2 = gz0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(gz0Var);
                    e2 e2Var2 = new e2(context2, 3, z13 ? null : new di.b());
                    e2Var2.r(250L);
                    callback2.run(trim2, new v3(e2Var2, e2Var, gz0Var, 9));
                    break;
                } else {
                    gz0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(gz0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(gz0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.i0((ProfileActivity) this.c, (boolean[]) this.d, this.b, (r2) this.e, tL_error);
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        ii.f fVar = (ii.f) this.c;
        e2 e2Var = (e2) this.d;
        String str = (String) this.e;
        fVar.getClass();
        e2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.b = -j10;
        fVar.c = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.W(str, this.b);
    }

    public /* synthetic */ b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
