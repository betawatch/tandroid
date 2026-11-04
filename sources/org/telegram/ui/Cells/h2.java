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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.e20;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.lc;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.wo;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h2 extends FrameLayout implements org.telegram.messenger.x5 {
    public int E;
    public StaticLayout F;
    public final int G;
    public StaticLayout H;
    public final int I;
    public StaticLayout J;
    public TLRPC.BotInlineResult K;
    public TLRPC.User L;
    public TLRPC.Document M;
    public int N;
    public TLRPC.Photo O;
    public TLRPC.PhotoSize P;
    public int Q;
    public boolean R;
    public zi S;
    public AnimatorSet T;
    public final Paint U;
    public final int V;
    public int W;
    public final ImageReceiver a;
    public final RadialProgress2 a0;
    public boolean b;
    public boolean b0;
    public final c70 c;
    public final wo c0;
    public final int d;
    public g2 d0;
    public Object e;
    public gc e0;
    public final org.telegram.ui.ActionBar.e6 f;
    public boolean f0;
    public String g0;
    public e71 h;
    public boolean h0;
    public float i0;
    public final f2 j0;
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
        int i3 = this.Q;
        RadialProgress2 radialProgress2 = this.a0;
        if (i3 != 3 && i3 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
            return this.W == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.id, org.telegram.ui.ActionBar.k6.jd);
        int i10 = this.W;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        f(true, z10);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.h0 = true;
        this.a0.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i3;
        int i10 = this.Q;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.W;
            RadialProgress2 radialProgress2 = this.a0;
            if (i11 == 0) {
                if (MediaController.B().S(this.S)) {
                    this.W = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.B().R(this.S, true)) {
                    this.W = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i12 = this.d;
            if (i11 != 2) {
                if (i11 == 4) {
                    if (this.M != null) {
                        org.telegram.messenger.w7.G(i12).f(this.M);
                    } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.w7.G(i12).e(null, null, e20.c(this.K.content), null, null, null);
                    }
                    this.W = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            radialProgress2.p(false, 0.0f);
            if (this.M != null) {
                org.telegram.messenger.w7.G(i12).X(this.M, this.K, 1, 0);
            } else if (this.K.content instanceof TLRPC.TL_webDocument) {
                i3 = 4;
                org.telegram.messenger.w7.G(i12).Y(null, null, e20.c(this.K.content), null, null, null, null, 0L, 3, 1);
                this.W = i3;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
            i3 = 4;
            this.W = i3;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b() {
        this.S = null;
        this.Q = 0;
        TLRPC.Document document = this.M;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.Q = 7;
                } else if (botInlineResult.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                    this.Q = 5;
                } else if (this.K.type.equals("voice")) {
                    this.Q = 3;
                }
            }
        } else if (zi.t3(document, false)) {
            this.Q = 2;
        } else if (zi.v4(this.M) || zi.L2(this.M, true)) {
            this.Q = 6;
        } else if (zi.K3(this.M)) {
            this.Q = 5;
        } else if (zi.R4(this.M)) {
            this.Q = 3;
        }
        int i3 = this.Q;
        if (i3 == 3 || i3 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.b.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.d;
            long e10 = h10.i(i10).e();
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
            TLRPC.Document document2 = this.M;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String B = zb.B(this.K.content.url, this.Q == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = t4.c.f("audio/", B);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = zi.g1(this.K);
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.Q == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.a(this.K.content.url));
                sb2.append(".");
                sb2.append(zb.B(this.K.content.url, this.Q == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File z10 = org.telegram.messenger.w7.z(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.a(this.K.content.url));
                sb3.append(".");
                sb3.append(zb.B(this.K.content.url, this.Q == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(z10, sb3.toString()).getAbsolutePath();
            }
            this.S = new zi(i10, tL_message, false, true);
        }
    }

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.c0;
        if (woVar == null) {
            return;
        }
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.T = null;
        }
        if (!z11) {
            this.i0 = z10 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.T = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.j0, z10 ? 0.81f : 1.0f));
        this.T.setDuration(200L);
        this.T.addListener(new dh.x(22, this, z10));
        this.T.start();
    }

    public final void d(int i3, Object obj, TLRPC.Document document) {
        this.n = false;
        this.s = false;
        this.N = i3;
        this.K = null;
        this.e = obj;
        this.M = document;
        this.O = null;
        this.R = true;
        this.y = true;
        b();
        this.Q = 2;
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.n = z11;
        this.s = z12;
        this.L = user;
        this.K = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.M = botInlineResult.document;
            this.O = botInlineResult.photo;
        } else {
            this.M = null;
            this.O = null;
        }
        this.R = z10;
        this.y = z13;
        e71 e71Var = this.h;
        if (e71Var != null && e71Var.r) {
            e71Var.r = false;
            e71Var.h.p(false);
            e71Var.h.q();
            org.telegram.utils.twidget.p.r(e71Var.c);
        }
        this.h = (botInlineResult == null || !(botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) ? null : new e71(this, this.d, botInlineResult, this.f);
        b();
        if (z13) {
            this.Q = 2;
        }
        requestLayout();
        this.g0 = null;
        this.h0 = false;
        this.f0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.g0;
        if (str == null && !this.f0) {
            this.f0 = true;
            Utilities.g.c(new e2(this, z10));
            this.a0.setIcon(4, z10, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.W = -1;
            this.a0.setIcon(4, z10, false);
            return;
        }
        if (this.M != null) {
            containsKey = org.telegram.messenger.w7.G(this.d).T(this.g0);
        } else {
            containsKey = zb.D().C.containsKey(this.g0);
        }
        if (containsKey || !this.h0) {
            org.telegram.messenger.z5.q(this.d).a(this.g0, null, this);
            int i3 = this.Q;
            if (i3 != 5 && i3 != 3) {
                this.W = 1;
                Float w10 = zb.D().w(this.g0);
                this.a0.p(false, w10 != null ? w10.floatValue() : 0.0f);
            } else if (containsKey) {
                this.W = 4;
                Float w11 = zb.D().w(this.g0);
                if (w11 != null) {
                    this.a0.p(z11, w11.floatValue());
                } else {
                    this.a0.p(z11, 0.0f);
                }
            } else {
                this.W = 2;
            }
        } else {
            org.telegram.messenger.z5.q(this.d).v(this);
            int i10 = this.Q;
            if (i10 == 5 || i10 == 3) {
                boolean I = MediaController.B().I(this.S);
                if (!I || (I && MediaController.B().H())) {
                    this.W = 0;
                } else {
                    this.W = 1;
                }
                this.a0.p(z11, 1.0f);
            } else {
                this.W = -1;
            }
        }
        this.a0.setIcon(getIconForCurrentState(), z10, z11);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.K;
    }

    public int getDate() {
        return this.N;
    }

    public TLRPC.Document getDocument() {
        return this.M;
    }

    public TLRPC.User getInlineBot() {
        return this.L;
    }

    public zi getMessageObject() {
        return this.S;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.V;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.K;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.a0.p(true, Math.min(1.0f, j10 / j11));
        int i3 = this.Q;
        if (i3 == 3 || i3 == 5) {
            if (this.W != 4) {
                f(false, true);
            }
        } else if (this.W != 1) {
            f(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a.P()) {
            f(false, false);
        }
        this.a0.e();
        if (this.h == null || getMeasuredWidth() <= 0) {
            return;
        }
        this.h.a(getMeasuredWidth() - org.telegram.messenger.g0.L(this.R ? 4.0f : 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        this.a0.f();
        org.telegram.messenger.z5.q(this.d).v(this);
        e71 e71Var = this.h;
        if (e71Var == null || !e71Var.r) {
            return;
        }
        e71Var.r = false;
        e71Var.h.p(false);
        e71Var.h.q();
        org.telegram.utils.twidget.p.r(e71Var.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        int i10;
        e71 e71Var = this.h;
        if (e71Var != null) {
            float L = org.telegram.messenger.g0.L(this.R ? 2.0f : 8.0f);
            float L2 = org.telegram.messenger.g0.L(this.R ? 2.0f : 6.0f);
            Paint paint = e71Var.e;
            Path path = e71Var.f;
            org.telegram.utils.twidget.u uVar = e71Var.c;
            if (uVar != null && (i10 = e71Var.n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(e71Var.b, uVar, i10), org.telegram.messenger.g0.L(320.0f));
                float L3 = org.telegram.messenger.g0.L(az.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, e71Var.n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ob, e71Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                h71 h71Var = e71Var.h;
                if (h71Var != null && h71Var.b(canvas, e71Var.n)) {
                    e71Var.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (!this.n || this.R) {
                return;
            }
            canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        wo woVar = this.c0;
        if (woVar != null && (woVar.a.q || !imageReceiver.I() || imageReceiver.i1 != 1.0f || PhotoViewer.Q1((zi) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.U);
        }
        if (this.H != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.J;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.I);
            this.J.draw(canvas);
            canvas.restore();
        }
        if (this.F != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J6, e6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : org.telegram.messenger.g0.C), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.R;
        RadialProgress2 radialProgress2 = this.a0;
        if (z10) {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                    float f10 = imageReceiver.L0;
                    float f11 = imageReceiver.N0;
                    int z11 = (int) com.google.android.recaptcha.internal.a.z(f11, intrinsicWidth, 2.0f, f10);
                    float f12 = imageReceiver.M0;
                    float f13 = imageReceiver.O0;
                    int z12 = (int) com.google.android.recaptcha.internal.a.z(f13, intrinsicHeight, 2.0f, f12);
                    canvas.drawRect(f10, f12, f11 + f10, f12 + f13, c70.k);
                    org.telegram.ui.ActionBar.k6.o4.setBounds(z11, z12, intrinsicWidth + z11, intrinsicHeight + z12);
                    org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                }
            }
        } else {
            boolean z13 = this.b;
            c70 c70Var = this.c;
            if (!z13 || PhotoViewer.R1(this.K)) {
                c70Var.setAlpha(hs.e4);
            } else {
                c70Var.setAlpha((int) ((1.0f - imageReceiver.i1) * 255.0f));
            }
            int i11 = this.Q;
            if (i11 == 3 || i11 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(this.r ? org.telegram.ui.ActionBar.k6.Xd : org.telegram.ui.ActionBar.k6.Wd, e6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.K;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.K;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.K.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.K.type.equals("geo"))) {
                            c70Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.k6.o4.getIntrinsicHeight();
                            int L4 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth2) / 2));
                            int L5 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight2) / 2));
                            float f14 = imageReceiver.L0;
                            canvas.drawRect(f14, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f14, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.k);
                            org.telegram.ui.ActionBar.k6.o4.setBounds(L4, L5, intrinsicWidth2 + L4, intrinsicHeight2 + L5);
                            org.telegram.ui.ActionBar.k6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.k6.n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth3) / 2));
                        int L7 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight3) / 2));
                        float f15 = imageReceiver.L0;
                        canvas.drawRect(f15, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f15, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.k);
                        org.telegram.ui.ActionBar.k6.n4.setBounds(L6, L7, intrinsicWidth3 + L6, intrinsicHeight3 + L7);
                        org.telegram.ui.ActionBar.k6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.k6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.k6.m4.getIntrinsicHeight();
                    int L8 = (int) (imageReceiver.L0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicWidth4) / 2));
                    int L9 = (int) (imageReceiver.M0 + ((org.telegram.messenger.g0.L(52.0f) - intrinsicHeight4) / 2));
                    float f16 = imageReceiver.L0;
                    canvas.drawRect(f16, imageReceiver.M0, org.telegram.messenger.g0.L(52.0f) + f16, imageReceiver.M0 + org.telegram.messenger.g0.L(52.0f), c70.k);
                    org.telegram.ui.ActionBar.k6.m4.setBounds(L8, L9, intrinsicWidth4 + L8, intrinsicHeight4 + L9);
                    org.telegram.ui.ActionBar.k6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.K != null) {
                imageReceiver.O0(!PhotoViewer.R1(r14), false);
            }
            canvas.save();
            float f17 = this.i0;
            gc gcVar = this.e0;
            if (gcVar != null) {
                f17 *= gcVar.a(0.1f);
            }
            canvas.scale(f17, f17, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.R && ((i3 = this.Q) == 7 || i3 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.R) {
            if (bd.a0) {
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
        switch (this.Q) {
            case 1:
                sb2.append(bd.M0(2131753975, null));
                break;
            case 2:
                sb2.append(bd.M0(2131753971, null));
                break;
            case 3:
                sb2.append(bd.M0(2131753982, null));
                break;
            case 4:
                sb2.append(bd.M0(2131753933, null));
                break;
            case 5:
                sb2.append(bd.M0(2131753952, null));
                break;
            case 6:
                sb2.append(bd.M0(2131753936, null));
                break;
            case 7:
                sb2.append(bd.M0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.H;
        boolean z10 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.J;
        boolean z11 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.Q == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(bd.a0("AccDescrMusicInfo", null, 2131754832, this.J.getText(), this.H.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.H.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.J.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        wo woVar = this.c0;
        if (woVar != null && woVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i3 = this.Q;
        if (i3 == 3 || i3 == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? bd.M0(2131754929, "AccActionPlay") : bd.M0(2131754941, "AccActionCancelDownload") : bd.M0(2131754938, "AccActionDownload") : bd.M0(2131754930, "AccActionPause")));
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
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        c70 c70Var;
        float f10;
        float f11;
        c70 c70Var2;
        ?? r72;
        float f12;
        float f13;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        ArrayList arrayList3;
        e20 e20Var;
        String str2;
        int i12;
        int i13;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize R;
        ac acVar;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ac i14;
        String h;
        String concat;
        boolean z11;
        float f14;
        int L;
        wo woVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z12;
        char c2;
        boolean z13;
        int i15 = 0;
        this.b = false;
        this.J = null;
        this.H = null;
        this.F = null;
        this.P = null;
        this.E = org.telegram.messenger.g0.L(27.0f);
        if (this.K == null && this.M == null) {
            setMeasuredDimension(org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(100.0f));
            return;
        }
        if (this.h != null) {
            int size = View.MeasureSpec.getSize(i3);
            int L2 = size - org.telegram.messenger.g0.L(this.R ? 4.0f : 16.0f);
            e71 e71Var = this.h;
            setMeasuredDimension(size, org.telegram.messenger.g0.L(this.R ? 4.0f : 12.0f) + Math.min(org.telegram.utils.twidget.p.d(e71Var.b, e71Var.c, L2), org.telegram.messenger.g0.L(320.0f)) + (this.n ? 1 : 0));
            if (isAttachedToWindow()) {
                this.h.a(L2);
                return;
            }
            return;
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int L3 = (size2 - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(8.0f);
        if (this.M != null) {
            arrayList2 = new ArrayList(this.M.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.K;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z10 = this.R;
                c70Var = this.c;
                if (!z10 || (botInlineResult2 = this.K) == null) {
                    f10 = 100.0f;
                    f11 = 1.0f;
                    c70Var2 = c70Var;
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
                                this.H = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i6.m(this.K.title.replace('\n', ' '), org.telegram.ui.ActionBar.k6.f3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.k6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.f3.measureText(r0)), L3), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.f3, L3 + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                c70Var.a(this.K.title);
                                str6 = this.K.description;
                                if (str6 == null) {
                                }
                                r72 = z13;
                                if (this.K.url != null) {
                                }
                                document = this.M;
                                if (document != null) {
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            f13 = 4.0f;
                        }
                        c70Var.a(this.K.title);
                    } else {
                        f12 = 12.0f;
                        f13 = 4.0f;
                    }
                    str6 = this.K.description;
                    if (str6 == null) {
                        try {
                        } catch (Exception e12) {
                            e = e12;
                            f11 = 1.0f;
                            c70Var2 = c70Var;
                        }
                        try {
                            z12 = true;
                            c2 = ' ';
                            c70Var2 = c70Var;
                            f11 = 1.0f;
                        } catch (Exception e13) {
                            e = e13;
                            c70Var2 = c70Var;
                            f11 = 1.0f;
                            z12 = true;
                            c2 = ' ';
                            org.telegram.messenger.a8.g(e, z12);
                            z13 = z12;
                            r72 = z13;
                            if (this.K.url != null) {
                            }
                            document = this.M;
                            if (document != null) {
                            }
                        }
                        try {
                            StaticLayout H1 = q1.H1(org.telegram.messenger.i6.m(str6, org.telegram.ui.ActionBar.k6.g3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.k6.g3, L3, L3, 0, 3);
                            this.J = H1;
                            z13 = z12;
                            if (H1.getLineCount() > 0) {
                                int i16 = this.I;
                                StaticLayout staticLayout = this.J;
                                this.E = i16 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + org.telegram.messenger.g0.L(1.0f);
                                z13 = z12;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            org.telegram.messenger.a8.g(e, z12);
                            z13 = z12;
                            r72 = z13;
                            if (this.K.url != null) {
                            }
                            document = this.M;
                            if (document != null) {
                            }
                        }
                    } else {
                        f11 = 1.0f;
                        c70Var2 = c70Var;
                        z13 = true;
                        c2 = ' ';
                    }
                    r72 = z13;
                    if (this.K.url != null) {
                        try {
                            this.F = new StaticLayout(TextUtils.ellipsize(this.K.url.replace('\n', c2), org.telegram.ui.ActionBar.k6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.g3.measureText(r0)), L3), TextUtils.TruncateAt.MIDDLE), org.telegram.ui.ActionBar.k6.g3, L3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r72 = z13;
                        } catch (Exception e15) {
                            org.telegram.messenger.a8.g(e15, z13);
                            r72 = z13;
                        }
                    }
                }
                document = this.M;
                if (document != null) {
                    if (this.y || zi.t3(document, false)) {
                        this.P = org.telegram.messenger.w7.w(this.M.thumbs, 90, false, null, r72);
                    } else {
                        if (zi.v4(this.M) || zi.L2(this.M, r72)) {
                            this.P = org.telegram.messenger.w7.w(this.M.thumbs, 90, false, null, r72);
                            str = "webp";
                            w10 = null;
                            botInlineResult = this.K;
                            if (botInlineResult == null) {
                                if ((botInlineResult.content instanceof TLRPC.TL_webDocument) && (str5 = botInlineResult.type) != null) {
                                    if (str5.startsWith("gif")) {
                                        TLRPC.WebDocument webDocument = this.K.thumb;
                                        tL_webDocument = ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) ? (TLRPC.TL_webDocument) this.K.thumb : (TLRPC.TL_webDocument) this.K.content;
                                        this.Q = 2;
                                    } else if (this.K.type.equals("photo")) {
                                        TLRPC.BotInlineResult botInlineResult4 = this.K;
                                        TLRPC.WebDocument webDocument2 = botInlineResult4.thumb;
                                        tL_webDocument = webDocument2 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument2 : (TLRPC.TL_webDocument) botInlineResult4.content;
                                    }
                                    if (tL_webDocument == null) {
                                        TLRPC.WebDocument webDocument3 = this.K.thumb;
                                        if (webDocument3 instanceof TLRPC.TL_webDocument) {
                                            tL_webDocument = (TLRPC.TL_webDocument) webDocument3;
                                        }
                                    }
                                    if (tL_webDocument == null && this.P == null && w10 == null) {
                                        botInlineMessage = this.K.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            i11 = 3;
                                            arrayList3 = arrayList;
                                            double d10 = geoPoint._long;
                                            if (hp.s1(this.d).n3 != 2) {
                                                e20Var = e20.b(this.K.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)));
                                                str2 = null;
                                            } else {
                                                str2 = org.telegram.messenger.g0.e0(this.d, d, d10, 72, 72, true, 15, -1);
                                                e20Var = null;
                                            }
                                            if (tL_webDocument != null) {
                                                e20Var = e20.c(tL_webDocument);
                                            }
                                        }
                                    }
                                    i11 = 3;
                                    arrayList3 = arrayList;
                                    e20Var = null;
                                    str2 = null;
                                    if (tL_webDocument != null) {
                                    }
                                }
                                tL_webDocument = null;
                                if (tL_webDocument == null) {
                                }
                                if (tL_webDocument == null) {
                                    botInlineMessage = this.K.send_message;
                                    if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                                    }
                                    TLRPC.GeoPoint geoPoint2 = botInlineMessage.geo;
                                    double d11 = geoPoint2.lat;
                                    i11 = 3;
                                    arrayList3 = arrayList;
                                    double d102 = geoPoint2._long;
                                    if (hp.s1(this.d).n3 != 2) {
                                    }
                                    if (tL_webDocument != null) {
                                    }
                                }
                                i11 = 3;
                                arrayList3 = arrayList;
                                e20Var = null;
                                str2 = null;
                                if (tL_webDocument != null) {
                                }
                            } else {
                                i11 = 3;
                                arrayList3 = arrayList;
                                e20Var = null;
                                str2 = null;
                            }
                            if (this.M != null) {
                                for (int i17 = 0; i17 < this.M.attributes.size(); i17++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.M.attributes.get(i17);
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
                                photoSize = this.P;
                                if (photoSize == null) {
                                    if (w10 != null) {
                                        w10.size = -1;
                                    }
                                    i12 = photoSize.w;
                                    i13 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.K;
                                    if (botInlineResult5 != null) {
                                        int[] h12 = zi.h1(botInlineResult5);
                                        int i18 = h12[0];
                                        i13 = h12[r72];
                                        i12 = i18;
                                    }
                                }
                            }
                            if (i12 != 0 || i13 == 0) {
                                i12 = org.telegram.messenger.g0.L(80.0f);
                                i13 = i12;
                            }
                            document2 = this.M;
                            imageReceiver = this.a;
                            if (document2 != null && this.P == null && e20Var == null && str2 == null) {
                                imageReceiver3 = imageReceiver;
                            } else {
                                if (this.R) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i12, i13) / 3;
                                    if (this.Q == 2) {
                                        Locale locale = Locale.US;
                                        String h7 = com.google.android.recaptcha.internal.a.h((int) (min / org.telegram.messenger.g0.p), "_80_b");
                                        int i19 = az.a;
                                        if (lc.e(2048) || this.x) {
                                            str4 = h7;
                                            str3 = str4;
                                        } else {
                                            concat = h7.concat("_firstframe");
                                            h = h7.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        h = com.google.android.recaptcha.internal.a.h((int) (min / org.telegram.messenger.g0.p), "_80");
                                        concat = h.concat("_b");
                                    }
                                    str4 = h;
                                    str3 = concat;
                                }
                                imageReceiver.S0 = this.Q != 6 ? r72 : false;
                                R = org.telegram.messenger.w7.R(arrayList3);
                                if (R != null) {
                                    TLRPC.Document document3 = this.M;
                                    if (document3 != null) {
                                        i14 = ac.c(R, document3);
                                    } else {
                                        TLRPC.Photo photo = this.O;
                                        if (photo != null) {
                                            i14 = ac.i(R, photo);
                                        }
                                    }
                                    acVar = i14;
                                    if (this.Q == 2) {
                                        TLRPC.Document document4 = this.M;
                                        if (document4 != null) {
                                            TLRPC.VideoSize J0 = zi.J0(document4);
                                            if (J0 != null) {
                                                ac d12 = ac.d(J0, this.M);
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                int i20 = az.a;
                                                sb2.append((lc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.u0(d12, sb2.toString(), ac.c(this.P, this.M), str4, acVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                ac b10 = ac.b(this.M);
                                                if (this.y) {
                                                    b10.p = 2;
                                                }
                                                StringBuilder sb3 = new StringBuilder("100_100");
                                                int i21 = az.a;
                                                sb3.append((lc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2.u0(b10, sb3.toString(), ac.c(this.P, this.M), str4, acVar, str3, null, this.M.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (e20Var != null) {
                                                imageReceiver2.u0(ac.p(e20Var), "100_100", ac.i(this.P, this.O), str4, acVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.u0(ac.g(str2), "100_100", ac.i(this.P, this.O), str4, acVar, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.P != null) {
                                            jz f15 = org.telegram.messenger.t5.f(this.M, org.telegram.ui.ActionBar.k6.a7, f11, null);
                                            if (!zi.p(this.M)) {
                                                TLRPC.Document document5 = this.M;
                                                if (document5 == null) {
                                                    imageReceiver2.u0(ac.i(this.P, this.O), str4, ac.i(w10, this.O), str3, acVar, str3, null, this.P.size, str, this.e, 0);
                                                } else if (f15 != null) {
                                                    imageReceiver2.u0(ac.c(this.P, document5), str4, null, null, acVar, str3, f15, this.P.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.u0(ac.c(this.P, document5), str4, ac.i(w10, this.O), str3, acVar, str3, null, this.P.size, str, this.e, 0);
                                                }
                                            } else if (f15 != null) {
                                                imageReceiver2.u0(ac.b(this.M), "80_80", null, null, acVar, str3, f15, this.P.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.u0(ac.b(this.M), "80_80", ac.c(this.P, this.M), str3, acVar, str3, null, this.P.size, str, this.e, 0);
                                            }
                                        } else if (e20Var != null) {
                                            imageReceiver2.u0(ac.p(e20Var), str4, ac.i(w10, this.O), str3, acVar, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.u0(ac.g(str2), str4, ac.i(w10, this.O), str3, acVar, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    int i22 = az.a;
                                    if (!lc.e(2048) || this.x) {
                                        imageReceiver3.u0 = r72;
                                        imageReceiver3.P0(false);
                                    } else {
                                        imageReceiver3.u0 = false;
                                        imageReceiver3.Q0();
                                    }
                                    this.b = r72;
                                }
                                acVar = null;
                                if (this.Q == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                int i222 = az.a;
                                if (lc.e(2048)) {
                                }
                                imageReceiver3.u0 = r72;
                                imageReceiver3.P0(false);
                                this.b = r72;
                            }
                            z11 = this.R;
                            RadialProgress2 radialProgress2 = this.a0;
                            if (z11) {
                                StaticLayout staticLayout2 = this.H;
                                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                                    StaticLayout staticLayout3 = this.H;
                                    i15 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - r72);
                                }
                                StaticLayout staticLayout4 = this.J;
                                if (staticLayout4 != null && staticLayout4.getLineCount() != 0) {
                                    StaticLayout staticLayout5 = this.J;
                                    i15 += staticLayout5.getLineBottom(staticLayout5.getLineCount() - r72);
                                }
                                StaticLayout staticLayout6 = this.F;
                                if (staticLayout6 != null && staticLayout6.getLineCount() > 0) {
                                    StaticLayout staticLayout7 = this.F;
                                    i15 += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r72);
                                }
                                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(16.0f, Math.max(org.telegram.messenger.g0.L(52.0f), i15), org.telegram.messenger.g0.L(68.0f)) + (this.n ? 1 : 0));
                                int L4 = org.telegram.messenger.g0.L(52.0f);
                                if (bd.a0) {
                                    f14 = 8.0f;
                                    L = org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i3), L4);
                                } else {
                                    f14 = 8.0f;
                                    L = org.telegram.messenger.g0.L(8.0f);
                                }
                                c70Var2.setBounds(L, org.telegram.messenger.g0.L(f14), L + L4, org.telegram.messenger.g0.L(60.0f));
                                float f16 = L4;
                                imageReceiver3.y0(L, org.telegram.messenger.g0.L(f14), f16, f16);
                                int i23 = this.Q;
                                if (i23 == i11 || i23 == 5) {
                                    radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
                                    radialProgress2.r(org.telegram.messenger.g0.L(f13) + L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(48.0f) + L, org.telegram.messenger.g0.L(56.0f));
                                }
                            } else {
                                int size3 = View.MeasureSpec.getSize(i10);
                                if (size3 == 0) {
                                    size3 = org.telegram.messenger.g0.L(f10);
                                }
                                setMeasuredDimension(size2, size3);
                                int y9 = org.telegram.messenger.camera.q.y(24.0f, size2, 2);
                                int y10 = org.telegram.messenger.camera.q.y(24.0f, size3, 2);
                                radialProgress2.r(y9, y10, org.telegram.messenger.g0.L(24.0f) + y9, org.telegram.messenger.g0.L(24.0f) + y10);
                                radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(f12));
                                imageReceiver3.y0(0.0f, 0.0f, size2, size3);
                            }
                            woVar = this.c0;
                            if (woVar == null) {
                                measureChildWithMargins(woVar, i3, 0, i10, 0);
                                return;
                            }
                            return;
                        }
                        int i24 = this.Q;
                        if (i24 != 5 && i24 != 3) {
                            this.P = org.telegram.messenger.w7.w(this.M.thumbs, 90, false, null, r72);
                        }
                    }
                    w10 = null;
                    str = null;
                    botInlineResult = this.K;
                    if (botInlineResult == null) {
                    }
                    if (this.M != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.P;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    i13 = i12;
                    document2 = this.M;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.R) {
                    }
                    imageReceiver.S0 = this.Q != 6 ? r72 : false;
                    R = org.telegram.messenger.w7.R(arrayList3);
                    if (R != null) {
                    }
                    acVar = null;
                    if (this.Q == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i2222 = az.a;
                    if (lc.e(2048)) {
                    }
                    imageReceiver3.u0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z11 = this.R;
                    RadialProgress2 radialProgress22 = this.a0;
                    if (z11) {
                    }
                    woVar = this.c0;
                    if (woVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.K;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.P = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), r72, null, r72);
                        w10 = org.telegram.messenger.w7.w(arrayList, 80, false, null, r72);
                        if (w10 != this.P) {
                            str = null;
                            botInlineResult = this.K;
                            if (botInlineResult == null) {
                            }
                            if (this.M != null) {
                            }
                            i12 = 0;
                            i13 = 0;
                            if (i12 != 0) {
                            }
                            photoSize = this.P;
                            if (photoSize == null) {
                            }
                            if (i12 != 0) {
                            }
                            i12 = org.telegram.messenger.g0.L(80.0f);
                            i13 = i12;
                            document2 = this.M;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.R) {
                            }
                            imageReceiver.S0 = this.Q != 6 ? r72 : false;
                            R = org.telegram.messenger.w7.R(arrayList3);
                            if (R != null) {
                            }
                            acVar = null;
                            if (this.Q == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            int i22222 = az.a;
                            if (lc.e(2048)) {
                            }
                            imageReceiver3.u0 = r72;
                            imageReceiver3.P0(false);
                            this.b = r72;
                            z11 = this.R;
                            RadialProgress2 radialProgress222 = this.a0;
                            if (z11) {
                            }
                            woVar = this.c0;
                            if (woVar == null) {
                            }
                        }
                    }
                    w10 = null;
                    str = null;
                    botInlineResult = this.K;
                    if (botInlineResult == null) {
                    }
                    if (this.M != null) {
                    }
                    i12 = 0;
                    i13 = 0;
                    if (i12 != 0) {
                    }
                    photoSize = this.P;
                    if (photoSize == null) {
                    }
                    if (i12 != 0) {
                    }
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    i13 = i12;
                    document2 = this.M;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.R) {
                    }
                    imageReceiver.S0 = this.Q != 6 ? r72 : false;
                    R = org.telegram.messenger.w7.R(arrayList3);
                    if (R != null) {
                    }
                    acVar = null;
                    if (this.Q == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i222222 = az.a;
                    if (lc.e(2048)) {
                    }
                    imageReceiver3.u0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z11 = this.R;
                    RadialProgress2 radialProgress2222 = this.a0;
                    if (z11) {
                    }
                    woVar = this.c0;
                    if (woVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.K.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z10 = this.R;
        c70Var = this.c;
        if (z10) {
        }
        f10 = 100.0f;
        f11 = 1.0f;
        c70Var2 = c70Var;
        r72 = 1;
        f12 = 12.0f;
        f13 = 4.0f;
        document = this.M;
        if (document != null) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.R || this.d0 == null || this.K == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        org.telegram.messenger.g0.L(48.0f);
        int i3 = this.Q;
        c70 c70Var = this.c;
        boolean z10 = true;
        if (i3 == 3 || i3 == 5) {
            boolean contains = c70Var.getBounds().contains(x10, y9);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.a0;
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
            z10 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.K;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (c70Var.getBounds().contains(x10, y9)) {
                        this.r = true;
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        ((kg.r0) this.d0).a.W.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                    } else if (motionEvent.getAction() == 2 && !c70Var.getBounds().contains(x10, y9)) {
                        this.r = false;
                    }
                }
            }
            z10 = false;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        int i10;
        if (i3 != 16 || ((i10 = this.Q) != 3 && i10 != 5)) {
            return super.performAccessibilityAction(i3, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z10) {
        this.w = z10;
    }

    public void setDelegate(g2 g2Var) {
        this.d0 = g2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.x = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        gc gcVar = this.e0;
        if (gcVar != null) {
            gcVar.c(z10 || this.b0);
        }
    }

    public void setScaled(boolean z10) {
        this.b0 = z10;
        gc gcVar = this.e0;
        if (gcVar != null) {
            gcVar.c(isPressed() || this.b0);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i3 = h10.t0;
        this.d = i3;
        this.G = org.telegram.messenger.g0.L(7.0f);
        this.I = org.telegram.messenger.g0.L(27.0f);
        this.i0 = 1.0f;
        this.j0 = new f2(0, this);
        this.f = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.E0(1);
        imageReceiver.w0 = true;
        this.c = new c70(0, e6Var);
        this.a0 = new RadialProgress2(this, null);
        this.V = org.telegram.messenger.z5.q(i3).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.U = paint;
            int i10 = org.telegram.ui.ActionBar.k6.zi;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            wo woVar = new wo(21, context, e6Var);
            this.c0 = woVar;
            woVar.setVisibility(4);
            woVar.b(-1, i10, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(1);
            addView(woVar, mf.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
