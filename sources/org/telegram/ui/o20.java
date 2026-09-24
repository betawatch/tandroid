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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                org.telegram.ui.ActionBar.u0 u0Var = d60Var.k1;
                org.telegram.ui.ActionBar.e1 e1Var = d60Var.v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = d60Var.u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = d60Var.p1;
                ChatObject.Call call = d60Var.a1;
                if (call != null && !d60Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.h6.hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                        e1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.h6.wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i13, false), org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                        e1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.h6.wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.w0(null, i14, false), org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                        e1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.h6.hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.w0(null, i15, false), org.telegram.ui.ActionBar.h6.w0(null, i15, false));
                        e1Var.setChecked(false);
                    }
                    d60Var.l0 = false;
                    u0Var.r(1);
                    u0Var.r(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            e1Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            e1Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : LocaleController.getString(R.string.VoipAudioRoutingBluetooth));
                        } else if (currentAudioRoute == 0) {
                            e1Var3.setIcon(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone);
                            e1Var3.setSubtext(LocaleController.getString(VoIPService.getSharedInstance().isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
                        } else if (currentAudioRoute == 1) {
                            if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                e1Var3.setIcon(R.drawable.msg_voice_speaker);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
                            } else {
                                e1Var3.setIcon(R.drawable.msg_voice_phone);
                                e1Var3.setSubtext(LocaleController.getString(R.string.VoipAudioRoutingPhone));
                            }
                        }
                    }
                    d60Var.I1();
                    u0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (d60Var.r1()) {
                    if (sf.c.a(d60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(d60Var.i0);
                        d60Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.e5.B(d60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.i0)) {
                    org.telegram.ui.Components.a30.e0 = false;
                    d60Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.e5.A(d60Var.getContext()).o();
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
                        LaunchActivity launchActivity = d60Var.i0;
                        if (launchActivity != null) {
                            d60Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = d60Var.a1;
                if (call2 != null && call2.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                d40 d40Var = d60Var.H;
                if (d40Var.m()) {
                    d40Var.j();
                    break;
                } else {
                    d40Var.d();
                    break;
                }
            case 5:
                d60.E(d60Var);
                break;
            case 6:
                int P0 = d60Var.P0();
                if (P0 > 0 && P0 != Integer.MAX_VALUE) {
                    d60Var.Q.v0(0, P0, null);
                }
                org.telegram.ui.Components.fu fuVar = d60Var.H.a;
                fuVar.requestFocus();
                AndroidUtilities.showKeyboard(fuVar);
                break;
            case 7:
                ChatObject.Call call3 = d60Var.a1;
                if (call3 == null || call3.isScheduled() || d60Var.r1()) {
                    d60Var.j1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(d60Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = d60Var.a1;
                if (call4 != null && call4.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = d60Var.a1;
                if (call5 != null && call5.recording) {
                    d60Var.G1(d60Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = d60Var.Y1;
                org.telegram.ui.Components.ij0 ij0Var = d60Var.G2;
                d60Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (d60Var.H2 == 18) {
                        d60Var.H2 = 39;
                        ij0Var.P(39);
                        ij0Var.start();
                    } else {
                        ij0Var.N(0, false, false);
                        d60Var.H2 = 18;
                        ij0Var.P(18);
                        ij0Var.start();
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
                if (d60Var.h1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                d60Var.y3 = Integer.valueOf(i11);
                d60Var.N1(true, true);
                d60Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ld(d60Var, i11, 14));
                break;
        }
    }
}
