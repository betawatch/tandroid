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
import h7.z5;
import hh.db;
import hh.t5;
import java.util.ArrayList;
import java.util.HashMap;
import lh.c5;
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
import org.telegram.messenger.rl;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.j30;
import org.telegram.ui.s50;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout implements m0 {
    public boolean A;
    public int A0;
    public final ChatObject.Call B;
    public int B0;
    public final s50 C;
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
    public final q J;
    public final TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public float O;
    public final Paint P;
    public final ri0 Q;
    public final ImageView R;
    public boolean S;
    public float T;
    public final s U;
    public ValueAnimator V;
    public boolean W;
    public final o a;
    public float a0;
    public boolean b;
    public float b0;
    public l c;
    public float c0;
    public e20 d;
    public float d0;
    public l e;
    public float e0;
    public boolean f;
    public boolean f0;
    public float g0;
    public boolean h;
    public final ImageReceiver h0;
    public final ArrayList i0;
    public n0 j0;
    public boolean k0;
    public float l0;
    public Bitmap m0;
    public boolean n;
    public Paint n0;
    public boolean o0;
    public float p0;
    public final br q0;
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
    public final k0 x;
    public final Rect x0;
    public final Paint y;
    public t5 y0;
    public int z0;

    public t(k0 k0Var, ChatObject.Call call, s50 s50Var) {
        super(k0Var.getContext());
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.P = paint;
        this.T = 1.0f;
        this.h0 = new ImageReceiver();
        this.i0 = new ArrayList();
        this.w0 = new m(this, 1);
        this.x0 = new Rect();
        this.B = call;
        int currentAccount = s50Var.getCurrentAccount();
        this.G = currentAccount;
        br brVar = new br(k0Var.getContext(), R.drawable.calls_video, -1);
        this.q0 = brVar;
        brVar.a(true, false);
        float f10 = -AndroidUtilities.dp(4.0f);
        float dp = AndroidUtilities.dp(6.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        brVar.i = f10;
        brVar.j = dp;
        brVar.k = dp2;
        brVar.invalidateSelf();
        float dpf2 = AndroidUtilities.dpf2(3.4f);
        brVar.c.setStrokeWidth(dpf2);
        brVar.d.setStrokeWidth(dpf2 * 1.47f);
        this.r0 = k0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
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
        o oVar = new o(this, k0Var.getContext(), call, k0Var, textPaint, staticLayout2, textPaint2, string3, textPaint2.measureText(string3), staticLayout, s50Var, string, textPaint.measureText(string));
        this.a = oVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        q2 q2Var = oVar.d;
        q2Var.setScalingType(scalingType);
        this.x = k0Var;
        this.C = s50Var;
        q2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new p(this));
        TextureView textureView = oVar.e;
        if (textureView != null) {
            q2Var.setBackgroundRenderer(textureView);
            if (!q2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        q2Var.setAlpha(0.0f);
        addView(oVar);
        s sVar = new s(this, getContext());
        this.U = sVar;
        addView(sVar);
        h5 h5Var = new h5(k0Var.getContext());
        this.H = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(i0.b.k(-1, TLRPC.LAYER));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setFullTextMaxLines(1);
        h5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        this.F = frameLayout;
        frameLayout.addView(h5Var, z5.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, z5.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(g6.w0(null, g6.qg, false));
        frameLayout.setClipChildren(false);
        ri0 ri0Var = new ri0(k0Var.getContext());
        this.Q = ri0Var;
        addView(ri0Var, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        this.R = imageView;
        addView(imageView, z5.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setImageDrawable(k0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int dp4 = AndroidUtilities.dp(19.0f);
        int k10 = i0.b.k(-1, 100);
        org.telegram.ui.Cells.z i02 = g6.i0(dp4, dp4, dp4, dp4, 0, k10, k10);
        q qVar = new q(this, k0Var.getContext());
        this.J = qVar;
        qVar.setText(LocaleController.getString(R.string.VoipVideoScreenStopSharing));
        qVar.setTextSize(1, 15.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        qVar.setTextColor(-1);
        qVar.setBackground(i02);
        qVar.setGravity(17);
        qVar.setOnClickListener(new c5(this, 10));
        addView(qVar, z5.e(-2, 38, 51));
        TextView textView = new TextView(k0Var.getContext());
        this.K = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setTextColor(g6.w0(null, g6.og, false));
        textView.setBackground(i02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (ChatObject.canManageCalls(chat)) {
            org.telegram.messenger.y1.p(R.string.NoRtmpStreamFromAppOwner, textView);
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoRtmpStreamFromAppViewer", R.string.NoRtmpStreamFromAppViewer, chat.title)));
        }
        addView(textView, z5.e(-2, -2, 51));
    }

    public static t c(ArrayList arrayList, j30 j30Var, l lVar, e20 e20Var, l lVar2, ChatObject.VideoParticipant videoParticipant, ChatObject.Call call, s50 s50Var) {
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
            tVar = new t(j30Var, call, s50Var);
        }
        if (lVar != null) {
            tVar.setPrimaryView(lVar);
        }
        if (e20Var != null) {
            tVar.setSecondaryView(e20Var);
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
        s sVar = this.U;
        if (sVar.getVisibility() == 0) {
            s.a(sVar, true);
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
            } else if (VoIPService.getSharedInstance() != null && !g1.Z.R) {
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
                imageReceiver.setImageBitmap(new nb0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.G;
            if (peerId > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
                ImageLocation forUser = ImageLocation.getForUser(i10, user, 1);
                int d = user != null ? y8.d(user.id) : i0.b.d(0.2f, -16777216, -1);
                imageReceiver.setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, d, -16777216), i0.b.d(0.4f, d, -16777216)}), null, user, 0);
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            ImageLocation forChat = ImageLocation.getForChat(i10, chat, 1);
            int d10 = chat != null ? y8.d(chat.id) : i0.b.d(0.2f, -16777216, -1);
            imageReceiver.setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, d10, -16777216), i0.b.d(0.4f, d10, -16777216)}), null, chat, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.v;
        k0 k0Var = this.x;
        o oVar = this.a;
        if (z10) {
            float y10 = (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J;
            FrameLayout frameLayout = this.F;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.l0;
            boolean z11 = this.h;
            ri0 ri0Var = this.Q;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - k0Var.n);
                ri0Var.setAlpha(1.0f - k0Var.n);
            } else if (this.b || this.r) {
                if (!s50.B3 && !s50.C3) {
                    measuredHeight = pa.b(1.0f, k0Var.S, AndroidUtilities.dp(90.0f) * k0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                ri0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - k0Var.c);
                ri0Var.setAlpha(1.0f - k0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                ri0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            h5 h5Var = this.H;
            if (z12 || this.r) {
                h5Var.setFullAlpha(k0Var.c);
            } else {
                h5Var.setFullAlpha(0.0f);
            }
            ri0Var.setTranslationX(frameLayout.getX());
            ri0Var.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
            ImageView imageView = this.R;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((oVar.getMeasuredWidth() - (oVar.K * 2.0f)) - AndroidUtilities.dp(32.0f));
                imageView.setTranslationY(measuredHeight - AndroidUtilities.dp(2.0f));
                imageView.setAlpha(Math.min(1.0f - k0Var.c, 1.0f - k0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.u0 ? 0.0f : AndroidUtilities.dp(6.0f) * k0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.v) {
            n0 n0Var = this.j0;
            if (n0Var != null) {
                boolean z13 = n0Var.e;
                if (z13) {
                    float f10 = this.O;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.O = f11;
                        if (f11 > 1.0f) {
                            this.O = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f12 = this.O;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.O = f13;
                        if (f13 < 0.0f) {
                            this.O = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.O;
            float f15 = (1.0f - k0Var.n) * (1.0f - k0Var.c) * f14;
            if (f14 > 0.0f) {
                int i10 = (int) (f15 * 255.0f);
                Paint paint = this.P;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.l0) / AndroidUtilities.dp(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(oVar.getX() + oVar.K, oVar.getY() + oVar.J, (oVar.getX() + oVar.getMeasuredWidth()) - oVar.K, (oVar.getY() + oVar.getMeasuredHeight()) - oVar.J);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.l0);
                float f16 = oVar.b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
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
        n0 n0Var = this.j0;
        if (n0Var != null) {
            this.C.p2.add(n0Var);
            this.j0.b();
            n0 n0Var2 = this.j0;
            n0Var2.c = null;
            n0Var2.c(false);
        }
        this.j0 = null;
    }

    public final void f() {
        if (this.w != null) {
            o oVar = this.a;
            q2 q2Var = oVar.d;
            q2 q2Var2 = oVar.d;
            if (q2Var.getMeasuredHeight() == 0 || q2Var2.getMeasuredWidth() == 0) {
                return;
            }
            q2Var2.getRenderBufferBitmap(new lh.p(this, 12));
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

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.a0 == f10 && this.b0 == f11 && this.c0 == f12 && this.d0 == f13 && this.e0 == f14) {
            return;
        }
        this.f0 = z10;
        this.a0 = f10;
        this.b0 = f11;
        this.c0 = f12;
        this.d0 = f13;
        this.e0 = f14;
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
            s50 s50Var = this.C;
            if (s50Var.T2 == this.c) {
                s50Var.getContainerView().invalidate();
            }
        }
        e20 e20Var = this.d;
        if (e20Var != null) {
            e20Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d9, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x066a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ac  */
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
        int dp;
        float f10;
        boolean z14;
        int size;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ChatObject.VideoParticipant videoParticipant3;
        boolean z15;
        q2 q2Var;
        boolean videoIsActive;
        s sVar;
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
        int i10 = 0;
        if (call.call.rtmp_stream) {
            int dp2 = AndroidUtilities.dp(this.b ? 36.0f : 21.0f);
            this.K.setPadding(dp2, 0, dp2, 0);
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
        ri0 ri0Var = this.Q;
        k0 k0Var = this.x;
        o oVar = this.a;
        int i11 = 1;
        if (z18 && !this.b) {
            boolean z19 = VoIPService.getSharedInstance() == null;
            if (s50.E3 || (videoParticipant4 = this.w) == null || (this.d == null && (!ChatObject.Call.videoIsActive(videoParticipant4.participant, videoParticipant4.presentation, call) || (!call.canStreamVideo && this.w != call.videoNotAvailableParticipant)))) {
                z19 = true;
            }
            if (z19 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.v = false;
                f();
                boolean z20 = SharedConfig.getDevicePerformanceClass() <= 0;
                if (oVar.U == null && z19) {
                    if (z20) {
                        k0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z20, 7)).setDuration(150L).start();
                } else {
                    if (k0Var.s) {
                        t5 t5Var = this.y0;
                        if (t5Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(t5Var);
                            this.y0 = null;
                        }
                        t5 t5Var2 = new t5(this, z20, this, 21);
                        this.y0 = t5Var2;
                        AndroidUtilities.runOnUIThread(t5Var2);
                    } else {
                        if (z20) {
                            k0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z20) {
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
                    e20 e20Var = this.d;
                    if (e20Var != null) {
                        this.w = e20Var.getVideoParticipant();
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
                s50 s50Var = this.C;
                if (s50Var.p2.size() > 0) {
                    this.j0 = (n0) com.google.android.recaptcha.internal.a.k(1, s50Var.p2);
                } else {
                    this.j0 = new n0();
                }
                n0 n0Var = this.j0;
                n0Var.g = this;
                n0Var.c = ri0Var;
                n0Var.c(false);
                k(false);
                t5 t5Var3 = this.y0;
                if (t5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t5Var3);
                    this.y0 = null;
                }
                if (getParent() == null) {
                    k0Var.addView(this, z5.e(46, 46, 51));
                    k0Var.D.add(this);
                    long peerId2 = MessageObject.getPeerId(this.w.participant.peer);
                    LongSparseIntArray longSparseIntArray = k0Var.w;
                    longSparseIntArray.put(peerId2, longSparseIntArray.get(peerId2, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.N = true;
                this.A = false;
                animate().setListener(null).cancel();
                if (oVar.U != null || this.d == null || this.c != null || oVar.y == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.A = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new r(this, i10)).setDuration(100L).start();
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
                        ri0Var.setVisibility(4);
                    }
                } else if (h5Var.getVisibility() != 0) {
                    h5Var.setVisibility(0);
                    ri0Var.setVisibility(0);
                }
                z13 = this.v;
                int i12 = this.G;
                if (z13) {
                    str = null;
                } else {
                    boolean z22 = s50.C3 && (!k0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        e20 e20Var2 = this.d;
                        if (e20Var2 == null || this.c != null || k0Var.b) {
                            if (!this.h) {
                                if (e20Var2 == null || this.c != null) {
                                    l lVar5 = this.e;
                                    if (lVar5 == null || !z22) {
                                        l lVar6 = this.c;
                                        if ((lVar6 == null || e20Var2 != null) && this.n) {
                                            if (lVar6 != null) {
                                                dp = AndroidUtilities.dp(80.0f);
                                            }
                                        } else if (lVar6 != null) {
                                            f10 = lVar6.a;
                                            dp = -1;
                                            z14 = true;
                                            size = 0;
                                            marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                            if (dp != 0 && (marginLayoutParams.height != dp || z12 || this.D != z14 || ((z14 && this.E != f10) || size != 0))) {
                                                marginLayoutParams.height = dp;
                                                if (z14) {
                                                    dp = -1;
                                                }
                                                marginLayoutParams.width = dp;
                                                this.D = z14;
                                                this.E = f10;
                                                this.N = true;
                                                if (z11) {
                                                    oVar.requestLayout();
                                                } else {
                                                    oVar.a();
                                                    this.s = true;
                                                }
                                                AndroidUtilities.runOnUIThread(new m(this, i10));
                                                k0Var.requestLayout();
                                                invalidate();
                                            }
                                            videoParticipant3 = this.w;
                                            if (videoParticipant3.participant.self || videoParticipant3.presentation || VoIPService.getSharedInstance() == null) {
                                                q2 q2Var2 = oVar.d;
                                                q2 q2Var3 = oVar.d;
                                                q2Var2.setMirror(false);
                                                q2Var3.setRotateTextureWithScreen(true);
                                                q2Var3.setUseCameraRotation(false);
                                            } else {
                                                q2 q2Var4 = oVar.d;
                                                q2 q2Var5 = oVar.d;
                                                q2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                                q2Var5.setRotateTextureWithScreen(true);
                                                q2Var5.setUseCameraRotation(true);
                                            }
                                            z15 = oVar.a;
                                            q2Var = oVar.d;
                                            if (!z15) {
                                                ((WindowManager) oVar.getContext().getSystemService("window")).getDefaultDisplay();
                                            }
                                            if (this.w.participant.self) {
                                                q2Var.setMaxTextureSize(720);
                                            } else {
                                                q2Var.setMaxTextureSize(0);
                                            }
                                            ChatObject.VideoParticipant videoParticipant9 = this.w;
                                            videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9.participant, videoParticipant9.presentation, call);
                                            sVar = this.U;
                                            if (videoIsActive || !(call.canStreamVideo || this.w == call.videoNotAvailableParticipant)) {
                                                ImageReceiver imageReceiver = sVar.a;
                                                y8 y8Var = sVar.c;
                                                imageReceiver.setCurrentAccount(i12);
                                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                                if (DialogObject.isUserDialog(peerId)) {
                                                    TLRPC.User user = AccountInstance.getInstance(i12).getMessagesController().getUser(Long.valueOf(peerId));
                                                    y8Var.m(i12, user);
                                                    forChat = ImageLocation.getForUser(i12, user, 0);
                                                    forChat2 = ImageLocation.getForUser(i12, user, 1);
                                                    chat = user;
                                                } else {
                                                    TLRPC.Chat chat2 = AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().getChat(Long.valueOf(-peerId));
                                                    y8Var.k(i12, chat2);
                                                    forChat = ImageLocation.getForChat(i12, chat2, 0);
                                                    forChat2 = ImageLocation.getForChat(i12, chat2, 1);
                                                    chat = chat2;
                                                }
                                                TLRPC.Chat chat3 = chat;
                                                ImageLocation imageLocation = forChat;
                                                sVar.a.setImage(imageLocation, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? y8Var : imageFromMemory, null, chat3, 0);
                                                sVar.b.setImage(imageLocation, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat3, 0);
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
                                                    sVar.setVisibility(z24 ? 8 : 0);
                                                    sVar.setAlpha(this.T);
                                                    oVar.invalidate();
                                                } else {
                                                    if (!this.S && sVar.getVisibility() != 0) {
                                                        sVar.setVisibility(0);
                                                        sVar.setAlpha(0.0f);
                                                    }
                                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, this.S ? 0.0f : 1.0f);
                                                    this.V = ofFloat;
                                                    ofFloat.addUpdateListener(new n(this, i10));
                                                    this.V.addListener(new r(this, i11));
                                                    this.V.start();
                                                }
                                                if (this.S) {
                                                    s.a(sVar, false);
                                                }
                                            }
                                            if (this.w.participant.self && VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(q2Var, this.w.presentation);
                                            }
                                            n0 n0Var2 = this.j0;
                                            n0Var2.h = this.w.participant;
                                            n0Var2.c(z11);
                                            if (sVar.getVisibility() == 0) {
                                                s.a(sVar, true);
                                            }
                                            ChatObject.VideoParticipant videoParticipant10 = this.w;
                                            z17 = !videoParticipant10.presentation ? (tL_groupCallParticipantVideo = videoParticipant10.participant.video) == null || !tL_groupCallParticipantVideo.paused : (tL_groupCallParticipantVideo2 = videoParticipant10.participant.presentation) == null || !tL_groupCallParticipantVideo2.paused;
                                            if (this.o0 != z17) {
                                                this.o0 = z17;
                                                q2Var.animate().alpha(this.o0 ? 0.0f : 1.0f).setDuration(250L).start();
                                                oVar.invalidate();
                                            }
                                            if (s50.E3 && this.S) {
                                                if (!q2Var.isFirstFrameRendered()) {
                                                    d();
                                                }
                                                if (this.w.participant.self) {
                                                    if (VoIPService.getSharedInstance() != null) {
                                                        VoIPService.getSharedInstance().setLocalSink(q2Var, this.w.presentation);
                                                    }
                                                } else if (VoIPService.getSharedInstance() != null) {
                                                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant11 = this.w;
                                                    sharedInstance4.addRemoteSink(videoParticipant11.participant, videoParticipant11.presentation, q2Var, null);
                                                    VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                                    ChatObject.VideoParticipant videoParticipant12 = this.w;
                                                    sharedInstance5.addRemoteSink(videoParticipant12.participant, videoParticipant12.presentation, q2Var, null);
                                                    if (call.call.rtmp_stream && !q2Var.isFirstFrameRendered() && !this.v0) {
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
                                                if (s50.E3 && q2Var.isFirstFrameRendered()) {
                                                    f();
                                                    q2Var.clearFirstFrame();
                                                    q2Var.setAlpha(0.0f);
                                                    oVar.e.setAlpha(0.0f);
                                                }
                                            }
                                            k(true);
                                        } else {
                                            dp = AndroidUtilities.dp(46.0f);
                                        }
                                    } else {
                                        float f11 = lVar5.a;
                                        size = lVar5.b.e.size();
                                        z14 = true;
                                        f10 = f11;
                                        dp = -1;
                                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                        if (dp != 0) {
                                            marginLayoutParams.height = dp;
                                            if (z14) {
                                            }
                                            marginLayoutParams.width = dp;
                                            this.D = z14;
                                            this.E = f10;
                                            this.N = true;
                                            if (z11) {
                                            }
                                            AndroidUtilities.runOnUIThread(new m(this, i10));
                                            k0Var.requestLayout();
                                            invalidate();
                                        }
                                        videoParticipant3 = this.w;
                                        if (videoParticipant3.participant.self) {
                                        }
                                        q2 q2Var22 = oVar.d;
                                        q2 q2Var32 = oVar.d;
                                        q2Var22.setMirror(false);
                                        q2Var32.setRotateTextureWithScreen(true);
                                        q2Var32.setUseCameraRotation(false);
                                        z15 = oVar.a;
                                        q2Var = oVar.d;
                                        if (!z15) {
                                        }
                                        if (this.w.participant.self) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant92 = this.w;
                                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92.participant, videoParticipant92.presentation, call);
                                        sVar = this.U;
                                        if (videoIsActive) {
                                        }
                                        ImageReceiver imageReceiver2 = sVar.a;
                                        y8 y8Var2 = sVar.c;
                                        imageReceiver2.setCurrentAccount(i12);
                                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                                        if (DialogObject.isUserDialog(peerId)) {
                                        }
                                        TLRPC.Chat chat32 = chat;
                                        ImageLocation imageLocation2 = forChat;
                                        sVar.a.setImage(imageLocation2, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? y8Var2 : imageFromMemory, null, chat32, 0);
                                        sVar.b.setImage(imageLocation2, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat32, 0);
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
                                            VoIPService.getSharedInstance().setLocalSink(q2Var, this.w.presentation);
                                        }
                                        n0 n0Var22 = this.j0;
                                        n0Var22.h = this.w.participant;
                                        n0Var22.c(z11);
                                        if (sVar.getVisibility() == 0) {
                                        }
                                        ChatObject.VideoParticipant videoParticipant102 = this.w;
                                        if (videoParticipant102.presentation) {
                                        }
                                        if (this.o0 != z17) {
                                        }
                                        if (s50.E3) {
                                        }
                                        if (!this.w.participant.self) {
                                        }
                                        if (s50.E3) {
                                            f();
                                            q2Var.clearFirstFrame();
                                            q2Var.setAlpha(0.0f);
                                            oVar.e.setAlpha(0.0f);
                                        }
                                        k(true);
                                    }
                                } else {
                                    dp = AndroidUtilities.dp(80.0f);
                                }
                                f10 = 1.0f;
                                z14 = false;
                                size = 0;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (dp != 0) {
                                }
                                videoParticipant3 = this.w;
                                if (videoParticipant3.participant.self) {
                                }
                                q2 q2Var222 = oVar.d;
                                q2 q2Var322 = oVar.d;
                                q2Var222.setMirror(false);
                                q2Var322.setRotateTextureWithScreen(true);
                                q2Var322.setUseCameraRotation(false);
                                z15 = oVar.a;
                                q2Var = oVar.d;
                                if (!z15) {
                                }
                                if (this.w.participant.self) {
                                }
                                ChatObject.VideoParticipant videoParticipant922 = this.w;
                                videoIsActive = ChatObject.Call.videoIsActive(videoParticipant922.participant, videoParticipant922.presentation, call);
                                sVar = this.U;
                                if (videoIsActive) {
                                }
                                ImageReceiver imageReceiver22 = sVar.a;
                                y8 y8Var22 = sVar.c;
                                imageReceiver22.setCurrentAccount(i12);
                                peerId = MessageObject.getPeerId(this.w.participant.peer);
                                if (DialogObject.isUserDialog(peerId)) {
                                }
                                TLRPC.Chat chat322 = chat;
                                ImageLocation imageLocation22 = forChat;
                                sVar.a.setImage(imageLocation22, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? y8Var22 : imageFromMemory, null, chat322, 0);
                                sVar.b.setImage(imageLocation22, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat322, 0);
                                z16 = false;
                                if (z11) {
                                }
                                if (z16 != this.S) {
                                }
                                if (this.w.participant.self) {
                                }
                                n0 n0Var222 = this.j0;
                                n0Var222.h = this.w.participant;
                                n0Var222.c(z11);
                                if (sVar.getVisibility() == 0) {
                                }
                                ChatObject.VideoParticipant videoParticipant1022 = this.w;
                                if (videoParticipant1022.presentation) {
                                }
                                if (this.o0 != z17) {
                                }
                                if (s50.E3) {
                                }
                                if (!this.w.participant.self) {
                                }
                                if (s50.E3) {
                                }
                                k(true);
                            }
                        }
                        dp = 0;
                        f10 = 1.0f;
                        z14 = false;
                        size = 0;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (dp != 0) {
                        }
                        videoParticipant3 = this.w;
                        if (videoParticipant3.participant.self) {
                        }
                        q2 q2Var2222 = oVar.d;
                        q2 q2Var3222 = oVar.d;
                        q2Var2222.setMirror(false);
                        q2Var3222.setRotateTextureWithScreen(true);
                        q2Var3222.setUseCameraRotation(false);
                        z15 = oVar.a;
                        q2Var = oVar.d;
                        if (!z15) {
                        }
                        if (this.w.participant.self) {
                        }
                        ChatObject.VideoParticipant videoParticipant9222 = this.w;
                        videoIsActive = ChatObject.Call.videoIsActive(videoParticipant9222.participant, videoParticipant9222.presentation, call);
                        sVar = this.U;
                        if (videoIsActive) {
                        }
                        ImageReceiver imageReceiver222 = sVar.a;
                        y8 y8Var222 = sVar.c;
                        imageReceiver222.setCurrentAccount(i12);
                        peerId = MessageObject.getPeerId(this.w.participant.peer);
                        if (DialogObject.isUserDialog(peerId)) {
                        }
                        TLRPC.Chat chat3222 = chat;
                        ImageLocation imageLocation222 = forChat;
                        sVar.a.setImage(imageLocation222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? y8Var222 : imageFromMemory, null, chat3222, 0);
                        sVar.b.setImage(imageLocation222, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat3222, 0);
                        z16 = false;
                        if (z11) {
                        }
                        if (z16 != this.S) {
                        }
                        if (this.w.participant.self) {
                        }
                        n0 n0Var2222 = this.j0;
                        n0Var2222.h = this.w.participant;
                        n0Var2222.c(z11);
                        if (sVar.getVisibility() == 0) {
                        }
                        ChatObject.VideoParticipant videoParticipant10222 = this.w;
                        if (videoParticipant10222.presentation) {
                        }
                        if (this.o0 != z17) {
                        }
                        if (s50.E3) {
                        }
                        if (!this.w.participant.self) {
                        }
                        if (s50.E3) {
                        }
                        k(true);
                    }
                    dp = -1;
                    f10 = 1.0f;
                    z14 = false;
                    size = 0;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (dp != 0) {
                    }
                    videoParticipant3 = this.w;
                    if (videoParticipant3.participant.self) {
                    }
                    q2 q2Var22222 = oVar.d;
                    q2 q2Var32222 = oVar.d;
                    q2Var22222.setMirror(false);
                    q2Var32222.setRotateTextureWithScreen(true);
                    q2Var32222.setUseCameraRotation(false);
                    z15 = oVar.a;
                    q2Var = oVar.d;
                    if (!z15) {
                    }
                    if (this.w.participant.self) {
                    }
                    ChatObject.VideoParticipant videoParticipant92222 = this.w;
                    videoIsActive = ChatObject.Call.videoIsActive(videoParticipant92222.participant, videoParticipant92222.presentation, call);
                    sVar = this.U;
                    if (videoIsActive) {
                    }
                    ImageReceiver imageReceiver2222 = sVar.a;
                    y8 y8Var2222 = sVar.c;
                    imageReceiver2222.setCurrentAccount(i12);
                    peerId = MessageObject.getPeerId(this.w.participant.peer);
                    if (DialogObject.isUserDialog(peerId)) {
                    }
                    TLRPC.Chat chat32222 = chat;
                    ImageLocation imageLocation2222 = forChat;
                    sVar.a.setImage(imageLocation2222, null, (forChat2 != null || (imageFromMemory = ImageLoader.getInstance().getImageFromMemory(forChat2.location, null, "50_50")) == null) ? y8Var2222 : imageFromMemory, null, chat32222, 0);
                    sVar.b.setImage(imageLocation2222, "50_50_b", new ColorDrawable(g6.w0(null, g6.tg, false)), null, chat32222, 0);
                    z16 = false;
                    if (z11) {
                    }
                    if (z16 != this.S) {
                    }
                    if (this.w.participant.self) {
                    }
                    n0 n0Var22222 = this.j0;
                    n0Var22222.h = this.w.participant;
                    n0Var22222.c(z11);
                    if (sVar.getVisibility() == 0) {
                    }
                    ChatObject.VideoParticipant videoParticipant102222 = this.w;
                    if (videoParticipant102222.presentation) {
                    }
                    if (this.o0 != z17) {
                    }
                    if (s50.E3) {
                    }
                    if (!this.w.participant.self) {
                    }
                    if (s50.E3) {
                    }
                    k(true);
                }
                if (this.v) {
                    return;
                }
                long peerId3 = MessageObject.getPeerId(this.w.participant.peer);
                if (DialogObject.isUserDialog(peerId3)) {
                    str2 = UserObject.getUserName(AccountInstance.getInstance(i12).getMessagesController().getUser(Long.valueOf(peerId3)));
                } else {
                    TLRPC.Chat chat4 = AccountInstance.getInstance(i12).getMessagesController().getChat(Long.valueOf(-peerId3));
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
        int i122 = this.G;
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
        n0 n0Var = this.j0;
        if (n0Var == null) {
            return;
        }
        if (n0Var.k) {
            w03 = g6.w0(null, g6.sg, false);
        } else {
            if (!n0Var.e) {
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
                ofFloat.addUpdateListener(new db(this, i11, i10, i12, w02, 2));
                this.C0.addListener(new nh.q2(this, i10, w02, 3));
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
        float f10;
        int dp2;
        FrameLayout frameLayout = this.F;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        ChatObject.Call call = this.B;
        float f11 = call.call.rtmp_stream ? 0.0f : 1.0f;
        boolean z11 = this.W;
        boolean z12 = s50.B3;
        if (z11 != z12) {
            this.N = true;
            this.W = z12;
        }
        int dp3 = AndroidUtilities.dp(2.0f);
        layoutParams.rightMargin = dp3;
        layoutParams.leftMargin = dp3;
        boolean z13 = this.s;
        ri0 ri0Var = this.Q;
        h5 h5Var = this.H;
        if (z13) {
            h5Var.animate().scaleX(f11).scaleY(f11).start();
            ri0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            h5Var.animate().cancel();
            h5Var.setScaleX(f11);
            h5Var.setScaleY(f11);
            ri0Var.animate().cancel();
            ri0Var.setScaleX(f11);
            ri0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.s0 = 1.0f;
            if (s50.C3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
            } else if (s50.B3) {
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
            int z14 = rl.z(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(z14, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + z14, TLObject.FLAG_30));
        } else if (this.D) {
            this.s0 = 1.0f;
            int i13 = 6;
            if ((!s50.C3 || this.e == null) && !s50.B3) {
                i13 = 2;
            }
            if (this.e != null) {
                dp = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(344.0f);
            } else if (s50.C3) {
                dp = AndroidUtilities.dp(320.0f);
            } else {
                z10 = rl.z(14.0f, 2, View.MeasureSpec.getSize(i10)) + (s50.B3 ? -AndroidUtilities.dp(90.0f) : 0);
                float f12 = (this.E / i13) * z10;
                lVar = this.e;
                if (lVar == null) {
                    f10 = lVar.getItemHeight() - AndroidUtilities.dp(4.0f);
                    dp2 = AndroidUtilities.dp(4.0f);
                } else {
                    if (s50.C3) {
                        f10 = z10 / 2.0f;
                    } else {
                        f10 = z10 / (s50.B3 ? 3 : 2);
                    }
                    dp2 = AndroidUtilities.dp(2.0f);
                }
                float f13 = f12 - dp2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float dp4 = this.R.getVisibility() != 0 ? f13 - AndroidUtilities.dp(28.0f) : f13;
                l((int) dp4);
                layoutParams2.width = (int) (dp4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
            }
            z10 = dp;
            float f122 = (this.E / i13) * z10;
            lVar = this.e;
            if (lVar == null) {
            }
            float f132 = f122 - dp2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.R.getVisibility() != 0) {
            }
            l((int) dp4);
            layoutParams22.width = (int) (dp4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f132, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
        } else {
            this.s0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.I != size3) {
            this.I = size3;
            this.y.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), 0, i0.b.k(-16777216, 120), Shader.TileMode.CLAMP));
        }
        h5Var.setPivotX(0.0f);
        h5Var.setPivotY(h5Var.getMeasuredHeight() / 2.0f);
    }

    public void setAmplitude(double d) {
        this.j0.a(d);
        s sVar = this.U;
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
            this.N = true;
            j(true);
        }
    }

    public void setSecondaryView(e20 e20Var) {
        if (this.d != e20Var) {
            this.d = e20Var;
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
