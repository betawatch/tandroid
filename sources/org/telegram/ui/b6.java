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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6(Object obj, int i10) {
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
        org.telegram.ui.Components.voip.l I0;
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
        int i10;
        switch (this.a) {
            case 0:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.V == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.V = null;
                    break;
                }
                break;
            case 1:
                x9 x9Var = (x9) this.b;
                CameraView cameraView = x9Var.c;
                if (cameraView != null && !x9Var.J && cameraView.getCameraSession() != null) {
                    x9Var.e.post(new yt0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.i0 = false;
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
                u10 u10Var = (u10) this.b;
                if (u10Var.J) {
                    u10Var.f.clear();
                    u10Var.n.clear();
                    u10Var.r.clear();
                    org.telegram.ui.Components.ql0 ql0Var = u10Var.d;
                    if (ql0Var != null) {
                        ql0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                e60 e60Var = ((n30) this.b).b;
                e60Var.x.setAnimation(e60Var.G0);
                e60Var.I0 = false;
                break;
            case 6:
                try {
                    e60 e60Var2 = (e60) this.b;
                    x30 x30Var = e60Var2.X1;
                    if (x30Var != null && !x30Var.b && (I0 = e60.I0(e60Var2)) != null && I0.isAttachedToWindow() && (renderer = I0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        e60.E3.postRunnable(new w10(4, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((v70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    v70 v70Var = (v70) this.b;
                    if (v70Var.e.equals(v70Var.b.eglGetCurrentContext())) {
                        v70 v70Var2 = (v70) this.b;
                        break;
                    }
                    v70 v70Var3 = (v70) this.b;
                    EGL10 egl10 = v70Var3.b;
                    EGLDisplay eGLDisplay = v70Var3.c;
                    EGLSurface eGLSurface = v70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, v70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.y3.u(((v70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((v70) this.b).s, 16L);
                    Intro.setPage(((v70) this.b).x.E);
                    Intro.setDate((currentTimeMillis - r2.G) / 1000.0f);
                    Intro.onDrawFrame(min);
                    v70 v70Var4 = (v70) this.b;
                    v70Var4.b.eglSwapBuffers(v70Var4.c, v70Var4.f);
                    v70 v70Var5 = (v70) this.b;
                    v70Var5.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (v70Var5.r == 0.0f) {
                        for (float f11 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((v70) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    v70 v70Var6 = (v70) this.b;
                    v70Var6.postRunnable(v70Var6.w, Math.max(((long) (1000.0f / v70Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.W0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.G0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.W0 = null;
                    break;
                }
                break;
            case 9:
                cf0 cf0Var = (cf0) this.b;
                if (cf0Var.h == this) {
                    cf0Var.o();
                    AndroidUtilities.runOnUIThread(cf0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((cj0) this.b).Q.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                jj0 jj0Var = (jj0) this.b;
                String str = jj0Var.g0;
                if (str != null) {
                    jj0.Q(jj0Var, str);
                    break;
                }
                break;
            case 12:
                mv0 mv0Var = (mv0) this.b;
                b6 b6Var = mv0Var.v0;
                org.telegram.ui.Cells.b6 b6Var2 = mv0Var.Y;
                if (b6Var2 != null) {
                    EditTextBoldCursor editField = b6Var2.getEditField();
                    if (!mv0Var.R && editField != null && mv0Var.Q && !mv0Var.V && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(b6Var);
                        AndroidUtilities.runOnUIThread(b6Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((oa1) this.b).Y.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                ge1 ge1Var = (ge1) this.b;
                ge1Var.C.setVisibility(0);
                ge1Var.C.setAlpha(0.0f);
                ge1Var.C.animate().alpha(1.0f).start();
                break;
            default:
                dj1 dj1Var = (dj1) this.b;
                MessageObject messageObject = dj1Var.n;
                if (messageObject != null && dj1Var.getParentActivity() != null && dj1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.p2) dj1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(dj1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
