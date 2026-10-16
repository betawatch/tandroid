package org.telegram.ui;

import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        if (r2.f.equals(r2.b.eglGetCurrentSurface(12377)) == false) goto L69;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.voip.l J0;
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
        int i10;
        switch (this.a) {
            case 0:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Y == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.Y = null;
                    break;
                }
                break;
            case 1:
                z9 z9Var = (z9) this.b;
                CameraView cameraView = z9Var.c;
                if (cameraView != null && !z9Var.N && cameraView.getCameraSession() != null) {
                    z9Var.e.post(new su0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.l0 = false;
                break;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.w == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        externalActionActivity.i();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    externalActionActivity.w = null;
                    break;
                }
                break;
            case 4:
                b20 b20Var = (b20) this.b;
                if (b20Var.M) {
                    b20Var.f.clear();
                    b20Var.n.clear();
                    b20Var.r.clear();
                    org.telegram.ui.Components.lm0 lm0Var = b20Var.d;
                    if (lm0Var != null) {
                        lm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                n60 n60Var = ((u30) this.b).b;
                n60Var.x.setAnimation(n60Var.J0);
                n60Var.L0 = false;
                break;
            case 6:
                try {
                    n60 n60Var2 = (n60) this.b;
                    e40 e40Var = n60Var2.a2;
                    if (e40Var != null && !e40Var.b && (J0 = n60.J0(n60Var2)) != null && J0.isAttachedToWindow() && (renderer = J0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        n60.H3.postRunnable(new d20(4, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((f80) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    f80 f80Var = (f80) this.b;
                    if (f80Var.e.equals(f80Var.b.eglGetCurrentContext())) {
                        f80 f80Var2 = (f80) this.b;
                        break;
                    }
                    f80 f80Var3 = (f80) this.b;
                    EGL10 egl10 = f80Var3.b;
                    EGLDisplay eGLDisplay = f80Var3.c;
                    EGLSurface eGLSurface = f80Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, f80Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.sk.v(((f80) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((f80) this.b).s, 16L);
                    Intro.setPage(((f80) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    f80 f80Var4 = (f80) this.b;
                    f80Var4.b.eglSwapBuffers(f80Var4.c, f80Var4.f);
                    f80 f80Var5 = (f80) this.b;
                    f80Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (f80Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((f80) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    f80 f80Var6 = (f80) this.b;
                    f80Var6.postRunnable(f80Var6.w, Math.max(((long) (1000.0f / f80Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Z0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.Z0 = null;
                    break;
                }
                break;
            case 9:
                mf0 mf0Var = (mf0) this.b;
                if (mf0Var.h == this) {
                    mf0Var.o();
                    AndroidUtilities.runOnUIThread(mf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((pj0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                wj0 wj0Var = (wj0) this.b;
                String str = wj0Var.j0;
                if (str != null) {
                    wj0.R(wj0Var, str);
                    break;
                }
                break;
            case 12:
                fw0 fw0Var = (fw0) this.b;
                a6 a6Var = fw0Var.y0;
                org.telegram.ui.Cells.d6 d6Var = fw0Var.b0;
                if (d6Var != null) {
                    EditTextBoldCursor editField = d6Var.getEditField();
                    if (!fw0Var.U && editField != null && fw0Var.T && !fw0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(a6Var);
                        AndroidUtilities.runOnUIThread(a6Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((hb1) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ze1 ze1Var = (ze1) this.b;
                ze1Var.F.setVisibility(0);
                ze1Var.F.setAlpha(0.0f);
                ze1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                xj1 xj1Var = (xj1) this.b;
                MessageObject messageObject = xj1Var.n;
                if (messageObject != null && xj1Var.getParentActivity() != null && xj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) xj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(xj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
