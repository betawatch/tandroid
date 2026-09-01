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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;

    public /* synthetic */ o20(d60 d60Var, int i10) {
        this.a = i10;
        this.b = d60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        d60 d60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = d60Var.h1;
                org.telegram.ui.ActionBar.g1 g1Var = d60Var.s1;
                org.telegram.ui.ActionBar.g1 g1Var2 = d60Var.r1;
                org.telegram.ui.ActionBar.g1 g1Var3 = d60Var.m1;
                ChatObject.Call call = d60Var.X0;
                if (call != null && !d60Var.X1.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.k6.hg;
                        g1Var2.c(org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                        g1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.k6.wg;
                        g1Var.c(org.telegram.ui.ActionBar.k6.w0(null, i13, false), org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                        g1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.k6.wg;
                        g1Var2.c(org.telegram.ui.ActionBar.k6.w0(null, i14, false), org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                        g1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.k6.hg;
                        g1Var.c(org.telegram.ui.ActionBar.k6.w0(null, i15, false), org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                        g1Var.setChecked(false);
                    }
                    d60Var.i0 = false;
                    w0Var.r(1);
                    w0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            g1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            g1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            g1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            g1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                g1Var3.setIcon(R.drawable.msg_voice_speaker);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                g1Var3.setIcon(R.drawable.msg_voice_phone);
                                g1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    d60Var.I1();
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (d60Var.r1()) {
                    if (ff.d.a(d60Var.f0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(d60Var.f0);
                        d60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.z4.B(d60Var.f0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.f0)) {
                    org.telegram.ui.Components.c30.b0 = false;
                    d60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.z4.A(d60Var.getContext()).o();
                    break;
                }
            case 2:
                d60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = d60Var.f0;
                        if (launchActivity != null) {
                            d60Var.f0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = d60Var.X0;
                if (call2 != null && call2.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 4:
                e40 e40Var = d60Var.E;
                if (e40Var.m()) {
                    e40Var.j();
                    break;
                } else {
                    e40Var.d();
                    break;
                }
            case 5:
                d60.D(d60Var);
                break;
            case 6:
                int P0 = d60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    d60Var.N.v0(0, P0, null);
                }
                org.telegram.ui.Components.au auVar = d60Var.E.a;
                auVar.requestFocus();
                AndroidUtilities.showKeyboard(auVar);
                break;
            case 7:
                ChatObject.Call call3 = d60Var.X0;
                if (call3 == null || call3.isScheduled() || d60Var.r1()) {
                    d60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = d60Var.X0;
                if (call4 != null && call4.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = d60Var.X0;
                if (call5 != null && call5.recording) {
                    d60Var.G1(d60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = d60Var.V1;
                org.telegram.ui.Components.ij0 ij0Var = d60Var.D2;
                d60Var.X1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (d60Var.E2 == 18) {
                        d60Var.E2 = 39;
                        ij0Var.N(39);
                        ij0Var.start();
                    } else {
                        ij0Var.L(0, false, false);
                        d60Var.E2 = 18;
                        ij0Var.N(18);
                        ij0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = uVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.p pVar = uVar.a;
                            if (uVar.G0 == null) {
                                uVar.H0 = false;
                                ImageView imageView = uVar.u0;
                                if (imageView == null) {
                                    uVar.u0 = new ImageView(uVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (pVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = pVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        uVar.u0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    uVar.u0.setAlpha(0.0f);
                                } else {
                                    uVar.u0.setAlpha(1.0f);
                                }
                                if (uVar.u0.getParent() == null) {
                                    pVar.addView(uVar.u0);
                                }
                                ((FrameLayout.LayoutParams) uVar.u0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                uVar.G0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(uVar, 1));
                                uVar.G0.addListener(new org.telegram.ui.Components.voip.s(uVar, 2));
                                uVar.G0.setDuration(400L);
                                uVar.G0.setInterpolator(org.telegram.ui.Components.pr.f);
                                uVar.G0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (d60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                d60Var.v3 = Integer.valueOf(i11);
                d60Var.N1(true, true);
                d60Var.v3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jm(d60Var, i11, 12));
                break;
        }
    }
}
