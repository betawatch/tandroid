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
import bi.u7;
import bi.vd;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.o30;
import org.telegram.ui.x50;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t extends FrameLayout implements n0 {
    public final m A0;
    public final Rect B0;
    public u7 C0;
    public int D0;
    public boolean E;
    public int E0;
    public final ChatObject.Call F;
    public int F0;
    public final x50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final b6 L;
    public int M;
    public final q N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final bk0 U;
    public final ImageView V;
    public boolean W;
    public final o a;
    public float a0;
    public boolean b;
    public final s b0;
    public l c;
    public ValueAnimator c0;
    public b30 d;
    public boolean d0;
    public l e;
    public float e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public boolean j0;
    public float k0;
    public final ImageReceiver l0;
    public final ArrayList m0;
    public boolean n;
    public o0 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final as u0;
    public boolean v;
    public final Drawable v0;
    public ChatObject.VideoParticipant w;
    public float w0;
    public final l0 x;
    public ImageView x0;
    public final Paint y;
    public boolean y0;
    public boolean z0;

    public t(l0 l0Var, ChatObject.Call call, x50 x50Var) {
        super(l0Var.getContext());
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver();
        this.m0 = new ArrayList();
        this.A0 = new m(this, 1);
        this.B0 = new Rect();
        this.F = call;
        int currentAccount = x50Var.getCurrentAccount();
        this.K = currentAccount;
        as asVar = new as(l0Var.getContext(), R.drawable.calls_video, -1);
        this.u0 = asVar;
        asVar.a(true, false);
        float f7 = -AndroidUtilities.dp(4.0f);
        float dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        asVar.i = f7;
        asVar.j = dp;
        asVar.k = dp2;
        asVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        asVar.c.setStrokeWidth(dpf2);
        asVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.v0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, l0Var.getContext(), call, l0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, x50Var, string, textPaint.measureText(string));
        this.a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        s2 s2Var = oVar.d;
        s2Var.setScalingType(scalingType);
        this.x = l0Var;
        this.G = x50Var;
        s2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            s2Var.setBackgroundRenderer(textureView);
            if (!s2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        s2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.b0 = sVar;
        addView(sVar);
        b6 b6Var = new b6(l0Var.getContext());
        this.L = b6Var;
        b6Var.setTextSize(13);
        b6Var.setTextColor(i0.a.o(-1, 229));
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setFullTextMaxLines(1);
        b6Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.J = frameLayout;
        frameLayout.addView(b6Var, kb1.h(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, kb1.g(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(y6.x0(null, y6.qg, false));
        frameLayout.setClipChildren(false);
        bk0 bk0Var = new bk0(l0Var.getContext());
        this.U = bk0Var;
        addView(bk0Var, kb1.h(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(l0Var.getContext());
        this.V = imageView;
        addView(imageView, kb1.h(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp4 = AndroidUtilities.dp(19.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y j02 = y6.j0(dp4, dp4, dp4, dp4, 0, o10, o10);
        q qVar = new q(this, l0Var.getContext());
        this.N = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(j02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new ig.d0(this, 12));
        addView(qVar, kb1.i(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        f7.V(textView, y6.og, null);
        textView.setBackground(j02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.t.n(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, kb1.i(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, o30 o30Var, l lVar, b30 b30Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, x50 x50Var) {
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
            tVar = new t(o30Var, call, x50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (b30Var != null) {
            tVar.setSecondaryView(b30Var);
        }
        if (lVar2 != null) {
            tVar.setTabletGridView(lVar2);
        }
        return tVar;
    }

    @Override // org.telegram.ui.Components.voip.n0
    public final void a() {
        invalidate();
        k(true);
        s sVar = this.b0;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.v = false;
        this.x.f(this);
        if (z10) {
            if (this.w.participant.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.w.presentation);
                }
            } else if (VoIPService.getSharedInstance() != null && !i1.d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                ChatObject.VideoParticipant videoParticipant = this.w;
                sharedInstance.removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.q0 != null) {
            return;
        }
        HashMap<String, Bitmap> hashMap = this.F.thumbs;
        ChatObject.VideoParticipant videoParticipant = this.w;
        boolean z10 = videoParticipant.presentation;
        TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
        Bitmap bitmap = hashMap.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.q0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.q0 == null) {
            long peerId = MessageObject.getPeerId(this.w.participant.peer);
            ChatObject.VideoParticipant videoParticipant2 = this.w;
            boolean z11 = videoParticipant2.participant.self;
            ImageReceiver imageReceiver = this.l0;
            if (z11 && videoParticipant2.presentation) {
                imageReceiver.setImageBitmap(new vc0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.K;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                int d = user != null ? j9.d(user.id) : i0.a.f(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
            int d10 = chat != null ? j9.d(chat.id) : i0.a.f(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d10, -16777216), i0.a.f(0.4f, d10, -16777216)}), null, chat, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.v;
        l0 l0Var = this.x;
        o oVar = this.a;
        if (z10) {
            float y3 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z11 = this.h;
            bk0 bk0Var = this.U;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - l0Var.n);
                bk0Var.setAlpha(1.0f - l0Var.n);
            } else if (this.b || this.r) {
                if (!x50.F3 && !x50.G3) {
                    measuredHeight = ic.a.d(1.0f, l0Var.W, AndroidUtilities.dp(90.0f) * l0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                bk0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - l0Var.c);
                bk0Var.setAlpha(1.0f - l0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                bk0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            b6 b6Var = this.L;
            if (z12 || this.r) {
                b6Var.setFullAlpha(l0Var.c);
            } else {
                b6Var.setFullAlpha(0.0f);
            }
            bk0Var.setTranslationX(frameLayout.getX());
            bk0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.O * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.c, 1.0f - l0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : AndroidUtilities.dp(6.0f) * l0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            o0 o0Var = this.n0;
            if (o0Var != null) {
                boolean z13 = o0Var.e;
                if (z13) {
                    float f7 = this.S;
                    if (f7 != 1.0f) {
                        float f10 = f7 + 0.053333335f;
                        this.S = f10;
                        if (f10 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.S;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.S = f12;
                        if (f12 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.S;
            float f14 = (1.0f - l0Var.n) * (1.0f - l0Var.c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.O, oVar.getY() + oVar.N, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.O, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f15 = oVar.b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.o0 || (view != this.a && view != this.b0)) {
            return super.drawChild(canvas, view, j10);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        o0 o0Var = this.n0;
        if (o0Var != null) {
            this.G.t2.add(o0Var);
            this.n0.b();
            o0 o0Var2 = this.n0;
            o0Var2.c = null;
            o0Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.w != null) {
            o oVar = this.a;
            s2 s2Var = oVar.d;
            s2 s2Var2 = oVar.d;
            if (s2Var.getMeasuredHeight() == 0 || s2Var2.getMeasuredWidth() == 0) {
                return;
            }
            s2Var2.getRenderBufferBitmap(new jg.e1(this, 29));
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
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.e0 == f7 && this.f0 == f10 && this.g0 == f11 && this.h0 == f12 && this.i0 == f13) {
            return;
        }
        this.j0 = z10;
        this.e0 = f7;
        this.f0 = f10;
        this.g0 = f11;
        this.h0 = f12;
        this.i0 = f13;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.a.invalidate();
        }
        l lVar = this.c;
        if (lVar != null) {
            lVar.invalidate();
            x50 x50Var = this.G;
            if (x50Var.X2 == this.c) {
                x50Var.getContainerView().invalidate();
            }
        }
        b30 b30Var = this.d;
        if (b30Var != null) {
            b30Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x01d9, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0670 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0393  */
    /* JADX WARN: Type inference failed for: r6v18, types: [int] */
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
        boolean z14;
        float f7;
        int i10;
        boolean z15;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z16;
        s2 s2Var;
        boolean videoIsActive;
        s sVar;
        long peerId;
        ImageLocation forChat;
        ImageLocation forChat2;
        TLRPC.Chat chat;
        boolean z17;
        Drawable imageFromMemory;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z18;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        ChatObject.VideoParticipant videoParticipant4;
        l lVar;
        if (this.P) {
            return;
        }
        ChatObject.Call call = this.F;
        int i11 = 0;
        if (call.call.rtmp_stream) {
            int dp = AndroidUtilities.dp(this.b ? 36.0f : 21.0f);
            this.O.setPadding(dp, 0, dp, 0);
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
        boolean z19 = this.v;
        bk0 bk0Var = this.U;
        l0 l0Var = this.x;
        o oVar = this.a;
        int i12 = 1;
        if (z19 && !this.b) {
            boolean z20 = VoIPService.getSharedInstance() == null;
            if (x50.I3 || (videoParticipant4 = this.w) == null || (this.d == null && (!ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, call) || (!call.canStreamVideo && this.w != call.videoNotAvailableParticipant)))) {
                z20 = true;
            }
            if (z20 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.v = false;
                f();
                boolean z21 = SharedConfig.getDevicePerformanceClass() <= 0;
                if (oVar.b0 == null && z20) {
                    if (z21) {
                        l0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new ai.l0(this, this, z21, 9)).setDuration(150L).start();
                } else {
                    if (l0Var.s) {
                        u7 u7Var = this.C0;
                        if (u7Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(u7Var);
                            this.C0 = null;
                        }
                        u7 u7Var2 = new u7(this, z21, this, 26);
                        this.C0 = u7Var2;
                        AndroidUtilities.runOnUIThread(u7Var2);
                    } else {
                        if (z21) {
                            l0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z21) {
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
                ValueAnimator valueAnimator2 = this.c0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.c0.cancel();
                }
            }
        } else if (!z19) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            l lVar3 = this.c;
            if (lVar3 != null || this.d != null || this.e != null || this.b) {
                if (lVar3 != null) {
                    this.w = lVar3.getParticipant();
                } else {
                    b30 b30Var = this.d;
                    if (b30Var != null) {
                        this.w = b30Var.getVideoParticipant();
                    } else {
                        l lVar4 = this.e;
                        if (lVar4 != null) {
                            this.w = lVar4.getParticipant();
                        }
                    }
                }
                ChatObject.VideoParticipant videoParticipant6 = this.w;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant6.participant;
                boolean z22 = !groupCallParticipant.self ? !((call.canStreamVideo || videoParticipant6 == call.videoNotAvailableParticipant) && ChatObject.Call.videoIsActive(groupCallParticipant, videoParticipant6.presentation, call)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.w.presentation) == 2);
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
                x50 x50Var = this.G;
                if (x50Var.t2.size() > 0) {
                    this.n0 = (o0) ic.a.y(1, x50Var.t2);
                } else {
                    this.n0 = new o0();
                }
                o0 o0Var = this.n0;
                o0Var.g = this;
                o0Var.c = bk0Var;
                o0Var.c(false);
                k(false);
                u7 u7Var3 = this.C0;
                if (u7Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(u7Var3);
                    this.C0 = null;
                }
                if (getParent() == null) {
                    l0Var.addView(this, kb1.i(46, 46, 51));
                    l0Var.H.add(this);
                    long peerId2 = MessageObject.getPeerId(this.w.participant.peer);
                    LongSparseIntArray longSparseIntArray = l0Var.w;
                    longSparseIntArray.put(peerId2, longSparseIntArray.get(peerId2, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.E = false;
                animate().setListener(null).cancel();
                if (oVar.b0 != null || this.d == null || this.c != null || oVar.y == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.E = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new r(this, i11)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility((!this.w.presentation || call.call.rtmp_stream) ? 8 : 0);
                z11 = false;
                z12 = true;
                videoParticipant = this.w;
                videoParticipant2 = call.videoNotAvailableParticipant;
                b6 b6Var = this.L;
                if (videoParticipant != videoParticipant2) {
                    if (b6Var.getVisibility() != 4) {
                        b6Var.setVisibility(4);
                        bk0Var.setVisibility(4);
                    }
                } else if (b6Var.getVisibility() != 0) {
                    b6Var.setVisibility(0);
                    bk0Var.setVisibility(0);
                }
                z13 = this.v;
                int i13 = this.K;
                if (z13) {
                    str = null;
                } else {
                    boolean z23 = x50.G3 && (!l0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        b30 b30Var2 = this.d;
                        if (b30Var2 == null || this.c != null || l0Var.b) {
                            if (!this.h) {
                                if (b30Var2 == null || this.c != null) {
                                    l lVar5 = this.e;
                                    if (lVar5 == null || !z23) {
                                        l lVar6 = this.c;
                                        if ((lVar6 == null || b30Var2 != null) && this.n) {
                                            if (lVar6 != null) {
                                                i10 = AndroidUtilities.dp(80.0f);
                                            }
                                        } else if (lVar6 != null) {
                                            z14 = false;
                                            f7 = lVar6.a;
                                            z15 = true;
                                        } else {
                                            i10 = AndroidUtilities.dp(46.0f);
                                        }
                                    } else {
                                        float f10 = lVar5.a;
                                        z14 = lVar5.b.e.size();
                                        z15 = true;
                                        f7 = f10;
                                    }
                                    i10 = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i10 != 0 && (marginLayoutParams.height != i10 || z12 || this.H != z15 || ((z15 && this.I != f7) || z14))) {
                                        marginLayoutParams.height = i10;
                                        if (z15) {
                                            i10 = -1;
                                        }
                                        marginLayoutParams.width = i10;
                                        this.H = z15;
                                        this.I = f7;
                                        this.R = true;
                                        if (z11) {
                                            oVar.requestLayout();
                                        } else {
                                            oVar.a();
                                            this.s = true;
                                        }
                                        AndroidUtilities.runOnUIThread(new m(this, i11));
                                        l0Var.requestLayout();
                                        invalidate();
                                    }
                                    videoParticipant3 = this.w;
                                    if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                                        s2 s2Var2 = oVar.d;
                                        s2 s2Var3 = oVar.d;
                                        s2Var2.setMirror(false);
                                        s2Var3.setRotateTextureWithScreen(true);
                                        s2Var3.setUseCameraRotation(false);
                                    } else {
                                        s2 s2Var4 = oVar.d;
                                        s2 s2Var5 = oVar.d;
                                        s2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        s2Var5.setRotateTextureWithScreen(true);
                                        s2Var5.setUseCameraRotation(true);
                                    }
                                    z16 = oVar.a;
                                    s2Var = oVar.d;
                                    if (!z16) {
                                        ((WindowManager) oVar.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.w.participant.self) {
                                        s2Var.setMaxTextureSize(0);
                                    } else {
                                        s2Var.setMaxTextureSize(720);
                                    }
                                    ChatObject.VideoParticipant videoParticipant9 = this.w;
                                    videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9.participant, videoParticipant9.presentation, call);
                                    sVar = this.b0;
                                    if (videoIsActive || !(call.canStreamVideo || this.w == call.videoNotAvailableParticipant)) {
                                        ImageReceiver imageReceiver = sVar.a;
                                        j9 j9Var = sVar.c;
                                        imageReceiver.setCurrentAccount(i13);
                                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                                        if (DialogObject.isUserDialog(peerId)) {
                                            TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                                            j9Var.k(i13, chat2);
                                            forChat = ImageLocation.getForChat(i13, chat2, 0);
                                            forChat2 = ImageLocation.getForChat(i13, chat2, 1);
                                            chat = chat2;
                                        } else {
                                            TLRPC.User user = AccountInstance.getInstance(i13).getMessagesController().getUser(Long.valueOf(peerId));
                                            j9Var.m(i13, user);
                                            forChat = ImageLocation.getForUser(i13, user, 0);
                                            forChat2 = ImageLocation.getForUser(i13, user, 1);
                                            chat = user;
                                        }
                                        TLRPC.Chat chat3 = chat;
                                        ImageLocation imageLocation = forChat;
                                        sVar.a.setImage(imageLocation, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? j9Var : imageFromMemory, null, chat3, 0);
                                        sVar.b.setImage(imageLocation, "50_50_b", new ColorDrawable(y6.x0(null, y6.tg, false)), null, chat3, 0);
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z24 = (z11 || this.d == null || this.b || z17) ? false : true;
                                    if (z17 != this.W && !z24) {
                                        this.W = z17;
                                        valueAnimator = this.c0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.c0.cancel();
                                        }
                                        if (z11) {
                                            boolean z25 = this.W;
                                            this.a0 = z25 ? 0.0f : 1.0f;
                                            sVar.setVisibility(z25 ? 8 : 0);
                                            sVar.setAlpha(this.a0);
                                            oVar.invalidate();
                                        } else {
                                            if (!this.W && sVar.getVisibility() != 0) {
                                                sVar.setVisibility(0);
                                                sVar.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new n(this, i11));
                                            this.c0.addListener(new r(this, i12));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            s.a(sVar, false);
                                        }
                                    }
                                    if (this.w.participant.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(s2Var, this.w.presentation);
                                    }
                                    o0 o0Var2 = this.n0;
                                    o0Var2.h = this.w.participant;
                                    o0Var2.c(z11);
                                    if (sVar.getVisibility() == 0) {
                                        s.a(sVar, true);
                                    }
                                    ChatObject.VideoParticipant videoParticipant10 = this.w;
                                    z18 = videoParticipant10.presentation ? !((tL_groupCallParticipantVideo = videoParticipant10.participant.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = videoParticipant10.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z18) {
                                        this.s0 = z18;
                                        s2Var.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        oVar.invalidate();
                                    }
                                    if (x50.I3 && this.W) {
                                        if (!s2Var.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.w.participant.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(s2Var, this.w.presentation);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            ChatObject.VideoParticipant videoParticipant11 = this.w;
                                            sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, s2Var, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            ChatObject.VideoParticipant videoParticipant12 = this.w;
                                            sharedInstance5.addRemoteSink(videoParticipant12.participant, videoParticipant12.presentation, s2Var, null);
                                            if (call.call.rtmp_stream && !s2Var.isFirstFrameRendered() && !this.z0) {
                                                AndroidUtilities.runOnUIThread(this.A0, 15000L);
                                                this.z0 = true;
                                            }
                                        }
                                        str = null;
                                    } else {
                                        if (this.w.participant.self) {
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
                                        if (x50.I3 && s2Var.isFirstFrameRendered()) {
                                            f();
                                            s2Var.clearFirstFrame();
                                            s2Var.setAlpha(0.0f);
                                            oVar.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i10 = AndroidUtilities.dp(80.0f);
                                }
                                z14 = false;
                                f7 = 1.0f;
                                z15 = z14;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i10 != 0) {
                                    marginLayoutParams.height = i10;
                                    if (z15) {
                                    }
                                    marginLayoutParams.width = i10;
                                    this.H = z15;
                                    this.I = f7;
                                    this.R = true;
                                    if (z11) {
                                    }
                                    AndroidUtilities.runOnUIThread(new m(this, i11));
                                    l0Var.requestLayout();
                                    invalidate();
                                }
                                videoParticipant3 = this.w;
                                if (videoParticipant3.participant.self) {
                                }
                                s2 s2Var22 = oVar.d;
                                s2 s2Var32 = oVar.d;
                                s2Var22.setMirror(false);
                                s2Var32.setRotateTextureWithScreen(true);
                                s2Var32.setUseCameraRotation(false);
                                z16 = oVar.a;
                                s2Var = oVar.d;
                                if (!z16) {
                                }
                                if (this.w.participant.self) {
                                }
                                ChatObject.VideoParticipant videoParticipant92 = this.w;
                                videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92.participant, videoParticipant92.presentation, call);
                                sVar = this.b0;
                                if (videoIsActive) {
                                }
                                ImageReceiver imageReceiver2 = sVar.a;
                                j9 j9Var2 = sVar.c;
                                imageReceiver2.setCurrentAccount(i13);
                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                if (DialogObject.isUserDialog(peerId)) {
                                }
                                TLRPC.Chat chat32 = chat;
                                ImageLocation imageLocation2 = forChat;
                                sVar.a.setImage(imageLocation2, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? j9Var2 : imageFromMemory, null, chat32, 0);
                                sVar.b.setImage(imageLocation2, "50_50_b", new ColorDrawable(y6.x0(null, y6.tg, false)), null, chat32, 0);
                                z17 = false;
                                if (z11) {
                                }
                                if (z17 != this.W) {
                                    this.W = z17;
                                    valueAnimator = this.c0;
                                    if (valueAnimator != null) {
                                    }
                                    if (z11) {
                                    }
                                    if (this.W) {
                                    }
                                }
                                if (this.w.participant.self) {
                                    VoIPService.getSharedInstance().setLocalSink(s2Var, this.w.presentation);
                                }
                                o0 o0Var22 = this.n0;
                                o0Var22.h = this.w.participant;
                                o0Var22.c(z11);
                                if (sVar.getVisibility() == 0) {
                                }
                                ChatObject.VideoParticipant videoParticipant102 = this.w;
                                if (videoParticipant102.presentation) {
                                }
                                if (this.s0 != z18) {
                                }
                                if (x50.I3) {
                                }
                                if (this.w.participant.self) {
                                }
                                if (x50.I3) {
                                    f();
                                    s2Var.clearFirstFrame();
                                    s2Var.setAlpha(0.0f);
                                    oVar.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        i10 = 0;
                        z14 = false;
                        f7 = 1.0f;
                        z15 = z14;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i10 != 0) {
                        }
                        videoParticipant3 = this.w;
                        if (videoParticipant3.participant.self) {
                        }
                        s2 s2Var222 = oVar.d;
                        s2 s2Var322 = oVar.d;
                        s2Var222.setMirror(false);
                        s2Var322.setRotateTextureWithScreen(true);
                        s2Var322.setUseCameraRotation(false);
                        z16 = oVar.a;
                        s2Var = oVar.d;
                        if (!z16) {
                        }
                        if (this.w.participant.self) {
                        }
                        ChatObject.VideoParticipant videoParticipant922 = this.w;
                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant922.participant, videoParticipant922.presentation, call);
                        sVar = this.b0;
                        if (videoIsActive) {
                        }
                        ImageReceiver imageReceiver22 = sVar.a;
                        j9 j9Var22 = sVar.c;
                        imageReceiver22.setCurrentAccount(i13);
                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                        if (DialogObject.isUserDialog(peerId)) {
                        }
                        TLRPC.Chat chat322 = chat;
                        ImageLocation imageLocation22 = forChat;
                        sVar.a.setImage(imageLocation22, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? j9Var22 : imageFromMemory, null, chat322, 0);
                        sVar.b.setImage(imageLocation22, "50_50_b", new ColorDrawable(y6.x0(null, y6.tg, false)), null, chat322, 0);
                        z17 = false;
                        if (z11) {
                        }
                        if (z17 != this.W) {
                        }
                        if (this.w.participant.self) {
                        }
                        o0 o0Var222 = this.n0;
                        o0Var222.h = this.w.participant;
                        o0Var222.c(z11);
                        if (sVar.getVisibility() == 0) {
                        }
                        ChatObject.VideoParticipant videoParticipant1022 = this.w;
                        if (videoParticipant1022.presentation) {
                        }
                        if (this.s0 != z18) {
                        }
                        if (x50.I3) {
                        }
                        if (this.w.participant.self) {
                        }
                        if (x50.I3) {
                        }
                        k(true);
                    }
                    z14 = false;
                    f7 = 1.0f;
                    i10 = -1;
                    z15 = z14;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i10 != 0) {
                    }
                    videoParticipant3 = this.w;
                    if (videoParticipant3.participant.self) {
                    }
                    s2 s2Var2222 = oVar.d;
                    s2 s2Var3222 = oVar.d;
                    s2Var2222.setMirror(false);
                    s2Var3222.setRotateTextureWithScreen(true);
                    s2Var3222.setUseCameraRotation(false);
                    z16 = oVar.a;
                    s2Var = oVar.d;
                    if (!z16) {
                    }
                    if (this.w.participant.self) {
                    }
                    ChatObject.VideoParticipant videoParticipant9222 = this.w;
                    videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9222.participant, videoParticipant9222.presentation, call);
                    sVar = this.b0;
                    if (videoIsActive) {
                    }
                    ImageReceiver imageReceiver222 = sVar.a;
                    j9 j9Var222 = sVar.c;
                    imageReceiver222.setCurrentAccount(i13);
                    peerId = MessageObject.getPeerId(this.w.participant.peer);
                    if (DialogObject.isUserDialog(peerId)) {
                    }
                    TLRPC.Chat chat3222 = chat;
                    ImageLocation imageLocation222 = forChat;
                    sVar.a.setImage(imageLocation222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? j9Var222 : imageFromMemory, null, chat3222, 0);
                    sVar.b.setImage(imageLocation222, "50_50_b", new ColorDrawable(y6.x0(null, y6.tg, false)), null, chat3222, 0);
                    z17 = false;
                    if (z11) {
                    }
                    if (z17 != this.W) {
                    }
                    if (this.w.participant.self) {
                    }
                    o0 o0Var2222 = this.n0;
                    o0Var2222.h = this.w.participant;
                    o0Var2222.c(z11);
                    if (sVar.getVisibility() == 0) {
                    }
                    ChatObject.VideoParticipant videoParticipant10222 = this.w;
                    if (videoParticipant10222.presentation) {
                    }
                    if (this.s0 != z18) {
                    }
                    if (x50.I3) {
                    }
                    if (this.w.participant.self) {
                    }
                    if (x50.I3) {
                    }
                    k(true);
                }
                if (this.v) {
                    return;
                }
                long peerId3 = MessageObject.getPeerId(this.w.participant.peer);
                if (DialogObject.isUserDialog(peerId3)) {
                    str2 = UserObject.getUserName(AccountInstance.getInstance(i13).getMessagesController().getUser(Long.valueOf(peerId3)));
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(i13).getMessagesController().getChat(Long.valueOf(-peerId3));
                    str2 = chat4 != null ? chat4.title : str;
                }
                b6Var.l(str2, false);
                return;
            }
        }
        z11 = z10;
        z12 = false;
        videoParticipant = this.w;
        videoParticipant2 = call.videoNotAvailableParticipant;
        b6 b6Var2 = this.L;
        if (videoParticipant != videoParticipant2) {
        }
        z13 = this.v;
        int i132 = this.K;
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
        int x02;
        int i10;
        int x03;
        o0 o0Var = this.n0;
        if (o0Var == null) {
            return;
        }
        if (o0Var.k) {
            x03 = y6.x0(null, y6.sg, false);
        } else {
            if (!o0Var.e) {
                x02 = y6.x0(null, y6.qg, false);
                i10 = -1;
                if (this.E0 != i10) {
                    return;
                }
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.G0.cancel();
                }
                if (!z10) {
                    this.F0 = x02;
                    this.T.setColor(x02);
                    return;
                }
                int i11 = this.D0;
                int i12 = this.F0;
                this.E0 = i10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G0 = ofFloat;
                ofFloat.addUpdateListener(new vd(this, i11, i10, i12, x02, 2));
                this.G0.addListener(new hi.b3(this, i10, x02, 3));
                this.G0.start();
                return;
            }
            x03 = y6.x0(null, y6.qg, false);
        }
        i10 = x03;
        x02 = i10;
        if (this.E0 != i10) {
        }
    }

    public final void l(int i10) {
        int measuredWidth = this.x.getMeasuredWidth() - AndroidUtilities.dp(6.0f);
        if ((this.H0 == i10 || i10 <= 0) && (this.I0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i10 != 0) {
            this.H0 = i10;
        }
        if (measuredWidth != 0) {
            this.I0 = measuredWidth;
        }
        this.L.h(measuredWidth - i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float C;
        int dp;
        l lVar;
        float f7;
        int dp2;
        FrameLayout frameLayout = this.J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        ChatObject.Call call = this.F;
        float f10 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.d0;
        boolean z11 = x50.F3;
        if (z10 != z11) {
            this.R = true;
            this.d0 = z11;
        }
        int dp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = dp3;
        layoutParams.leftMargin = dp3;
        boolean z12 = this.s;
        bk0 bk0Var = this.U;
        b6 b6Var = this.L;
        if (z12) {
            b6Var.animate().scaleX(f10).scaleY(f10).start();
            bk0Var.animate().scaleX(f10).scaleY(f10).start();
        } else {
            b6Var.animate().cancel();
            b6Var.setScaleX(f10);
            b6Var.setScaleY(f10);
            bk0Var.animate().cancel();
            bk0Var.setScaleX(f10);
            bk0Var.setScaleY(f10);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (x50.G3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
            } else if (x50.F3) {
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
            this.w0 = 1.0f;
            int C2 = wh.C(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + C2, TLObject.FLAG_30));
        } else if (this.H) {
            this.w0 = 1.0f;
            int i13 = 6;
            if ((!x50.G3 || this.e == null) && !x50.F3) {
                i13 = 2;
            }
            if (this.e != null) {
                dp = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(344.0f);
            } else if (x50.G3) {
                dp = AndroidUtilities.dp(320.0f);
            } else {
                C = wh.C(14.0f, 2, View.MeasureSpec.getSize(i10)) + (x50.F3 ? -AndroidUtilities.dp(90.0f) : 0);
                float f11 = (this.I / i13) * C;
                lVar = this.e;
                if (lVar == null) {
                    f7 = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (x50.G3) {
                        f7 = C / 2.0f;
                    } else {
                        f7 = C / (x50.F3 ? 3 : 2);
                    }
                    dp2 = AndroidUtilities.dp(2.0f);
                }
                float f12 = f11 - dp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float dp4 = this.V.getVisibility() != 0 ? f12 - AndroidUtilities.dp(28.0f) : f12;
                l((int) dp4);
                layoutParams2.width = (int) (dp4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30));
            }
            C = dp;
            float f112 = (this.I / i13) * C;
            lVar = this.e;
            if (lVar == null) {
            }
            float f122 = f112 - dp2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.V.getVisibility() != 0) {
            }
            l((int) dp4);
            layoutParams22.width = (int) (dp4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f122, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30));
        } else {
            this.w0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.M != size3) {
            this.M = size3;
            this.y.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, i0.a.o(-16777216, 120), Shader.TileMode.CLAMP));
        }
        b6Var.setPivotX(0.0f);
        b6Var.setPivotY(b6Var.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        s sVar = this.b0;
        sVar.getClass();
        float f7 = ((float) d) / 80.0f;
        float f10 = f7 <= 1.0f ? 0.0f : 1.0f;
        f7 = f10;
        sVar.r = f7;
        sVar.s = (f7 - sVar.n) / 200.0f;
    }

    public void setPrimaryView(l lVar) {
        if (this.c != lVar) {
            this.c = lVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(b30 b30Var) {
        if (this.d != b30Var) {
            this.d = b30Var;
            this.R = true;
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
