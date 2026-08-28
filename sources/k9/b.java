package k9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bg.d;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.z;
import fh.i;
import ih.j7;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.f;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
import qh.l3;
import t2.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, MessagesStorage.LongCallback, b2, MessagesController.ErrorDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // t2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        e9.b bVar = (e9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new j7(10, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = z.a;
            boolean z11 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z11 = true;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                        if (z10) {
                        }
                        throw th;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                qn qnVar = (qn) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z10 = this.b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", qnVar.getMessagesController().secretWebpagePreview).commit();
                qnVar.D5 = null;
                qnVar.Ya(charSequence, z10);
                break;
            case 3:
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
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
            case 4:
                gx0 gx0Var = (gx0) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z12 = this.b;
                String trim = gx0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(gx0Var);
                    c2 c2Var2 = new c2(context2, 3, z12 ? null : new ih.b());
                    c2Var2.q(250L);
                    callback2.run(trim, new i(c2Var2, c2Var, gx0Var, 10));
                    break;
                } else {
                    gx0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(gx0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(gx0Var);
                    break;
                }
                break;
            default:
                boolean z13 = this.b;
                d dVar = (d) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                l3 l3Var = (l3) this.e;
                int i10 = l3Var.b;
                if (!z13) {
                    dVar.run();
                    break;
                } else {
                    String trim2 = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        TL_iv.pageBlockButtonRow d = l3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i10 < 0 || i10 >= d.buttons.size()) ? null : d.buttons.get(i10);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d9 = l3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d9 == null || i10 < 0 || i10 >= d9.buttons.size()) ? null : d9.buttons.get(i10);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            l3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Y((ProfileActivity) this.c, (boolean[]) this.d, this.b, (o2) this.e, tL_error);
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        f fVar = (f) this.c;
        c2 c2Var = (c2) this.d;
        String str = (String) this.e;
        fVar.getClass();
        c2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        fVar.a = -j10;
        fVar.b = fVar.getMessagesController().getChat(Long.valueOf(j10));
        fVar.U(str, this.b);
    }

    public /* synthetic */ b(boolean z10, Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = z10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
