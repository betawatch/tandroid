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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h7 extends FrameLayout implements us {
    public final org.telegram.ui.ActionBar.p6 D;
    public final org.telegram.ui.Components.t5 E;
    public boolean F;
    public final org.telegram.ui.Components.t5 G;
    public long H;
    public kg.k1 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public qz0 M;
    public final org.telegram.ui.Components.g9 a;
    public final ag.j3 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final ep d;
    public final f7 e;
    public g7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public h7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.y = d20.s0;
        gr grVar = gr.h;
        this.E = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.G = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.K = new Paint();
        this.D = p6Var;
        this.e = new f7(this, p6Var, 0);
        setWillNotDraw(false);
        this.n = i10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        if (i10 == 2) {
            addView(g9Var, w7.b6.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(g9Var, w7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ag.j3 j3Var = new ag.j3(context, 5);
        this.b = j3Var;
        zs.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, this.F ? org.telegram.ui.ActionBar.t6.C6 : org.telegram.ui.ActionBar.t6.j5, p6Var);
        j3Var.setTextSize(1, 12.0f);
        j3Var.setMaxLines(2);
        j3Var.setGravity(49);
        j3Var.setLines(2);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(j3Var, w7.b6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.j5, p6Var);
        u5Var.setTextSize(12);
        u5Var.setMaxLines(2);
        u5Var.setGravity(49);
        u5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(u5Var, w7.b6.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        ep epVar = new ep(21, context, p6Var);
        this.d = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.B5, org.telegram.ui.ActionBar.t6.h5, org.telegram.ui.ActionBar.t6.C5);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(4);
        epVar.setProgressDelegate(new ca(this, 5));
        addView(epVar, w7.b6.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, p6Var);
    }

    public String a() {
        return cd.L0(2131750497, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        f7 f7Var = this.e;
        f7Var.p = 1.0f;
        org.telegram.ui.Components.g9 g9Var = this.a;
        ag.j3 j3Var = this.b;
        if (j10 == Long.MAX_VALUE) {
            j3Var.setText(a());
            if (this.f == null) {
                this.f = new g7(getContext(), g9Var, true, R.drawable.large_repost_story, this.D);
            }
            g9Var.j(null, null, this.f, null);
        } else {
            boolean E = org.telegram.messenger.o5.E(j10);
            org.telegram.ui.Components.t5 t5Var = this.G;
            org.telegram.ui.Components.t5 t5Var2 = this.E;
            int i10 = this.y;
            if (E) {
                this.h = vp.r1(i10).Z1(Long.valueOf(j10));
                TL_account.RequirementToContact H2 = vp.r1(i10).H2(j10);
                this.F = H2 instanceof TL_account.requirementToContactPremium;
                this.H = org.telegram.messenger.o5.k(H2);
                org.telegram.ui.ActionBar.a7.V(j3Var, this.F ? org.telegram.ui.ActionBar.t6.C6 : org.telegram.ui.ActionBar.t6.j5, this.D);
                t5Var2.a(this.F);
                t5Var.a(this.H > 0);
                invalidate();
                f7Var.r(this.h);
                int i11 = this.n;
                if (i11 != 2 && h20.z(this.h)) {
                    j3Var.setText(cd.L0(2131746281, null));
                    f7Var.g(12);
                    g9Var.j(null, null, f7Var, this.h);
                } else if (i11 == 2 || !h20.B(this.h)) {
                    if (charSequence != null) {
                        j3Var.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            j3Var.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                        } else {
                            j3Var.setText("");
                        }
                    }
                    g9Var.e(this.h, f7Var);
                } else {
                    j3Var.setText(cd.L0(2131745918, null));
                    f7Var.g(1);
                    g9Var.j(null, null, f7Var, this.h);
                }
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
            } else {
                this.h = null;
                this.F = false;
                t5Var2.e(true, 0.0f);
                this.H = vp.r1(i10).M1(j10);
                t5Var.getClass();
                t5Var.e(true, 0.0f);
                TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
                if (charSequence != null) {
                    j3Var.setText(charSequence);
                } else if (L0 == null) {
                    j3Var.setText("");
                } else if (L0.monoforum) {
                    j3Var.setText(gg.e.i(i10, L0, false));
                } else {
                    j3Var.setText(L0.title);
                }
                if (org.telegram.messenger.w3.p0(L0)) {
                    gg.e.o(i10, L0, f7Var, g9Var);
                } else {
                    f7Var.q(L0);
                    g9Var.e(L0, f7Var);
                }
                g9Var.setRoundRadius((L0 == null || !(L0.forum || L0.monoforum)) ? org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(16.0f));
            }
        }
        this.w = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12 = this.x;
        boolean z13 = tL_forumTopic != null;
        if (z12 == z13 && z11) {
            return;
        }
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        o1.j jVar = (o1.j) u5Var.getTag(R.id.spring_tag);
        if (jVar != null) {
            jVar.d();
        }
        if (z13) {
            if (z10) {
                u5Var.l(vp.r1(this.y).A1(org.telegram.messenger.o5.o(tL_forumTopic.from_id), false), false);
            } else {
                u5Var.l(gg.e.j(tL_forumTopic, u5Var.getTextPaint(), null), false);
            }
            u5Var.requestLayout();
        }
        if (z11) {
            o1.j jVar2 = new o1.j(new o1.i(z13 ? 0.0f : 1000.0f));
            o1.k kVar = new o1.k(z13 ? 1000.0f : 0.0f);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.m = kVar;
            jVar2.b(new o1.g() { // from class: org.telegram.ui.Cells.d7
                @Override // o1.g
                public final void a(o1.j jVar3, float f7, float f10) {
                    float f11 = f7 / 1000.0f;
                    h7 h7Var = h7.this;
                    org.telegram.ui.ActionBar.u5 u5Var2 = h7Var.c;
                    u5Var2.setAlpha(f11);
                    ag.j3 j3Var = h7Var.b;
                    float f12 = 1.0f - f11;
                    j3Var.setAlpha(f12);
                    u5Var2.setTranslationX(f12 * (-org.telegram.messenger.i0.L(10.0f)));
                    j3Var.setTranslationX(f11 * org.telegram.messenger.i0.L(10.0f));
                }
            });
            jVar2.a(new o1.f() { // from class: org.telegram.ui.Cells.e7
                @Override // o1.f
                public final void a(o1.j jVar3, boolean z14, float f7, float f10) {
                    h7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            u5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.h();
        } else {
            ag.j3 j3Var = this.b;
            if (z13) {
                u5Var.setAlpha(1.0f);
                j3Var.setAlpha(0.0f);
                u5Var.setTranslationX(0.0f);
                j3Var.setTranslationX(org.telegram.messenger.i0.L(10.0f));
            } else {
                u5Var.setAlpha(0.0f);
                j3Var.setAlpha(1.0f);
                u5Var.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
                j3Var.setTranslationX(0.0f);
            }
        }
        this.x = z13;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.i3) {
            TLRPC.User user = this.h;
            int i12 = this.y;
            TL_account.RequirementToContact H2 = user != null ? vp.r1(i12).H2(this.h.id) : null;
            long M1 = this.w < 0 ? vp.r1(i12).M1(this.w) : org.telegram.messenger.o5.k(H2);
            boolean z10 = H2 instanceof TL_account.requirementToContactPremium;
            if (this.F == z10 && this.H == M1) {
                return;
            }
            this.F = z10;
            this.H = M1;
            org.telegram.ui.ActionBar.a7.V(this.b, z10 ? org.telegram.ui.ActionBar.t6.C6 : org.telegram.ui.ActionBar.t6.j5, this.D);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.p6 p6Var;
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        qz0 qz0Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.g9 g9Var = this.a;
        if (view == g9Var && this.n != 2 && (user = this.h) != null && !vp.E2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float d = this.G.d(this.H > 0);
            org.telegram.ui.ActionBar.p6 p6Var2 = this.D;
            if (d > 0.0f) {
                float measuredWidth = (g9Var.getMeasuredWidth() / 2.0f) + g9Var.getLeft() + org.telegram.messenger.i0.L(18.0f);
                float measuredHeight = ((g9Var.getMeasuredHeight() / 2.0f) + g9Var.getTop()) - org.telegram.messenger.i0.L(20.83f);
                if (this.M != null) {
                    f7 = 0.0f;
                    f11 = 5.0f;
                    long j13 = this.L;
                    f12 = measuredWidth;
                    long j14 = this.H;
                    if (j13 == j14 || j14 <= 0) {
                        qz0 qz0Var2 = this.M;
                        float L = (qz0Var2 != null ? f7 : qz0Var2.c) + org.telegram.messenger.i0.L(10.0f);
                        float L2 = org.telegram.messenger.i0.L(14.33f);
                        RectF rectF = org.telegram.messenger.i0.P;
                        float f13 = L / 2.0f;
                        float f14 = f12 - f13;
                        float f15 = L2 / 2.0f;
                        rectF.set(f14, measuredHeight - f15, f12 + f13, f15 + measuredHeight);
                        rectF.inset(-org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var2);
                        Paint paint = this.K;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B5, p6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        qz0Var = this.M;
                        if (qz0Var == null) {
                            float L3 = org.telegram.messenger.i0.L(f11) + f14;
                            p6Var = p6Var2;
                            f10 = 9.33f;
                            qz0Var.c(L3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            p6Var = p6Var2;
                            f10 = 9.33f;
                        }
                    }
                } else {
                    f12 = measuredWidth;
                    f7 = 0.0f;
                    f11 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.H;
                this.L = j15;
                sb2.append(org.telegram.messenger.i0.o0((int) j15, 0));
                this.M = new qz0(rh.h8.T0(sb2.toString(), 0.65f, null), 9.33f, org.telegram.messenger.i0.o());
                qz0 qz0Var22 = this.M;
                float L4 = (qz0Var22 != null ? f7 : qz0Var22.c) + org.telegram.messenger.i0.L(10.0f);
                float L22 = org.telegram.messenger.i0.L(14.33f);
                RectF rectF2 = org.telegram.messenger.i0.P;
                float f132 = L4 / 2.0f;
                float f142 = f12 - f132;
                float f152 = L22 / 2.0f;
                rectF2.set(f142, measuredHeight - f152, f12 + f132, f152 + measuredHeight);
                rectF2.inset(-org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(-1.33f));
                int w022 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var2);
                Paint paint2 = this.K;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B5, p6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                qz0Var = this.M;
                if (qz0Var == null) {
                }
            } else {
                p6Var = p6Var2;
                f7 = 0.0f;
                f10 = 9.33f;
                f11 = 5.0f;
            }
            float d10 = this.E.d(this.F);
            if (d10 > f7) {
                int bottom = g9Var.getBottom() - org.telegram.messenger.i0.L(9.0f);
                int right = g9Var.getRight() - org.telegram.messenger.i0.L(f10);
                canvas.save();
                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
                float f16 = right;
                float f17 = bottom;
                canvas.drawCircle(f16, f17, org.telegram.messenger.i0.L(12.0f) * d10, org.telegram.ui.ActionBar.t6.t0);
                if (this.I == null) {
                    this.I = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, this.D);
                }
                this.I.d(right - org.telegram.messenger.i0.L(10.0f), 0.0f, bottom - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f) + right, 0.0f, org.telegram.messenger.i0.L(10.0f) + bottom);
                canvas.drawCircle(f16, f17, org.telegram.messenger.i0.L(10.0f) * d10, this.I.f);
                if (this.J == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.J = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds((int) (f16 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d10)), (int) (f17 - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * d10)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * d10) + f16), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * d10) + f17));
                this.J.setAlpha((int) (255.0f * d10));
                this.J.draw(canvas);
                canvas.restore();
            }
            if (!this.F) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i10 = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || vp.r1(i10).Z.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f7) {
                            int bottom2 = g9Var.getBottom() - org.telegram.messenger.i0.L(6.0f);
                            int right2 = g9Var.getRight() - org.telegram.messenger.i0.L(10.0f);
                            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
                            float f18 = right2;
                            float f19 = bottom2;
                            float f20 = 1.0f - d10;
                            float f21 = 1.0f - d;
                            canvas.drawCircle(f18, f19, org.telegram.messenger.i0.L(7.0f) * this.r * f20 * f21, org.telegram.ui.ActionBar.t6.t0);
                            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T8, p6Var));
                            canvas.drawCircle(f18, f19, c3.i0.E(org.telegram.messenger.i0.L(f11), this.r, f20, f21), org.telegram.ui.ActionBar.t6.t0);
                            if (z10) {
                                float f22 = this.r;
                                if (f22 > f7) {
                                    float f23 = f22 - (j12 / 150.0f);
                                    this.r = f23;
                                    if (f23 < f7) {
                                        this.r = f7;
                                    }
                                    g9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f24 = this.r;
                                if (f24 < 1.0f) {
                                    float f25 = (j12 / 150.0f) + f24;
                                    this.r = f25;
                                    if (f25 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    g9Var.invalidate();
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
            int bottom22 = g9Var.getBottom() - org.telegram.messenger.i0.L(6.0f);
            int right22 = g9Var.getRight() - org.telegram.messenger.i0.L(10.0f);
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            float f182 = right22;
            float f192 = bottom22;
            float f202 = 1.0f - d10;
            float f212 = 1.0f - d;
            canvas.drawCircle(f182, f192, org.telegram.messenger.i0.L(7.0f) * this.r * f202 * f212, org.telegram.ui.ActionBar.t6.t0);
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.T8, p6Var));
            canvas.drawCircle(f182, f192, c3.i0.E(org.telegram.messenger.i0.L(f11), this.r, f202, f212), org.telegram.ui.ActionBar.t6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.y).c(this, zs.i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.y).n(this, zs.i3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.g9 g9Var = this.a;
        int measuredWidth = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
        int measuredHeight = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
        org.telegram.ui.ActionBar.t6.o0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B5, this.D));
        org.telegram.ui.ActionBar.t6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = org.telegram.messenger.i0.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, g9Var.getRoundRadius()[0], g9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.t6.o0);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
