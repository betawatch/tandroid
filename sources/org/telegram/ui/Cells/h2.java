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
import org.telegram.messenger.b30;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends FrameLayout implements org.telegram.messenger.z5 {
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
    public jj R;
    public AnimatorSet S;
    public final Paint T;
    public final int U;
    public int V;
    public final RadialProgress2 W;
    public final ImageReceiver a;
    public boolean a0;
    public boolean b;
    public final ep b0;
    public final z70 c;
    public g2 c0;
    public final int d;
    public dc d0;
    public Object e;
    public boolean e0;
    public final org.telegram.ui.ActionBar.p6 f;
    public String f0;
    public boolean g0;
    public n81 h;
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
        int i10 = this.P;
        RadialProgress2 radialProgress2 = this.W;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
            return this.V == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.id, org.telegram.ui.ActionBar.t6.jd);
        int i11 = this.V;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        return i11 == 4 ? 3 : 0;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        f(true, z10);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.g0 = true;
        this.W.p(true, 1.0f);
        f(false, true);
    }

    public final void a() {
        int i10;
        int i11 = this.P;
        if (i11 == 3 || i11 == 5) {
            int i12 = this.V;
            RadialProgress2 radialProgress2 = this.W;
            if (i12 == 0) {
                if (MediaController.B().S(this.R)) {
                    this.V = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i12 == 1) {
                if (MediaController.B().R(this.R, true)) {
                    this.V = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i13 = this.d;
            if (i12 != 2) {
                if (i12 == 4) {
                    if (this.L != null) {
                        org.telegram.messenger.b8.G(i13).f(this.L);
                    } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                        org.telegram.messenger.b8.G(i13).e(null, null, b30.c(this.J.content), null, null, null);
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
                org.telegram.messenger.b8.G(i13).X(this.L, this.J, 1, 0);
            } else if (this.J.content instanceof TLRPC.TL_webDocument) {
                i10 = 4;
                org.telegram.messenger.b8.G(i13).Y(null, null, b30.c(this.J.content), null, null, null, null, 0L, 3, 1);
                this.V = i10;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
            i10 = 4;
            this.V = i10;
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
        } else if (jj.s3(document, false)) {
            this.P = 2;
        } else if (jj.u4(this.L) || jj.K2(this.L, true)) {
            this.P = 6;
        } else if (jj.J3(this.L)) {
            this.P = 5;
        } else if (jj.Q4(this.L)) {
            this.P = 3;
        }
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = -Utilities.b.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i11 = this.d;
            long e = d20.i(i11).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
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
                String B = hc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = sc.e.h("audio/", B);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = jj.g1(this.J);
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
                sb2.append(hc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File z10 = org.telegram.messenger.b8.z(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.a(this.J.content.url));
                sb3.append(".");
                sb3.append(hc.B(this.J.content.url, this.P == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(z10, sb3.toString()).getAbsolutePath();
            }
            this.R = new jj(i11, tL_message, false, true);
        }
    }

    public final void c(boolean z10, boolean z11) {
        ep epVar = this.b0;
        if (epVar == null) {
            return;
        }
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.S = null;
        }
        if (!z11) {
            this.h0 = z10 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.S = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.i0, z10 ? 0.81f : 1.0f));
        this.S.setDuration(200L);
        this.S.addListener(new eg.m(8, this, z10));
        this.S.start();
    }

    public final void d(int i10, Object obj, TLRPC.Document document) {
        this.n = false;
        this.s = false;
        this.M = i10;
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

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.n = z11;
        this.s = z12;
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
        this.Q = z10;
        this.y = z13;
        n81 n81Var = this.h;
        if (n81Var != null && n81Var.r) {
            n81Var.r = false;
            n81Var.h.q(false);
            n81Var.h.r();
            org.telegram.utils.twidget.p.r(n81Var.c);
        }
        this.h = (botInlineResult == null || !(botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget)) ? null : new n81(this, this.d, botInlineResult, this.f);
        b();
        if (z13) {
            this.P = 2;
        }
        requestLayout();
        this.f0 = null;
        this.g0 = false;
        this.e0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean containsKey;
        String str = this.f0;
        if (str == null && !this.e0) {
            this.e0 = true;
            Utilities.g.c(new e2(this, z10));
            this.W.setIcon(4, z10, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.V = -1;
            this.W.setIcon(4, z10, false);
            return;
        }
        if (this.L != null) {
            containsKey = org.telegram.messenger.b8.G(this.d).T(this.f0);
        } else {
            containsKey = hc.D().C.containsKey(this.f0);
        }
        if (containsKey || !this.g0) {
            org.telegram.messenger.b6.q(this.d).a(this.f0, null, this);
            int i10 = this.P;
            if (i10 != 5 && i10 != 3) {
                this.V = 1;
                Float w9 = hc.D().w(this.f0);
                this.W.p(false, w9 != null ? w9.floatValue() : 0.0f);
            } else if (containsKey) {
                this.V = 4;
                Float w10 = hc.D().w(this.f0);
                if (w10 != null) {
                    this.W.p(z11, w10.floatValue());
                } else {
                    this.W.p(z11, 0.0f);
                }
            } else {
                this.V = 2;
            }
        } else {
            org.telegram.messenger.b6.q(this.d).v(this);
            int i11 = this.P;
            if (i11 == 5 || i11 == 3) {
                boolean I = MediaController.B().I(this.R);
                if (!I || (I && MediaController.B().H())) {
                    this.V = 0;
                } else {
                    this.V = 1;
                }
                this.W.p(z11, 1.0f);
            } else {
                this.V = -1;
            }
        }
        this.W.setIcon(getIconForCurrentState(), z10, z11);
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

    public jj getMessageObject() {
        return this.R;
    }

    @Override // org.telegram.messenger.z5
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

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.W.p(true, Math.min(1.0f, j10 / j11));
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
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
        this.h.a(getMeasuredWidth() - org.telegram.messenger.i0.L(this.Q ? 4.0f : 16.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        this.W.f();
        org.telegram.messenger.b6.q(this.d).v(this);
        n81 n81Var = this.h;
        if (n81Var == null || !n81Var.r) {
            return;
        }
        n81Var.r = false;
        n81Var.h.q(false);
        n81Var.h.r();
        org.telegram.utils.twidget.p.r(n81Var.c);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        n81 n81Var = this.h;
        if (n81Var != null) {
            float L = org.telegram.messenger.i0.L(this.Q ? 2.0f : 8.0f);
            float L2 = org.telegram.messenger.i0.L(this.Q ? 2.0f : 6.0f);
            Paint paint = n81Var.e;
            Path path = n81Var.f;
            org.telegram.utils.twidget.w wVar = n81Var.c;
            if (wVar != null && (i11 = n81Var.n) > 0) {
                int min = Math.min(org.telegram.utils.twidget.p.d(n81Var.b, wVar, i11), org.telegram.messenger.i0.L(320.0f));
                float L3 = org.telegram.messenger.i0.L(tz.Y0);
                canvas.save();
                canvas.translate(L, L2);
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, n81Var.n, min);
                path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
                canvas.clipPath(path);
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ob, n81Var.d) | (-16777216));
                canvas.drawRect(rectF, paint);
                q81 q81Var = n81Var.h;
                if (q81Var != null && q81Var.c(canvas, n81Var.n)) {
                    n81Var.a.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (!this.n || this.Q) {
                return;
            }
            canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        ep epVar = this.b0;
        if (epVar != null && (epVar.a.q || !imageReceiver.I() || imageReceiver.h1 != 1.0f || PhotoViewer.Q1((jj) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.T);
        }
        if (this.G != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.F);
            this.G.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.I;
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.t6.g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.H);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            org.telegram.ui.ActionBar.t6.g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J6, p6Var));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? 8.0f : org.telegram.messenger.i0.C), this.D);
            this.E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.Q;
        RadialProgress2 radialProgress2 = this.W;
        if (z10) {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.t6.o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.t6.o4.getIntrinsicHeight();
                    float f7 = imageReceiver.K0;
                    float f10 = imageReceiver.M0;
                    int B = (int) c3.i0.B(f10, intrinsicWidth, 2.0f, f7);
                    float f11 = imageReceiver.L0;
                    float f12 = imageReceiver.N0;
                    int B2 = (int) c3.i0.B(f12, intrinsicHeight, 2.0f, f11);
                    canvas.drawRect(f7, f11, f10 + f7, f11 + f12, z70.k);
                    org.telegram.ui.ActionBar.t6.o4.setBounds(B, B2, intrinsicWidth + B, intrinsicHeight + B2);
                    org.telegram.ui.ActionBar.t6.o4.draw(canvas);
                }
            }
        } else {
            boolean z11 = this.b;
            z70 z70Var = this.c;
            if (!z11 || PhotoViewer.R1(this.J)) {
                z70Var.setAlpha(zs.e4);
            } else {
                z70Var.setAlpha((int) ((1.0f - imageReceiver.h1) * 255.0f));
            }
            int i12 = this.P;
            if (i12 == 3 || i12 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(this.r ? org.telegram.ui.ActionBar.t6.Xd : org.telegram.ui.ActionBar.t6.Wd, p6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.J;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.J;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals(MediaStreamTrack.AUDIO_TRACK_KIND) || this.J.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.J;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.J.type.equals("geo"))) {
                            z70Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.t6.o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.t6.o4.getIntrinsicHeight();
                            int L4 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth2) / 2));
                            int L5 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight2) / 2));
                            float f13 = imageReceiver.K0;
                            canvas.drawRect(f13, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f13, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.k);
                            org.telegram.ui.ActionBar.t6.o4.setBounds(L4, L5, intrinsicWidth2 + L4, intrinsicHeight2 + L5);
                            org.telegram.ui.ActionBar.t6.o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.t6.n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.t6.n4.getIntrinsicHeight();
                        int L6 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth3) / 2));
                        int L7 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight3) / 2));
                        float f14 = imageReceiver.K0;
                        canvas.drawRect(f14, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f14, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.k);
                        org.telegram.ui.ActionBar.t6.n4.setBounds(L6, L7, intrinsicWidth3 + L6, intrinsicHeight3 + L7);
                        org.telegram.ui.ActionBar.t6.n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.t6.m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.t6.m4.getIntrinsicHeight();
                    int L8 = (int) (imageReceiver.K0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicWidth4) / 2));
                    int L9 = (int) (imageReceiver.L0 + ((org.telegram.messenger.i0.L(52.0f) - intrinsicHeight4) / 2));
                    float f15 = imageReceiver.K0;
                    canvas.drawRect(f15, imageReceiver.L0, org.telegram.messenger.i0.L(52.0f) + f15, imageReceiver.L0 + org.telegram.messenger.i0.L(52.0f), z70.k);
                    org.telegram.ui.ActionBar.t6.m4.setBounds(L8, L9, intrinsicWidth4 + L8, intrinsicHeight4 + L9);
                    org.telegram.ui.ActionBar.t6.m4.draw(canvas);
                }
            }
        }
        if (this.b) {
            if (this.J != null) {
                imageReceiver.O0(!PhotoViewer.R1(r14), false);
            }
            canvas.save();
            float f16 = this.h0;
            dc dcVar = this.d0;
            if (dcVar != null) {
                f16 *= dcVar.a(0.1f);
            }
            canvas.scale(f16, f16, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (this.Q && ((i10 = this.P) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.n && !this.Q) {
            if (cd.X) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            }
        }
        if (this.s) {
            org.telegram.ui.ActionBar.t6.p4.setBounds(0, 0, getMeasuredWidth(), org.telegram.messenger.i0.L(3.0f));
            org.telegram.ui.ActionBar.t6.p4.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.P) {
            case 1:
                sb2.append(cd.L0(2131753975, null));
                break;
            case 2:
                sb2.append(cd.L0(2131753971, null));
                break;
            case 3:
                sb2.append(cd.L0(2131753982, null));
                break;
            case 4:
                sb2.append(cd.L0(2131753933, null));
                break;
            case 5:
                sb2.append(cd.L0(2131753952, null));
                break;
            case 6:
                sb2.append(cd.L0(2131753936, null));
                break;
            case 7:
                sb2.append(cd.L0(2131753948, null));
                break;
        }
        StaticLayout staticLayout = this.G;
        boolean z10 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.I;
        boolean z11 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.P == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(cd.a0("AccDescrMusicInfo", null, 2131754832, this.I.getText(), this.G.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.G.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.I.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        ep epVar = this.b0;
        if (epVar != null && epVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.P;
        if (i10 == 3 || i10 == 5) {
            int iconForCurrentState = getIconForCurrentState();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? cd.L0(2131754929, "AccActionPlay") : cd.L0(2131754941, "AccActionCancelDownload") : cd.L0(2131754938, "AccActionDownload") : cd.L0(2131754930, "AccActionPause")));
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
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        z70 z70Var;
        float f7;
        float f10;
        z70 z70Var2;
        ?? r72;
        float f11;
        float f12;
        TLRPC.Document document;
        TLRPC.PhotoSize w9;
        String str;
        TLRPC.BotInlineResult botInlineResult;
        int i12;
        ArrayList arrayList3;
        b30 b30Var;
        String str2;
        int i13;
        int i14;
        TLRPC.PhotoSize photoSize;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        TLRPC.TL_photoStrippedSize R;
        ic icVar;
        ImageReceiver imageReceiver2;
        ImageReceiver imageReceiver3;
        ic i15;
        String k10;
        String concat;
        boolean z11;
        float f13;
        int L;
        ep epVar;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.BotInlineMessage botInlineMessage;
        String str5;
        TLRPC.BotInlineResult botInlineResult2;
        String str6;
        boolean z12;
        char c10;
        boolean z13;
        int i16 = 0;
        this.b = false;
        this.I = null;
        this.G = null;
        this.E = null;
        this.O = null;
        this.D = org.telegram.messenger.i0.L(27.0f);
        if (this.J == null && this.L == null) {
            setMeasuredDimension(org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(100.0f));
            return;
        }
        if (this.h != null) {
            int size = View.MeasureSpec.getSize(i10);
            int L2 = size - org.telegram.messenger.i0.L(this.Q ? 4.0f : 16.0f);
            n81 n81Var = this.h;
            setMeasuredDimension(size, org.telegram.messenger.i0.L(this.Q ? 4.0f : 12.0f) + Math.min(org.telegram.utils.twidget.p.d(n81Var.b, n81Var.c, L2), org.telegram.messenger.i0.L(320.0f)) + (this.n ? 1 : 0));
            if (isAttachedToWindow()) {
                this.h.a(L2);
                return;
            }
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int L3 = (size2 - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C)) - org.telegram.messenger.i0.L(8.0f);
        if (this.L != null) {
            arrayList2 = new ArrayList(this.L.thumbs);
        } else {
            TLRPC.BotInlineResult botInlineResult3 = this.J;
            if (botInlineResult3 == null || botInlineResult3.photo == null) {
                arrayList = null;
                z10 = this.Q;
                z70Var = this.c;
                if (!z10 || (botInlineResult2 = this.J) == null) {
                    f7 = 100.0f;
                    f10 = 1.0f;
                    z70Var2 = z70Var;
                    r72 = 1;
                    f11 = 12.0f;
                    f12 = 4.0f;
                } else {
                    f7 = 100.0f;
                    if (botInlineResult2.title != null) {
                        f11 = 12.0f;
                        try {
                            f12 = 4.0f;
                            try {
                                this.G = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.k6.m(this.J.title.replace('\n', ' '), org.telegram.ui.ActionBar.t6.f3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.t6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.t6.f3.measureText(r0)), L3), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.f3, L3 + org.telegram.messenger.i0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            } catch (Exception e) {
                                e = e;
                                org.telegram.messenger.f8.g(e, true);
                                z70Var.a(this.J.title);
                                str6 = this.J.description;
                                if (str6 == null) {
                                }
                                r72 = z13;
                                if (this.J.url != null) {
                                }
                                document = this.L;
                                if (document != null) {
                                }
                            }
                        } catch (Exception e7) {
                            e = e7;
                            f12 = 4.0f;
                        }
                        z70Var.a(this.J.title);
                    } else {
                        f11 = 12.0f;
                        f12 = 4.0f;
                    }
                    str6 = this.J.description;
                    if (str6 == null) {
                        try {
                        } catch (Exception e10) {
                            e = e10;
                            f10 = 1.0f;
                            z70Var2 = z70Var;
                        }
                        try {
                            z12 = true;
                            c10 = ' ';
                            z70Var2 = z70Var;
                            f10 = 1.0f;
                        } catch (Exception e11) {
                            e = e11;
                            z70Var2 = z70Var;
                            f10 = 1.0f;
                            z12 = true;
                            c10 = ' ';
                            org.telegram.messenger.f8.g(e, z12);
                            z13 = z12;
                            r72 = z13;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                        try {
                            StaticLayout F1 = q1.F1(org.telegram.messenger.k6.m(str6, org.telegram.ui.ActionBar.t6.g3.getFontMetricsInt(), false, null, 0), org.telegram.ui.ActionBar.t6.g3, L3, L3, 0, 3);
                            this.I = F1;
                            z13 = z12;
                            if (F1.getLineCount() > 0) {
                                int i17 = this.H;
                                StaticLayout staticLayout = this.I;
                                this.D = i17 + staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + org.telegram.messenger.i0.L(1.0f);
                                z13 = z12;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            org.telegram.messenger.f8.g(e, z12);
                            z13 = z12;
                            r72 = z13;
                            if (this.J.url != null) {
                            }
                            document = this.L;
                            if (document != null) {
                            }
                        }
                    } else {
                        f10 = 1.0f;
                        z70Var2 = z70Var;
                        z13 = true;
                        c10 = ' ';
                    }
                    r72 = z13;
                    if (this.J.url != null) {
                        try {
                            this.E = new StaticLayout(TextUtils.ellipsize(this.J.url.replace('\n', c10), org.telegram.ui.ActionBar.t6.g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.t6.g3.measureText(r0)), L3), TextUtils.TruncateAt.MIDDLE), org.telegram.ui.ActionBar.t6.g3, L3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r72 = z13;
                        } catch (Exception e13) {
                            org.telegram.messenger.f8.g(e13, z13);
                            r72 = z13;
                        }
                    }
                }
                document = this.L;
                if (document != null) {
                    if (this.y || jj.s3(document, false)) {
                        this.O = org.telegram.messenger.b8.w(this.L.thumbs, 90, false, null, r72);
                    } else {
                        if (jj.u4(this.L) || jj.K2(this.L, r72)) {
                            this.O = org.telegram.messenger.b8.w(this.L.thumbs, 90, false, null, r72);
                            str = "webp";
                            w9 = null;
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
                                    if (tL_webDocument == null && this.O == null && w9 == null) {
                                        botInlineMessage = this.J.send_message;
                                        if (!(botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                                            TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                                            double d = geoPoint.lat;
                                            i12 = 3;
                                            arrayList3 = arrayList;
                                            double d10 = geoPoint._long;
                                            if (vp.r1(this.d).m3 != 2) {
                                                b30Var = b30.b(this.J.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.p)));
                                                str2 = null;
                                            } else {
                                                str2 = org.telegram.messenger.i0.e0(this.d, d, d10, 72, 72, true, 15, -1);
                                                b30Var = null;
                                            }
                                            if (tL_webDocument != null) {
                                                b30Var = b30.c(tL_webDocument);
                                            }
                                        }
                                    }
                                    i12 = 3;
                                    arrayList3 = arrayList;
                                    b30Var = null;
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
                                    double d11 = geoPoint2.lat;
                                    i12 = 3;
                                    arrayList3 = arrayList;
                                    double d102 = geoPoint2._long;
                                    if (vp.r1(this.d).m3 != 2) {
                                    }
                                    if (tL_webDocument != null) {
                                    }
                                }
                                i12 = 3;
                                arrayList3 = arrayList;
                                b30Var = null;
                                str2 = null;
                                if (tL_webDocument != null) {
                                }
                            } else {
                                i12 = 3;
                                arrayList3 = arrayList;
                                b30Var = null;
                                str2 = null;
                            }
                            if (this.L != null) {
                                for (int i18 = 0; i18 < this.L.attributes.size(); i18++) {
                                    TLRPC.DocumentAttribute documentAttribute = this.L.attributes.get(i18);
                                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                        i13 = documentAttribute.w;
                                        i14 = documentAttribute.h;
                                        break;
                                    }
                                }
                            }
                            i13 = 0;
                            i14 = 0;
                            if (i13 != 0 || i14 == 0) {
                                photoSize = this.O;
                                if (photoSize == null) {
                                    if (w9 != null) {
                                        w9.size = -1;
                                    }
                                    i13 = photoSize.w;
                                    i14 = photoSize.h;
                                } else {
                                    TLRPC.BotInlineResult botInlineResult5 = this.J;
                                    if (botInlineResult5 != null) {
                                        int[] h12 = jj.h1(botInlineResult5);
                                        int i19 = h12[0];
                                        i14 = h12[r72];
                                        i13 = i19;
                                    }
                                }
                            }
                            if (i13 != 0 || i14 == 0) {
                                i13 = org.telegram.messenger.i0.L(80.0f);
                                i14 = i13;
                            }
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null && this.O == null && b30Var == null && str2 == null) {
                                imageReceiver3 = imageReceiver;
                            } else {
                                if (this.Q) {
                                    str3 = "52_52_b";
                                    str4 = "52_52";
                                } else {
                                    int min = Math.min(i13, i14) / 3;
                                    if (this.P == 2) {
                                        Locale locale = Locale.US;
                                        String k11 = a1.g.k((int) (min / org.telegram.messenger.i0.p), "_80_b");
                                        int i20 = tz.a;
                                        if (sc.e(2048) || this.x) {
                                            str4 = k11;
                                            str3 = str4;
                                        } else {
                                            concat = k11.concat("_firstframe");
                                            k10 = k11.concat("_firstframe");
                                        }
                                    } else {
                                        Locale locale2 = Locale.US;
                                        k10 = a1.g.k((int) (min / org.telegram.messenger.i0.p), "_80");
                                        concat = k10.concat("_b");
                                    }
                                    str4 = k10;
                                    str3 = concat;
                                }
                                imageReceiver.R0 = this.P != 6 ? r72 : false;
                                R = org.telegram.messenger.b8.R(arrayList3);
                                if (R != null) {
                                    TLRPC.Document document3 = this.L;
                                    if (document3 != null) {
                                        i15 = ic.c(R, document3);
                                    } else {
                                        TLRPC.Photo photo = this.N;
                                        if (photo != null) {
                                            i15 = ic.i(R, photo);
                                        }
                                    }
                                    icVar = i15;
                                    if (this.P == 2) {
                                        TLRPC.Document document4 = this.L;
                                        if (document4 != null) {
                                            TLRPC.VideoSize J0 = jj.J0(document4);
                                            if (J0 != null) {
                                                ic d12 = ic.d(J0, this.L);
                                                StringBuilder sb2 = new StringBuilder("100_100");
                                                int i21 = tz.a;
                                                sb2.append((sc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2 = imageReceiver;
                                                imageReceiver2.u0(d12, sb2.toString(), ic.c(this.O, this.L), str4, icVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2 = imageReceiver;
                                                ic b10 = ic.b(this.L);
                                                if (this.y) {
                                                    b10.p = 2;
                                                }
                                                StringBuilder sb3 = new StringBuilder("100_100");
                                                int i22 = tz.a;
                                                sb3.append((sc.e(2048) || this.x) ? "" : "_firstframe");
                                                imageReceiver2.u0(b10, sb3.toString(), ic.c(this.O, this.L), str4, icVar, str3, null, this.L.size, str, this.e, 0);
                                            }
                                        } else {
                                            imageReceiver2 = imageReceiver;
                                            if (b30Var != null) {
                                                imageReceiver2.u0(ic.p(b30Var), "100_100", ic.i(this.O, this.N), str4, icVar, str3, null, -1L, str, this.e, 1);
                                            } else {
                                                imageReceiver2.u0(ic.g(str2), "100_100", ic.i(this.O, this.N), str4, icVar, str3, null, -1L, str, this.e, 1);
                                            }
                                        }
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                        if (this.O != null) {
                                            c00 f14 = org.telegram.messenger.v5.f(this.L, org.telegram.ui.ActionBar.t6.a7, f10, null);
                                            if (!jj.p(this.L)) {
                                                TLRPC.Document document5 = this.L;
                                                if (document5 == null) {
                                                    imageReceiver2.u0(ic.i(this.O, this.N), str4, ic.i(w9, this.N), str3, icVar, str3, null, this.O.size, str, this.e, 0);
                                                } else if (f14 != null) {
                                                    imageReceiver2.u0(ic.c(this.O, document5), str4, null, null, icVar, str3, f14, this.O.size, str, this.e, 0);
                                                } else {
                                                    imageReceiver2.u0(ic.c(this.O, document5), str4, ic.i(w9, this.N), str3, icVar, str3, null, this.O.size, str, this.e, 0);
                                                }
                                            } else if (f14 != null) {
                                                imageReceiver2.u0(ic.b(this.L), "80_80", null, null, icVar, str3, f14, this.O.size, str, this.e, 0);
                                            } else {
                                                imageReceiver2.u0(ic.b(this.L), "80_80", ic.c(this.O, this.L), str3, icVar, str3, null, this.O.size, str, this.e, 0);
                                            }
                                        } else if (b30Var != null) {
                                            imageReceiver2.u0(ic.p(b30Var), str4, ic.i(w9, this.N), str3, icVar, str3, null, -1L, str, this.e, 1);
                                        } else {
                                            imageReceiver2.u0(ic.g(str2), str4, ic.i(w9, this.N), str3, icVar, str3, null, -1L, str, this.e, 1);
                                        }
                                    }
                                    imageReceiver3 = imageReceiver2;
                                    int i23 = tz.a;
                                    if (!sc.e(2048) || this.x) {
                                        imageReceiver3.t0 = r72;
                                        imageReceiver3.P0(false);
                                    } else {
                                        imageReceiver3.t0 = false;
                                        imageReceiver3.Q0();
                                    }
                                    this.b = r72;
                                }
                                icVar = null;
                                if (this.P == 2) {
                                }
                                imageReceiver3 = imageReceiver2;
                                int i232 = tz.a;
                                if (sc.e(2048)) {
                                }
                                imageReceiver3.t0 = r72;
                                imageReceiver3.P0(false);
                                this.b = r72;
                            }
                            z11 = this.Q;
                            RadialProgress2 radialProgress2 = this.W;
                            if (z11) {
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
                                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(16.0f, Math.max(org.telegram.messenger.i0.L(52.0f), i16), org.telegram.messenger.i0.L(68.0f)) + (this.n ? 1 : 0));
                                int L4 = org.telegram.messenger.i0.L(52.0f);
                                if (cd.X) {
                                    f13 = 8.0f;
                                    L = org.telegram.messenger.m5.z(8.0f, View.MeasureSpec.getSize(i10), L4);
                                } else {
                                    f13 = 8.0f;
                                    L = org.telegram.messenger.i0.L(8.0f);
                                }
                                z70Var2.setBounds(L, org.telegram.messenger.i0.L(f13), L + L4, org.telegram.messenger.i0.L(60.0f));
                                float f15 = L4;
                                imageReceiver3.y0(L, org.telegram.messenger.i0.L(f13), f15, f15);
                                int i24 = this.P;
                                if (i24 == i12 || i24 == 5) {
                                    radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
                                    radialProgress2.r(org.telegram.messenger.i0.L(f12) + L, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(48.0f) + L, org.telegram.messenger.i0.L(56.0f));
                                }
                            } else {
                                int size3 = View.MeasureSpec.getSize(i11);
                                if (size3 == 0) {
                                    size3 = org.telegram.messenger.i0.L(f7);
                                }
                                setMeasuredDimension(size2, size3);
                                int y3 = z20.y(24.0f, size2, 2);
                                int y10 = z20.y(24.0f, size3, 2);
                                radialProgress2.r(y3, y10, org.telegram.messenger.i0.L(24.0f) + y3, org.telegram.messenger.i0.L(24.0f) + y10);
                                radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(f11));
                                imageReceiver3.y0(0.0f, 0.0f, size2, size3);
                            }
                            epVar = this.b0;
                            if (epVar == null) {
                                measureChildWithMargins(epVar, i10, 0, i11, 0);
                                return;
                            }
                            return;
                        }
                        int i25 = this.P;
                        if (i25 != 5 && i25 != 3) {
                            this.O = org.telegram.messenger.b8.w(this.L.thumbs, 90, false, null, r72);
                        }
                    }
                    w9 = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i13 = 0;
                    i14 = 0;
                    if (i13 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i13 != 0) {
                    }
                    i13 = org.telegram.messenger.i0.L(80.0f);
                    i14 = i13;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.Q) {
                    }
                    imageReceiver.R0 = this.P != 6 ? r72 : false;
                    R = org.telegram.messenger.b8.R(arrayList3);
                    if (R != null) {
                    }
                    icVar = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i2322 = tz.a;
                    if (sc.e(2048)) {
                    }
                    imageReceiver3.t0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z11 = this.Q;
                    RadialProgress2 radialProgress22 = this.W;
                    if (z11) {
                    }
                    epVar = this.b0;
                    if (epVar == null) {
                    }
                } else {
                    TLRPC.BotInlineResult botInlineResult6 = this.J;
                    if (botInlineResult6 != null && botInlineResult6.photo != null) {
                        this.O = org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), r72, null, r72);
                        w9 = org.telegram.messenger.b8.w(arrayList, 80, false, null, r72);
                        if (w9 != this.O) {
                            str = null;
                            botInlineResult = this.J;
                            if (botInlineResult == null) {
                            }
                            if (this.L != null) {
                            }
                            i13 = 0;
                            i14 = 0;
                            if (i13 != 0) {
                            }
                            photoSize = this.O;
                            if (photoSize == null) {
                            }
                            if (i13 != 0) {
                            }
                            i13 = org.telegram.messenger.i0.L(80.0f);
                            i14 = i13;
                            document2 = this.L;
                            imageReceiver = this.a;
                            if (document2 != null) {
                            }
                            if (this.Q) {
                            }
                            imageReceiver.R0 = this.P != 6 ? r72 : false;
                            R = org.telegram.messenger.b8.R(arrayList3);
                            if (R != null) {
                            }
                            icVar = null;
                            if (this.P == 2) {
                            }
                            imageReceiver3 = imageReceiver2;
                            int i23222 = tz.a;
                            if (sc.e(2048)) {
                            }
                            imageReceiver3.t0 = r72;
                            imageReceiver3.P0(false);
                            this.b = r72;
                            z11 = this.Q;
                            RadialProgress2 radialProgress222 = this.W;
                            if (z11) {
                            }
                            epVar = this.b0;
                            if (epVar == null) {
                            }
                        }
                    }
                    w9 = null;
                    str = null;
                    botInlineResult = this.J;
                    if (botInlineResult == null) {
                    }
                    if (this.L != null) {
                    }
                    i13 = 0;
                    i14 = 0;
                    if (i13 != 0) {
                    }
                    photoSize = this.O;
                    if (photoSize == null) {
                    }
                    if (i13 != 0) {
                    }
                    i13 = org.telegram.messenger.i0.L(80.0f);
                    i14 = i13;
                    document2 = this.L;
                    imageReceiver = this.a;
                    if (document2 != null) {
                    }
                    if (this.Q) {
                    }
                    imageReceiver.R0 = this.P != 6 ? r72 : false;
                    R = org.telegram.messenger.b8.R(arrayList3);
                    if (R != null) {
                    }
                    icVar = null;
                    if (this.P == 2) {
                    }
                    imageReceiver3 = imageReceiver2;
                    int i232222 = tz.a;
                    if (sc.e(2048)) {
                    }
                    imageReceiver3.t0 = r72;
                    imageReceiver3.P0(false);
                    this.b = r72;
                    z11 = this.Q;
                    RadialProgress2 radialProgress2222 = this.W;
                    if (z11) {
                    }
                    epVar = this.b0;
                    if (epVar == null) {
                    }
                }
            } else {
                arrayList2 = new ArrayList(this.J.photo.sizes);
            }
        }
        arrayList = arrayList2;
        z10 = this.Q;
        z70Var = this.c;
        if (z10) {
        }
        f7 = 100.0f;
        f10 = 1.0f;
        z70Var2 = z70Var;
        r72 = 1;
        f11 = 12.0f;
        f12 = 4.0f;
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
        int y3 = (int) motionEvent.getY();
        org.telegram.messenger.i0.L(48.0f);
        int i10 = this.P;
        z70 z70Var = this.c;
        boolean z10 = true;
        if (i10 == 3 || i10 == 5) {
            boolean contains = z70Var.getBounds().contains(x10, y3);
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
            z10 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.J;
            if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                if (motionEvent.getAction() == 0) {
                    if (z70Var.getBounds().contains(x10, y3)) {
                        this.r = true;
                    }
                } else if (this.r) {
                    if (motionEvent.getAction() == 1) {
                        this.r = false;
                        playSoundEffect(0);
                        ((zf.l0) this.c0).a.V.b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.r = false;
                    } else if (motionEvent.getAction() == 2 && !z70Var.getBounds().contains(x10, y3)) {
                        this.r = false;
                    }
                }
            }
            z10 = false;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 != 16 || ((i11 = this.P) != 3 && i11 != 5)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z10) {
        this.w = z10;
    }

    public void setDelegate(g2 g2Var) {
        this.c0 = g2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.x = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        dc dcVar = this.d0;
        if (dcVar != null) {
            dcVar.c(z10 || this.a0);
        }
    }

    public void setScaled(boolean z10) {
        this.a0 = z10;
        dc dcVar = this.d0;
        if (dcVar != null) {
            dcVar.c(isPressed() || this.a0);
        }
    }

    public h2(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        int i10 = d20.s0;
        this.d = i10;
        this.F = org.telegram.messenger.i0.L(7.0f);
        this.H = org.telegram.messenger.i0.L(27.0f);
        this.h0 = 1.0f;
        this.i0 = new f2(0, this);
        this.f = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.E0(1);
        imageReceiver.v0 = true;
        this.c = new z70(0, p6Var);
        this.W = new RadialProgress2(this, null);
        this.U = org.telegram.messenger.b6.q(i10).k();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.T = paint;
            int i11 = org.telegram.ui.ActionBar.t6.zi;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            ep epVar = new ep(21, context, p6Var);
            this.b0 = epVar;
            epVar.setVisibility(4);
            epVar.b(-1, i11, org.telegram.ui.ActionBar.t6.k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(1);
            addView(epVar, w7.b6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
