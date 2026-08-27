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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class he extends FrameLayout {
    public final Paint a;
    public final RectF b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ ChatActivityEnterView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ChatActivityEnterView chatActivityEnterView, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.d = chatActivityEnterView;
        this.c = c6Var;
        this.a = new Paint(1);
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.d;
        if (!chatActivityEnterView.W0) {
            oe oeVar = chatActivityEnterView.O0;
            float f10 = 1.0f;
            if (oeVar != null && oeVar.getVisibility() == 0) {
                f10 = 1.0f - chatActivityEnterView.O0.getAlpha();
            }
            float dpf2 = AndroidUtilities.dpf2(19.0f);
            int i02 = chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.Yd);
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
            canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.d.g5;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wd wdVar;
        long j10;
        long j11;
        long j12;
        ChatActivityEnterView chatActivityEnterView = this.d;
        he heVar = chatActivityEnterView.V0;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        ne neVar = chatActivityEnterView.C3;
        vf vfVar = chatActivityEnterView.F3;
        ke keVar = chatActivityEnterView.F0;
        final int i10 = 0;
        if (!chatActivityEnterView.g5) {
            chatActivityEnterView.Y();
            final int i11 = 2;
            final int i12 = 3;
            final int i13 = 1;
            if (motionEvent.getAction() == 0) {
                if (!ChatActivityEnterView.this.n4) {
                    TLRPC.Chat chat = rnVar == null ? null : rnVar.e;
                    TLRPC.UserFull userFull = rnVar == null ? chatActivityEnterView.G : rnVar.W7;
                    if ((chat != null && !ChatObject.canSendVoice(chat) && (!ChatObject.canSendRoundVideo(chat) || !chatActivityEnterView.Z1)) || (userFull != null && userFull.voice_messages_forbidden)) {
                        chatActivityEnterView.U2.U1();
                        return true;
                    }
                    if (!chatActivityEnterView.Z1) {
                        vfVar.run();
                        return true;
                    }
                    chatActivityEnterView.E3 = false;
                    chatActivityEnterView.D3 = true;
                    AndroidUtilities.runOnUIThread(vfVar, 150L);
                    return true;
                }
                boolean z10 = chatActivityEnterView.Z1;
                if (!z10 || chatActivityEnterView.E3) {
                    chatActivityEnterView.y2 = -1.0f;
                    if (!z10 || !chatActivityEnterView.Y0) {
                        if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                            Activity activity = chatActivityEnterView.J2;
                            long a2 = rnVar.a();
                            c2 c2Var = new c2(15);
                            gc gcVar = new gc(i11);
                            Pattern pattern = y4.a;
                            org.telegram.ui.ActionBar.c6 c6Var = this.c;
                            y4.K(activity, a2, -1L, 0, false, c2Var, gcVar, new w4(c6Var), c6Var);
                        }
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            if (chatActivityEnterView.Y0) {
                                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f1;
                                if (slideTextView != null) {
                                    slideTextView.setEnabled(false);
                                }
                                chatActivityEnterView.U2.f1();
                            } else {
                                if (chatActivityEnterView.n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.N0(0);
                                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f1;
                                if (slideTextView2 != null) {
                                    slideTextView2.setEnabled(false);
                                }
                            }
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fe
                                public final /* synthetic */ he b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i13) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        chatActivityEnterView.U2.N0(0);
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView3 = chatActivityEnterView.f1;
                            if (slideTextView3 != null) {
                                slideTextView3.setEnabled(false);
                            }
                            chatActivityEnterView.U2.f1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fe
                                public final /* synthetic */ he b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i10) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        chatActivityEnterView.U2.X1(1, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.c0 = false;
                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.Components.ge
                        public final /* synthetic */ he b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = this.b.d;
                                    chatActivityEnterView2.b0 = null;
                                    chatActivityEnterView2.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = this.b.d;
                                    chatActivityEnterView3.b0 = null;
                                    chatActivityEnterView3.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.b0 = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 200L);
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2 && chatActivityEnterView.A2) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z11 = chatActivityEnterView2.n4;
                    if (!z11) {
                        if (!z11) {
                            if (chatActivityEnterView2.g4 == -1.0f) {
                                chatActivityEnterView2.f4 = y10;
                            }
                            chatActivityEnterView2.g4 = y10;
                            recordCircle.invalidate();
                            if (chatActivityEnterView2.m4 || chatActivityEnterView2.e4 < 0.7f || chatActivityEnterView2.f4 - chatActivityEnterView2.g4 < AndroidUtilities.dp(57.0f)) {
                                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                                float f10 = x8 - recordCircle2.B;
                                float f11 = y10 - recordCircle2.C;
                                float f12 = (f11 * f11) + (f10 * f10);
                                recordCircle2.C = y10;
                                recordCircle2.B = x8;
                                ChatActivityEnterView chatActivityEnterView3 = ChatActivityEnterView.this;
                                if (chatActivityEnterView3.Z3 && chatActivityEnterView3.b4 == 0.0f && f12 > recordCircle2.A) {
                                    chatActivityEnterView3.a4 = System.currentTimeMillis();
                                }
                                if (chatActivityEnterView.y2 == -1.0f) {
                                    chatActivityEnterView.y2 = x8;
                                    float measuredWidth = (float) (chatActivityEnterView.h1.getMeasuredWidth() * 0.35d);
                                    chatActivityEnterView.z2 = measuredWidth;
                                    if (measuredWidth > AndroidUtilities.dp(140.0f)) {
                                        chatActivityEnterView.z2 = AndroidUtilities.dp(140.0f);
                                    }
                                }
                                float x10 = heVar.getX() + x8;
                                float f13 = chatActivityEnterView.y2;
                                float f14 = ((x10 - f13) / chatActivityEnterView.z2) + 1.0f;
                                if (f13 != -1.0f) {
                                    float f15 = f14 <= 1.0f ? f14 < 0.0f ? 0.0f : f14 : 1.0f;
                                    ChatActivityEnterView.SlideTextView slideTextView4 = chatActivityEnterView.f1;
                                    if (slideTextView4 != null) {
                                        slideTextView4.r = f15;
                                    }
                                    chatActivityEnterView.setSlideToCancelProgress(f15);
                                    f14 = f15;
                                }
                                if (f14 == 0.0f) {
                                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                                        chatActivityEnterView.N4 = 0L;
                                        keVar.setEffect(0L);
                                    } else {
                                        chatActivityEnterView.U2.N0(0);
                                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                                    }
                                    chatActivityEnterView.A2 = false;
                                    chatActivityEnterView.K1(5, true);
                                    return true;
                                }
                            } else {
                                chatActivityEnterView2.n4 = true;
                                eg egVar = chatActivityEnterView2.J1;
                                if (egVar != null && MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) <= 3) {
                                    egVar.a();
                                    lh.w3 w3Var = new lh.w3(egVar.getContext(), 2);
                                    egVar.a = w3Var;
                                    w3Var.m(1.0f, 0.0f);
                                    egVar.a.q(true);
                                    egVar.a.t(LocaleController.getString(R.string.VoicePauseHint));
                                    MessagesController.getGlobalMainSettings().edit().putInt("voicepausehint", MessagesController.getGlobalMainSettings().getInt("voicepausehint", 0) + 1).apply();
                                    egVar.addView(egVar.a, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
                                    lh.w3 w3Var2 = egVar.a;
                                    w3Var2.h0 = new cg(egVar, w3Var2, 3);
                                    w3Var2.v();
                                }
                            }
                        }
                        ChatActivityEnterView.m(chatActivityEnterView);
                        return false;
                    }
                }
                return true;
            }
            if (motionEvent.getAction() == 3 && chatActivityEnterView.A2) {
                if (chatActivityEnterView.e4 >= 0.7f) {
                    chatActivityEnterView.n4 = true;
                    ChatActivityEnterView.m(chatActivityEnterView);
                    return false;
                }
                if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                    CameraController.getInstance().cancelOnInitRunnable(neVar);
                    chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                    j12 = 0;
                    chatActivityEnterView.N4 = 0L;
                    keVar.setEffect(0L);
                } else {
                    chatActivityEnterView.U2.N0(0);
                    MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                    j12 = 0;
                }
                chatActivityEnterView.e1 = j12;
                chatActivityEnterView.A2 = false;
                chatActivityEnterView.K1(5, true);
                return false;
            }
            ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.I1;
            if ((recordCircle3 == null || !ChatActivityEnterView.this.n4) && ((wdVar = chatActivityEnterView.a1) == null || wdVar.getVisibility() != 0)) {
                if ((((heVar.getX() + motionEvent.getX()) - chatActivityEnterView.y2) / chatActivityEnterView.z2) + 1.0f < 0.45d) {
                    if (chatActivityEnterView.Z1 && chatActivityEnterView.Y0) {
                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                        chatActivityEnterView.U2.X1(2, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        j11 = 0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    } else {
                        chatActivityEnterView.U2.N0(0);
                        MediaController.getInstance().stopRecording(0, false, 0, chatActivityEnterView.K, 0L);
                        j11 = 0;
                    }
                    chatActivityEnterView.e1 = j11;
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.K1(5, true);
                    return true;
                }
                if (chatActivityEnterView.D3) {
                    AndroidUtilities.cancelRunOnUIThread(vfVar);
                    if (chatActivityEnterView.u0 && chatActivityEnterView.t0) {
                        chatActivityEnterView.U2.G(!chatActivityEnterView.Y0);
                        chatActivityEnterView.j1(!chatActivityEnterView.Y0, true);
                    } else {
                        chatActivityEnterView.U2.U1();
                    }
                    performHapticFeedback(3);
                    sendAccessibilityEvent(1);
                    return true;
                }
                boolean z12 = chatActivityEnterView.Z1;
                if (!z12 || chatActivityEnterView.E3) {
                    chatActivityEnterView.y2 = -1.0f;
                    if (!z12 || !chatActivityEnterView.Y0) {
                        j10 = 0;
                        if (!chatActivityEnterView.u0) {
                            chatActivityEnterView.U2.U1();
                        } else {
                            if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                                if (chatActivityEnterView.n4) {
                                    chatActivityEnterView.E3 = true;
                                }
                                MediaController.getInstance().toggleRecordingPause(chatActivityEnterView.K);
                                chatActivityEnterView.U2.N0(0);
                                ChatActivityEnterView.SlideTextView slideTextView5 = chatActivityEnterView.f1;
                                if (slideTextView5 != null) {
                                    slideTextView5.setEnabled(false);
                                }
                                y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fe
                                    public final /* synthetic */ he b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        Long l10 = (Long) obj;
                                        switch (i12) {
                                            case 0:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 1:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            case 2:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                            default:
                                                this.b.d.T0(0, true, 0, false, l10.longValue());
                                                break;
                                        }
                                    }
                                });
                                return true;
                            }
                            if (chatActivityEnterView.A2 && chatActivityEnterView.c()) {
                                Activity activity2 = chatActivityEnterView.J2;
                                long a3 = rnVar.a();
                                c2 c2Var2 = new c2(16);
                                gc gcVar2 = new gc(i12);
                                org.telegram.ui.ActionBar.c6 c6Var2 = this.c;
                                y4.K(activity2, a3, -1L, 0, false, c2Var2, gcVar2, new w4(c6Var2), c6Var2);
                            }
                            chatActivityEnterView.U2.N0(0);
                            MediaController.getInstance().stopRecording(chatActivityEnterView.c() ? 3 : 1, true, 0, chatActivityEnterView.K, 0L);
                        }
                    } else {
                        if (y4.d0(chatActivityEnterView.M, chatActivityEnterView.L2)) {
                            ChatActivityEnterView.SlideTextView slideTextView6 = chatActivityEnterView.f1;
                            if (slideTextView6 != null) {
                                slideTextView6.setEnabled(false);
                            }
                            chatActivityEnterView.U2.f1();
                            y4.a0(chatActivityEnterView.M, 1, chatActivityEnterView.L2, new Utilities.Callback(this) { // from class: org.telegram.ui.Components.fe
                                public final /* synthetic */ he b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    Long l10 = (Long) obj;
                                    switch (i11) {
                                        case 0:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 1:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        case 2:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                        default:
                                            this.b.d.T0(0, true, 0, false, l10.longValue());
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        CameraController.getInstance().cancelOnInitRunnable(neVar);
                        chatActivityEnterView.U2.X1(1, 0, chatActivityEnterView.K ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, chatActivityEnterView.N4, 0L, true);
                        j10 = 0;
                        chatActivityEnterView.N4 = 0L;
                        keVar.setEffect(0L);
                    }
                    chatActivityEnterView.A2 = false;
                    chatActivityEnterView.c0 = false;
                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.Components.ge
                        public final /* synthetic */ he b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView22 = this.b.d;
                                    chatActivityEnterView22.b0 = null;
                                    chatActivityEnterView22.K1(1, true);
                                    break;
                                default:
                                    ChatActivityEnterView chatActivityEnterView32 = this.b.d;
                                    chatActivityEnterView32.b0 = null;
                                    chatActivityEnterView32.K1(1, true);
                                    break;
                            }
                        }
                    };
                    chatActivityEnterView.b0 = runnable2;
                    AndroidUtilities.runOnUIThread(runnable2, chatActivityEnterView.t4 ? 500L : j10);
                    return true;
                }
                return true;
            }
            if (chatActivityEnterView.D3) {
                AndroidUtilities.cancelRunOnUIThread(vfVar);
            }
        }
        return false;
    }
}
