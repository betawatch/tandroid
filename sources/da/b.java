package da;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import b2.q1;
import bi.h4;
import bi.q4;
import bi.u8;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.k0;
import e9.n0;
import e9.x1;
import gi.f;
import i5.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.u3;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import x2.d;
import x2.e;
import x2.i;
import x2.k;
import x2.n;
import x9.x;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, MessagesStorage.LongCallback, z1, MessagesController.ErrorDelegate, k {
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

    @Override // x2.k
    public x1 a(int i10, q1 q1Var, int[] iArr) {
        n nVar = (n) this.c;
        i iVar = (i) this.d;
        int[] iArr2 = (int[]) this.e;
        nVar.getClass();
        d dVar = new d(nVar, iVar);
        int i11 = iArr2[i10];
        k0 t10 = n0.t();
        for (int i12 = 0; i12 < q1Var.a; i12++) {
            t10.c(new e(i10, q1Var, i12, iVar, iArr[i12], this.b, dVar, i11));
        }
        return t10.f();
    }

    @Override // i5.g
    public void b(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        x9.b bVar = (x9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new u8(23, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = x.a;
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

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 2:
                boolean z10 = this.b;
                h4 h4Var = (h4) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                u3 u3Var = (u3) this.e;
                int i11 = u3Var.b;
                if (!z10) {
                    h4Var.run();
                    break;
                } else {
                    String trim = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim)) {
                        TL_iv.pageBlockButtonRow d = u3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = u3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            u3Var.a(trim, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
            case 3:
                fo foVar = (fo) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z11 = this.b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", foVar.getMessagesController().secretWebpagePreview).commit();
                foVar.H5 = null;
                foVar.cb(charSequence, z11);
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
                xy0 xy0Var = (xy0) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z13 = this.b;
                String trim2 = xy0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim2) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim2.toString()))) {
                    AndroidUtilities.hideKeyboard(xy0Var);
                    a2 a2Var2 = new a2(context2, 3, z13 ? null : new bi.b());
                    a2Var2.q(250L);
                    callback2.run(trim2, new q4(a2Var2, a2Var, xy0Var, 8));
                    break;
                } else {
                    xy0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(xy0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(xy0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.c, (boolean[]) this.d, this.b, (m2) this.e, tL_error);
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
        f fVar = (f) this.c;
        a2 a2Var = (a2) this.d;
        String str = (String) this.e;
        fVar.getClass();
        a2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.a = -j10;
        fVar.b = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.V(str, this.b);
    }

    public /* synthetic */ b(boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
