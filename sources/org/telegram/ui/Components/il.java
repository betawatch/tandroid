package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class il implements ku0 {
    public File a;
    public boolean b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d3 d;
    public final /* synthetic */ ChatAttachAlertPhotoLayout e;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.c = b6Var;
        this.d = d3Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [org.telegram.ui.Components.hl] */
    public final boolean a() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        sl slVar = chatAttachAlertPhotoLayout.N;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        int i9 = kiVar.M0;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if ((i9 == 2 || (o2Var instanceof org.telegram.ui.qn)) && !chatAttachAlertPhotoLayout.o0 && !kiVar.R && chatAttachAlertPhotoLayout.L != null && !kiVar.C) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.s0) {
                    org.telegram.messenger.ll.p(R.string.GlobalAttachVideoRestricted, new oc(chatAttachAlertPhotoLayout.L, this.c), null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                }
                for (int i10 = 0; i10 < 2; i10++) {
                    chatAttachAlertPhotoLayout.O[i10].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(gr.f).start();
                }
                ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                gr grVar = gr.f;
                duration.setInterpolator(grVar).start();
                chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.b0;
                this.a = AndroidUtilities.generateVideoPath((o2Var2 instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var2).w());
                AndroidUtilities.updateViewVisibilityAnimated(slVar, true);
                slVar.setText(AndroidUtilities.formatLongDuration(0));
                chatAttachAlertPhotoLayout.c0 = 0;
                final int i11 = 0;
                chatAttachAlertPhotoLayout.d0 = new Runnable(this) { // from class: org.telegram.ui.Components.hl
                    public final /* synthetic */ il b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.d0 != null) {
                                    int i12 = chatAttachAlertPhotoLayout2.c0 + 1;
                                    chatAttachAlertPhotoLayout2.c0 = i12;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i12));
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
                final int i12 = 1;
                CameraController.getInstance().recordVideo(chatAttachAlertPhotoLayout.L.getCameraSessionObject(), this.a, kiVar.M0 != 0, new s(this, 21), new Runnable(this) { // from class: org.telegram.ui.Components.hl
                    public final /* synthetic */ il b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.b.e;
                                if (chatAttachAlertPhotoLayout2.d0 != null) {
                                    int i122 = chatAttachAlertPhotoLayout2.c0 + 1;
                                    chatAttachAlertPhotoLayout2.c0 = i122;
                                    chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i122));
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
                chatAttachAlertPhotoLayout.g0.a(lu0.b);
                chatAttachAlertPhotoLayout.L.runHaptic();
                return true;
            }
        }
        return false;
    }

    public final void b() {
        ul ulVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.g0;
        if (chatAttachAlertPhotoLayout.o0 || (ulVar = chatAttachAlertPhotoLayout.L) == null || ulVar.getCameraSession() == null) {
            return;
        }
        if (shutterButton.getState() == lu0.b) {
            chatAttachAlertPhotoLayout.k0();
            CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
            shutterButton.a(lu0.a);
        } else {
            if (!chatAttachAlertPhotoLayout.t0) {
                org.telegram.messenger.ll.p(R.string.GlobalAttachPhotoRestricted, new oc(chatAttachAlertPhotoLayout.L, this.c), null);
                return;
            }
            org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
            File generatePicturePath = AndroidUtilities.generatePicturePath((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).w(), null);
            boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
            chatAttachAlertPhotoLayout.L.getCameraSession().setFlipFront((kiVar.b0 instanceof org.telegram.ui.qn) || kiVar.M0 == 2);
            chatAttachAlertPhotoLayout.o0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new kh.oc(this, generatePicturePath, isSameTakePictureOrientation));
            chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
        }
    }
}
