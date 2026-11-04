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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p10 extends LinearLayout implements VoIPService.StateListener, org.telegram.messenger.cs {
    public boolean E;
    public float F;
    public float G;
    public TextView a;
    public TextView b;
    public org.telegram.ui.Components.voip.c2 c;
    public org.telegram.ui.Components.voip.c2 d;
    public k9 e;
    public RectF f;
    public Paint h;
    public LinearGradient n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public int y;

    public final void a(float f10, float f11, int i3) {
        this.r = i3;
        this.s = f10;
        this.w = f11;
        invalidate();
        this.x = true;
    }

    public final void b(boolean z10) {
        VoIPService sharedInstance;
        boolean z11;
        org.telegram.ui.Components.voip.c2 c2Var = this.d;
        org.telegram.ui.Components.voip.c2 c2Var2 = this.c;
        if (c2Var2 == null || c2Var == null || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        boolean isBluetoothOn = sharedInstance.isBluetoothOn();
        boolean z12 = !isBluetoothOn && sharedInstance.isSpeakerphoneOn();
        c2Var2.b(z12, z10);
        if (isBluetoothOn) {
            z11 = z10;
            c2Var2.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743513, null), false, z11);
        } else {
            z11 = z10;
            if (z12) {
                c2Var2.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z11);
            } else if (sharedInstance.isHeadsetPlugged()) {
                c2Var2.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743511, null), false, z11);
            } else {
                c2Var2.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z11);
            }
        }
        if (sharedInstance.mutedByAdmin()) {
            c2Var.c(R.drawable.calls_unmute, -1, i0.a.o(-1, 76), 0.1f, true, org.telegram.messenger.bd.M0(2131743301, null), true, z11);
        } else {
            c2Var.c(R.drawable.calls_unmute, -1, i0.a.o(-1, (int) ((sharedInstance.isMicMute() ? 0.3f : 0.15f) * 255.0f)), 0.1f, true, org.telegram.messenger.bd.M0(sharedInstance.isMicMute() ? 2131743240 : 2131743303, null), sharedInstance.isMicMute(), z11);
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
            textView.setText(org.telegram.messenger.bd.M0(2131743402, "VoipGroupConnecting"));
        } else {
            TLRPC.GroupCall groupCall = sharedInstance.groupCall.b;
            textView.setText(org.telegram.messenger.bd.G(groupCall.participants_count, groupCall.rtmp_stream ? "ViewersWatching" : "Participants", new Object[0]));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean mutedByAdmin;
        if (i3 == org.telegram.messenger.hs.w2) {
            c();
            if (VoIPService.getSharedInstance() == null || (mutedByAdmin = VoIPService.getSharedInstance().mutedByAdmin()) == this.E) {
                return;
            }
            this.E = mutedByAdmin;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        org.telegram.messenger.r3 r3Var;
        int i3 = this.y;
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
            TLRPC.Chat chat = sharedInstance.getChat();
            u8Var.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p8[u8.e(chat != null ? chat.id : 0L)], false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q8[u8.e(chat != null ? chat.id : 0L)], false));
            u8Var.q(chat);
            if (chat != null) {
                this.e.j(org.telegram.messenger.ac.e(chat.photo.photo_small), "50_50", u8Var, null);
            }
            if (!sharedInstance.isConference() || (r3Var = sharedInstance.groupCall) == null) {
                str = !TextUtils.isEmpty(sharedInstance.groupCall.b.title) ? sharedInstance.groupCall.b.title : chat != null ? chat.title : "";
            } else if (r3Var.e.size() == 1) {
                str = org.telegram.messenger.bd.M0(2131751823, null);
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
                    sb2.append(org.telegram.messenger.bd.G(sharedInstance.groupCall.e.size() - 3, "AndOther", new Object[0]));
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
                this.E = VoIPService.getSharedInstance().mutedByAdmin();
            }
            this.G = this.E ? 1.0f : 0.0f;
            this.F = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E) ? 1.0f : 0.0f;
        }
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.w2);
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
    public final /* synthetic */ void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
        org.telegram.messenger.hs.f(this.y).n(this, org.telegram.messenger.hs.w2);
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
        int i3;
        float translationX;
        float measuredHeight;
        int i10;
        Paint paint = this.h;
        RectF rectF = this.f;
        boolean z11 = VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute() || this.E;
        if (z11) {
            float f10 = this.F;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.F = f11;
                if (f11 >= 1.0f) {
                    this.F = 1.0f;
                }
                this.x = true;
                invalidate();
                z10 = this.E;
                if (z10) {
                    float f12 = this.G;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.G = f13;
                        if (f13 >= 1.0f) {
                            this.G = 1.0f;
                        }
                        this.x = true;
                        invalidate();
                        if (this.x) {
                            int f14 = i0.a.f(1.0f - this.F, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                            int f15 = i0.a.f(1.0f - this.F, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Rh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Th, false));
                            int f16 = i0.a.f(this.G, f14, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uh, false));
                            int f17 = i0.a.f(this.G, f15, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vh, false));
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
                        i3 = this.r;
                        if (i3 == 0) {
                            measuredHeight = this.w - getTranslationY();
                            translationX = 0.0f;
                        } else if (i3 == 1) {
                            measuredHeight = this.w - getTranslationY();
                            translationX = getMeasuredWidth();
                        } else if (i3 == 2) {
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
                if (!z10) {
                    float f18 = this.G;
                    if (f18 != 0.0f) {
                        float f19 = f18 - 0.10666667f;
                        this.G = f19;
                        if (f19 < 0.0f) {
                            this.G = 0.0f;
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
                i3 = this.r;
                if (i3 == 0) {
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
        if (!z11) {
            float f20 = this.F;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.10666667f;
                this.F = f21;
                if (f21 < 0.0f) {
                    this.F = 0.0f;
                }
                this.x = true;
                invalidate();
            }
        }
        z10 = this.E;
        if (z10) {
        }
        if (!z10) {
        }
        if (this.x) {
        }
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        paint.setShader(this.n);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        i3 = this.r;
        if (i3 == 0) {
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(230.0f), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i3) {
        c();
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }
}
