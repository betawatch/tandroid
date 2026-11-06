package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t10 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.ls {
    public boolean D;
    public float E;
    public float F;
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.voip.n2 c;
    public org.telegram.ui.Components.voip.n2 d;
    public l9 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public int y;

    public final void a(float f10, float f11, int i7) {
        this.r = i7;
        this.s = f10;
        this.w = f11;
        invalidate();
        this.x = true;
    }

    public final void b(boolean z9) {
        VoIPService sharedInstance;
        boolean z10;
        org.telegram.ui.Components.voip.n2 n2Var = this.d;
        org.telegram.ui.Components.voip.n2 n2Var2 = this.c;
        if (n2Var2 == null || n2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z11 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        n2Var2.b(z11, z9);
        if (isBluetoothOn) {
            z10 = z9;
            n2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743504, null), false, z10);
        } else {
            z10 = z9;
            if (z11) {
                n2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.hd.M0(2131743240, null), false, z10);
            } else if (sharedInstance.isHeadsetPlugged()) {
                n2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743502, null), false, z10);
            } else {
                n2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.hd.M0(2131743240, null), false, z10);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            n2Var.c(R.drawable.calls_unmute, -1, i0.a.o(-1, 76), 0.1f, true, org.telegram.messenger.hd.M0(2131743292, null), true, z10);
        } else {
            n2Var.c(R.drawable.calls_unmute, -1, i0.a.o(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, org.telegram.messenger.hd.M0(sharedInstance.isMicMute() ? 2131743231 : 2131743294, null), sharedInstance.isMicMute(), z10);
        }
        invalidate();
    }

    public final void c() {
        TextView textView = this.b;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            textView.setText(org.telegram.messenger.hd.M0(2131743393, "VoipGroupConnecting"));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            textView.setText(org.telegram.messenger.hd.G(groupCall.participants_count, groupCall.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]));
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i7 == org.telegram.messenger.qs.w2) {
            c();
            if (VoIPService.getSharedInstance() == null || (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.D) {
                return;
            }
            this.D = mutedByAdmin;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        org.telegram.messenger.r3 r3Var;
        int i7 = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            w8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p8[w8.e(chat != null ? chat.id : 0L)], false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q8[w8.e(chat != null ? chat.id : 0L)], false));
            w8Var.q(chat);
            if (chat != null) {
                this.e.j(org.telegram.messenger.hc.e(chat.photo.photo_small), "50_50", w8Var, null);
            }
            if (!sharedInstance.isConference() || (r3Var = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.b.title) ? sharedInstance.groupCall.b.title : chat != null ? chat.title : "";
            } else if (r3Var.e.size() == 1) {
                str = org.telegram.messenger.hd.M0(2131751823, null);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.e.size()); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.m5.t(org.telegram.messenger.m5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i10)).peer)));
                }
                if (sharedInstance.groupCall.e.size() > 3) {
                    sb2.append(" ");
                    sb2.append(org.telegram.messenger.hd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
                }
                str = sb2.toString();
            }
            if (str != null) {
                str = str.replace("\n", " ").replaceAll(" +", " ").trim();
            }
            this.a.setText(str);
            c();
            sharedInstance.registerStateListener(this);
            if (VoIPService.getSharedInstance() != null) {
                this.D = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.F = this.D ? 1.0f : 0.0f;
            this.E = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.D) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.w2);
        b(false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.qs.f(this.y).n(this, org.telegram.messenger.qs.w2);
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
        boolean z9;
        int i7;
        float translationX;
        float measuredHeight;
        int i10;
        Paint paint = this.h;
        RectF rectF = this.f;
        boolean z10 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.D;
        if (z10) {
            float f10 = this.E;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.E = f11;
                if (f11 >= 1.0f) {
                    this.E = 1.0f;
                }
                this.x = true;
                invalidate();
                z9 = this.D;
                if (z9) {
                    float f12 = this.F;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.F = f13;
                        if (f13 >= 1.0f) {
                            this.F = 1.0f;
                        }
                        this.x = true;
                        invalidate();
                        if (this.x) {
                            int f14 = i0.a.f(1.0f - this.E, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            int f15 = i0.a.f(1.0f - this.E, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Th, false));
                            int f16 = i0.a.f(this.F, f14, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uh, false));
                            int f17 = i0.a.f(this.F, f15, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vh, false));
                            this.x = false;
                            int i11 = this.r;
                            if (i11 == 0) {
                                this.n = new LinearGradient(-org.telegram.messenger.g0.L(60.0f), this.w - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{f16, f17}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i11 == 1) {
                                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.g0.L(60.0f) + getMeasuredWidth(), this.w - getTranslationY(), new int[]{f17, f16}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i11 == 2) {
                                this.n = new LinearGradient(this.s - getTranslationX(), -org.telegram.messenger.g0.L(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{f16, f17}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight(), new int[]{f17, f16}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                        }
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        paint.setShader(this.n);
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
                        i7 = this.r;
                        if (i7 == 0) {
                            measuredHeight = this.w - getTranslationY();
                            translationX = 0.0f;
                        } else if (i7 == 1) {
                            measuredHeight = this.w - getTranslationY();
                            translationX = getMeasuredWidth();
                        } else if (i7 == 2) {
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
                            canvas.clipRect(translationX - org.telegram.messenger.g0.L(15.0f), measuredHeight - org.telegram.messenger.g0.L(15.0f), translationX, org.telegram.messenger.g0.L(15.0f) + measuredHeight);
                            canvas.translate(org.telegram.messenger.g0.L(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i10 == 1) {
                            canvas.clipRect(translationX, measuredHeight - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + translationX, org.telegram.messenger.g0.L(15.0f) + measuredHeight);
                            canvas.translate(-org.telegram.messenger.g0.L(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i10 == 2) {
                            canvas.clipRect(translationX - org.telegram.messenger.g0.L(15.0f), measuredHeight - org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f) + translationX, measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, org.telegram.messenger.g0.L(3.0f));
                        } else {
                            canvas.clipRect(translationX - org.telegram.messenger.g0.L(15.0f), measuredHeight, org.telegram.messenger.g0.L(15.0f) + translationX, org.telegram.messenger.g0.L(15.0f) + measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, -org.telegram.messenger.g0.L(3.0f));
                        }
                        rectF.set(translationX - org.telegram.messenger.g0.L(10.0f), measuredHeight - org.telegram.messenger.g0.L(10.0f), translationX + org.telegram.messenger.g0.L(10.0f), measuredHeight + org.telegram.messenger.g0.L(10.0f));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                        canvas.restore();
                        super.onDraw(canvas);
                    }
                }
                if (!z9) {
                    float f18 = this.F;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.10666667f;
                        this.F = f19;
                        if (f19 < 0.0f) {
                            this.F = 0.0f;
                        }
                        this.x = true;
                        invalidate();
                    }
                }
                if (this.x) {
                }
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                paint.setShader(this.n);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
                i7 = this.r;
                if (i7 == 0) {
                }
                setPivotX(translationX);
                setPivotY(measuredHeight);
                canvas.save();
                i10 = this.r;
                if (i10 == 0) {
                }
                rectF.set(translationX - org.telegram.messenger.g0.L(10.0f), measuredHeight - org.telegram.messenger.g0.L(10.0f), translationX + org.telegram.messenger.g0.L(10.0f), measuredHeight + org.telegram.messenger.g0.L(10.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas.restore();
                super.onDraw(canvas);
            }
        }
        if (!z10) {
            float f20 = this.E;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.10666667f;
                this.E = f21;
                if (f21 < 0.0f) {
                    this.E = 0.0f;
                }
                this.x = true;
                invalidate();
            }
        }
        z9 = this.D;
        if (z9) {
        }
        if (!z9) {
        }
        if (this.x) {
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        i7 = this.r;
        if (i7 == 0) {
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        i10 = this.r;
        if (i10 == 0) {
        }
        rectF.set(translationX - org.telegram.messenger.g0.L(10.0f), measuredHeight - org.telegram.messenger.g0.L(10.0f), translationX + org.telegram.messenger.g0.L(10.0f), measuredHeight + org.telegram.messenger.g0.L(10.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i7) {
        c();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }
}
