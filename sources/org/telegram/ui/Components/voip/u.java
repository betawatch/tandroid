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
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import jh.r5;
import jh.xa;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.j30;
import org.telegram.ui.r50;
import org.telegram.ui.th;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends FrameLayout implements n0 {
    public boolean A;
    public int A0;
    public final ChatObject.Call B;
    public int B0;
    public final r50 C;
    public ValueAnimator C0;
    public boolean D;
    public int D0;
    public float E;
    public int E0;
    public final FrameLayout F;
    public ValueAnimator F0;
    public final int G;
    public boolean G0;
    public final h5 H;
    public int I;
    public final r J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public final Paint P;
    public final aj0 Q;
    public final ImageView R;
    public boolean S;
    public float T;
    public final t U;
    public ValueAnimator V;
    public boolean W;
    public final p a;
    public float a0;
    public boolean b;
    public float b0;
    public l c;
    public float c0;
    public n20 d;
    public float d0;
    public l e;
    public float e0;
    public boolean f;
    public boolean f0;
    public float g0;
    public boolean h;
    public final ImageReceiver h0;
    public final ArrayList i0;
    public o0 j0;
    public boolean k0;
    public float l0;
    public Bitmap m0;
    public boolean n;
    public Paint n0;
    public boolean o0;
    public float p0;
    public final gr q0;
    public boolean r;
    public final Drawable r0;
    public boolean s;
    public float s0;
    public ImageView t0;
    public boolean u0;
    public boolean v;
    public boolean v0;
    public ChatObject.VideoParticipant w;
    public final m w0;
    public final l0 x;
    public final Rect x0;
    public final Paint y;
    public r5 y0;
    public int z0;

    public u(l0 l0Var, ChatObject.Call call, r50 r50Var) {
        super(l0Var.getContext());
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.P = paint;
        this.T = 1.0f;
        this.h0 = new ImageReceiver();
        this.i0 = new ArrayList();
        this.w0 = new m(this, 1);
        this.x0 = new Rect();
        this.B = call;
        int currentAccount = r50Var.getCurrentAccount();
        this.G = currentAccount;
        gr grVar = new gr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.q0 = grVar;
        grVar.a(true, false);
        float f9 = -AndroidUtilities.dp(4.0f);
        float dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        grVar.i = f9;
        grVar.j = dp;
        grVar.k = dp2;
        grVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        grVar.c.setStrokeWidth(dpf2);
        grVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.r0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        p pVar = new p(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, r50Var, string, textPaint.measureText(string));
        this.a = pVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        t2 t2Var = pVar.d;
        t2Var.setScalingType(scalingType);
        this.x = l0Var;
        this.C = r50Var;
        t2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q(this));
        TextureView textureView = pVar.e;
        if (textureView != null) {
            t2Var.setBackgroundRenderer(textureView);
            if (!t2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        t2Var.setAlpha(0.0f);
        addView(pVar);
        t tVar = new t(this, getContext());
        this.U = tVar;
        addView(tVar);
        h5 h5Var = new h5(l0Var.getContext());
        this.H = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.a.k(-1, TLRPC.LAYER));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.F = frameLayout;
        frameLayout.addView(h5Var, f6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, f6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(g6.w0(null, g6.qg, false));
        frameLayout.setClipChildren(false);
        aj0 aj0Var = new aj0(l0Var.getContext());
        this.Q = aj0Var;
        addView(aj0Var, f6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(l0Var.getContext());
        this.R = imageView;
        addView(imageView, f6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp4 = AndroidUtilities.dp(19.0f);
        int k9 = i0.a.k(-1, 100);
        org.telegram.ui.Cells.z i02 = g6.i0(dp4, dp4, dp4, dp4, 0, k9, k9);
        r rVar = new r(this, l0Var.getContext());
        this.J = rVar;
        rVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        rVar.setTextSize(1, 15.0f);
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        rVar.setTextColor(-1);
        rVar.setBackground(i02);
        rVar.setGravity(17);
        rVar.setOnClickListener(new mh.n(this, 7));
        addView(rVar, f6.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.K = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(g6.w0(null, g6.og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            x3.r(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, f6.e(-2, -2, 51));
    }

    public static u c(ArrayList arrayList, j30 j30Var, l lVar, n20 n20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, r50 r50Var) {
        u uVar;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                uVar = null;
                break;
            }
            if (videoParticipant.equals(((u) arrayList.get(i10)).w)) {
                uVar = (u) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (uVar == null) {
            uVar = new u(j30Var, call, r50Var);
        }
        if (lVar != null) {
            uVar.setPrimaryView(lVar);
        }
        if (n20Var != null) {
            uVar.setSecondaryView(n20Var);
        }
        if (lVar2 != null) {
            uVar.setTabletGridView(lVar2);
        }
        return uVar;
    }

    @Override // org.telegram.ui.Components.voip.n0
    public final void a() {
        invalidate();
        k(true);
        t tVar = this.U;
        if (tVar.getVisibility() == 0) {
            t.a(tVar, true);
        }
    }

    public final void b(boolean z10) {
        this.L = true;
        this.v = false;
        this.x.f(this);
        if (z10) {
            if (this.w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !h1.Z.R) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.V.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.m0 != null) {
            return;
        }
        HashMap<String, Bitmap> hashMap = this.B.thumbs;
        ChatObject.VideoParticipant videoParticipant = this.w;
        boolean z10 = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        Bitmap bitmap = hashMap.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.m0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.m0 == null) {
            long peerId = MessageObject.getPeerId(this.w.participant.peer);
            ChatObject.VideoParticipant videoParticipant2 = this.w;
            boolean z11 = videoParticipant2.participant.self;
            ImageReceiver imageReceiver = this.h0;
            if (z11 && videoParticipant2.presentation) {
                imageReceiver.setImageBitmap(new yb0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.G;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                int d = user != null ? e9.d(user.id) : i0.a.d(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
            int d10 = chat != null ? e9.d(chat.id) : i0.a.d(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, chat, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.v;
        l0 l0Var = this.x;
        p pVar = this.a;
        if (z10) {
            float y8 = (pVar.getY() + pVar.getMeasuredHeight()) - pVar.J;
            FrameLayout frameLayout = this.F;
            float measuredHeight = (y8 - frameLayout.getMeasuredHeight()) + this.l0;
            boolean z11 = this.h;
            aj0 aj0Var = this.Q;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - l0Var.n);
                aj0Var.setAlpha(1.0f - l0Var.n);
            } else if (this.b || this.r) {
                if (!r50.B3 && !r50.C3) {
                    measuredHeight = th.b(1.0f, l0Var.S, AndroidUtilities.dp(90.0f) * l0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                aj0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - l0Var.c);
                aj0Var.setAlpha(1.0f - l0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                aj0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            h5 h5Var = this.H;
            if (z12 || this.r) {
                h5Var.setFullAlpha(l0Var.c);
            } else {
                h5Var.setFullAlpha(0.0f);
            }
            aj0Var.setTranslationX(frameLayout.getX());
            aj0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.R;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((pVar.getMeasuredWidth() - (pVar.K * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.c, 1.0f - l0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.u0 ? 0.0f : AndroidUtilities.dp(6.0f) * l0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.j0;
            if (o0Var != null) {
                boolean z13 = o0Var.e;
                if (z13) {
                    float f9 = this.O;
                    if (f9 != 1.0f) {
                        float f10 = f9 + 0.053333335f;
                        this.O = f10;
                        if (f10 > 1.0f) {
                            this.O = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.O;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.O = f12;
                        if (f12 < 0.0f) {
                            this.O = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.O;
            float f14 = (1.0f - l0Var.n) * (1.0f - l0Var.c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(pVar.getX() + pVar.K, pVar.getY() + pVar.J, (pVar.getX() + pVar.getMeasuredWidth()) - pVar.K, (pVar.getY() + pVar.getMeasuredHeight()) - pVar.J);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.l0);
                float f15 = pVar.b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.k0 || (view != this.a && view != this.U)) {
            return super.drawChild(canvas, view, j10);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.l0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        o0 o0Var = this.j0;
        if (o0Var != null) {
            this.C.p2.add(o0Var);
            this.j0.b();
            o0 o0Var2 = this.j0;
            o0Var2.c = null;
            o0Var2.c(false);
        }
        this.j0 = null;
    }

    public final void f() {
        if (this.w != null) {
            p pVar = this.a;
            t2 t2Var = pVar.d;
            t2 t2Var2 = pVar.d;
            if (t2Var.getMeasuredHeight() == 0 || t2Var2.getMeasuredWidth() == 0) {
                return;
            }
            t2Var2.getRenderBufferBitmap(new l4.s0(this, 21));
        }
    }

    public final void g(boolean z10, boolean z11) {
        if (this.n != z10) {
            this.n = z10;
            j(!(this.c == null && this.e == null) && z11);
        }
    }

    public String getName() {
        long peerId = MessageObject.getPeerId(this.w.participant.peer);
        return DialogObject.isUserDialog(peerId) ? UserObject.getUserName(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getUser(Long.valueOf(peerId))) : AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId)).title;
    }

    public l getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.b != z10) {
            this.b = z10;
            this.N = true;
            j(z11);
        }
    }

    public final void i(float f9, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.a0 == f9 && this.b0 == f10 && this.c0 == f11 && this.d0 == f12 && this.e0 == f13) {
            return;
        }
        this.f0 = z10;
        this.a0 = f9;
        this.b0 = f10;
        this.c0 = f11;
        this.d0 = f12;
        this.e0 = f13;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.M) {
            this.a.invalidate();
        }
        l lVar = this.c;
        if (lVar != null) {
            lVar.invalidate();
            r50 r50Var = this.C;
            if (r50Var.T2 == this.c) {
                r50Var.getContainerView().invalidate();
            }
        }
        n20 n20Var = this.d;
        if (n20Var != null) {
            n20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d7, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x066a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        boolean z11;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        boolean z13;
        String str;
        String str2;
        int i10;
        int i11;
        boolean z14;
        float f9;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z15;
        t2 t2Var;
        boolean videoIsActive;
        t tVar;
        long peerId;
        ImageLocation forChat;
        ImageLocation forChat2;
        TLRPC.Chat chat;
        boolean z16;
        Drawable imageFromMemory;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z17;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        ChatObject.VideoParticipant videoParticipant4;
        l lVar;
        if (this.L) {
            return;
        }
        ChatObject.Call call = this.B;
        int i12 = 0;
        if (call.call.rtmp_stream) {
            int dp = AndroidUtilities.dp(this.b ? 36.0f : 21.0f);
            this.K.setPadding(dp, 0, dp, 0);
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
        boolean z18 = this.v;
        aj0 aj0Var = this.Q;
        int i13 = 8;
        l0 l0Var = this.x;
        p pVar = this.a;
        int i14 = 1;
        if (z18 && !this.b) {
            boolean z19 = VoIPService.getSharedInstance() == null;
            if (r50.E3 || (videoParticipant4 = this.w) == null || (this.d == null && (!ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, call) || (!call.canStreamVideo && this.w != call.videoNotAvailableParticipant)))) {
                z19 = true;
            }
            if (z19 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.v = false;
                f();
                boolean z20 = SharedConfig.getDevicePerformanceClass() <= 0;
                if (pVar.U == null && z19) {
                    if (z20) {
                        l0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z20, i13)).setDuration(150L).start();
                } else {
                    if (l0Var.s) {
                        r5 r5Var = this.y0;
                        if (r5Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(r5Var);
                            this.y0 = null;
                        }
                        r5 r5Var2 = new r5(this, z20, this, 21);
                        this.y0 = r5Var2;
                        AndroidUtilities.runOnUIThread(r5Var2);
                    } else {
                        if (z20) {
                            l0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z20) {
                        l0Var.f(this);
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
                ValueAnimator valueAnimator2 = this.V;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.V.cancel();
                }
            }
        } else if (!z18) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            l lVar3 = this.c;
            if (lVar3 != null || this.d != null || this.e != null || this.b) {
                if (lVar3 != null) {
                    this.w = lVar3.getParticipant();
                } else {
                    n20 n20Var = this.d;
                    if (n20Var != null) {
                        this.w = n20Var.getVideoParticipant();
                    } else {
                        l lVar4 = this.e;
                        if (lVar4 != null) {
                            this.w = lVar4.getParticipant();
                        }
                    }
                }
                ChatObject.VideoParticipant videoParticipant6 = this.w;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant6.participant;
                boolean z21 = !groupCallParticipant.self ? !((call.canStreamVideo || videoParticipant6 == call.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant6.presentation, call)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.w.presentation) == 2);
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
                r50 r50Var = this.C;
                if (r50Var.p2.size() > 0) {
                    this.j0 = (o0) com.google.android.recaptcha.internal.a.j(1, r50Var.p2);
                } else {
                    this.j0 = new o0();
                }
                o0 o0Var = this.j0;
                o0Var.g = this;
                o0Var.c = aj0Var;
                o0Var.c(false);
                k(false);
                r5 r5Var3 = this.y0;
                if (r5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(r5Var3);
                    this.y0 = null;
                }
                if (getParent() == null) {
                    l0Var.addView(this, f6.e(46, 46, 51));
                    l0Var.D.add(this);
                    long peerId2 = MessageObject.getPeerId(this.w.participant.peer);
                    LongSparseIntArray longSparseIntArray = l0Var.w;
                    longSparseIntArray.put(peerId2, longSparseIntArray.get(peerId2, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.N = true;
                this.A = false;
                animate().setListener(null).cancel();
                if (pVar.U != null || this.d == null || this.c != null || pVar.y == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.A = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new s(this, i12)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.R.setVisibility((!this.w.presentation || call.call.rtmp_stream) ? 8 : 0);
                z11 = false;
                z12 = true;
                videoParticipant = this.w;
                videoParticipant2 = call.videoNotAvailableParticipant;
                h5 h5Var = this.H;
                if (videoParticipant != videoParticipant2) {
                    if (h5Var.getVisibility() != 4) {
                        h5Var.setVisibility(4);
                        aj0Var.setVisibility(4);
                    }
                } else if (h5Var.getVisibility() != 0) {
                    h5Var.setVisibility(0);
                    aj0Var.setVisibility(0);
                }
                z13 = this.v;
                int i15 = this.G;
                if (z13) {
                    str = null;
                } else {
                    boolean z22 = r50.C3 && (!l0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        n20 n20Var2 = this.d;
                        if (n20Var2 == null || this.c != null || l0Var.b) {
                            if (!this.h) {
                                if (n20Var2 == null || this.c != null) {
                                    l lVar5 = this.e;
                                    if (lVar5 == null || !z22) {
                                        l lVar6 = this.c;
                                        if ((lVar6 == null || n20Var2 != null) && this.n) {
                                            if (lVar6 != null) {
                                                i10 = AndroidUtilities.dp(80.0f);
                                            }
                                        } else if (lVar6 != null) {
                                            f9 = lVar6.a;
                                            i10 = -1;
                                            z14 = true;
                                            i11 = 0;
                                            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                            if (i10 != 0 && (marginLayoutParams.height != i10 || z12 || this.D != z14 || ((z14 && this.E != f9) || i11 != 0))) {
                                                marginLayoutParams.height = i10;
                                                if (z14) {
                                                    i10 = -1;
                                                }
                                                marginLayoutParams.width = i10;
                                                this.D = z14;
                                                this.E = f9;
                                                this.N = true;
                                                if (z11) {
                                                    pVar.requestLayout();
                                                } else {
                                                    pVar.a();
                                                    this.s = true;
                                                }
                                                AndroidUtilities.runOnUIThread(new m(this, i12));
                                                l0Var.requestLayout();
                                                invalidate();
                                            }
                                            videoParticipant3 = this.w;
                                            if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                                                t2 t2Var2 = pVar.d;
                                                t2 t2Var3 = pVar.d;
                                                t2Var2.setMirror(false);
                                                t2Var3.setRotateTextureWithScreen(true);
                                                t2Var3.setUseCameraRotation(false);
                                            } else {
                                                t2 t2Var4 = pVar.d;
                                                t2 t2Var5 = pVar.d;
                                                t2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                                t2Var5.setRotateTextureWithScreen(true);
                                                t2Var5.setUseCameraRotation(true);
                                            }
                                            z15 = pVar.a;
                                            t2Var = pVar.d;
                                            if (!z15) {
                                                ((WindowManager) pVar.getContext().getSystemService("window")).getDefaultDisplay();
                                            }
                                            if (this.w.participant.self) {
                                                t2Var.setMaxTextureSize(720);
                                            } else {
                                                t2Var.setMaxTextureSize(0);
                                            }
                                            ChatObject.VideoParticipant videoParticipant9 = this.w;
                                            videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9.participant, videoParticipant9.presentation, call);
                                            tVar = this.U;
                                            if (videoIsActive || !(call.canStreamVideo || this.w == call.videoNotAvailableParticipant)) {
                                                ImageReceiver imageReceiver = tVar.a;
                                                e9 e9Var = tVar.c;
                                                imageReceiver.setCurrentAccount(i15);
                                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                                if (DialogObject.isUserDialog(peerId)) {
                                                    TLRPC.User user = AccountInstance.getInstance(i15).getMessagesController().getUser(Long.valueOf(peerId));
                                                    e9Var.m(i15, user);
                                                    forChat = ImageLocation.getForUser(i15, user, 0);
                                                    forChat2 = ImageLocation.getForUser(i15, user, 1);
                                                    chat = user;
                                                } else {
                                                    TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                                                    e9Var.k(i15, chat2);
                                                    forChat = ImageLocation.getForChat(i15, chat2, 0);
                                                    forChat2 = ImageLocation.getForChat(i15, chat2, 1);
                                                    chat = chat2;
                                                }
                                                TLRPC.Chat chat3 = chat;
                                                ImageLocation imageLocation = forChat;
                                                tVar.a.setImage(imageLocation, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? e9Var : imageFromMemory, null, chat3, 0);
                                                tVar.b.setImage(imageLocation, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat3, 0);
                                                z16 = false;
                                            } else {
                                                z16 = true;
                                            }
                                            boolean z23 = (z11 || this.d == null || this.b || z16) ? false : true;
                                            if (z16 != this.S && !z23) {
                                                this.S = z16;
                                                valueAnimator = this.V;
                                                if (valueAnimator != null) {
                                                    valueAnimator.removeAllListeners();
                                                    this.V.cancel();
                                                }
                                                if (z11) {
                                                    boolean z24 = this.S;
                                                    this.T = z24 ? 0.0f : 1.0f;
                                                    tVar.setVisibility(z24 ? 8 : 0);
                                                    tVar.setAlpha(this.T);
                                                    pVar.invalidate();
                                                } else {
                                                    if (!this.S && tVar.getVisibility() != 0) {
                                                        tVar.setVisibility(0);
                                                        tVar.setAlpha(0.0f);
                                                    }
                                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, this.S ? 0.0f : 1.0f);
                                                    this.V = ofFloat;
                                                    ofFloat.addUpdateListener(new n(this, i12));
                                                    this.V.addListener(new s(this, i14));
                                                    this.V.start();
                                                }
                                                if (this.S) {
                                                    t.a(tVar, false);
                                                }
                                            }
                                            if (this.w.participant.self && VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(t2Var, this.w.presentation);
                                            }
                                            o0 o0Var2 = this.j0;
                                            o0Var2.h = this.w.participant;
                                            o0Var2.c(z11);
                                            if (tVar.getVisibility() == 0) {
                                                t.a(tVar, true);
                                            }
                                            ChatObject.VideoParticipant videoParticipant10 = this.w;
                                            z17 = !videoParticipant10.presentation ? (tL_groupCallParticipantVideo = videoParticipant10.participant.video) == null || !tL_groupCallParticipantVideo.paused : (tL_groupCallParticipantVideo2 = videoParticipant10.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused;
                                            if (this.o0 != z17) {
                                                this.o0 = z17;
                                                t2Var.animate().alpha(this.o0 ? 0.0f : 1.0f).setDuration(250L).start();
                                                pVar.invalidate();
                                            }
                                            if (r50.E3 && this.S) {
                                                if (!t2Var.isFirstFrameRendered()) {
                                                    d();
                                                }
                                                if (this.w.participant.self) {
                                                    if (VoIPService.getSharedInstance() != null) {
                                                        VoIPService.getSharedInstance().setLocalSink(t2Var, this.w.presentation);
                                                    }
                                                } else if (VoIPService.getSharedInstance() != null) {
                                                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant11 = this.w;
                                                    sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, t2Var, null);
                                                    VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant12 = this.w;
                                                    sharedInstance5.addRemoteSink(videoParticipant12.participant, videoParticipant12.presentation, t2Var, null);
                                                    if (call.call.rtmp_stream && !t2Var.isFirstFrameRendered() && !this.v0) {
                                                        AndroidUtilities.runOnUIThread(this.w0, 15000L);
                                                        this.v0 = true;
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
                                                if (r50.E3 && t2Var.isFirstFrameRendered()) {
                                                    f();
                                                    t2Var.clearFirstFrame();
                                                    t2Var.setAlpha(0.0f);
                                                    pVar.e.setAlpha(0.0f);
                                                }
                                            }
                                            k(true);
                                        } else {
                                            i10 = AndroidUtilities.dp(46.0f);
                                        }
                                    } else {
                                        float f10 = lVar5.a;
                                        i11 = lVar5.b.e.size();
                                        z14 = true;
                                        f9 = f10;
                                        i10 = -1;
                                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                        if (i10 != 0) {
                                            marginLayoutParams.height = i10;
                                            if (z14) {
                                            }
                                            marginLayoutParams.width = i10;
                                            this.D = z14;
                                            this.E = f9;
                                            this.N = true;
                                            if (z11) {
                                            }
                                            AndroidUtilities.runOnUIThread(new m(this, i12));
                                            l0Var.requestLayout();
                                            invalidate();
                                        }
                                        videoParticipant3 = this.w;
                                        if (videoParticipant3.participant.self) {
                                        }
                                        t2 t2Var22 = pVar.d;
                                        t2 t2Var32 = pVar.d;
                                        t2Var22.setMirror(false);
                                        t2Var32.setRotateTextureWithScreen(true);
                                        t2Var32.setUseCameraRotation(false);
                                        z15 = pVar.a;
                                        t2Var = pVar.d;
                                        if (!z15) {
                                        }
                                        if (this.w.participant.self) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant92 = this.w;
                                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92.participant, videoParticipant92.presentation, call);
                                        tVar = this.U;
                                        if (videoIsActive) {
                                        }
                                        ImageReceiver imageReceiver2 = tVar.a;
                                        e9 e9Var2 = tVar.c;
                                        imageReceiver2.setCurrentAccount(i15);
                                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                                        if (DialogObject.isUserDialog(peerId)) {
                                        }
                                        TLRPC.Chat chat32 = chat;
                                        ImageLocation imageLocation2 = forChat;
                                        tVar.a.setImage(imageLocation2, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? e9Var2 : imageFromMemory, null, chat32, 0);
                                        tVar.b.setImage(imageLocation2, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat32, 0);
                                        z16 = false;
                                        if (z11) {
                                        }
                                        if (z16 != this.S) {
                                            this.S = z16;
                                            valueAnimator = this.V;
                                            if (valueAnimator != null) {
                                            }
                                            if (z11) {
                                            }
                                            if (this.S) {
                                            }
                                        }
                                        if (this.w.participant.self) {
                                            VoIPService.getSharedInstance().setLocalSink(t2Var, this.w.presentation);
                                        }
                                        o0 o0Var22 = this.j0;
                                        o0Var22.h = this.w.participant;
                                        o0Var22.c(z11);
                                        if (tVar.getVisibility() == 0) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant102 = this.w;
                                        if (videoParticipant102.presentation) {
                                        }
                                        if (this.o0 != z17) {
                                        }
                                        if (r50.E3) {
                                        }
                                        if (!this.w.participant.self) {
                                        }
                                        if (r50.E3) {
                                            f();
                                            t2Var.clearFirstFrame();
                                            t2Var.setAlpha(0.0f);
                                            pVar.e.setAlpha(0.0f);
                                        }
                                        k(true);
                                    }
                                } else {
                                    i10 = AndroidUtilities.dp(80.0f);
                                }
                                f9 = 1.0f;
                                z14 = false;
                                i11 = 0;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i10 != 0) {
                                }
                                videoParticipant3 = this.w;
                                if (videoParticipant3.participant.self) {
                                }
                                t2 t2Var222 = pVar.d;
                                t2 t2Var322 = pVar.d;
                                t2Var222.setMirror(false);
                                t2Var322.setRotateTextureWithScreen(true);
                                t2Var322.setUseCameraRotation(false);
                                z15 = pVar.a;
                                t2Var = pVar.d;
                                if (!z15) {
                                }
                                if (this.w.participant.self) {
                                }
                                ChatObject.VideoParticipant videoParticipant922 = this.w;
                                videoIsActive = ChatObject.Call.videoIsActive(videoParticipant922.participant, videoParticipant922.presentation, call);
                                tVar = this.U;
                                if (videoIsActive) {
                                }
                                ImageReceiver imageReceiver22 = tVar.a;
                                e9 e9Var22 = tVar.c;
                                imageReceiver22.setCurrentAccount(i15);
                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                if (DialogObject.isUserDialog(peerId)) {
                                }
                                TLRPC.Chat chat322 = chat;
                                ImageLocation imageLocation22 = forChat;
                                tVar.a.setImage(imageLocation22, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? e9Var22 : imageFromMemory, null, chat322, 0);
                                tVar.b.setImage(imageLocation22, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat322, 0);
                                z16 = false;
                                if (z11) {
                                }
                                if (z16 != this.S) {
                                }
                                if (this.w.participant.self) {
                                }
                                o0 o0Var222 = this.j0;
                                o0Var222.h = this.w.participant;
                                o0Var222.c(z11);
                                if (tVar.getVisibility() == 0) {
                                }
                                ChatObject.VideoParticipant videoParticipant1022 = this.w;
                                if (videoParticipant1022.presentation) {
                                }
                                if (this.o0 != z17) {
                                }
                                if (r50.E3) {
                                }
                                if (!this.w.participant.self) {
                                }
                                if (r50.E3) {
                                }
                                k(true);
                            }
                        }
                        i10 = 0;
                        f9 = 1.0f;
                        z14 = false;
                        i11 = 0;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i10 != 0) {
                        }
                        videoParticipant3 = this.w;
                        if (videoParticipant3.participant.self) {
                        }
                        t2 t2Var2222 = pVar.d;
                        t2 t2Var3222 = pVar.d;
                        t2Var2222.setMirror(false);
                        t2Var3222.setRotateTextureWithScreen(true);
                        t2Var3222.setUseCameraRotation(false);
                        z15 = pVar.a;
                        t2Var = pVar.d;
                        if (!z15) {
                        }
                        if (this.w.participant.self) {
                        }
                        ChatObject.VideoParticipant videoParticipant9222 = this.w;
                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9222.participant, videoParticipant9222.presentation, call);
                        tVar = this.U;
                        if (videoIsActive) {
                        }
                        ImageReceiver imageReceiver222 = tVar.a;
                        e9 e9Var222 = tVar.c;
                        imageReceiver222.setCurrentAccount(i15);
                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                        if (DialogObject.isUserDialog(peerId)) {
                        }
                        TLRPC.Chat chat3222 = chat;
                        ImageLocation imageLocation222 = forChat;
                        tVar.a.setImage(imageLocation222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? e9Var222 : imageFromMemory, null, chat3222, 0);
                        tVar.b.setImage(imageLocation222, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat3222, 0);
                        z16 = false;
                        if (z11) {
                        }
                        if (z16 != this.S) {
                        }
                        if (this.w.participant.self) {
                        }
                        o0 o0Var2222 = this.j0;
                        o0Var2222.h = this.w.participant;
                        o0Var2222.c(z11);
                        if (tVar.getVisibility() == 0) {
                        }
                        ChatObject.VideoParticipant videoParticipant10222 = this.w;
                        if (videoParticipant10222.presentation) {
                        }
                        if (this.o0 != z17) {
                        }
                        if (r50.E3) {
                        }
                        if (!this.w.participant.self) {
                        }
                        if (r50.E3) {
                        }
                        k(true);
                    }
                    i10 = -1;
                    f9 = 1.0f;
                    z14 = false;
                    i11 = 0;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i10 != 0) {
                    }
                    videoParticipant3 = this.w;
                    if (videoParticipant3.participant.self) {
                    }
                    t2 t2Var22222 = pVar.d;
                    t2 t2Var32222 = pVar.d;
                    t2Var22222.setMirror(false);
                    t2Var32222.setRotateTextureWithScreen(true);
                    t2Var32222.setUseCameraRotation(false);
                    z15 = pVar.a;
                    t2Var = pVar.d;
                    if (!z15) {
                    }
                    if (this.w.participant.self) {
                    }
                    ChatObject.VideoParticipant videoParticipant92222 = this.w;
                    videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92222.participant, videoParticipant92222.presentation, call);
                    tVar = this.U;
                    if (videoIsActive) {
                    }
                    ImageReceiver imageReceiver2222 = tVar.a;
                    e9 e9Var2222 = tVar.c;
                    imageReceiver2222.setCurrentAccount(i15);
                    peerId = MessageObject.getPeerId(this.w.participant.peer);
                    if (DialogObject.isUserDialog(peerId)) {
                    }
                    TLRPC.Chat chat32222 = chat;
                    ImageLocation imageLocation2222 = forChat;
                    tVar.a.setImage(imageLocation2222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? e9Var2222 : imageFromMemory, null, chat32222, 0);
                    tVar.b.setImage(imageLocation2222, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat32222, 0);
                    z16 = false;
                    if (z11) {
                    }
                    if (z16 != this.S) {
                    }
                    if (this.w.participant.self) {
                    }
                    o0 o0Var22222 = this.j0;
                    o0Var22222.h = this.w.participant;
                    o0Var22222.c(z11);
                    if (tVar.getVisibility() == 0) {
                    }
                    ChatObject.VideoParticipant videoParticipant102222 = this.w;
                    if (videoParticipant102222.presentation) {
                    }
                    if (this.o0 != z17) {
                    }
                    if (r50.E3) {
                    }
                    if (!this.w.participant.self) {
                    }
                    if (r50.E3) {
                    }
                    k(true);
                }
                if (this.v) {
                    return;
                }
                long peerId3 = MessageObject.getPeerId(this.w.participant.peer);
                if (DialogObject.isUserDialog(peerId3)) {
                    str2 = UserObject.getUserName(AccountInstance.getInstance(i15).getMessagesController().getUser(Long.valueOf(peerId3)));
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(i15).getMessagesController().getChat(Long.valueOf(-peerId3));
                    str2 = chat4 != null ? chat4.title : str;
                }
                h5Var.l(str2, false);
                return;
            }
        }
        z11 = z10;
        z12 = false;
        videoParticipant = this.w;
        videoParticipant2 = call.videoNotAvailableParticipant;
        h5 h5Var2 = this.H;
        if (videoParticipant != videoParticipant2) {
        }
        z13 = this.v;
        int i152 = this.G;
        if (z13) {
        }
        if (this.v) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z10) {
        int w02;
        int i10;
        int w03;
        o0 o0Var = this.j0;
        if (o0Var == null) {
            return;
        }
        if (o0Var.k) {
            w03 = g6.w0(null, g6.sg, false);
        } else {
            if (!o0Var.e) {
                w02 = g6.w0(null, g6.qg, false);
                i10 = -1;
                if (this.A0 != i10) {
                    return;
                }
                ValueAnimator valueAnimator = this.C0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.C0.cancel();
                }
                if (!z10) {
                    this.B0 = w02;
                    this.P.setColor(w02);
                    return;
                }
                int i11 = this.z0;
                int i12 = this.B0;
                this.A0 = i10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.C0 = ofFloat;
                ofFloat.addUpdateListener(new xa(this, i11, i10, i12, w02, 2));
                this.C0.addListener(new m20(this, i10, w02, 2));
                this.C0.start();
                return;
            }
            w03 = g6.w0(null, g6.qg, false);
        }
        i10 = w03;
        w02 = i10;
        if (this.A0 != i10) {
        }
    }

    public final void l(int i10) {
        int measuredWidth = this.x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.D0 == i10 || i10 <= 0) && (this.E0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i10 != 0) {
            this.D0 = i10;
        }
        if (measuredWidth != 0) {
            this.E0 = measuredWidth;
        }
        this.H.h(measuredWidth - i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0.onDetachedFromWindow();
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
        float z10;
        int dp;
        l lVar;
        float f9;
        int dp2;
        FrameLayout frameLayout = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        ChatObject.Call call = this.B;
        float f10 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z11 = this.W;
        boolean z12 = r50.B3;
        if (z11 != z12) {
            this.N = true;
            this.W = z12;
        }
        int dp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = dp3;
        layoutParams.leftMargin = dp3;
        boolean z13 = this.s;
        aj0 aj0Var = this.Q;
        h5 h5Var = this.H;
        if (z13) {
            h5Var.animate().scaleX(f10).scaleY(f10).start();
            aj0Var.animate().scaleX(f10).scaleY(f10).start();
        } else {
            h5Var.animate().cancel();
            h5Var.setScaleX(f10);
            h5Var.setScaleY(f10);
            aj0Var.animate().cancel();
            aj0Var.setScaleX(f10);
            aj0Var.setScaleY(f10);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.s0 = 1.0f;
            if (r50.C3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
            } else if (r50.B3) {
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
            this.s0 = 1.0f;
            int z14 = org.telegram.ui.b.z(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(z14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + z14, TLObject.FLAG_30));
        } else if (this.D) {
            this.s0 = 1.0f;
            int i13 = 6;
            if ((!r50.C3 || this.e == null) && !r50.B3) {
                i13 = 2;
            }
            if (this.e != null) {
                dp = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(344.0f);
            } else if (r50.C3) {
                dp = AndroidUtilities.dp(320.0f);
            } else {
                z10 = org.telegram.ui.b.z(14.0f, 2, View.MeasureSpec.getSize(i10)) + (r50.B3 ? -AndroidUtilities.dp(90.0f) : 0);
                float f11 = (this.E / i13) * z10;
                lVar = this.e;
                if (lVar == null) {
                    f9 = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (r50.C3) {
                        f9 = z10 / 2.0f;
                    } else {
                        f9 = z10 / (r50.B3 ? 3 : 2);
                    }
                    dp2 = AndroidUtilities.dp(2.0f);
                }
                float f12 = f11 - dp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float dp4 = this.R.getVisibility() != 0 ? f12 - AndroidUtilities.dp(28.0f) : f12;
                l((int) dp4);
                layoutParams2.width = (int) (dp4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f9, TLObject.FLAG_30));
            }
            z10 = dp;
            float f112 = (this.E / i13) * z10;
            lVar = this.e;
            if (lVar == null) {
            }
            float f122 = f112 - dp2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.R.getVisibility() != 0) {
            }
            l((int) dp4);
            layoutParams22.width = (int) (dp4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f122, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f9, TLObject.FLAG_30));
        } else {
            this.s0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.I != size3) {
            this.I = size3;
            this.y.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, i0.a.k(-16777216, 120), Shader.TileMode.CLAMP));
        }
        h5Var.setPivotX(0.0f);
        h5Var.setPivotY(h5Var.getMeasuredHeight() / 2.0f);
    }

    public void setAmplitude(double d) {
        this.j0.a(d);
        t tVar = this.U;
        tVar.getClass();
        float f9 = ((float) d) / 80.0f;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        } else if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        tVar.r = f9;
        tVar.s = (f9 - tVar.n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.c != lVar) {
            this.c = lVar;
            this.N = true;
            j(true);
        }
    }

    public void setSecondaryView(n20 n20Var) {
        if (this.d != n20Var) {
            this.d = n20Var;
            this.N = true;
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
