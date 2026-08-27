package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class el implements nu0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public el(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = c6Var;
        this.d = c3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.dl] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ol olVar = chatAttachAlertPhotoLayout.N;
        gi giVar = chatAttachAlertPhotoLayout.b;
        int i10 = giVar.M0;
        org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.rn)) && !chatAttachAlertPhotoLayout.o0 && !giVar.R && chatAttachAlertPhotoLayout.L != null && !giVar.C) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.s0) {
                    org.telegram.messenger.y1.r(R.string.GlobalAttachVideoRestricted, new mc(chatAttachAlertPhotoLayout.L, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    chatAttachAlertPhotoLayout.O[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(er.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                er erVar = er.f;
                duration.setInterpolator(erVar).start();
                chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(erVar).start();
                org.telegram.ui.ActionBar.n2 n2Var2 = giVar.b0;
                this.a = AndroidUtilities.generateVideoPath((n2Var2 instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var2).x());
                AndroidUtilities.updateViewVisibilityAnimated(olVar, true);
                olVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.c0 = 0;
                final int i12 = 0;
                chatAttachAlertPhotoLayout.d0 = new Runnable(this) { // from class: org.telegram.ui.Components.dl
                    public final /* synthetic */ el b;

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
                AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                final int i13 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.L.getCameraSessionObject(), this.a, giVar.M0 != 0, new s(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.dl
                    public final /* synthetic */ el b;

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
                chatAttachAlertPhotoLayout.g0.a(ou0.b);
                chatAttachAlertPhotoLayout.L.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        ql qlVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        gi giVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.g0;
        if (chatAttachAlertPhotoLayout.o0 || (qlVar = chatAttachAlertPhotoLayout.L) == null || qlVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == ou0.b) {
            chatAttachAlertPhotoLayout.l0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
            shutterButton.a(ou0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.t0) {
                org.telegram.messenger.y1.r(R.string.GlobalAttachPhotoRestricted, new mc(chatAttachAlertPhotoLayout.L, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = giVar.b0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((n2Var instanceof org.telegram.ui.rn) && ((org.telegram.ui.rn) n2Var).x(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.L.getCameraSession().setFlipFront((giVar.b0 instanceof org.telegram.ui.rn) || giVar.M0 == 2);
            chatAttachAlertPhotoLayout.o0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new lh.kc(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
        }
    }
}
