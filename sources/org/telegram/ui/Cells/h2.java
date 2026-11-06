package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.m20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class h2 extends FrameLayout implements org.telegram.messenger.x5 {
    public int D;
    public StaticLayout E;
    public final int F;
    public StaticLayout G;
    public final int H;
    public StaticLayout I;
    public TLRPC.BotInlineResult J;
    public TLRPC.User K;
    public TLRPC.Document L;
    public int M;
    public TLRPC.Photo N;
    public TLRPC.PhotoSize O;
    public int P;
    public boolean Q;
    public ij R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver a;
    public boolean a0;
    public boolean b;
    public final wo b0;
    public final g70 c;
    public g2 c0;
    public final int d;
    public ic d0;
    public Object e;
    public boolean e0;
    public final org.telegram.ui.ActionBar.f6 f;
    public String f0;
    public boolean g0;
    public m71 h;
    public float h0;
    public final f2 i0;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public h2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i7 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i7 != 3 && i7 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
            return this.V == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.id, org.telegram.ui.ActionBar.k6.jd);
        int i10 = this.V;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        f(true, z9);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.g0 = true;
        this.W.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i7;
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i11 == 0) {
                if (MediaController.B().S(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.B().R(this.R, true)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i12 = this.d;
            if (i11 != 2) {
                if (i11 == 4) {
                    if (this.L != null) {
                        org.telegram.messenger.w7.G(i12).f(this.L);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.w7.G(i12).e(null, null, m20.c(this.J.content), null, null, null);
                    }
                    this.V = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            radialProgress2.p(false, 0.0f);
            if (this.L != null) {
                org.telegram.messenger.w7.G(i12).W(this.L, this.J, 1, 0);
            } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                i7 = 4;
                org.telegram.messenger.w7.G(i12).X(null, null, m20.c(this.J.content), null, null, null, null, 0L, 3, 1);
                this.V = i7;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
            i7 = 4;
            this.V = i7;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b() {
        this.R = null;
        this.P = 0;
        TLRPC.Document document = this.L;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.P = 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.P = 5;
                } else if (this.J.type.equals("voice")) {
                    this.P = 3;
                }
            }
        } else if (ij.t3(document, false)) {
            this.P = 2;
        } else if (ij.v4(this.L) || ij.L2(this.L, true)) {
            this.P = 6;
        } else if (ij.K3(this.L)) {
            this.P = 5;
        } else if (ij.R4(this.L)) {
            this.P = 3;
        }
        int i7 = this.P;
        if (i7 == 3 || i7 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.b.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.d;
            long e10 = p10.i(i10).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.MessageMedia messageMedia = tL_message.media;
            messageMedia.document.file_reference = new byte[0];
            tL_message.flags |= 768;
            TLRPC.Document document2 = this.L;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String B = gc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = rf.b.i("audio/", B);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = ij.g1(this.J);
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.P == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.a(this.J.content.url));
                sb2.append(".");
                sb2.append(gc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File z9 = org.telegram.messenger.w7.z(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.a(this.J.content.url));
                sb3.append(".");
                sb3.append(gc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(z9, sb3.toString()).getAbsolutePath();
            }
            this.R = new ij(i10, tL_message, false, true);
        }
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.b0;
        if (woVar == null) {
            return;
        }
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z9, z10);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        if (!z10) {
            this.h0 = z9 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.S = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.i0, z9 ? 0.81f : 1.0f));
        this.S.setDuration(200L);
        this.S.addListener(new ch.y(22, this, z9));
        this.S.start();
    }

    public final void d(int i7, Object obj, TLRPC.Document document) {
        this.n = false;
        this.s = false;
        this.M = i7;
        this.J = null;
        this.e = obj;
        this.L = document;
        this.N = null;
        this.Q = true;
        this.y = true;
        b();
        this.P = 2;
        requestLayout();
        this.f0 = null;
        this.g0 = false;
        this.e0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.n = z10;
        this.s = z11;
        this.K = user;
        this.J = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.L = botInlineResult.document;
            this.N = botInlineResult.photo;
        } else {
            this.L = null;
            this.N = null;
        }
        this.Q = z9;
        this.y = z12;
        m71 m71Var = this.h;
        if (m71Var != null && m71Var.r) {
            m71Var.r = false;
            m71Var.h.p(false);
            m71Var.h.q();
            org.telegram.utils.twidget.p.r(m71Var.c);
        }
        this.h = (botInlineResult == null || !(botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) ? null : new m71(this, this.d, botInlineResult, this.f);
        b();
        if (z12) {
            this.P = 2;
        }
        requestLayout();
        this.f0 = null;
        this.g0 = false;
        this.e0 = false;
        f(false, false);
    }

    public final void f(boolean z9, boolean z10) {
        boolean containsKey;
        String str = this.f0;
        if (str == null && !this.e0) {
            this.e0 = true;
            Utilities.g.c(new e2(this, z9));
            this.W.setIcon(4, z9, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z9, false);
            return;
        }
        if (this.L != null) {
            containsKey = org.telegram.messenger.w7.G(this.d).S(this.f0);
        } else {
            containsKey = gc.D().C.containsKey(this.f0);
        }
        if (containsKey || !this.g0) {
            org.telegram.messenger.z5.q(this.d).a(this.f0, null, this);
            int i7 = this.P;
            if (i7 != 5 && i7 != 3) {
                this.V = 1;
                Float w10 = gc.D().w(this.f0);
                this.W.p(false, w10 != null ? w10.floatValue() : 0.0f);
            } else if (containsKey) {
                this.V = 4;
                Float w11 = gc.D().w(this.f0);
                if (w11 != null) {
                    this.W.p(z10, w11.floatValue());
                } else {
                    this.W.p(z10, 0.0f);
                }
            } else {
                this.V = 2;
            }
        } else {
            org.telegram.messenger.z5.q(this.d).v(this);
            int i10 = this.P;
            if (i10 == 5 || i10 == 3) {
                boolean I = MediaController.B().I(this.R);
                if (!I || (I && MediaController.B().H())) {
                    this.V = 0;
                } else {
                    this.V = 1;
                }
                this.W.p(z10, 1.0f);
            } else {
                this.V = -1;
            }
        }
        this.W.setIcon(getIconForCurrentState(), z9, z10);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.J;
    }

    public int getDate() {
        return this.M;
    }

    public TLRPC.Document getDocument() {
        return this.L;
    }

    public TLRPC.User getInlineBot() {
        return this.K;
    }

    public ij getMessageObject() {
        return this.R;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.U;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.J;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.W.p(true, Math.min(1.0f, j3 / j10));
        int i7 = this.P;
        if (i7 == 3 || i7 == 5) {
            if (this.V != 4) {
                f(false, true);
            }
        } else if (this.V != 1) {
            f(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.P()) {
            f(false, false);
        }
        this.W.e();
        if (this.h == null || getMeasuredWidth() <= 0) {
            return;
        }
        this.h.a(getMeasuredWidth() - org.telegram.messenger.g0.L(this.Q ? 4.0f : 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        this.W.f();
        org.telegram.messenger.z5.q(this.d).v(this);
        m71 m71Var = this.h;
        if (m71Var == null || !m71Var.r) {
            return;
        }
        m71Var.r = false;
        m71Var.h.p(false);
        m71Var.h.q();
        org.telegram.utils.twidget.p.r(m71Var.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        m71 m71Var = this.h;
        if (m71Var != null) {
            float L = org.telegram.messenger.g0.L(this.Q ? 2.0f : 8.0f);
            float L2 = org.telegram.messenger.g0.L(this.Q ? 2.0f : 6.0f);
            Paint paint = m71Var.e;
            Path path = m71Var.f;
            org.telegram.utils.twidget.u uVar = m71Var.c;
            if (uVar != null && (i10 = m71Var.n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(m71Var.b, uVar, i10), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(iz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, m71Var.n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ob, m71Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                p71 p71Var = m71Var.h;
                if (p71Var != null && p71Var.b(canvas, m71Var.n)) {
                    m71Var.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (!this.n || this.Q) {
                return;
            }
            canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        wo woVar = this.b0;
        if (woVar != null && (woVar.a.q || !imageReceiver.I() || imageReceiver.h1 != 1.0f || PhotoViewer.L1((ij) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.f6 f6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, f6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, f6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z9 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (z9) {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                    float f10 = imageReceiver.K0;
                    float f11 = imageReceiver.M0;
                    int A = (int) com.google.android.recaptcha.internal.a.A(f11, intrinsicWidth, 2.0f, f10);
                    float f12 = imageReceiver.L0;
                    float f13 = imageReceiver.N0;
                    int A2 = (int) com.google.android.recaptcha.internal.a.A(f13, intrinsicHeight, 2.0f, f12);
                    canvas.drawRect(f10, f12, f11 + f10, f12 + f13, g70.k);
                    org.telegram.ui.ActionBar.k6.o4.setBounds(A, A2, intrinsicWidth + A, intrinsicHeight + A2);
                    org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                }
            }
        } else {
            boolean z10 = this.b;
            g70 g70Var = this.c;
            if (!z10 || PhotoViewer.M1(this.J)) {
                g70Var.setAlpha(qs.e4);
            } else {
                g70Var.setAlpha((int) ((1.0f - imageReceiver.h1) * 255.0f));
            }
            int i11 = this.P;
            if (i11 == 3 || i11 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(this.r ? org.telegram.ui.ActionBar.k6.Xd : org.telegram.ui.ActionBar.k6.Wd, f6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.J.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            g70Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                            int L4 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                            int L5 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                            float f14 = imageReceiver.K0;
                            canvas.drawRect(f14, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.k);
                            org.telegram.ui.ActionBar.k6.o4.setBounds(L4, L5, intrinsicWidth2 + L4, intrinsicHeight2 + L5);
                            org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                        int L7 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                        float f15 = imageReceiver.K0;
                        canvas.drawRect(f15, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.k);
                        org.telegram.ui.ActionBar.k6.n4.setBounds(L6, L7, intrinsicWidth3 + L6, intrinsicHeight3 + L7);
                        org.telegram.ui.ActionBar.k6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.k6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.k6.m4.getIntrinsicHeight();
                    int L8 = (int) (imageReceiver.K0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth4) / 2));
                    int L9 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight4) / 2));
                    float f16 = imageReceiver.K0;
                    canvas.drawRect(f16, imageReceiver.L0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.L0 + org.telegram.messenger.g0.L(52.0f), g70.k);
                    org.telegram.ui.ActionBar.k6.m4.setBounds(L8, L9, intrinsicWidth4 + L8, intrinsicHeight4 + L9);
                    org.telegram.ui.ActionBar.k6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.J != null) {
                imageReceiver.O0(!PhotoViewer.M1(r14), false);
            }
            canvas.save();
            float f17 = this.h0;
            ic icVar = this.d0;
            if (icVar != null) {
                f17 *= icVar.a(0.1f);
            }
            canvas.scale(f17, f17, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.Q && ((i7 = this.P) == 7 || i7 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.Q) {
            if (hd.a0) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            }
        }
        if (this.s) {
            org.telegram.ui.ActionBar.k6.p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.k6.p4.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(hd.M0(2131753975, null));
                break;
            case 2:
                sb2.append(hd.M0(2131753971, null));
                break;
            case 3:
                sb2.append(hd.M0(2131753982, null));
                break;
            case 4:
                sb2.append(hd.M0(2131753933, null));
                break;
            case 5:
                sb2.append(hd.M0(2131753952, null));
                break;
            case 6:
                sb2.append(hd.M0(2131753936, null));
                break;
            case 7:
                sb2.append(hd.M0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.G;
        boolean z9 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.I;
        boolean z10 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.P == 5 && z9 && z10) {
            sb2.append(", ");
            sb2.append(hd.a0("AccDescrMusicInfo", null, 2131754832, this.I.getText(), this.G.getText()));
        } else {
            if (z9) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        wo woVar = this.b0;
        if (woVar != null && woVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i7 = this.P;
        if (i7 == 3 || i7 == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? hd.M0(2131754929, "AccActionPlay") : hd.M0(2131754941, "AccActionCancelDownload") : hd.M0(2131754938, "AccActionDownload") : hd.M0(2131754930, "AccActionPause")));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030b  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9;
        g70 g70Var;
        float f10;
        float f11;
        g70 g70Var2;
        ?? r72;
        float f12;
        float f13;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        ArrayList arrayList3;
        m20 m20Var;
        String str2;
        int i12;
        int i13;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize Q;
        hc hcVar;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        hc i14;
        String i15;
        String concat;
        boolean z10;
        float f14;
        int L;
        wo woVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z11;
        char c10;
        boolean z12;
        int i16 = 0;
        this.b = false;
        this.I = null;
        this.G = null;
        this.E = null;
        this.O = null;
        this.D = org.telegram.messenger.g0.L(27.0f);
        if (this.J == null && this.L == null) {
            setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
            return;
        }
        if (this.h != null) {
            int size = View.MeasureSpec.getSize(i7);
            int L2 = size - org.telegram.messenger.g0.L(this.Q ? 4.0f : 16.0f);
            m71 m71Var = this.h;
            setMeasuredDimension(size, org.telegram.messenger.g0.L(this.Q ? 4.0f : 12.0f) + Math.min(org.telegram.utils.twidget.p.d(m71Var.b, m71Var.c, L2), org.telegram.messenger.g0.L(320.0f)) + (this.n ? 1 : 0));
            if (isAttachedToWindow()) {
                this.h.a(L2);
                return;
            }
            return;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int L3 = (size2 - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(8.0f);
        if (this.L != null) {
            arrayList2 = new ArrayList(this.L.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.J;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z9 = this.Q;
                g70Var = this.c;
                if (!z9 || (botInlineResult2 = this.J) == null) {
                    f10 = 100.0f;
                    f11 = 1.0f;
                    g70Var2 = g70Var;
                    r72 = 1;
                    f12 = 12.0f;
                    f13 = 4.0f;
                } else {
                    f10 = 100.0f;
                    if (botInlineResult2.title != null) {
                        f12 = 12.0f;
                        try {
                            f13 = 4.0f;
                            try {
                                this.G = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(this.J.title.replace('\n', ' '), org.telegram.ui.ActionBar.k6.f3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.k6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.f3.measureText(r0)), L3), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.f3, L3 + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                g70Var.a(this.J.title);
                                str6 = this.J.description;
                                if (str6 == null) {
                                }
                                r72 = z12;
                                if (this.J.url != null) {
                                }
                                document = this.L;
                                if (document != null) {
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            f13 = 4.0f;
                        }
                        g70Var.a(this.J.title);
                    } else {
                        f12 = 12.0f;
                        f13 = 4.0f;
                    }
                    str6 = this.J.description;
                    if (str6 == null) {
                        try {
                        } catch (Exception e12) {
                            e = e12;
                            f11 = 1.0f;
                            g70Var2 = g70Var;
                        }
                        try {
                            z11 = true;
                            c10 = ' ';
                            g70Var2 = g70Var;
                            f11 = 1.0f;
                        } catch (Exception e13) {
                            e = e13;
                            g70Var2 = g70Var;
                            f11 = 1.0f;
                            z11 = true;
                            c10 = ' ';
                            org.telegram.messenger.a8.g(e, z11);
                            z12 = z11;
                            r72 = z12;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                        try {
                            StaticLayout H1 = q1.H1(org.telegram.messenger.i6.m(str6, org.telegram.ui.ActionBar.k6.g3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.k6.g3, L3, L3, 0, 3);
                            this.I = H1;
                            z12 = z11;
                            if (H1.getLineCount() > 0) {
                                int i17 = this.H;
                                StaticLayout staticLayout = this.I;
                                this.D = i17 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + org.telegram.messenger.g0.L(1.0f);
                                z12 = z11;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            org.telegram.messenger.a8.g(e, z11);
                            z12 = z11;
                            r72 = z12;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                    } else {
                        f11 = 1.0f;
                        g70Var2 = g70Var;
                        z12 = true;
                        c10 = ' ';
                    }
                    r72 = z12;
                    if (this.J.url != null) {
                        try {
                            this.E = new StaticLayout(TextUtils.ellipsize(this.J.url.replace('\n', c10), org.telegram.ui.ActionBar.k6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.g3.measureText(r0)), L3), TextUtils.TruncateAt.MIDDLE), org.telegram.ui.ActionBar.k6.g3, L3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r72 = z12;
                        } catch (Exception e15) {
                            org.telegram.messenger.a8.g(e15, z12);
                            r72 = z12;
                        }
                    }
                }
                document = this.L;
                if (document != null) {
                    if (this.y || ij.t3(document, false)) {
                        this.O = org.telegram.messenger.w7.w(this.L.thumbs, 90, false, null, r72);
                    } else {
                        if (ij.v4(this.L) || ij.L2(this.L, r72)) {
                            this.O = org.telegram.messenger.w7.w(this.L.thumbs, 90, false, null, r72);
                            str = "webp";
                            w10 = null;
                            botInlineResult = this.J;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    if (str5.startsWith("gif")) {
                                        TLRPC.WebDocument webDocument = this.J.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.J.thumb : (TLRPC.TL_webDocument) this.J.content;
                                        this.P = 2;
                                    } else if (this.J.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                                        TLRPC.WebDocument webDocument2 = botInlineResult4.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult4.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.J.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.O == null && w10 == null) {
                                        botInlineMessage = this.J.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            i11 = 3;
                                            arrayList3 = arrayList;
                                            double d2 = geoPoint._long;
                                            if (qp.s1(this.d).m3 != 2) {
                                                m20Var = m20.b(this.J.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)));
                                                str2 = null;
                                            } else {
                                                str2 = org.telegram.messenger.g0.e0(this.d, d, d2, 72, 72, true, 15, -1);
                                                m20Var = null;
                                            }
                                            if (tL_webDocument != null) {
                                                m20Var = m20.c(tL_webDocument);
                                            }
                                        }
                                    }
                                    i11 = 3;
                                    arrayList3 = arrayList;
                                    m20Var = null;
                                    str2 = null;
                                    if (tL_webDocument != null) {
                                    }
                                }
                                tL_webDocument = null;
                                if (tL_webDocument == null) {
                                }
                                if (tL_webDocument == null) {
                                    botInlineMessage = this.J.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d10 = geoPoint2.lat;
                                    i11 = 3;
                                    arrayList3 = arrayList;
                                    double d22 = geoPoint2._long;
                                    if (qp.s1(this.d).m3 != 2) {
                                    }
                                    if (tL_webDocument != null) {
                                    }
                                }
                                i11 = 3;
                                arrayList3 = arrayList;
                                m20Var = null;
                                str2 = null;
                                if (tL_webDocument != null) {
                                }
                            } else {
                                i11 = 3;
                                arrayList3 = arrayList;
                                m20Var = null;
                                str2 = null;
                            }
                            if (this.L != null) {
                                for (int i18 = 0; i18 < this.L.attributes.size(); i18++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i18);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        i12 = documentAttribute.w;
                                        i13 = documentAttribute.h;
                                        break;
                                    }
                                }
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0 || i13 == 0) {
                                photoSize = this.O;
                                if (photoSize == null) {
                                    if (w10 != null) {
                                        w10.size = -1;
                                    }
                                    i12 = photoSize.w;
                                    i13 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.J;
                                    if (botInlineResult5 != null) {
                                        int[] h12 = ij.h1(botInlineResult5);
                                        int i19 = h12[0];
                                        i13 = h12[r72];
                                        i12 = i19;
                                    }
                                }
                            }
                            if (i12 != 0 || i13 == 0) {
                                i12 = org.telegram.messenger.g0.L(80.0f);
                                i13 = i12;
                            }
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null && this.O == null && m20Var == null && str2 == null) {
                                imageReceiver3 = imageReceiver;
                            } else {
                                if (this.Q) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i12, i13) / 3;
                                    if (this.P == 2) {
                                        Locale locale = Locale.US;
                                        String i20 = com.google.android.recaptcha.internal.a.i((int) (min / org.telegram.messenger.g0.p), "_80_b");
                                        int i21 = iz.a;
                                        if (rc.e(2048) || this.x) {
                                            str4 = i20;
                                            str3 = str4;
                                        } else {
                                            concat = i20.concat("_firstframe");
                                            i15 = i20.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        i15 = com.google.android.recaptcha.internal.a.i((int) (min / org.telegram.messenger.g0.p), "_80");
                                        concat = i15.concat("_b");
                                    }
                                    str4 = i15;
                                    str3 = concat;
                                }
                                imageReceiver.R0 = this.P != 6 ? r72 : false;
                                Q = org.telegram.messenger.w7.Q(arrayList3);
                                if (Q != null) {
                                    TLRPC.Document document3 = this.L;
                                    if (document3 != null) {
                                        i14 = hc.c(Q, document3);
                                    } else {
                                        TLRPC.Photo photo = this.N;
                                        if (photo != null) {
                                            i14 = hc.i(Q, photo);
                                        }
                                    }
                                    hcVar = i14;
                                    if (this.P == 2) {
                                        TLRPC.Document document4 = this.L;
                                        if (document4 != null) {
                                            TLRPC.VideoSize J0 = ij.J0(document4);
                                            if (J0 != null) {
                                                hc d11 = hc.d(J0, this.L);
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                int i22 = iz.a;
                                                sb2.append((rc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.u0(d11, sb2.toString(), hc.c(this.O, this.L), str4, hcVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                hc b10 = hc.b(this.L);
                                                if (this.y) {
                                                    b10.p = 2;
                                                }
                                                StringBuilder sb3 = new StringBuilder("100_100");
                                                int i23 = iz.a;
                                                sb3.append((rc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2.u0(b10, sb3.toString(), hc.c(this.O, this.L), str4, hcVar, str3, null, this.L.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (m20Var != null) {
                                                imageReceiver2.u0(hc.p(m20Var), "100_100", hc.i(this.O, this.N), str4, hcVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.u0(hc.g(str2), "100_100", hc.i(this.O, this.N), str4, hcVar, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.O != null) {
                                            rz f15 = org.telegram.messenger.t5.f(this.L, org.telegram.ui.ActionBar.k6.a7, f11, null);
                                            if (!ij.p(this.L)) {
                                                TLRPC.Document document5 = this.L;
                                                if (document5 == null) {
                                                    imageReceiver2.u0(hc.i(this.O, this.N), str4, hc.i(w10, this.N), str3, hcVar, str3, null, this.O.size, str, this.e, 0);
                                                } else if (f15 != null) {
                                                    imageReceiver2.u0(hc.c(this.O, document5), str4, null, null, hcVar, str3, f15, this.O.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.u0(hc.c(this.O, document5), str4, hc.i(w10, this.N), str3, hcVar, str3, null, this.O.size, str, this.e, 0);
                                                }
                                            } else if (f15 != null) {
                                                imageReceiver2.u0(hc.b(this.L), "80_80", null, null, hcVar, str3, f15, this.O.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.u0(hc.b(this.L), "80_80", hc.c(this.O, this.L), str3, hcVar, str3, null, this.O.size, str, this.e, 0);
                                            }
                                        } else if (m20Var != null) {
                                            imageReceiver2.u0(hc.p(m20Var), str4, hc.i(w10, this.N), str3, hcVar, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.u0(hc.g(str2), str4, hc.i(w10, this.N), str3, hcVar, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    int i24 = iz.a;
                                    if (!rc.e(2048) || this.x) {
                                        imageReceiver3.t0 = r72;
                                        imageReceiver3.P0(false);
                                    } else {
                                        imageReceiver3.t0 = false;
                                        imageReceiver3.Q0();
                                    }
                                    this.b = r72;
                                }
                                hcVar = null;
                                if (this.P == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                int i242 = iz.a;
                                if (rc.e(2048)) {
                                }
                                imageReceiver3.t0 = r72;
                                imageReceiver3.P0(false);
                                this.b = r72;
                            }
                            z10 = this.Q;
                            RadialProgress2 radialProgress2 = this.W;
                            if (z10) {
                                StaticLayout staticLayout2 = this.G;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.G;
                                    i16 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r72);
                                }
                                StaticLayout staticLayout4 = this.I;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.I;
                                    i16 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r72);
                                }
                                StaticLayout staticLayout6 = this.E;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.E;
                                    i16 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r72);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(16.0f, Math.max(org.telegram.messenger.g0.L(52.0f), i16), org.telegram.messenger.g0.L(68.0f)) + (this.n ? 1 : 0));
                                int L4 = org.telegram.messenger.g0.L(52.0f);
                                if (hd.a0) {
                                    f14 = 8.0f;
                                    L = org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i7), L4);
                                } else {
                                    f14 = 8.0f;
                                    L = org.telegram.messenger.g0.L(8.0f);
                                }
                                g70Var2.setBounds(L, org.telegram.messenger.g0.L(f14), L + L4, org.telegram.messenger.g0.L(60.0f));
                                float f16 = L4;
                                imageReceiver3.y0(L, org.telegram.messenger.g0.L(f14), f16, f16);
                                int i25 = this.P;
                                if (i25 == i11 || i25 == 5) {
                                    radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
                                    radialProgress2.r(org.telegram.messenger.g0.L(f13) + L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(48.0f) + L, org.telegram.messenger.g0.L(56.0f));
                                }
                            } else {
                                int size3 = View.MeasureSpec.getSize(i10);
                                if (size3 == 0) {
                                    size3 = org.telegram.messenger.g0.L(f10);
                                }
                                setMeasuredDimension(size2, size3);
                                int y10 = org.telegram.messenger.camera.q.y(24.0f, size2, 2);
                                int y11 = org.telegram.messenger.camera.q.y(24.0f, size3, 2);
                                radialProgress2.r(y10, y11, org.telegram.messenger.g0.L(24.0f) + y10, org.telegram.messenger.g0.L(24.0f) + y11);
                                radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(f12));
                                imageReceiver3.y0(0.0f, 0.0f, size2, size3);
                            }
                            woVar = this.b0;
                            if (woVar == null) {
                                measureChildWithMargins(woVar, i7, 0, i10, 0);
                                return;
                            }
                            return;
                        }
                        int i26 = this.P;
                        if (i26 != 5 && i26 != 3) {
                            this.O = org.telegram.messenger.w7.w(this.L.thumbs, 90, false, null, r72);
                        }
                    }
                    w10 = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    i13 = i12;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.Q) {
                    }
                    imageReceiver.R0 = this.P != 6 ? r72 : false;
                    Q = org.telegram.messenger.w7.Q(arrayList3);
                    if (Q != null) {
                    }
                    hcVar = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i2422 = iz.a;
                    if (rc.e(2048)) {
                    }
                    imageReceiver3.t0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z10 = this.Q;
                    RadialProgress2 radialProgress22 = this.W;
                    if (z10) {
                    }
                    woVar = this.b0;
                    if (woVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.J;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.O = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), r72, null, r72);
                        w10 = org.telegram.messenger.w7.w(arrayList, 80, false, null, r72);
                        if (w10 != this.O) {
                            str = null;
                            botInlineResult = this.J;
                            if (botInlineResult == null) {
                            }
                            if (this.L != null) {
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0) {
                            }
                            photoSize = this.O;
                            if (photoSize == null) {
                            }
                            if (i12 != 0) {
                            }
                            i12 = org.telegram.messenger.g0.L(80.0f);
                            i13 = i12;
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.Q) {
                            }
                            imageReceiver.R0 = this.P != 6 ? r72 : false;
                            Q = org.telegram.messenger.w7.Q(arrayList3);
                            if (Q != null) {
                            }
                            hcVar = null;
                            if (this.P == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            int i24222 = iz.a;
                            if (rc.e(2048)) {
                            }
                            imageReceiver3.t0 = r72;
                            imageReceiver3.P0(false);
                            this.b = r72;
                            z10 = this.Q;
                            RadialProgress2 radialProgress222 = this.W;
                            if (z10) {
                            }
                            woVar = this.b0;
                            if (woVar == null) {
                            }
                        }
                    }
                    w10 = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    i13 = i12;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.Q) {
                    }
                    imageReceiver.R0 = this.P != 6 ? r72 : false;
                    Q = org.telegram.messenger.w7.Q(arrayList3);
                    if (Q != null) {
                    }
                    hcVar = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i242222 = iz.a;
                    if (rc.e(2048)) {
                    }
                    imageReceiver3.t0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z10 = this.Q;
                    RadialProgress2 radialProgress2222 = this.W;
                    if (z10) {
                    }
                    woVar = this.b0;
                    if (woVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.J.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z9 = this.Q;
        g70Var = this.c;
        if (z9) {
        }
        f10 = 100.0f;
        f11 = 1.0f;
        g70Var2 = g70Var;
        r72 = 1;
        f12 = 12.0f;
        f13 = 4.0f;
        document = this.L;
        if (document != null) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.Q || this.c0 == null || this.J == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        org.telegram.messenger.g0.L(48.0f);
        int i7 = this.P;
        g70 g70Var = this.c;
        boolean z9 = true;
        if (i7 == 3 || i7 == 5) {
            boolean contains = g70Var.getBounds().contains(x10, y10);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.W;
            if (action == 0) {
                if (contains) {
                    this.r = true;
                    radialProgress2.o(true, false);
                    invalidate();
                }
            } else if (this.r) {
                if (motionEvent.getAction() == 1) {
                    this.r = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.r = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !contains) {
                    this.r = false;
                    invalidate();
                }
                radialProgress2.o(this.r, false);
            }
            z9 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (g70Var.getBounds().contains(x10, y10)) {
                        this.r = true;
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        ((jg.u0) this.c0).a.V.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                    } else if (motionEvent.getAction() == 2 && !g70Var.getBounds().contains(x10, y10)) {
                        this.r = false;
                    }
                }
            }
            z9 = false;
        }
        return !z9 ? super.onTouchEvent(motionEvent) : z9;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        int i10;
        if (i7 != 16 || ((i10 = this.P) != 3 && i10 != 5)) {
            return super.performAccessibilityAction(i7, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z9) {
        this.w = z9;
    }

    public void setDelegate(g2 g2Var) {
        this.c0 = g2Var;
    }

    public void setIsKeyboard(boolean z9) {
        this.x = z9;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        ic icVar = this.d0;
        if (icVar != null) {
            icVar.c(z9 || this.a0);
        }
    }

    public void setScaled(boolean z9) {
        this.a0 = z9;
        ic icVar = this.d0;
        if (icVar != null) {
            icVar.c(isPressed() || this.a0);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        int i7 = p10.s0;
        this.d = i7;
        this.F = org.telegram.messenger.g0.L(7.0f);
        this.H = org.telegram.messenger.g0.L(27.0f);
        this.h0 = 1.0f;
        this.i0 = new f2(0, this);
        this.f = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.E0(1);
        imageReceiver.v0 = true;
        this.c = new g70(0, f6Var);
        this.W = new RadialProgress2(this, null);
        this.U = org.telegram.messenger.z5.q(i7).k();
        setFocusable(true);
        if (z9) {
            Paint paint = new Paint();
            this.T = paint;
            int i10 = org.telegram.ui.ActionBar.k6.zi;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            wo woVar = new wo(21, context, f6Var);
            this.b0 = woVar;
            woVar.setVisibility(4);
            woVar.b(-1, i10, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(1);
            addView(woVar, c8.ha.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
