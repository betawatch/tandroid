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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c60 b;

    public /* synthetic */ n20(c60 c60Var, int i10) {
        this.a = i10;
        this.b = c60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        c60 c60Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.w0 w0Var = c60Var.h1;
                org.telegram.ui.ActionBar.g1 g1Var = c60Var.s1;
                org.telegram.ui.ActionBar.g1 g1Var2 = c60Var.r1;
                org.telegram.ui.ActionBar.g1 g1Var3 = c60Var.m1;
                ChatObject.Call call = c60Var.X0;
                if (call != null && !c60Var.X1.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.j6.hg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        g1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.j6.wg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i13, false), org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                        g1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.j6.wg;
                        g1Var2.c(org.telegram.ui.ActionBar.j6.w0(null, i14, false), org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        g1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.j6.hg;
                        g1Var.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                        g1Var.setChecked(false);
                    }
                    c60Var.i0 = false;
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
                    c60Var.I1();
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (c60Var.r1()) {
                    if (ff.d.a(c60Var.f0) > 0) {
                        org.telegram.ui.Components.voip.g1.n(c60Var.f0);
                        c60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.z4.B(c60Var.f0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(c60Var.f0)) {
                    org.telegram.ui.Components.a30.b0 = false;
                    c60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.z4.A(c60Var.getContext()).o();
                    break;
                }
            case 2:
                c60Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = c60Var.f0;
                        if (launchActivity != null) {
                            c60Var.f0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = c60Var.X0;
                if (call2 != null && call2.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 4:
                d40 d40Var = c60Var.E;
                if (d40Var.m()) {
                    d40Var.j();
                    break;
                } else {
                    d40Var.d();
                    break;
                }
            case 5:
                c60.D(c60Var);
                break;
            case 6:
                int P0 = c60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    c60Var.N.v0(0, P0, null);
                }
                org.telegram.ui.Components.yt ytVar = c60Var.E.a;
                ytVar.requestFocus();
                AndroidUtilities.showKeyboard(ytVar);
                break;
            case 7:
                ChatObject.Call call3 = c60Var.X0;
                if (call3 == null || call3.isScheduled() || c60Var.r1()) {
                    c60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(c60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = c60Var.X0;
                if (call4 != null && call4.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = c60Var.X0;
                if (call5 != null && call5.recording) {
                    c60Var.G1(c60Var.L.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = c60Var.V1;
                org.telegram.ui.Components.gj0 gj0Var = c60Var.D2;
                c60Var.X1.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (c60Var.E2 == 18) {
                        c60Var.E2 = 39;
                        gj0Var.N(39);
                        gj0Var.start();
                    } else {
                        gj0Var.L(0, false, false);
                        c60Var.E2 = 18;
                        gj0Var.N(18);
                        gj0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.G0 == null) {
                                tVar.H0 = false;
                                ImageView imageView = tVar.u0;
                                if (imageView == null) {
                                    tVar.u0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.u0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.u0.setAlpha(0.0f);
                                } else {
                                    tVar.u0.setAlpha(1.0f);
                                }
                                if (tVar.u0.getParent() == null) {
                                    oVar.addView(tVar.u0);
                                }
                                ((FrameLayout.LayoutParams) tVar.u0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.G0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.G0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.G0.setDuration(400L);
                                tVar.G0.setInterpolator(org.telegram.ui.Components.nr.f);
                                tVar.G0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (c60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                c60Var.v3 = Integer.valueOf(i11);
                c60Var.N1(true, true);
                c60Var.v3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hm(c60Var, i11, 12));
                break;
        }
    }
}
