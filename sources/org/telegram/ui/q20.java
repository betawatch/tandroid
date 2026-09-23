package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ q20(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        f60 f60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v0 v0Var = f60Var.k1;
                org.telegram.ui.ActionBar.f1 f1Var = f60Var.v1;
                org.telegram.ui.ActionBar.f1 f1Var2 = f60Var.u1;
                org.telegram.ui.ActionBar.f1 f1Var3 = f60Var.p1;
                ChatObject.Call call = f60Var.a1;
                if (call != null && !f60Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.h6.hg;
                        f1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                        f1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.h6.wg;
                        f1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i13, false), org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                        f1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.h6.wg;
                        f1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i14, false), org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                        f1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.h6.hg;
                        f1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i15, false), org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                        f1Var.setChecked(false);
                    }
                    f60Var.l0 = false;
                    v0Var.r(1);
                    v0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            f1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            f1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            f1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            f1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                f1Var3.setIcon(R.drawable.msg_voice_speaker);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                f1Var3.setIcon(R.drawable.msg_voice_phone);
                                f1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    f60Var.I1();
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (f60Var.r1()) {
                    if (sf.c.a(f60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(f60Var.i0);
                        f60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.e5.B(f60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(f60Var.i0)) {
                    org.telegram.ui.Components.a30.e0 = false;
                    f60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.e5.A(f60Var.getContext()).o();
                    break;
                }
            case 2:
                f60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = f60Var.i0;
                        if (launchActivity != null) {
                            f60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = f60Var.a1;
                if (call2 != null && call2.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                f40 f40Var = f60Var.H;
                if (f40Var.m()) {
                    f40Var.j();
                    break;
                } else {
                    f40Var.d();
                    break;
                }
            case 5:
                f60.E(f60Var);
                break;
            case 6:
                int P0 = f60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    f60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.fu fuVar = f60Var.H.a;
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                break;
            case 7:
                ChatObject.Call call3 = f60Var.a1;
                if (call3 == null || call3.isScheduled() || f60Var.r1()) {
                    f60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(f60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = f60Var.a1;
                if (call4 != null && call4.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = f60Var.a1;
                if (call5 != null && call5.recording) {
                    f60Var.G1(f60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = f60Var.Y1;
                org.telegram.ui.Components.yi0 yi0Var = f60Var.G2;
                f60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (f60Var.H2 == 18) {
                        f60Var.H2 = 39;
                        yi0Var.P(39);
                        yi0Var.start();
                    } else {
                        yi0Var.N(0, false, false);
                        f60Var.H2 = 18;
                        yi0Var.P(18);
                        yi0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = uVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.a;
                            if (uVar.J0 == null) {
                                uVar.K0 = false;
                                ImageView imageView = uVar.x0;
                                if (imageView == null) {
                                    uVar.x0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.x0.setAlpha(0.0f);
                                } else {
                                    uVar.x0.setAlpha(1.0f);
                                }
                                if (uVar.x0.getParent() == null) {
                                    pVar.addView(uVar.x0);
                                }
                                ((FrameLayout.LayoutParams) uVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.J0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.J0.setDuration(400L);
                                uVar.J0.setInterpolator(org.telegram.ui.Components.rr.f);
                                uVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (f60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                f60Var.y3 = Integer.valueOf(i11);
                f60Var.N1(true, true);
                f60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(f60Var, i11, 14));
                break;
        }
    }
}
