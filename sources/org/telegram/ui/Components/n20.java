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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n20 extends LinearLayout implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate {
    public float A;
    public float B;
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.voip.u2 c;
    public org.telegram.ui.Components.voip.u2 d;
    public o9 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public int x;
    public boolean y;

    public static /* synthetic */ void a(n20 n20Var, Context context) {
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(n20Var.getContext(), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context));
    }

    public static void b(n20 n20Var, Context context) {
        org.telegram.ui.o50.t1(n20Var.getContext(), new l20(context, 0), Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context), false);
    }

    public final void c(float f10, float f11, int i9) {
        this.r = i9;
        this.s = f10;
        this.v = f11;
        invalidate();
        this.w = true;
    }

    public final void d(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        org.telegram.ui.Components.voip.u2 u2Var = this.d;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.c;
        if (u2Var2 == null || u2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z12 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        u2Var2.b(z12, z10);
        if (isBluetoothOn) {
            z11 = z10;
            u2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z11);
        } else {
            z11 = z10;
            if (z12) {
                u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            } else if (sharedInstance.isHeadsetPlugged()) {
                u2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z11);
            } else {
                u2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z11);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            u2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, 76), 0.1f, true, LocaleController.getString(R.string.VoipMutedByAdminShort), true, z11);
        } else {
            u2Var.c(R.drawable.calls_unmute, -1, i0.a.k(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, LocaleController.getString(sharedInstance.isMicMute() ? R.string.VoipUnmute : R.string.VoipMute), sharedInstance.isMicMute(), z11);
        }
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i9 == NotificationCenter.groupCallUpdated) {
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
        int i9 = this.x;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            z8Var.i(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p8[z8.e(chat != null ? chat.id : 0L)], false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q8[z8.e(chat != null ? chat.id : 0L)], false));
            z8Var.k(i9, chat);
            if (chat != null) {
                this.e.h(ImageLocation.getForLocal(chat.photo.photo_small), "50_50", z8Var, null);
            }
            if (!sharedInstance.isConference() || (call = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.call.title) ? sharedInstance.groupCall.call.title : chat != null ? chat.title : "";
            } else if (call.sortedParticipants.size() == 1) {
                str = LocaleController.getString(R.string.ConferenceChat);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(DialogObject.getShortName(DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i10).peer)));
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
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupCallUpdated);
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
        int i9;
        float translationX;
        float measuredHeight;
        int i10;
        Paint paint = this.h;
        RectF rectF = this.f;
        boolean z11 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.y;
        if (z11) {
            float f10 = this.A;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.A = f11;
                if (f11 >= 1.0f) {
                    this.A = 1.0f;
                }
                this.w = true;
                invalidate();
                z10 = this.y;
                if (z10) {
                    float f12 = this.B;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.B = f13;
                        if (f13 >= 1.0f) {
                            this.B = 1.0f;
                        }
                        this.w = true;
                        invalidate();
                        if (this.w) {
                            int d = i0.a.d(1.0f - this.A, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ch, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.eh, false));
                            int d9 = i0.a.d(1.0f - this.A, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.dh, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fh, false));
                            int d10 = i0.a.d(this.B, d, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gh, false));
                            int d11 = i0.a.d(this.B, d9, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hh, false));
                            this.w = false;
                            int i11 = this.r;
                            if (i11 == 0) {
                                this.n = new LinearGradient(-AndroidUtilities.dp(60.0f), this.v - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{d10, d11}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i11 == 1) {
                                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(60.0f) + getMeasuredWidth(), this.v - getTranslationY(), new int[]{d11, d10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i11 == 2) {
                                this.n = new LinearGradient(this.s - getTranslationX(), -AndroidUtilities.dp(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{d10, d11}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), AndroidUtilities.dp(60.0f) + getMeasuredHeight(), new int[]{d11, d10}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                        }
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        paint.setShader(this.n);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
                        i9 = this.r;
                        if (i9 == 0) {
                            measuredHeight = this.v - getTranslationY();
                            translationX = 0.0f;
                        } else if (i9 == 1) {
                            measuredHeight = this.v - getTranslationY();
                            translationX = getMeasuredWidth();
                        } else if (i9 == 2) {
                            translationX = this.s - getTranslationX();
                            measuredHeight = 0.0f;
                        } else {
                            translationX = this.s - getTranslationX();
                            measuredHeight = getMeasuredHeight();
                        }
                        setPivotX(translationX);
                        setPivotY(measuredHeight);
                        canvas.save();
                        i10 = this.r;
                        if (i10 == 0) {
                            canvas.clipRect(translationX - AndroidUtilities.dp(15.0f), measuredHeight - AndroidUtilities.dp(15.0f), translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
                            canvas.translate(AndroidUtilities.dp(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i10 == 1) {
                            canvas.clipRect(translationX, measuredHeight - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f) + translationX, AndroidUtilities.dp(15.0f) + measuredHeight);
                            canvas.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i10 == 2) {
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
                    float f14 = this.B;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.B = f15;
                        if (f15 < 0.0f) {
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
                i9 = this.r;
                if (i9 == 0) {
                }
                setPivotX(translationX);
                setPivotY(measuredHeight);
                canvas.save();
                i10 = this.r;
                if (i10 == 0) {
                }
                rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas.restore();
                super.onDraw(canvas);
            }
        }
        if (!z11) {
            float f16 = this.A;
            if (f16 != 0.0f) {
                float f17 = f16 - 0.10666667f;
                this.A = f17;
                if (f17 < 0.0f) {
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
        i9 = this.r;
        if (i9 == 0) {
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        i10 = this.r;
        if (i10 == 0) {
        }
        rectF.set(translationX - AndroidUtilities.dp(10.0f), measuredHeight - AndroidUtilities.dp(10.0f), translationX + AndroidUtilities.dp(10.0f), measuredHeight + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i9) {
        e();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }
}
