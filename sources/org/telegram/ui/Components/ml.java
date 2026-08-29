package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ml implements vu0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = c6Var;
        this.d = d3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.ll] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        wl wlVar = chatAttachAlertPhotoLayout.N;
        ni niVar = chatAttachAlertPhotoLayout.b;
        int i10 = niVar.M0;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if ((i10 == 2 || (o2Var instanceof org.telegram.ui.tn)) && !chatAttachAlertPhotoLayout.o0 && !niVar.R && chatAttachAlertPhotoLayout.L != null && !niVar.C) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.s0) {
                    org.telegram.messenger.x3.s(R.string.GlobalAttachVideoRestricted, new tc(chatAttachAlertPhotoLayout.L, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.O[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(jr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                jr jrVar = jr.f;
                duration.setInterpolator(jrVar).start();
                chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                org.telegram.ui.ActionBar.o2 o2Var2 = niVar.b0;
                this.a = AndroidUtilities.generateVideoPath((o2Var2 instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var2).w());
                AndroidUtilities.updateViewVisibilityAnimated(wlVar, true);
                wlVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.c0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.d0 = new Runnable(this) { // from class: org.telegram.ui.Components.ll
                    public final /* synthetic */ ml b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.d0 != null) {
                                    int i13 = chatAttachAlertPhotoLayout2.c0 + 1;
                                    chatAttachAlertPhotoLayout2.c0 = i13;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i13));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.d0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.d0, 1000L);
                                break;
                        }
                    }
                };
                AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.L.getCameraSessionObject(), this.a, niVar.M0 != 0, new u(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.ll
                    public final /* synthetic */ ml b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.d0 != null) {
                                    int i132 = chatAttachAlertPhotoLayout2.c0 + 1;
                                    chatAttachAlertPhotoLayout2.c0 = i132;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i132));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.d0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.d0, 1000L);
                                break;
                        }
                    }
                }, chatAttachAlertPhotoLayout.L);
                chatAttachAlertPhotoLayout.g0.a(wu0.b);
                chatAttachAlertPhotoLayout.L.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        yl ylVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ni niVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.g0;
        if (chatAttachAlertPhotoLayout.o0 || (ylVar = chatAttachAlertPhotoLayout.L) == null || ylVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == wu0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
            shutterButton.a(wu0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.t0) {
                org.telegram.messenger.x3.s(R.string.GlobalAttachPhotoRestricted, new tc(chatAttachAlertPhotoLayout.L, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).w(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.L.getCameraSession().setFlipFront((niVar.b0 instanceof org.telegram.ui.tn) || niVar.M0 == 2);
            chatAttachAlertPhotoLayout.o0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new nh.yb(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
        }
    }
}
