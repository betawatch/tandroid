package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import di.pb;
import di.xb;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class d7 extends FrameLayout implements fs {
    public final org.telegram.ui.ActionBar.i6 E;
    public final org.telegram.ui.Components.c6 F;
    public boolean G;
    public final org.telegram.ui.Components.c6 H;
    public long I;
    public ug.a1 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public wy0 N;
    public final org.telegram.ui.Components.p9 a;
    public final xb b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final lp d;
    public final b7 e;
    public c7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public d7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.y = i10.t0;
        kr krVar = kr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.H = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.L = new Paint();
        this.E = i6Var;
        this.e = new b7(this, i6Var, 0);
        setWillNotDraw(false);
        this.n = i7;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(p9Var, c8.na.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(p9Var, c8.na.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        xb xbVar = new xb(context, 8);
        this.b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, this.G ? org.telegram.ui.ActionBar.n6.C6 : org.telegram.ui.ActionBar.n6.j5, i6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(2);
        xbVar.setGravity(49);
        xbVar.setLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, c8.na.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        n5Var.setTextSize(12);
        n5Var.setMaxLines(2);
        n5Var.setGravity(49);
        n5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(n5Var, c8.na.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        lp lpVar = new lp(21, context, i6Var);
        this.d = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.h5, org.telegram.ui.ActionBar.n6.C5);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(4);
        lpVar.setProgressDelegate(new ea(this, 5));
        addView(lpVar, c8.na.d(24, 24.0f, 49, 19.0f, i7 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
    }

    public String a() {
        return gd.N0(2131750471, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j3, boolean z10, CharSequence charSequence) {
        b7 b7Var = this.e;
        b7Var.p = 1.0f;
        org.telegram.ui.Components.p9 p9Var = this.a;
        xb xbVar = this.b;
        if (j3 == Long.MAX_VALUE) {
            xbVar.setText(a());
            if (this.f == null) {
                this.f = new c7(getContext(), p9Var, true, R.drawable.large_repost_story, this.E);
            }
            p9Var.j(null, null, this.f, null);
        } else {
            boolean E = org.telegram.messenger.n5.E(j3);
            org.telegram.ui.Components.c6 c6Var = this.H;
            org.telegram.ui.Components.c6 c6Var2 = this.F;
            int i7 = this.y;
            if (E) {
                this.h = mp.u1(i7).c2(Long.valueOf(j3));
                TL_account.RequirementToContact P2 = mp.u1(i7).P2(j3);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.n5.k(P2);
                org.telegram.ui.ActionBar.u6.U(xbVar, this.G ? org.telegram.ui.ActionBar.n6.C6 : org.telegram.ui.ActionBar.n6.j5, this.E);
                c6Var2.a(this.G);
                c6Var.a(this.I > 0);
                invalidate();
                b7Var.r(this.h);
                int i10 = this.n;
                if (i10 != 2 && n10.A(this.h)) {
                    xbVar.setText(gd.N0(2131746070, null));
                    b7Var.g(12);
                    p9Var.j(null, null, b7Var, this.h);
                } else if (i10 == 2 || !n10.C(this.h)) {
                    if (charSequence != null) {
                        xbVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            xbVar.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        } else {
                            xbVar.setText("");
                        }
                    }
                    p9Var.f(this.h, b7Var);
                } else {
                    xbVar.setText(gd.N0(2131745705, null));
                    b7Var.g(1);
                    p9Var.j(null, null, b7Var, this.h);
                }
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                c6Var2.e(true, 0.0f);
                this.I = mp.u1(i7).P1(j3);
                c6Var.getClass();
                c6Var.e(true, 0.0f);
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                if (charSequence != null) {
                    xbVar.setText(charSequence);
                } else if (O0 == null) {
                    xbVar.setText("");
                } else if (O0.monoforum) {
                    xbVar.setText(qg.c.j(i7, O0, false));
                } else {
                    xbVar.setText(O0.title);
                }
                if (org.telegram.messenger.v3.p0(O0)) {
                    qg.c.p(i7, O0, b7Var, p9Var);
                } else {
                    b7Var.q(O0);
                    p9Var.f(O0, b7Var);
                }
                p9Var.setRoundRadius((O0 == null || !(O0.forum || O0.monoforum)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
            }
        }
        this.w = j3;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12 = this.x;
        boolean z13 = tL_forumTopic != null;
        if (z12 == z13 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        r1.g gVar = (r1.g) n5Var.getTag(R.id.spring_tag);
        if (gVar != null) {
            gVar.d();
        }
        if (z13) {
            if (z10) {
                n5Var.l(mp.u1(this.y).D1(org.telegram.messenger.n5.o(tL_forumTopic.from_id), false), false);
            } else {
                n5Var.l(qg.c.k(tL_forumTopic, n5Var.getTextPaint(), null), false);
            }
            n5Var.requestLayout();
        }
        if (z11) {
            r1.g gVar2 = new r1.g(new r1.f(z13 ? 0.0f : 1000.0f));
            r1.h hVar = new r1.h(z13 ? 1000.0f : 0.0f);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            gVar2.b(new r1.d() { // from class: org.telegram.ui.Cells.z6
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.n5 n5Var2 = d7Var.c;
                    n5Var2.setAlpha(f12);
                    xb xbVar = d7Var.b;
                    float f13 = 1.0f - f12;
                    xbVar.setAlpha(f13);
                    n5Var2.setTranslationX(f13 * (-org.telegram.messenger.g0.L(10.0f)));
                    xbVar.setTranslationX(f12 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() { // from class: org.telegram.ui.Cells.a7
                @Override // r1.c
                public final void a(r1.g gVar3, boolean z14, float f10, float f11) {
                    d7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            n5Var.setTag(R.id.spring_tag, gVar2);
            gVar2.h();
        } else {
            xb xbVar = this.b;
            if (z13) {
                n5Var.setAlpha(1.0f);
                xbVar.setAlpha(0.0f);
                n5Var.setTranslationX(0.0f);
                xbVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                n5Var.setAlpha(0.0f);
                xbVar.setAlpha(1.0f);
                n5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                xbVar.setTranslationX(0.0f);
            }
        }
        this.x = z13;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.k3) {
            TLRPC.User user = this.h;
            int i11 = this.y;
            TL_account.RequirementToContact P2 = user != null ? mp.u1(i11).P2(this.h.id) : null;
            long P1 = this.w < 0 ? mp.u1(i11).P1(this.w) : org.telegram.messenger.n5.k(P2);
            boolean z10 = P2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z10 && this.I == P1) {
                return;
            }
            this.G = z10;
            this.I = P1;
            org.telegram.ui.ActionBar.u6.U(this.b, z10 ? org.telegram.ui.ActionBar.n6.C6 : org.telegram.ui.ActionBar.n6.j5, this.E);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.i6 i6Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        wy0 wy0Var;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.p9 p9Var = this.a;
        if (view == p9Var && this.n != 2 && (user = this.h) != null && !mp.L2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.s;
            long j11 = j10 <= 17 ? j10 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            org.telegram.ui.ActionBar.i6 i6Var2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (p9Var.getMeasuredWidth() / 2.0f) + p9Var.getLeft() + org.telegram.messenger.g0.L(18.0f);
                float measuredHeight = ((p9Var.getMeasuredHeight() / 2.0f) + p9Var.getTop()) - org.telegram.messenger.g0.L(20.83f);
                if (this.N != null) {
                    f10 = 0.0f;
                    f12 = 5.0f;
                    long j12 = this.M;
                    f13 = measuredWidth;
                    long j13 = this.I;
                    if (j12 == j13 || j13 <= 0) {
                        wy0 wy0Var2 = this.N;
                        float L = (wy0Var2 != null ? f10 : wy0Var2.c) + org.telegram.messenger.g0.L(10.0f);
                        float L2 = org.telegram.messenger.g0.L(14.33f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f14 = L / 2.0f;
                        float f15 = f13 - f14;
                        float f16 = L2 / 2.0f;
                        rectF.set(f15, measuredHeight - f16, f13 + f14, f16 + measuredHeight);
                        rectF.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var2);
                        Paint paint = this.L;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B5, i6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        wy0Var = this.N;
                        if (wy0Var == null) {
                            float L3 = org.telegram.messenger.g0.L(f12) + f15;
                            i6Var = i6Var2;
                            f11 = 9.33f;
                            wy0Var.c(L3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            i6Var = i6Var2;
                            f11 = 9.33f;
                        }
                    }
                } else {
                    f13 = measuredWidth;
                    f10 = 0.0f;
                    f12 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j14 = this.I;
                this.M = j14;
                sb2.append(org.telegram.messenger.g0.o0((int) j14, 0));
                this.N = new wy0(pb.U0(sb2.toString(), 0.65f, null), 9.33f, org.telegram.messenger.g0.o());
                wy0 wy0Var22 = this.N;
                float L4 = (wy0Var22 != null ? f10 : wy0Var22.c) + org.telegram.messenger.g0.L(10.0f);
                float L22 = org.telegram.messenger.g0.L(14.33f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f142 = L4 / 2.0f;
                float f152 = f13 - f142;
                float f162 = L22 / 2.0f;
                rectF2.set(f152, measuredHeight - f162, f13 + f142, f162 + measuredHeight);
                rectF2.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                int w022 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var2);
                Paint paint2 = this.L;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B5, i6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                wy0Var = this.N;
                if (wy0Var == null) {
                }
            } else {
                i6Var = i6Var2;
                f10 = 0.0f;
                f11 = 9.33f;
                f12 = 5.0f;
            }
            float d2 = this.F.d(this.G);
            if (d2 > f10) {
                int bottom = p9Var.getBottom() - org.telegram.messenger.g0.L(9.0f);
                int right = p9Var.getRight() - org.telegram.messenger.g0.L(f11);
                canvas.save();
                org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
                float f17 = right;
                float f18 = bottom;
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(12.0f) * d2, org.telegram.ui.ActionBar.n6.t0);
                if (this.J == null) {
                    this.J = new ug.a1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, this.E);
                }
                this.J.d(right - org.telegram.messenger.g0.L(10.0f), 0.0f, bottom - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + right, 0.0f, org.telegram.messenger.g0.L(10.0f) + bottom);
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(10.0f) * d2, this.J.f);
                if (this.K == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.K = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.K.setBounds((int) (f17 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d2)), (int) (f18 - (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f) * d2)), (int) (((this.K.getIntrinsicWidth() / 2.0f) * 0.875f * d2) + f17), (int) (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f * d2) + f18));
                this.K.setAlpha((int) (255.0f * d2));
                this.K.draw(canvas);
                canvas.restore();
            }
            if (!this.G) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i7 = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || mp.u1(i7).a0.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f10) {
                            int bottom2 = p9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
                            int right2 = p9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
                            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
                            float f19 = right2;
                            float f20 = bottom2;
                            float f21 = 1.0f - d2;
                            float f22 = 1.0f - d;
                            canvas.drawCircle(f19, f20, org.telegram.messenger.g0.L(7.0f) * this.r * f21 * f22, org.telegram.ui.ActionBar.n6.t0);
                            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.T8, i6Var));
                            canvas.drawCircle(f19, f20, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.g0.L(f12), this.r, f21, f22), org.telegram.ui.ActionBar.n6.t0);
                            if (z10) {
                                float f23 = this.r;
                                if (f23 > f10) {
                                    float f24 = f23 - (j11 / 150.0f);
                                    this.r = f24;
                                    if (f24 < f10) {
                                        this.r = f10;
                                    }
                                    p9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f25 = this.r;
                                if (f25 < 1.0f) {
                                    float f26 = (j11 / 150.0f) + f25;
                                    this.r = f26;
                                    if (f26 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    p9Var.invalidate();
                                    invalidate();
                                    return drawChild;
                                }
                            }
                        }
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
            int bottom22 = p9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
            int right22 = p9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
            float f192 = right22;
            float f202 = bottom22;
            float f212 = 1.0f - d2;
            float f222 = 1.0f - d;
            canvas.drawCircle(f192, f202, org.telegram.messenger.g0.L(7.0f) * this.r * f212 * f222, org.telegram.ui.ActionBar.n6.t0);
            org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.T8, i6Var));
            canvas.drawCircle(f192, f202, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.g0.L(f12), this.r, f212, f222), org.telegram.ui.ActionBar.n6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.y).c(this, ks.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.y).n(this, ks.k3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.p9 p9Var = this.a;
        int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        org.telegram.ui.ActionBar.n6.o0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B5, this.E));
        org.telegram.ui.ActionBar.n6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = org.telegram.messenger.g0.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, p9Var.getRoundRadius()[0], p9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.n6.o0);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.a.q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
