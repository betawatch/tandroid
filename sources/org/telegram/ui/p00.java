package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c40 b;

    public /* synthetic */ p00(c40 c40Var, int i7) {
        this.a = i7;
        this.b = c40Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 2;
        c40 c40Var = this.b;
        switch (i7) {
            case 0:
                if (c40Var.u1()) {
                    org.telegram.ui.Components.voip.g1.k(c40Var.Z1);
                    break;
                } else {
                    org.telegram.ui.Components.p10.f0 = false;
                    c40Var.dismiss();
                    break;
                }
            case 1:
                c40Var.getClass();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        break;
                    } else {
                        LaunchActivity launchActivity = c40Var.Z1;
                        if (launchActivity != null) {
                            c40Var.Z1.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                            break;
                        }
                    }
                }
                break;
            case 2:
                org.telegram.messenger.r3 r3Var = c40Var.R2;
                if (r3Var != null && r3Var.w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    break;
                }
                break;
            case 3:
                h20 h20Var = c40Var.y1;
                if (h20Var.m()) {
                    h20Var.j();
                    break;
                } else {
                    h20Var.d();
                    break;
                }
            case 4:
                Editable text = c40Var.y1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = org.telegram.messenger.ui.b0(c40Var.a).W(new CharSequence[]{text}, true, true);
                c40Var.F1(tL_textWithEntities);
                break;
            case 5:
                int R0 = c40Var.R0();
                if (R0 > 0 && R0 != Integer.MAX_VALUE) {
                    c40Var.H1.w0(0, R0, null);
                }
                org.telegram.ui.Components.et etVar = c40Var.y1.a;
                etVar.requestFocus();
                org.telegram.messenger.g0.K3(etVar);
                break;
            case 6:
                org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                if (r3Var2 == null || r3Var2.j() || c40Var.u1()) {
                    c40Var.m1(false);
                    break;
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(c40Var.getContext(), false);
                    break;
                }
                break;
            case 7:
                org.telegram.messenger.r3 r3Var3 = c40Var.R2;
                if (r3Var3 != null && r3Var3.w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.r3 r3Var4 = c40Var.R2;
                if (r3Var4 != null && r3Var4.w) {
                    c40Var.M1(c40Var.F1.getTitleTextView());
                    break;
                }
                break;
            case 9:
                ArrayList arrayList = c40Var.P3;
                org.telegram.ui.Components.zg0 zg0Var = c40Var.x4;
                c40Var.R3.e();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (c40Var.y4 == 18) {
                        c40Var.y4 = 39;
                        zg0Var.P(39);
                        zg0Var.start();
                    } else {
                        zg0Var.N(0, false, false);
                        c40Var.y4 = 18;
                        zg0Var.P(18);
                        zg0Var.start();
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) arrayList.get(i11);
                        org.telegram.messenger.s3 s3Var = yVar.x;
                        if (s3Var.a.self && !s3Var.b) {
                            org.telegram.ui.Components.voip.u uVar = yVar.a;
                            if (yVar.J0 == null) {
                                yVar.K0 = false;
                                ImageView imageView = yVar.x0;
                                if (imageView == null) {
                                    yVar.x0 = new ImageView(yVar.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (uVar.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = uVar.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        yVar.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    yVar.x0.setAlpha(0.0f);
                                } else {
                                    yVar.x0.setAlpha(1.0f);
                                }
                                if (yVar.x0.getParent() == null) {
                                    uVar.addView(yVar.x0);
                                }
                                ((FrameLayout.LayoutParams) yVar.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                yVar.J0 = ofFloat;
                                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.t(yVar, 1));
                                yVar.J0.addListener(new org.telegram.ui.Components.voip.w(yVar, 2));
                                yVar.J0.setDuration(400L);
                                yVar.J0.setInterpolator(org.telegram.ui.Components.xq.f);
                                yVar.J0.start();
                            }
                        }
                    }
                    break;
                }
                break;
            case 10:
                if (c40Var.k1() != 1) {
                    i10 = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i10 = 0;
                    }
                }
                c40Var.p5 = Integer.valueOf(i10);
                c40Var.T1(true, true);
                c40Var.p5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.r2(c40Var, i10, 13));
                break;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = c40Var.b3;
                org.telegram.ui.ActionBar.z0 z0Var = c40Var.m3;
                org.telegram.ui.ActionBar.z0 z0Var2 = c40Var.l3;
                org.telegram.ui.ActionBar.z0 z0Var3 = c40Var.g3;
                org.telegram.messenger.r3 r3Var5 = c40Var.R2;
                if (r3Var5 != null && !c40Var.R3.b) {
                    if (r3Var5.b.join_muted) {
                        int i12 = org.telegram.ui.ActionBar.k6.Vg;
                        z0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                        z0Var2.setChecked(false);
                        int i13 = org.telegram.ui.ActionBar.k6.kh;
                        z0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i13, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                        z0Var.setChecked(true);
                    } else {
                        int i14 = org.telegram.ui.ActionBar.k6.kh;
                        z0Var2.d(org.telegram.ui.ActionBar.k6.x0(null, i14, false), org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                        z0Var2.setChecked(true);
                        int i15 = org.telegram.ui.ActionBar.k6.Vg;
                        z0Var.d(org.telegram.ui.ActionBar.k6.x0(null, i15, false), org.telegram.ui.ActionBar.k6.x0(null, i15, false));
                        z0Var.setChecked(false);
                    }
                    c40Var.c2 = false;
                    r0Var.t(1);
                    r0Var.t(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            z0Var3.setIcon(R.drawable.msg_voice_bluetooth);
                            z0Var3.setSubtext(VoIPService.getSharedInstance().currentBluetoothDeviceName != null ? VoIPService.getSharedInstance().currentBluetoothDeviceName : org.telegram.messenger.hd.M0(2131743504, null));
                        } else {
                            int i16 = R.drawable.msg_voice_phone;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i16 = R.drawable.msg_voice_headphones;
                                }
                                z0Var3.setIcon(i16);
                                z0Var3.setSubtext(org.telegram.messenger.hd.M0(VoIPService.getSharedInstance().isHeadsetPlugged() ? 2131743502 : 2131743501, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    z0Var3.setIcon(R.drawable.msg_voice_speaker);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743500, null));
                                } else {
                                    z0Var3.setIcon(R.drawable.msg_voice_phone);
                                    z0Var3.setSubtext(org.telegram.messenger.hd.M0(2131743501, null));
                                }
                            }
                        }
                    }
                    c40Var.O1();
                    r0Var.U(null, null);
                    break;
                }
                break;
        }
    }
}
