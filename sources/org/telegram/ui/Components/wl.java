package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wl implements nv0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = f6Var;
        this.d = f3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.vl] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        gm gmVar = chatAttachAlertPhotoLayout.R;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        int i10 = yiVar.Q0;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.eo)) && !chatAttachAlertPhotoLayout.s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.w0) {
                    org.telegram.messenger.a2.p(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(wr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                wr wrVar = wr.f;
                duration.setInterpolator(wrVar).start();
                chatAttachAlertPhotoLayout.q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f0;
                this.a = AndroidUtilities.generateVideoPath((p2Var2 instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var2).u());
                AndroidUtilities.updateViewVisibilityAnimated(gmVar, true);
                gmVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.g0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.h0 = new Runnable(this) { // from class: org.telegram.ui.Components.vl
                    public final /* synthetic */ wl b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.h0 != null) {
                                    int i13 = chatAttachAlertPhotoLayout2.g0 + 1;
                                    chatAttachAlertPhotoLayout2.g0 = i13;
                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i13));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.h0, 1000L);
                                break;
                        }
                    }
                };
                AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.P.getCameraSessionObject(), this.a, yiVar.Q0 != 0, new t(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.vl
                    public final /* synthetic */ wl b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.h0 != null) {
                                    int i132 = chatAttachAlertPhotoLayout2.g0 + 1;
                                    chatAttachAlertPhotoLayout2.g0 = i132;
                                    chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i132));
                                    AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.h0, 1000L);
                                    break;
                                }
                                break;
                            default:
                                AndroidUtilities.runOnUIThread(this.b.e.h0, 1000L);
                                break;
                        }
                    }
                }, chatAttachAlertPhotoLayout.P);
                chatAttachAlertPhotoLayout.k0.a(ov0.b);
                chatAttachAlertPhotoLayout.P.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        im imVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.k0;
        if (chatAttachAlertPhotoLayout.s0 || (imVar = chatAttachAlertPhotoLayout.P) == null || imVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == ov0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
            shutterButton.a(ov0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.x0) {
                org.telegram.messenger.a2.p(R.string.GlobalAttachPhotoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).u(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.P.getCameraSession().setFlipFront((yiVar.f0 instanceof org.telegram.ui.eo) || yiVar.Q0 == 2);
            chatAttachAlertPhotoLayout.s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new bi.we(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
        }
    }
}
