package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import k7.b6;
import lh.m5;
import lh.r5;
import lh.ya;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ai;
import org.telegram.ui.e60;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t extends FrameLayout implements m0 {
    public int A0;
    public boolean B;
    public int B0;
    public final ChatObject.Call C;
    public int C0;
    public final e60 D;
    public ValueAnimator D0;
    public boolean E;
    public int E0;
    public float F;
    public int F0;
    public final FrameLayout G;
    public ValueAnimator G0;
    public final int H;
    public boolean H0;
    public final k5 I;
    public int J;
    public final q K;
    public final TextView L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public final Paint Q;
    public final jj0 R;
    public final ImageView S;
    public boolean T;
    public float U;
    public final s V;
    public ValueAnimator W;
    public final o a;
    public boolean a0;
    public boolean b;
    public float b0;
    public l c;
    public float c0;
    public t20 d;
    public float d0;
    public l e;
    public float e0;
    public boolean f;
    public float f0;
    public boolean g0;
    public boolean h;
    public float h0;
    public final ImageReceiver i0;
    public final ArrayList j0;
    public n0 k0;
    public boolean l0;
    public float m0;
    public boolean n;
    public Bitmap n0;
    public Paint o0;
    public boolean p0;
    public float q0;
    public boolean r;
    public final jr r0;
    public boolean s;
    public final Drawable s0;
    public float t0;
    public ImageView u0;
    public boolean v;
    public boolean v0;
    public ChatObject.VideoParticipant w;
    public boolean w0;
    public final k0 x;
    public final m x0;
    public final Paint y;
    public final Rect y0;
    public r5 z0;

    public t(k0 k0Var, ChatObject.Call call, e60 e60Var) {
        super(k0Var.getContext());
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.Q = paint;
        this.U = 1.0f;
        this.i0 = new ImageReceiver();
        this.j0 = new ArrayList();
        this.x0 = new m(this, 1);
        this.y0 = new Rect();
        this.C = call;
        int currentAccount = e60Var.getCurrentAccount();
        this.H = currentAccount;
        jr jrVar = new jr(k0Var.getContext(), R.drawable.calls_video, -1);
        this.r0 = jrVar;
        jrVar.a(true, false);
        float f10 = -AndroidUtilities.dp(4.0f);
        float dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        jrVar.i = f10;
        jrVar.j = dp;
        jrVar.k = dp2;
        jrVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        jrVar.c.setStrokeWidth(dpf2);
        jrVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.s0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setColor(-1);
        String string = LocaleController.getString(R.string.VoipVideoOnPause);
        String string2 = LocaleController.getString(R.string.VoipVideoScreenSharingTwoLines);
        int dp3 = AndroidUtilities.dp(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(string2, textPaint, dp3, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat chat = MessagesController.getInstance(currentAccount).getChat(Long.valueOf(call.chatId));
        StaticLayout staticLayout2 = new StaticLayout(LocaleController.formatString("VoipVideoNotAvailable", R.string.VoipVideoNotAvailable, LocaleController.formatPluralString("Participants", MessagesController.getInstance(currentAccount).groupCallVideoMaxParticipants, new Object[0])), textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
        String string3 = LocaleController.getString(R.string.VoipVideoScreenSharing);
        o oVar = new o(this, k0Var.getContext(), call, k0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, e60Var, string, textPaint.measureText(string));
        this.a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        r2 r2Var = oVar.d;
        r2Var.setScalingType(scalingType);
        this.x = k0Var;
        this.D = e60Var;
        r2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            r2Var.setBackgroundRenderer(textureView);
            if (!r2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        r2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.V = sVar;
        addView(sVar);
        k5 k5Var = new k5(k0Var.getContext());
        this.I = k5Var;
        k5Var.setTextSize(13);
        k5Var.setTextColor(i0.a.k(-1, TLRPC.LAYER));
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setFullTextMaxLines(1);
        k5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.G = frameLayout;
        frameLayout.addView(k5Var, b6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, b6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(j6.w0(null, j6.qg, false));
        frameLayout.setClipChildren(false);
        jj0 jj0Var = new jj0(k0Var.getContext());
        this.R = jj0Var;
        addView(jj0Var, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        this.S = imageView;
        addView(imageView, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp4 = AndroidUtilities.dp(19.0f);
        int k10 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = j6.i0(dp4, dp4, dp4, dp4, 0, k10, k10);
        q qVar = new q(this, k0Var.getContext());
        this.K = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new oh.n(this, 1));
        addView(qVar, b6.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.L = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(j6.w0(null, j6.og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            y3.q(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, b6.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, x30 x30Var, l lVar, t20 t20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, e60 e60Var) {
        t tVar;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                tVar = null;
                break;
            }
            if (videoParticipant.equals(((t) arrayList.get(i10)).w)) {
                tVar = (t) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (tVar == null) {
            tVar = new t(x30Var, call, e60Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (t20Var != null) {
            tVar.setSecondaryView(t20Var);
        }
        if (lVar2 != null) {
            tVar.setTabletGridView(lVar2);
        }
        return tVar;
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        invalidate();
        k(true);
        s sVar = this.V;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z4) {
        this.M = true;
        this.v = false;
        this.x.f(this);
        if (z4) {
            if (this.w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !g1.a0.S) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.W.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.n0 != null) {
            return;
        }
        HashMap<String, Bitmap> hashMap = this.C.thumbs;
        ChatObject.VideoParticipant videoParticipant = this.w;
        boolean z4 = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        Bitmap bitmap = hashMap.get(z4 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.n0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.n0 == null) {
            long peerId = MessageObject.getPeerId(this.w.participant.peer);
            ChatObject.VideoParticipant videoParticipant2 = this.w;
            boolean z10 = videoParticipant2.participant.self;
            ImageReceiver imageReceiver = this.i0;
            if (z10 && videoParticipant2.presentation) {
                imageReceiver.setImageBitmap(new ec0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.H;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                int d = user != null ? z8.d(user.id) : i0.a.d(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
            int d10 = chat != null ? z8.d(chat.id) : i0.a.d(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, chat, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = this.v;
        k0 k0Var = this.x;
        o oVar = this.a;
        if (z4) {
            float y10 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.K;
            FrameLayout frameLayout = this.G;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.m0;
            boolean z10 = this.h;
            jj0 jj0Var = this.R;
            if (z10 || this.f) {
                frameLayout.setAlpha(1.0f - k0Var.n);
                jj0Var.setAlpha(1.0f - k0Var.n);
            } else if (this.b || this.r) {
                if (!e60.C3 && !e60.D3) {
                    measuredHeight = ai.c(1.0f, k0Var.T, AndroidUtilities.dp(90.0f) * k0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                jj0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - k0Var.c);
                jj0Var.setAlpha(1.0f - k0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                jj0Var.setAlpha(1.0f);
            }
            boolean z11 = this.b;
            k5 k5Var = this.I;
            if (z11 || this.r) {
                k5Var.setFullAlpha(k0Var.c);
            } else {
                k5Var.setFullAlpha(0.0f);
            }
            jj0Var.setTranslationX(frameLayout.getX());
            jj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.S;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.L * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.c, 1.0f - k0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.v0 ? 0.0f : AndroidUtilities.dp(6.0f) * k0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            n0 n0Var = this.k0;
            if (n0Var != null) {
                boolean z12 = n0Var.e;
                if (z12) {
                    float f10 = this.P;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.P = f11;
                        if (f11 > 1.0f) {
                            this.P = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z12) {
                    float f12 = this.P;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.P = f13;
                        if (f13 < 0.0f) {
                            this.P = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.P;
            float f15 = (1.0f - k0Var.n) * (1.0f - k0Var.c) * f14;
            if (f14 > 0.0f) {
                int i10 = (int) (f15 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.m0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.L, oVar.getY() + oVar.K, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.L, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.K);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.m0);
                float f16 = oVar.b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.l0 || (view != this.a && view != this.V)) {
            return super.drawChild(canvas, view, j10);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.m0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.m0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        n0 n0Var = this.k0;
        if (n0Var != null) {
            this.D.q2.add(n0Var);
            this.k0.b();
            n0 n0Var2 = this.k0;
            n0Var2.c = null;
            n0Var2.c(false);
        }
        this.k0 = null;
    }

    public final void f() {
        if (this.w != null) {
            o oVar = this.a;
            r2 r2Var = oVar.d;
            r2 r2Var2 = oVar.d;
            if (r2Var.getMeasuredHeight() == 0 || r2Var2.getMeasuredWidth() == 0) {
                return;
            }
            r2Var2.getRenderBufferBitmap(new m5(this, 20));
        }
    }

    public final void g(boolean z4, boolean z10) {
        if (this.n != z4) {
            this.n = z4;
            j(!(this.c == null && this.e == null) && z10);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.w.participant.peer);
        return DialogObject.isUserDialog(peerId) ? UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId))) : AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z4, boolean z10) {
        if (this.b != z4) {
            this.b = z4;
            this.O = true;
            j(z10);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z4) {
        if (this.b0 == f10 && this.c0 == f11 && this.d0 == f12 && this.e0 == f13 && this.f0 == f14) {
            return;
        }
        this.g0 = z4;
        this.b0 = f10;
        this.c0 = f11;
        this.d0 = f12;
        this.e0 = f13;
        this.f0 = f14;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.N) {
            this.a.invalidate();
        }
        l lVar = this.c;
        if (lVar != null) {
            lVar.invalidate();
            e60 e60Var = this.D;
            if (e60Var.U2 == this.c) {
                e60Var.getContainerView().invalidate();
            }
        }
        t20 t20Var = this.d;
        if (t20Var != null) {
            t20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d8, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x066b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z4) {
        boolean z10;
        boolean z11;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        boolean z12;
        String str;
        String str2;
        int i10;
        int i11;
        boolean z13;
        float f10;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z14;
        r2 r2Var;
        boolean videoIsActive;
        s sVar;
        long peerId;
        ImageLocation forChat;
        ImageLocation forChat2;
        TLRPC.Chat chat;
        boolean z15;
        Drawable imageFromMemory;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z16;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        ChatObject.VideoParticipant videoParticipant4;
        l lVar;
        if (this.M) {
            return;
        }
        ChatObject.Call call = this.C;
        int i12 = 0;
        if (call.call.rtmp_stream) {
            int dp = AndroidUtilities.dp(this.b ? 36.0f : 21.0f);
            this.L.setPadding(dp, 0, dp, 0);
        }
        if (this.w == null && ((lVar = this.c) != null || this.d != null || this.e != null)) {
            if (lVar != null) {
                this.w = lVar.getParticipant();
            } else {
                l lVar2 = this.e;
                if (lVar2 != null) {
                    this.w = lVar2.getParticipant();
                } else {
                    this.w = this.d.getVideoParticipant();
                }
            }
        }
        boolean z17 = this.v;
        jj0 jj0Var = this.R;
        k0 k0Var = this.x;
        o oVar = this.a;
        int i13 = 1;
        if (z17 && !this.b) {
            boolean z18 = VoIPService.getSharedInstance() == null;
            if (e60.F3 || (videoParticipant4 = this.w) == null || (this.d == null && (!ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, call) || (!call.canStreamVideo && this.w != call.videoNotAvailableParticipant)))) {
                z18 = true;
            }
            if (z18 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.v = false;
                f();
                boolean z19 = SharedConfig.getDevicePerformanceClass() <= 0;
                if (oVar.V == null && z18) {
                    if (z19) {
                        k0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z19, 7)).setDuration(150L).start();
                } else {
                    if (k0Var.s) {
                        r5 r5Var = this.z0;
                        if (r5Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(r5Var);
                            this.z0 = null;
                        }
                        r5 r5Var2 = new r5(this, z19, this, 19);
                        this.z0 = r5Var2;
                        AndroidUtilities.runOnUIThread(r5Var2);
                    } else {
                        if (z19) {
                            k0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z19) {
                        k0Var.f(this);
                        e();
                    }
                }
                if (this.w.participant.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.w.presentation);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant5 = this.w;
                    sharedInstance.removeRemoteSink(videoParticipant5.participant, videoParticipant5.presentation);
                }
                invalidate();
                ValueAnimator valueAnimator2 = this.W;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.W.cancel();
                }
            }
        } else if (!z17) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            l lVar3 = this.c;
            if (lVar3 != null || this.d != null || this.e != null || this.b) {
                if (lVar3 != null) {
                    this.w = lVar3.getParticipant();
                } else {
                    t20 t20Var = this.d;
                    if (t20Var != null) {
                        this.w = t20Var.getVideoParticipant();
                    } else {
                        l lVar4 = this.e;
                        if (lVar4 != null) {
                            this.w = lVar4.getParticipant();
                        }
                    }
                }
                ChatObject.VideoParticipant videoParticipant6 = this.w;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant6.participant;
                boolean z20 = !groupCallParticipant.self ? !((call.canStreamVideo || videoParticipant6 == call.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant6.presentation, call)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.w.presentation) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    ChatObject.VideoParticipant videoParticipant7 = this.w;
                    if (!sharedInstance2.isFullscreen(videoParticipant7.participant, videoParticipant7.presentation)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        ChatObject.VideoParticipant videoParticipant8 = this.w;
                        if (!sharedInstance3.isFullscreen(videoParticipant8.participant, videoParticipant8.presentation)) {
                        }
                    }
                }
                this.v = true;
                e60 e60Var = this.D;
                if (e60Var.q2.size() > 0) {
                    this.k0 = (n0) e2.c.g(1, e60Var.q2);
                } else {
                    this.k0 = new n0();
                }
                n0 n0Var = this.k0;
                n0Var.g = this;
                n0Var.c = jj0Var;
                n0Var.c(false);
                k(false);
                r5 r5Var3 = this.z0;
                if (r5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(r5Var3);
                    this.z0 = null;
                }
                if (getParent() == null) {
                    k0Var.addView(this, b6.e(46, 46, 51));
                    k0Var.E.add(this);
                    long peerId2 = MessageObject.getPeerId(this.w.participant.peer);
                    LongSparseIntArray longSparseIntArray = k0Var.w;
                    longSparseIntArray.put(peerId2, longSparseIntArray.get(peerId2, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.O = true;
                this.B = false;
                animate().setListener(null).cancel();
                if (oVar.V != null || this.d == null || this.c != null || oVar.y == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.B = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new r(this, i12)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.S.setVisibility((!this.w.presentation || call.call.rtmp_stream) ? 8 : 0);
                z10 = false;
                z11 = true;
                videoParticipant = this.w;
                videoParticipant2 = call.videoNotAvailableParticipant;
                k5 k5Var = this.I;
                if (videoParticipant != videoParticipant2) {
                    if (k5Var.getVisibility() != 4) {
                        k5Var.setVisibility(4);
                        jj0Var.setVisibility(4);
                    }
                } else if (k5Var.getVisibility() != 0) {
                    k5Var.setVisibility(0);
                    jj0Var.setVisibility(0);
                }
                z12 = this.v;
                int i14 = this.H;
                if (z12) {
                    str = null;
                } else {
                    boolean z21 = e60.D3 && (!k0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        t20 t20Var2 = this.d;
                        if (t20Var2 == null || this.c != null || k0Var.b) {
                            if (!this.h) {
                                if (t20Var2 == null || this.c != null) {
                                    l lVar5 = this.e;
                                    if (lVar5 == null || !z21) {
                                        l lVar6 = this.c;
                                        if ((lVar6 == null || t20Var2 != null) && this.n) {
                                            if (lVar6 != null) {
                                                i10 = AndroidUtilities.dp(80.0f);
                                            }
                                        } else if (lVar6 != null) {
                                            f10 = lVar6.a;
                                            i10 = -1;
                                            z13 = true;
                                            i11 = 0;
                                            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                            if (i10 != 0 && (marginLayoutParams.height != i10 || z11 || this.E != z13 || ((z13 && this.F != f10) || i11 != 0))) {
                                                marginLayoutParams.height = i10;
                                                if (z13) {
                                                    i10 = -1;
                                                }
                                                marginLayoutParams.width = i10;
                                                this.E = z13;
                                                this.F = f10;
                                                this.O = true;
                                                if (z10) {
                                                    oVar.requestLayout();
                                                } else {
                                                    oVar.a();
                                                    this.s = true;
                                                }
                                                AndroidUtilities.runOnUIThread(new m(this, i12));
                                                k0Var.requestLayout();
                                                invalidate();
                                            }
                                            videoParticipant3 = this.w;
                                            if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                                                r2 r2Var2 = oVar.d;
                                                r2 r2Var3 = oVar.d;
                                                r2Var2.setMirror(false);
                                                r2Var3.setRotateTextureWithScreen(true);
                                                r2Var3.setUseCameraRotation(false);
                                            } else {
                                                r2 r2Var4 = oVar.d;
                                                r2 r2Var5 = oVar.d;
                                                r2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                                r2Var5.setRotateTextureWithScreen(true);
                                                r2Var5.setUseCameraRotation(true);
                                            }
                                            z14 = oVar.a;
                                            r2Var = oVar.d;
                                            if (!z14) {
                                                ((WindowManager) oVar.getContext().getSystemService("window")).getDefaultDisplay();
                                            }
                                            if (this.w.participant.self) {
                                                r2Var.setMaxTextureSize(720);
                                            } else {
                                                r2Var.setMaxTextureSize(0);
                                            }
                                            ChatObject.VideoParticipant videoParticipant9 = this.w;
                                            videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9.participant, videoParticipant9.presentation, call);
                                            sVar = this.V;
                                            if (videoIsActive || !(call.canStreamVideo || this.w == call.videoNotAvailableParticipant)) {
                                                ImageReceiver imageReceiver = sVar.a;
                                                z8 z8Var = sVar.c;
                                                imageReceiver.setCurrentAccount(i14);
                                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                                if (DialogObject.isUserDialog(peerId)) {
                                                    TLRPC.User user = AccountInstance.getInstance(i14).getMessagesController().getUser(Long.valueOf(peerId));
                                                    z8Var.m(i14, user);
                                                    forChat = ImageLocation.getForUser(i14, user, 0);
                                                    forChat2 = ImageLocation.getForUser(i14, user, 1);
                                                    chat = user;
                                                } else {
                                                    TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                                                    z8Var.k(i14, chat2);
                                                    forChat = ImageLocation.getForChat(i14, chat2, 0);
                                                    forChat2 = ImageLocation.getForChat(i14, chat2, 1);
                                                    chat = chat2;
                                                }
                                                TLRPC.Chat chat3 = chat;
                                                ImageLocation imageLocation = forChat;
                                                sVar.a.setImage(imageLocation, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? z8Var : imageFromMemory, null, chat3, 0);
                                                sVar.b.setImage(imageLocation, "50_50_b", new ColorDrawable(j6.w0(null, j6.tg, false)), null, chat3, 0);
                                                z15 = false;
                                            } else {
                                                z15 = true;
                                            }
                                            boolean z22 = (z10 || this.d == null || this.b || z15) ? false : true;
                                            if (z15 != this.T && !z22) {
                                                this.T = z15;
                                                valueAnimator = this.W;
                                                if (valueAnimator != null) {
                                                    valueAnimator.removeAllListeners();
                                                    this.W.cancel();
                                                }
                                                if (z10) {
                                                    boolean z23 = this.T;
                                                    this.U = z23 ? 0.0f : 1.0f;
                                                    sVar.setVisibility(z23 ? 8 : 0);
                                                    sVar.setAlpha(this.U);
                                                    oVar.invalidate();
                                                } else {
                                                    if (!this.T && sVar.getVisibility() != 0) {
                                                        sVar.setVisibility(0);
                                                        sVar.setAlpha(0.0f);
                                                    }
                                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, this.T ? 0.0f : 1.0f);
                                                    this.W = ofFloat;
                                                    ofFloat.addUpdateListener(new n(this, i12));
                                                    this.W.addListener(new r(this, i13));
                                                    this.W.start();
                                                }
                                                if (this.T) {
                                                    s.a(sVar, false);
                                                }
                                            }
                                            if (this.w.participant.self && VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(r2Var, this.w.presentation);
                                            }
                                            n0 n0Var2 = this.k0;
                                            n0Var2.h = this.w.participant;
                                            n0Var2.c(z10);
                                            if (sVar.getVisibility() == 0) {
                                                s.a(sVar, true);
                                            }
                                            ChatObject.VideoParticipant videoParticipant10 = this.w;
                                            z16 = !videoParticipant10.presentation ? (tL_groupCallParticipantVideo = videoParticipant10.participant.video) == null || !tL_groupCallParticipantVideo.paused : (tL_groupCallParticipantVideo2 = videoParticipant10.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused;
                                            if (this.p0 != z16) {
                                                this.p0 = z16;
                                                r2Var.animate().alpha(this.p0 ? 0.0f : 1.0f).setDuration(250L).start();
                                                oVar.invalidate();
                                            }
                                            if (e60.F3 && this.T) {
                                                if (!r2Var.isFirstFrameRendered()) {
                                                    d();
                                                }
                                                if (this.w.participant.self) {
                                                    if (VoIPService.getSharedInstance() != null) {
                                                        VoIPService.getSharedInstance().setLocalSink(r2Var, this.w.presentation);
                                                    }
                                                } else if (VoIPService.getSharedInstance() != null) {
                                                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant11 = this.w;
                                                    sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, r2Var, null);
                                                    VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant12 = this.w;
                                                    sharedInstance5.addRemoteSink(videoParticipant12.participant, videoParticipant12.presentation, r2Var, null);
                                                    if (call.call.rtmp_stream && !r2Var.isFirstFrameRendered() && !this.w0) {
                                                        AndroidUtilities.runOnUIThread(this.x0, 15000L);
                                                        this.w0 = true;
                                                    }
                                                }
                                                str = null;
                                            } else {
                                                if (!this.w.participant.self) {
                                                    str = null;
                                                    if (VoIPService.getSharedInstance() != null) {
                                                        VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                        ChatObject.VideoParticipant videoParticipant13 = this.w;
                                                        sharedInstance6.removeRemoteSink(videoParticipant13.participant, videoParticipant13.presentation);
                                                        VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                        ChatObject.VideoParticipant videoParticipant14 = this.w;
                                                        sharedInstance7.removeRemoteSink(videoParticipant14.participant, videoParticipant14.presentation);
                                                    }
                                                } else if (VoIPService.getSharedInstance() != null) {
                                                    str = null;
                                                    VoIPService.getSharedInstance().setLocalSink(null, this.w.presentation);
                                                } else {
                                                    str = null;
                                                }
                                                if (e60.F3 && r2Var.isFirstFrameRendered()) {
                                                    f();
                                                    r2Var.clearFirstFrame();
                                                    r2Var.setAlpha(0.0f);
                                                    oVar.e.setAlpha(0.0f);
                                                }
                                            }
                                            k(true);
                                        } else {
                                            i10 = AndroidUtilities.dp(46.0f);
                                        }
                                    } else {
                                        float f11 = lVar5.a;
                                        i11 = lVar5.b.e.size();
                                        z13 = true;
                                        f10 = f11;
                                        i10 = -1;
                                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                        if (i10 != 0) {
                                            marginLayoutParams.height = i10;
                                            if (z13) {
                                            }
                                            marginLayoutParams.width = i10;
                                            this.E = z13;
                                            this.F = f10;
                                            this.O = true;
                                            if (z10) {
                                            }
                                            AndroidUtilities.runOnUIThread(new m(this, i12));
                                            k0Var.requestLayout();
                                            invalidate();
                                        }
                                        videoParticipant3 = this.w;
                                        if (videoParticipant3.participant.self) {
                                        }
                                        r2 r2Var22 = oVar.d;
                                        r2 r2Var32 = oVar.d;
                                        r2Var22.setMirror(false);
                                        r2Var32.setRotateTextureWithScreen(true);
                                        r2Var32.setUseCameraRotation(false);
                                        z14 = oVar.a;
                                        r2Var = oVar.d;
                                        if (!z14) {
                                        }
                                        if (this.w.participant.self) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant92 = this.w;
                                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92.participant, videoParticipant92.presentation, call);
                                        sVar = this.V;
                                        if (videoIsActive) {
                                        }
                                        ImageReceiver imageReceiver2 = sVar.a;
                                        z8 z8Var2 = sVar.c;
                                        imageReceiver2.setCurrentAccount(i14);
                                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                                        if (DialogObject.isUserDialog(peerId)) {
                                        }
                                        TLRPC.Chat chat32 = chat;
                                        ImageLocation imageLocation2 = forChat;
                                        sVar.a.setImage(imageLocation2, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? z8Var2 : imageFromMemory, null, chat32, 0);
                                        sVar.b.setImage(imageLocation2, "50_50_b", new ColorDrawable(j6.w0(null, j6.tg, false)), null, chat32, 0);
                                        z15 = false;
                                        if (z10) {
                                        }
                                        if (z15 != this.T) {
                                            this.T = z15;
                                            valueAnimator = this.W;
                                            if (valueAnimator != null) {
                                            }
                                            if (z10) {
                                            }
                                            if (this.T) {
                                            }
                                        }
                                        if (this.w.participant.self) {
                                            VoIPService.getSharedInstance().setLocalSink(r2Var, this.w.presentation);
                                        }
                                        n0 n0Var22 = this.k0;
                                        n0Var22.h = this.w.participant;
                                        n0Var22.c(z10);
                                        if (sVar.getVisibility() == 0) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant102 = this.w;
                                        if (videoParticipant102.presentation) {
                                        }
                                        if (this.p0 != z16) {
                                        }
                                        if (e60.F3) {
                                        }
                                        if (!this.w.participant.self) {
                                        }
                                        if (e60.F3) {
                                            f();
                                            r2Var.clearFirstFrame();
                                            r2Var.setAlpha(0.0f);
                                            oVar.e.setAlpha(0.0f);
                                        }
                                        k(true);
                                    }
                                } else {
                                    i10 = AndroidUtilities.dp(80.0f);
                                }
                                f10 = 1.0f;
                                z13 = false;
                                i11 = 0;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i10 != 0) {
                                }
                                videoParticipant3 = this.w;
                                if (videoParticipant3.participant.self) {
                                }
                                r2 r2Var222 = oVar.d;
                                r2 r2Var322 = oVar.d;
                                r2Var222.setMirror(false);
                                r2Var322.setRotateTextureWithScreen(true);
                                r2Var322.setUseCameraRotation(false);
                                z14 = oVar.a;
                                r2Var = oVar.d;
                                if (!z14) {
                                }
                                if (this.w.participant.self) {
                                }
                                ChatObject.VideoParticipant videoParticipant922 = this.w;
                                videoIsActive = ChatObject.Call.videoIsActive(videoParticipant922.participant, videoParticipant922.presentation, call);
                                sVar = this.V;
                                if (videoIsActive) {
                                }
                                ImageReceiver imageReceiver22 = sVar.a;
                                z8 z8Var22 = sVar.c;
                                imageReceiver22.setCurrentAccount(i14);
                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                if (DialogObject.isUserDialog(peerId)) {
                                }
                                TLRPC.Chat chat322 = chat;
                                ImageLocation imageLocation22 = forChat;
                                sVar.a.setImage(imageLocation22, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? z8Var22 : imageFromMemory, null, chat322, 0);
                                sVar.b.setImage(imageLocation22, "50_50_b", new ColorDrawable(j6.w0(null, j6.tg, false)), null, chat322, 0);
                                z15 = false;
                                if (z10) {
                                }
                                if (z15 != this.T) {
                                }
                                if (this.w.participant.self) {
                                }
                                n0 n0Var222 = this.k0;
                                n0Var222.h = this.w.participant;
                                n0Var222.c(z10);
                                if (sVar.getVisibility() == 0) {
                                }
                                ChatObject.VideoParticipant videoParticipant1022 = this.w;
                                if (videoParticipant1022.presentation) {
                                }
                                if (this.p0 != z16) {
                                }
                                if (e60.F3) {
                                }
                                if (!this.w.participant.self) {
                                }
                                if (e60.F3) {
                                }
                                k(true);
                            }
                        }
                        i10 = 0;
                        f10 = 1.0f;
                        z13 = false;
                        i11 = 0;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i10 != 0) {
                        }
                        videoParticipant3 = this.w;
                        if (videoParticipant3.participant.self) {
                        }
                        r2 r2Var2222 = oVar.d;
                        r2 r2Var3222 = oVar.d;
                        r2Var2222.setMirror(false);
                        r2Var3222.setRotateTextureWithScreen(true);
                        r2Var3222.setUseCameraRotation(false);
                        z14 = oVar.a;
                        r2Var = oVar.d;
                        if (!z14) {
                        }
                        if (this.w.participant.self) {
                        }
                        ChatObject.VideoParticipant videoParticipant9222 = this.w;
                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9222.participant, videoParticipant9222.presentation, call);
                        sVar = this.V;
                        if (videoIsActive) {
                        }
                        ImageReceiver imageReceiver222 = sVar.a;
                        z8 z8Var222 = sVar.c;
                        imageReceiver222.setCurrentAccount(i14);
                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                        if (DialogObject.isUserDialog(peerId)) {
                        }
                        TLRPC.Chat chat3222 = chat;
                        ImageLocation imageLocation222 = forChat;
                        sVar.a.setImage(imageLocation222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? z8Var222 : imageFromMemory, null, chat3222, 0);
                        sVar.b.setImage(imageLocation222, "50_50_b", new ColorDrawable(j6.w0(null, j6.tg, false)), null, chat3222, 0);
                        z15 = false;
                        if (z10) {
                        }
                        if (z15 != this.T) {
                        }
                        if (this.w.participant.self) {
                        }
                        n0 n0Var2222 = this.k0;
                        n0Var2222.h = this.w.participant;
                        n0Var2222.c(z10);
                        if (sVar.getVisibility() == 0) {
                        }
                        ChatObject.VideoParticipant videoParticipant10222 = this.w;
                        if (videoParticipant10222.presentation) {
                        }
                        if (this.p0 != z16) {
                        }
                        if (e60.F3) {
                        }
                        if (!this.w.participant.self) {
                        }
                        if (e60.F3) {
                        }
                        k(true);
                    }
                    i10 = -1;
                    f10 = 1.0f;
                    z13 = false;
                    i11 = 0;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i10 != 0) {
                    }
                    videoParticipant3 = this.w;
                    if (videoParticipant3.participant.self) {
                    }
                    r2 r2Var22222 = oVar.d;
                    r2 r2Var32222 = oVar.d;
                    r2Var22222.setMirror(false);
                    r2Var32222.setRotateTextureWithScreen(true);
                    r2Var32222.setUseCameraRotation(false);
                    z14 = oVar.a;
                    r2Var = oVar.d;
                    if (!z14) {
                    }
                    if (this.w.participant.self) {
                    }
                    ChatObject.VideoParticipant videoParticipant92222 = this.w;
                    videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92222.participant, videoParticipant92222.presentation, call);
                    sVar = this.V;
                    if (videoIsActive) {
                    }
                    ImageReceiver imageReceiver2222 = sVar.a;
                    z8 z8Var2222 = sVar.c;
                    imageReceiver2222.setCurrentAccount(i14);
                    peerId = MessageObject.getPeerId(this.w.participant.peer);
                    if (DialogObject.isUserDialog(peerId)) {
                    }
                    TLRPC.Chat chat32222 = chat;
                    ImageLocation imageLocation2222 = forChat;
                    sVar.a.setImage(imageLocation2222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? z8Var2222 : imageFromMemory, null, chat32222, 0);
                    sVar.b.setImage(imageLocation2222, "50_50_b", new ColorDrawable(j6.w0(null, j6.tg, false)), null, chat32222, 0);
                    z15 = false;
                    if (z10) {
                    }
                    if (z15 != this.T) {
                    }
                    if (this.w.participant.self) {
                    }
                    n0 n0Var22222 = this.k0;
                    n0Var22222.h = this.w.participant;
                    n0Var22222.c(z10);
                    if (sVar.getVisibility() == 0) {
                    }
                    ChatObject.VideoParticipant videoParticipant102222 = this.w;
                    if (videoParticipant102222.presentation) {
                    }
                    if (this.p0 != z16) {
                    }
                    if (e60.F3) {
                    }
                    if (!this.w.participant.self) {
                    }
                    if (e60.F3) {
                    }
                    k(true);
                }
                if (this.v) {
                    return;
                }
                long peerId3 = MessageObject.getPeerId(this.w.participant.peer);
                if (DialogObject.isUserDialog(peerId3)) {
                    str2 = UserObject.getUserName(AccountInstance.getInstance(i14).getMessagesController().getUser(Long.valueOf(peerId3)));
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(i14).getMessagesController().getChat(Long.valueOf(-peerId3));
                    str2 = chat4 != null ? chat4.title : str;
                }
                k5Var.l(str2, false);
                return;
            }
        }
        z10 = z4;
        z11 = false;
        videoParticipant = this.w;
        videoParticipant2 = call.videoNotAvailableParticipant;
        k5 k5Var2 = this.I;
        if (videoParticipant != videoParticipant2) {
        }
        z12 = this.v;
        int i142 = this.H;
        if (z12) {
        }
        if (this.v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z4) {
        int w02;
        int i10;
        int w03;
        n0 n0Var = this.k0;
        if (n0Var == null) {
            return;
        }
        if (n0Var.k) {
            w03 = j6.w0(null, j6.sg, false);
        } else {
            if (!n0Var.e) {
                w02 = j6.w0(null, j6.qg, false);
                i10 = -1;
                if (this.B0 != i10) {
                    return;
                }
                ValueAnimator valueAnimator = this.D0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.D0.cancel();
                }
                if (!z4) {
                    this.C0 = w02;
                    this.Q.setColor(w02);
                    return;
                }
                int i11 = this.A0;
                int i12 = this.C0;
                this.B0 = i10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.D0 = ofFloat;
                ofFloat.addUpdateListener(new ya(this, i11, i10, i12, w02, 2));
                this.D0.addListener(new s20(this, i10, w02, 2));
                this.D0.start();
                return;
            }
            w03 = j6.w0(null, j6.qg, false);
        }
        i10 = w03;
        w02 = i10;
        if (this.B0 != i10) {
        }
    }

    public final void l(int i10) {
        int measuredWidth = this.x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.E0 == i10 || i10 <= 0) && (this.F0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i10 != 0) {
            this.E0 = i10;
        }
        if (measuredWidth != 0) {
            this.F0 = measuredWidth;
        }
        this.I.h(measuredWidth - i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i0.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float z4;
        int dp;
        l lVar;
        float f10;
        int dp2;
        FrameLayout frameLayout = this.G;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        ChatObject.Call call = this.C;
        float f11 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.a0;
        boolean z11 = e60.C3;
        if (z10 != z11) {
            this.O = true;
            this.a0 = z11;
        }
        int dp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = dp3;
        layoutParams.leftMargin = dp3;
        boolean z12 = this.s;
        jj0 jj0Var = this.R;
        k5 k5Var = this.I;
        if (z12) {
            k5Var.animate().scaleX(f11).scaleY(f11).start();
            jj0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            k5Var.animate().cancel();
            k5Var.setScaleX(f11);
            k5Var.setScaleY(f11);
            jj0Var.animate().cancel();
            jj0Var.setScaleX(f11);
            jj0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.t0 = 1.0f;
            if (e60.D3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
            } else if (e60.C3) {
                int size = View.MeasureSpec.getSize(i10);
                if (!call.call.rtmp_stream) {
                    size -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
            } else {
                int size2 = View.MeasureSpec.getSize(i11);
                if (!call.call.rtmp_stream) {
                    size2 -= AndroidUtilities.dp(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.t0 = 1.0f;
            int z13 = org.telegram.ui.b.z(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(z13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + z13, TLObject.FLAG_30));
        } else if (this.E) {
            this.t0 = 1.0f;
            int i13 = 6;
            if ((!e60.D3 || this.e == null) && !e60.C3) {
                i13 = 2;
            }
            if (this.e != null) {
                dp = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(344.0f);
            } else if (e60.D3) {
                dp = AndroidUtilities.dp(320.0f);
            } else {
                z4 = org.telegram.ui.b.z(14.0f, 2, View.MeasureSpec.getSize(i10)) + (e60.C3 ? -AndroidUtilities.dp(90.0f) : 0);
                float f12 = (this.F / i13) * z4;
                lVar = this.e;
                if (lVar == null) {
                    f10 = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (e60.D3) {
                        f10 = z4 / 2.0f;
                    } else {
                        f10 = z4 / (e60.C3 ? 3 : 2);
                    }
                    dp2 = AndroidUtilities.dp(2.0f);
                }
                float f13 = f12 - dp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float dp4 = this.S.getVisibility() != 0 ? f13 - AndroidUtilities.dp(28.0f) : f13;
                l((int) dp4);
                layoutParams2.width = (int) (dp4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
            }
            z4 = dp;
            float f122 = (this.F / i13) * z4;
            lVar = this.e;
            if (lVar == null) {
            }
            float f132 = f122 - dp2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.S.getVisibility() != 0) {
            }
            l((int) dp4);
            layoutParams22.width = (int) (dp4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f132, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
        } else {
            this.t0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.J != size3) {
            this.J = size3;
            this.y.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, i0.a.k(-16777216, 120), Shader.TileMode.CLAMP));
        }
        k5Var.setPivotX(0.0f);
        k5Var.setPivotY(k5Var.getMeasuredHeight() / 2.0f);
    }

    public void setAmplitude(double d) {
        this.k0.a(d);
        s sVar = this.V;
        sVar.getClass();
        float f10 = ((float) d) / 80.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        } else if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        sVar.r = f10;
        sVar.s = (f10 - sVar.n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.c != lVar) {
            this.c = lVar;
            this.O = true;
            j(true);
        }
    }

    public void setSecondaryView(t20 t20Var) {
        if (this.d != t20Var) {
            this.d = t20Var;
            this.O = true;
            j(true);
        }
    }

    public void setTabletGridView(l lVar) {
        if (this.e != lVar) {
            this.e = lVar;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
