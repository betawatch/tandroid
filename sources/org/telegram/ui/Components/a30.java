package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a30 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float A;
    public float B;
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.voip.x2 c;
    public org.telegram.ui.Components.voip.x2 d;
    public t9 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public int x;
    public boolean y;

    public static /* synthetic */ void a(a30 a30Var, Context context) {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(a30Var.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    public static void b(a30 a30Var, Context context) {
        org.telegram.ui.r50.t1(a30Var.getContext(), new y20(context, 0), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context), false);
    }

    public final void c(float f9, float f10, int i10) {
        this.r = i10;
        this.s = f9;
        this.v = f10;
        invalidate();
        this.w = true;
    }

    public final void d(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        org.telegram.ui.Components.voip.x2 x2Var = this.d;
        org.telegram.ui.Components.voip.x2 x2Var2 = this.c;
        if (x2Var2 == null || x2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z12 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        x2Var2.b(z12, z10);
        if (isBluetoothOn) {
            z11 = z10;
            x2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z11);
        } else {
            z11 = z10;
            if (z12) {
                x2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            } else if (sharedInstance.isHeadsetPlugged()) {
                x2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z11);
            } else {
                x2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            x2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z11);
        } else {
            x2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, LocaleController.getString(sharedInstance.isMicMute() ? R.string.VoipUnmute : R.string.VoipMute), sharedInstance.isMicMute(), z11);
        }
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == NotificationCenter.groupCallUpdated) {
            e();
            if (VoIPService.getSharedInstance() == null || (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.y) {
                return;
            }
            this.y = mutedByAdmin;
            invalidate();
        }
    }

    public final void e() {
        TextView textView = this.b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            textView.setText(LocaleController.getString("VoipGroupConnecting", R.string.VoipGroupConnecting));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.call;
            textView.setText(LocaleController.formatPluralString(groupCall.rtmp_stream ? "ViewersWatching" : "Participants", groupCall.participants_count, new Object[0]));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        ChatObject.Call call;
        int i10 = this.x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            e9Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p8[e9.e(chat != null ? chat.id : 0L)], false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q8[e9.e(chat != null ? chat.id : 0L)], false));
            e9Var.k(i10, chat);
            if (chat != null) {
                this.e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", e9Var, null);
            }
            if (!sharedInstance.isConference() || (call = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.call.title) ? sharedInstance.groupCall.call.title : chat != null ? chat.title : "";
            } else if (call.sortedParticipants.size() == 1) {
                str = LocaleController.getString(R.string.ConferenceChat);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                }
                if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                    sb2.append(" ");
                    sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                }
                str = sb2.toString();
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.a.setText(str);
            e();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.y = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.B = this.y ? 1.0f : 0.0f;
            this.A = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.y) ? 1.0f : 0.0f;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
        d(false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        d(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        NotificationCenter.getInstance(this.x).removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0070  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        float translationX;
        float measuredHeight;
        int i11;
        Paint paint = this.h;
        RectF rectF = this.f;
        boolean z11 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.y;
        if (z11) {
            float f9 = this.A;
            if (f9 != 1.0f) {
                float f10 = f9 + 0.10666667f;
                this.A = f10;
                if (f10 >= 1.0f) {
                    this.A = 1.0f;
                }
                this.w = true;
                invalidate();
                z10 = this.y;
                if (z10) {
                    float f11 = this.B;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.B = f12;
                        if (f12 >= 1.0f) {
                            this.B = 1.0f;
                        }
                        this.w = true;
                        invalidate();
                        if (this.w) {
                            int d = i0.a.d(1.0f - this.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ch, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.eh, false));
                            int d10 = i0.a.d(1.0f - this.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.dh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fh, false));
                            int d11 = i0.a.d(this.B, d, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gh, false));
                            int d12 = i0.a.d(this.B, d10, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hh, false));
                            this.w = false;
                            int i12 = this.r;
                            if (i12 == 0) {
                                this.n = new LinearGradient(-AndroidUtilities.dp(60.0f), this.v - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{d11, d12}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i12 == 1) {
                                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(60.0f) + getMeasuredWidth(), this.v - getTranslationY(), new int[]{d12, d11}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i12 == 2) {
                                this.n = new LinearGradient(this.s - getTranslationX(), -AndroidUtilities.dp(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{d11, d12}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), AndroidUtilities.dp(60.0f) + getMeasuredHeight(), new int[]{d12, d11}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                        }
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        paint.setShader(this.n);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
                        i10 = this.r;
                        if (i10 == 0) {
                            measuredHeight = this.v - getTranslationY();
                            translationX = 0.0f;
                        } else if (i10 == 1) {
                            measuredHeight = this.v - getTranslationY();
                            translationX = getMeasuredWidth();
                        } else if (i10 == 2) {
                            translationX = this.s - getTranslationX();
                            measuredHeight = 0.0f;
                        } else {
                            translationX = this.s - getTranslationX();
                            measuredHeight = getMeasuredHeight();
                        }
                        setPivotX(translationX);
                        setPivotY(measuredHeight);
                        canvas.save();
                        i11 = this.r;
                        if (i11 == 0) {
                            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
                            canvas.translate(AndroidUtilities.dp(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i11 == 1) {
                            canvas.clipRect(translationX, measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
                            canvas.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i11 == 2) {
                            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, AndroidUtilities.dp(3.0f));
                        } else {
                            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight, AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, -AndroidUtilities.dp(3.0f));
                        }
                        rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                        canvas.restore();
                        super.onDraw(canvas);
                    }
                }
                if (!z10) {
                    float f13 = this.B;
                    if (f13 != 0.0f) {
                        float f14 = f13 - 0.10666667f;
                        this.B = f14;
                        if (f14 < 0.0f) {
                            this.B = 0.0f;
                        }
                        this.w = true;
                        invalidate();
                    }
                }
                if (this.w) {
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                paint.setShader(this.n);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
                i10 = this.r;
                if (i10 == 0) {
                }
                setPivotX(translationX);
                setPivotY(measuredHeight);
                canvas.save();
                i11 = this.r;
                if (i11 == 0) {
                }
                rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas.restore();
                super.onDraw(canvas);
            }
        }
        if (!z11) {
            float f15 = this.A;
            if (f15 != 0.0f) {
                float f16 = f15 - 0.10666667f;
                this.A = f16;
                if (f16 < 0.0f) {
                    this.A = 0.0f;
                }
                this.w = true;
                invalidate();
            }
        }
        z10 = this.y;
        if (z10) {
        }
        if (!z10) {
        }
        if (this.w) {
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        i10 = this.r;
        if (i10 == 0) {
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        i11 = this.r;
        if (i11 == 0) {
        }
        rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        e();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }
}
