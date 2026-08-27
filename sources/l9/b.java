package l9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.b0;
import gh.i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.p6;
import oh.f;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;
import rh.m3;
import t2.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, MessagesStorage.LongCallback, a2, MessagesController.ErrorDelegate {
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // t2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        f9.b bVar = (f9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new p6(16, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = b0.a;
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

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                rn rnVar = (rn) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z10 = this.b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", rnVar.getMessagesController().secretWebpagePreview).commit();
                rnVar.D5 = null;
                rnVar.Ya(charSequence, z10);
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
            case 4:
                ix0 ix0Var = (ix0) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z12 = this.b;
                String trim = ix0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(ix0Var);
                    b2 b2Var2 = new b2(context2, 3, z12 ? null : new jh.b());
                    b2Var2.q(250L);
                    callback2.run(trim, new i(b2Var2, b2Var, ix0Var, 10));
                    break;
                } else {
                    ix0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(ix0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(ix0Var);
                    break;
                }
                break;
            default:
                boolean z13 = this.b;
                cg.c cVar = (cg.c) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                m3 m3Var = (m3) this.e;
                int i11 = m3Var.b;
                if (!z13) {
                    cVar.run();
                    break;
                } else {
                    String trim2 = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        TL_iv.pageBlockButtonRow d = m3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = m3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            m3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.c, (boolean[]) this.d, this.b, (n2) this.e, tL_error);
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
        b2 b2Var = (b2) this.d;
        String str = (String) this.e;
        fVar.getClass();
        b2Var.dismiss();
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
