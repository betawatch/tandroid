package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ve extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = f6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.a1) {
            cf cfVar = chatActivityEnterView.S0;
            float f7 = 1.0f;
            if (cfVar != null && cfVar.getVisibility() == 0) {
                f7 = 1.0f - chatActivityEnterView.S0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.Yd);
            Paint paint = this.a;
            paint.setColor(i02);
            float dpf22 = AndroidUtilities.dpf2(3.0f);
            float dpf23 = AndroidUtilities.dpf2(38.0f);
            float measuredWidth = (getMeasuredWidth() - AndroidUtilities.dpf2(38.0f)) - dpf22;
            float measuredHeight = (getMeasuredHeight() - dpf23) - dpf22;
            float measuredWidth2 = getMeasuredWidth() - dpf22;
            float measuredHeight2 = getMeasuredHeight() - dpf22;
            RectF rectF = this.b;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            canvas.save();
            canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.k5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        le leVar;
        long j3;
        long j10;
        long j11;
        float f7;
        ChatActivityEnterView chatActivityEnterView = this.d;
        ve veVar = chatActivityEnterView.Z0;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        bf bfVar = chatActivityEnterView.G3;
        lg lgVar = chatActivityEnterView.J3;
        ye yeVar = chatActivityEnterView.J0;
        final int i10 = 0;
        if (!chatActivityEnterView.k5) {
            chatActivityEnterView.Y();
            final int i11 = 3;
            final int i12 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.r4) {
                    TLRPC.Chat chat = eoVar == null ? null : eoVar.e;
                    TLRPC.UserFull userFull = eoVar == null ? chatActivityEnterView.K : eoVar.a8;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.d2)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.Y2.g2();
                        return true;
                    }
                    if (!chatActivityEnterView.d2) {
                        lgVar.run();
                        return true;
                    }
                    chatActivityEnterView.I3 = false;
                    chatActivityEnterView.H3 = true;
                    AndroidUtilities.runOnUIThread(lgVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.d2;
                if (!z10 || chatActivityEnterView.I3) {
                    chatActivityEnterView.C2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.c1) {
                        if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.N2;
                            long a2 = eoVar.a();
                            q2 q2Var = new q2(6);
                            bi.f0 f0Var = new bi.f0(23);
                            Pattern pattern = d5.a;
                            org.telegram.ui.ActionBar.f6 f6Var = this.c;
                            d5.K(activity, a2, -1L, 0, false, q2Var, f0Var, new b5(f6Var), f6Var);
                        }
                        if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                            if (chatActivityEnterView.c1) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.j1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.Y2.m1();
                            } else {
                                if (chatActivityEnterView.r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.j1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.te
                                public final /* synthetic */ ve b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i12) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.O, 0L);
                        chatActivityEnterView.Y2.a1(0);
                    } else {
                        if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.j1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.Y2.m1();
                            d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.te
                                public final /* synthetic */ ve b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.Y2.i2(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    }
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ue
                        public final /* synthetic */ ve b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.f0 = null;
                                    chatActivityEnterView2.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.f0 = null;
                                    chatActivityEnterView3.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            final int i13 = 2;
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.E2) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.r4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.k4 == -1.0f) {
                                chatActivityEnterView2.j4 = y3;
                            }
                            chatActivityEnterView2.k4 = y3;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.q4 || chatActivityEnterView2.i4 < 0.7f || chatActivityEnterView2.j4 - chatActivityEnterView2.k4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                                float f10 = x10 - recordCircle2.F;
                                float f11 = y3 - recordCircle2.G;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.G = y3;
                                recordCircle2.F = x10;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.d4 && chatActivityEnterView3.f4 == 0.0f && f12 > recordCircle2.E) {
                                    f7 = 1.0f;
                                    chatActivityEnterView3.e4 = System.currentTimeMillis();
                                } else {
                                    f7 = 1.0f;
                                }
                                if (chatActivityEnterView.C2 == -1.0f) {
                                    chatActivityEnterView.C2 = x10;
                                    float measuredWidth = (float) (chatActivityEnterView.l1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.D2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.D2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x11 = veVar.getX() + x10;
                                float f13 = chatActivityEnterView.C2;
                                float f14 = ((x11 - f13) / chatActivityEnterView.D2) + f7;
                                if (f13 != -1.0f) {
                                    float f15 = f14 > f7 ? 1.0f : f14 < 0.0f ? 0.0f : f14;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.j1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f15;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f15);
                                    f14 = f15;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.d2 && chatActivityEnterView.c1) {
                                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                                        chatActivityEnterView.Y2.i2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                                        chatActivityEnterView.R4 = 0L;
                                        yeVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.Y2.a1(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                                    }
                                    chatActivityEnterView.E2 = false;
                                    chatActivityEnterView.L1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.r4 = true;
                                ug ugVar = chatActivityEnterView2.N1;
                                if (ugVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    ugVar.a();
                                    bi.x4 x4Var = new bi.x4(ugVar.getContext(), 2);
                                    ugVar.a = x4Var;
                                    x4Var.l(1.0f, 0.0f);
                                    ugVar.a.p(true);
                                    ugVar.a.s(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    ugVar.addView(ugVar.a, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    bi.x4 x4Var2 = ugVar.a;
                                    x4Var2.l0 = new sg(ugVar, x4Var2, 3);
                                    x4Var2.u();
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.E2) {
                if (chatActivityEnterView.i4 >= 0.7f) {
                    chatActivityEnterView.r4 = true;
                    ChatActivityEnterView.m(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.d2 && chatActivityEnterView.c1) {
                    CameraController.getInstance().cancelOnInitRunnable(bfVar);
                    chatActivityEnterView.Y2.i2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                    j11 = 0;
                    chatActivityEnterView.R4 = 0L;
                    yeVar.setEffect(0L);
                } else {
                    chatActivityEnterView.Y2.a1(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                    j11 = 0;
                }
                chatActivityEnterView.i1 = j11;
                chatActivityEnterView.E2 = false;
                chatActivityEnterView.L1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.M1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.r4) && ((leVar = chatActivityEnterView.e1) == null || leVar.getVisibility() != 0)) {
                if ((((veVar.getX() + motionEvent.getX()) - chatActivityEnterView.C2) / chatActivityEnterView.D2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.d2 && chatActivityEnterView.c1) {
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        chatActivityEnterView.Y2.i2(2, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.Y2.a1(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.O, 0L);
                        j10 = 0;
                    }
                    chatActivityEnterView.i1 = j10;
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.L1(5, true);
                    return true;
                }
                if (chatActivityEnterView.H3) {
                    AndroidUtilities.cancelRunOnUIThread(lgVar);
                    if (chatActivityEnterView.y0 && chatActivityEnterView.x0) {
                        chatActivityEnterView.Y2.Z(!chatActivityEnterView.c1);
                        chatActivityEnterView.k1(!chatActivityEnterView.c1, true);
                    } else {
                        chatActivityEnterView.Y2.g2();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.d2;
                if (!z12 || chatActivityEnterView.I3) {
                    chatActivityEnterView.C2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.c1) {
                        j3 = 0;
                        if (!chatActivityEnterView.y0) {
                            chatActivityEnterView.Y2.g2();
                        } else {
                            if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                                if (chatActivityEnterView.r4) {
                                    chatActivityEnterView.I3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.O);
                                chatActivityEnterView.Y2.a1(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.j1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.te
                                    public final /* synthetic */ ve b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        Long l4 = (Long) obj;
                                        switch (i11) {
                                            case 0:
                                                this.b.d.T0(0, true, 0, false, l4.longValue());
                                                break;
                                            case 1:
                                                this.b.d.T0(0, true, 0, false, l4.longValue());
                                                break;
                                            case 2:
                                                this.b.d.T0(0, true, 0, false, l4.longValue());
                                                break;
                                            default:
                                                this.b.d.T0(0, true, 0, false, l4.longValue());
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.E2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.N2;
                                long a10 = eoVar.a();
                                q2 q2Var2 = new q2(7);
                                bi.f0 f0Var2 = new bi.f0(24);
                                org.telegram.ui.ActionBar.f6 f6Var2 = this.c;
                                d5.K(activity2, a10, -1L, 0, false, q2Var2, f0Var2, new b5(f6Var2), f6Var2);
                            }
                            chatActivityEnterView.Y2.a1(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.O, 0L);
                        }
                    } else {
                        if (d5.d0(chatActivityEnterView.Q, chatActivityEnterView.P2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.j1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.Y2.m1();
                            d5.a0(chatActivityEnterView.Q, 1, chatActivityEnterView.P2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.te
                                public final /* synthetic */ ve b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l4 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l4.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(bfVar);
                        chatActivityEnterView.Y2.i2(1, 0, chatActivityEnterView.O ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.R4, 0L, true);
                        j3 = 0;
                        chatActivityEnterView.R4 = 0L;
                        yeVar.setEffect(0L);
                    }
                    chatActivityEnterView.E2 = false;
                    chatActivityEnterView.g0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ue
                        public final /* synthetic */ ve b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.f0 = null;
                                    chatActivityEnterView22.L1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.f0 = null;
                                    chatActivityEnterView32.L1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.f0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.x4 ? 500L : j3);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.H3) {
                AndroidUtilities.cancelRunOnUIThread(lgVar);
            }
        }
        return false;
    }
}
