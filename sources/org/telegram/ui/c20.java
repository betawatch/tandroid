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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ c20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        s50 s50Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.u0 u0Var = s50Var.k1;
                org.telegram.ui.ActionBar.e1 e1Var = s50Var.v1;
                org.telegram.ui.ActionBar.e1 e1Var2 = s50Var.u1;
                org.telegram.ui.ActionBar.e1 e1Var3 = s50Var.p1;
                ChatObject.Call call = s50Var.a1;
                if (call != null && !s50Var.a2.b) {
                    if (call.call.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.h6.hg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                        e1Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.h6.wg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i13, false), org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                        e1Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.h6.wg;
                        e1Var2.c(org.telegram.ui.ActionBar.h6.x0(null, i14, false), org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                        e1Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.h6.hg;
                        e1Var.c(org.telegram.ui.ActionBar.h6.x0(null, i15, false), org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                        e1Var.setChecked(false);
                    }
                    s50Var.l0 = false;
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
                    s50Var.J1();
                    u0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                if (s50Var.s1()) {
                    if (uf.b.a(s50Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(s50Var.i0);
                        s50Var.dismiss();
                        break;
                    } else {
                        org.telegram.ui.Components.f5.A(s50Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(s50Var.i0)) {
                    org.telegram.ui.Components.i30.e0 = false;
                    s50Var.dismiss();
                    break;
                } else {
                    org.telegram.ui.Components.f5.z(s50Var.getContext()).o();
                    break;
                }
            case 2:
                s50Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = s50Var.i0;
                        if (launchActivity != null) {
                            s50Var.i0.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 3:
                ChatObject.Call call2 = s50Var.a1;
                if (call2 != null && call2.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 4:
                r30 r30Var = s50Var.H;
                if (r30Var.m()) {
                    r30Var.j();
                    break;
                } else {
                    r30Var.d();
                    break;
                }
            case 5:
                s50.F(s50Var);
                break;
            case 6:
                int Q0 = s50Var.Q0();
                if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
                    s50Var.Q.v0(0, Q0, null);
                }
                org.telegram.ui.Components.lu luVar = s50Var.H.a;
                luVar.requestFocus();
                AndroidUtilities.showKeyboard(luVar);
                break;
            case 7:
                ChatObject.Call call3 = s50Var.a1;
                if (call3 == null || call3.isScheduled() || s50Var.s1()) {
                    s50Var.k1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(s50Var.getContext(), false);
                    break;
                }
                break;
            case 8:
                ChatObject.Call call4 = s50Var.a1;
                if (call4 != null && call4.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ChatObject.Call call5 = s50Var.a1;
                if (call5 != null && call5.recording) {
                    s50Var.H1(s50Var.O.getTitleTextView());
                    break;
                }
                break;
            case 10:
                ArrayList arrayList = s50Var.Y1;
                org.telegram.ui.Components.uj0 uj0Var = s50Var.G2;
                s50Var.a2.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (s50Var.H2 == 18) {
                        s50Var.H2 = 39;
                        uj0Var.P(39);
                        uj0Var.start();
                    } else {
                        uj0Var.N(0, false, false);
                        s50Var.H2 = 18;
                        uj0Var.P(18);
                        uj0Var.start();
                    }
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList.get(i16);
                        ChatObject.VideoParticipant videoParticipant = tVar.w;
                        if (videoParticipant.participant.self && !videoParticipant.presentation) {
                            org.telegram.ui.Components.voip.o oVar = tVar.a;
                            if (tVar.J0 == null) {
                                tVar.K0 = false;
                                ImageView imageView = tVar.x0;
                                if (imageView == null) {
                                    tVar.x0 = new ImageView(tVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (oVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = oVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        tVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    tVar.x0.setAlpha(0.0f);
                                } else {
                                    tVar.x0.setAlpha(1.0f);
                                }
                                if (tVar.x0.getParent() == null) {
                                    oVar.addView(tVar.x0);
                                }
                                ((FrameLayout.LayoutParams) tVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                tVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.n(tVar, 1));
                                tVar.J0.addListener(new org.telegram.ui.Components.voip.r(tVar, 2));
                                tVar.J0.setDuration(400L);
                                tVar.J0.setInterpolator(org.telegram.ui.Components.bs.f);
                                tVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (s50Var.i1() != 1) {
                    i11 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 != null && sharedInstance3.isBluetoothHeadsetConnected()) {
                        i11 = 2;
                    }
                }
                s50Var.y3 = Integer.valueOf(i11);
                s50Var.O1(true, true);
                s50Var.y3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(s50Var, i11, 16));
                break;
        }
    }
}
