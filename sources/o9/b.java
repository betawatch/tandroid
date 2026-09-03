package o9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.t0;
import i9.y;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.h;
import mh.m2;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.by0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
import v2.g;
import wh.o3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g, c2, MessagesController.ErrorDelegate, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    @Override // v2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(Exception exc) {
        c cVar = (c) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        i9.b bVar = (i9.b) this.e;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.b) {
            boolean z4 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new m2(24, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = y.a;
            boolean z10 = false;
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
                            if (z4) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z10 = true;
                    } catch (Throwable th3) {
                        th = th3;
                        z4 = z10;
                        if (z4) {
                        }
                        throw th;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th4) {
                th = th4;
                z4 = false;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                xn xnVar = (xn) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                boolean z4 = this.b;
                messagesController.secretWebpagePreview = 1;
                MessagesController.getGlobalMainSettings().edit().putInt("secretWebpage2", xnVar.getMessagesController().secretWebpagePreview).commit();
                xnVar.E5 = null;
                xnVar.Ya(charSequence, z4);
                break;
            case 2:
                boolean z10 = this.b;
                Context context = (Context) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                q0.a aVar = (q0.a) this.e;
                if (!z10) {
                    atomicBoolean.set(true);
                    aVar.accept(Boolean.TRUE);
                    break;
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
            case 3:
                by0 by0Var = (by0) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                Context context2 = (Context) this.e;
                boolean z11 = this.b;
                String trim = by0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(AndroidUtilities.translitSafe(trim.toString()))) {
                    AndroidUtilities.hideKeyboard(by0Var);
                    d2 d2Var2 = new d2(context2, 3, z11 ? null : new oh.b());
                    d2Var2.q(250L);
                    callback2.run(trim, new h(d2Var2, d2Var, by0Var, 10));
                    break;
                } else {
                    by0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(by0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(by0Var);
                    break;
                }
                break;
            default:
                boolean z12 = this.b;
                t0 t0Var = (t0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                o3 o3Var = (o3) this.e;
                int i11 = o3Var.b;
                if (!z12) {
                    t0Var.run();
                    break;
                } else {
                    String trim2 = editTextBoldCursor.getText().toString().trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        TL_iv.pageBlockButtonRow d = o3Var.d();
                        TL_keyboard.PageButton pageButton = (d == null || i11 < 0 || i11 >= d.buttons.size()) ? null : d.buttons.get(i11);
                        TL_keyboard.InlineButtonType inlineButtonType = pageButton == null ? null : pageButton.type;
                        if ((inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id : 0L) > 0) {
                            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                            TL_iv.pageBlockButtonRow d10 = o3Var.d();
                            TL_keyboard.PageButton pageButton2 = (d10 == null || i11 < 0 || i11 >= d10.buttons.size()) ? null : d10.buttons.get(i11);
                            TL_keyboard.InlineButtonType inlineButtonType2 = pageButton2 != null ? pageButton2.type : null;
                            tL_inlineButtonTypeUserProfile.user_id = inlineButtonType2 instanceof TL_keyboard.TL_inlineButtonTypeUserProfile ? ((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType2).user_id : 0L;
                            o3Var.a(trim2, tL_inlineButtonTypeUserProfile);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        return ProfileActivity.Z((ProfileActivity) this.c, (boolean[]) this.d, this.b, (p2) this.e, tL_error);
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        th.g gVar = (th.g) this.c;
        d2 d2Var = (d2) this.d;
        String str = (String) this.e;
        gVar.getClass();
        d2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        gVar.a = -j10;
        gVar.b = gVar.getMessagesController().getChat(Long.valueOf(j10));
        gVar.V(str, this.b);
    }

    public /* synthetic */ b(boolean z4, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = z4;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
