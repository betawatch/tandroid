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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k20 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.us {
    public boolean D;
    public float E;
    public float F;
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.voip.b2 c;
    public org.telegram.ui.Components.voip.b2 d;
    public g9 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public int y;

    public final void a(float f7, float f10, int i10) {
        this.r = i10;
        this.s = f7;
        this.w = f10;
        invalidate();
        this.x = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        org.telegram.ui.Components.voip.b2 b2Var = this.d;
        org.telegram.ui.Components.voip.b2 b2Var2 = this.c;
        if (b2Var2 == null || b2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z12 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        b2Var2.b(z12, z10);
        if (isBluetoothOn) {
            z11 = z10;
            b2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743529, null), false, z11);
        } else {
            z11 = z10;
            if (z12) {
                b2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z11);
            } else if (sharedInstance.isHeadsetPlugged()) {
                b2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743527, null), false, z11);
            } else {
                b2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.cd.L0(2131743265, null), false, z11);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            b2Var.c(R.drawable.calls_unmute, -1, i0.b.o(-1, 76), 0.1f, true, org.telegram.messenger.cd.L0(2131743317, null), true, z11);
        } else {
            b2Var.c(R.drawable.calls_unmute, -1, i0.b.o(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, org.telegram.messenger.cd.L0(sharedInstance.isMicMute() ? 2131743256 : 2131743319, null), sharedInstance.isMicMute(), z11);
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
            textView.setText(org.telegram.messenger.cd.L0(2131743418, "VoipGroupConnecting"));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            textView.setText(org.telegram.messenger.cd.G(groupCall.participants_count, groupCall.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean mutedByAdmin;
        if (i10 == org.telegram.messenger.zs.w2) {
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
        org.telegram.messenger.u3 u3Var;
        int i10 = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            r8Var.i(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p8[r8.e(chat != null ? chat.id : 0L)], false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q8[r8.e(chat != null ? chat.id : 0L)], false));
            r8Var.q(chat);
            if (chat != null) {
                this.e.j(org.telegram.messenger.ic.e(chat.photo.photo_small), "50_50", r8Var, null);
            }
            if (!sharedInstance.isConference() || (u3Var = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.b.title) ? sharedInstance.groupCall.b.title : chat != null ? chat.title : "";
            } else if (u3Var.e.size() == 1) {
                str = org.telegram.messenger.cd.L0(2131751823, null);
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.e.size()); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(org.telegram.messenger.o5.t(org.telegram.messenger.o5.o(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.e.get(i11)).peer)));
                }
                if (sharedInstance.groupCall.e.size() > 3) {
                    sb2.append(" ");
                    sb2.append(org.telegram.messenger.cd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
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
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.w2);
        b(false);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
        b(true);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.zs.f(this.y).n(this, org.telegram.messenger.zs.w2);
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
        boolean z11 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.D;
        if (z11) {
            float f7 = this.E;
            if (f7 != 1.0f) {
                float f10 = f7 + 0.10666667f;
                this.E = f10;
                if (f10 >= 1.0f) {
                    this.E = 1.0f;
                }
                this.x = true;
                invalidate();
                z10 = this.D;
                if (z10) {
                    float f11 = this.F;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.F = f12;
                        if (f12 >= 1.0f) {
                            this.F = 1.0f;
                        }
                        this.x = true;
                        invalidate();
                        if (this.x) {
                            int f13 = i0.b.f(1.0f - this.E, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Qh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Sh, false));
                            int f14 = i0.b.f(1.0f - this.E, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Rh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Th, false));
                            int f15 = i0.b.f(this.F, f13, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uh, false));
                            int f16 = i0.b.f(this.F, f14, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vh, false));
                            this.x = false;
                            int i12 = this.r;
                            if (i12 == 0) {
                                this.n = new LinearGradient(-org.telegram.messenger.i0.L(60.0f), this.w - getTranslationY(), getMeasuredWidth(), getMeasuredHeight() / 2.0f, new int[]{f15, f16}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i12 == 1) {
                                this.n = new LinearGradient(0.0f, getMeasuredHeight() / 2.0f, org.telegram.messenger.i0.L(60.0f) + getMeasuredWidth(), this.w - getTranslationY(), new int[]{f16, f15}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i12 == 2) {
                                this.n = new LinearGradient(this.s - getTranslationX(), -org.telegram.messenger.i0.L(60.0f), getMeasuredWidth() / 2.0f, getMeasuredHeight(), new int[]{f15, f16}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.n = new LinearGradient(getMeasuredWidth() / 2.0f, 0.0f, this.s - getTranslationX(), org.telegram.messenger.i0.L(60.0f) + getMeasuredHeight(), new int[]{f16, f15}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                        }
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        paint.setShader(this.n);
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
                        i10 = this.r;
                        if (i10 == 0) {
                            measuredHeight = this.w - getTranslationY();
                            translationX = 0.0f;
                        } else if (i10 == 1) {
                            measuredHeight = this.w - getTranslationY();
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
                            canvas.clipRect(translationX - org.telegram.messenger.i0.L(15.0f), measuredHeight - org.telegram.messenger.i0.L(15.0f), translationX, org.telegram.messenger.i0.L(15.0f) + measuredHeight);
                            canvas.translate(org.telegram.messenger.i0.L(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i11 == 1) {
                            canvas.clipRect(translationX, measuredHeight - org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f) + translationX, org.telegram.messenger.i0.L(15.0f) + measuredHeight);
                            canvas.translate(-org.telegram.messenger.i0.L(3.0f), 0.0f);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                        } else if (i11 == 2) {
                            canvas.clipRect(translationX - org.telegram.messenger.i0.L(15.0f), measuredHeight - org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f) + translationX, measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, org.telegram.messenger.i0.L(3.0f));
                        } else {
                            canvas.clipRect(translationX - org.telegram.messenger.i0.L(15.0f), measuredHeight, org.telegram.messenger.i0.L(15.0f) + translationX, org.telegram.messenger.i0.L(15.0f) + measuredHeight);
                            canvas.rotate(45.0f, translationX, measuredHeight);
                            canvas.translate(0.0f, -org.telegram.messenger.i0.L(3.0f));
                        }
                        rectF.set(translationX - org.telegram.messenger.i0.L(10.0f), measuredHeight - org.telegram.messenger.i0.L(10.0f), translationX + org.telegram.messenger.i0.L(10.0f), measuredHeight + org.telegram.messenger.i0.L(10.0f));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                        canvas.restore();
                        super.onDraw(canvas);
                    }
                }
                if (!z10) {
                    float f17 = this.F;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.10666667f;
                        this.F = f18;
                        if (f18 < 0.0f) {
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
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
                i10 = this.r;
                if (i10 == 0) {
                }
                setPivotX(translationX);
                setPivotY(measuredHeight);
                canvas.save();
                i11 = this.r;
                if (i11 == 0) {
                }
                rectF.set(translationX - org.telegram.messenger.i0.L(10.0f), measuredHeight - org.telegram.messenger.i0.L(10.0f), translationX + org.telegram.messenger.i0.L(10.0f), measuredHeight + org.telegram.messenger.i0.L(10.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                canvas.restore();
                super.onDraw(canvas);
            }
        }
        if (!z11) {
            float f19 = this.E;
            if (f19 != 0.0f) {
                float f20 = f19 - 0.10666667f;
                this.E = f20;
                if (f20 < 0.0f) {
                    this.E = 0.0f;
                }
                this.x = true;
                invalidate();
            }
        }
        z10 = this.D;
        if (z10) {
        }
        if (!z10) {
        }
        if (this.x) {
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint);
        i10 = this.r;
        if (i10 == 0) {
        }
        setPivotX(translationX);
        setPivotY(measuredHeight);
        canvas.save();
        i11 = this.r;
        if (i11 == 0) {
        }
        rectF.set(translationX - org.telegram.messenger.i0.L(10.0f), measuredHeight - org.telegram.messenger.i0.L(10.0f), translationX + org.telegram.messenger.i0.L(10.0f), measuredHeight + org.telegram.messenger.i0.L(10.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(230.0f), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i10) {
        c();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }
}
