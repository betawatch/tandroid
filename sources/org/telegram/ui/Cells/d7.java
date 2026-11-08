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
import bi.dd;
import bi.md;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class d7 extends FrameLayout implements ls {
    public final org.telegram.ui.ActionBar.f6 D;
    public final org.telegram.ui.Components.w5 E;
    public boolean F;
    public final org.telegram.ui.Components.w5 G;
    public long H;
    public ug.y0 I;
    public Drawable J;
    public final Paint K;
    public long L;
    public my0 M;
    public final org.telegram.ui.Components.l9 a;
    public final md b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final b7 e;
    public c7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public d7(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.y = p10.s0;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.G = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.K = new Paint();
        this.D = f6Var;
        this.e = new b7(this, f6Var, 0);
        setWillNotDraw(false);
        this.n = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(l9Var, c8.ha.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(l9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        md mdVar = new md(context, 8);
        this.b = mdVar;
        qs.i(mdVar);
        org.telegram.ui.ActionBar.r6.V(mdVar, this.F ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, f6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(2);
        mdVar.setGravity(49);
        mdVar.setLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(mdVar, c8.ha.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.j5, f6Var);
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(k5Var, c8.ha.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        wo woVar = new wo(21, context, f6Var);
        this.d = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(4);
        woVar.setProgressDelegate(new ca(this, 5));
        addView(woVar, c8.ha.d(24, 24.0f, 49, 19.0f, i7 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
    }

    public String a() {
        return id.M0(2131750489, null);
    }

    public final void b(boolean z9, boolean z10) {
        this.d.a(z9, z10);
        if (z9) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j3, boolean z9, CharSequence charSequence) {
        b7 b7Var = this.e;
        b7Var.p = 1.0f;
        org.telegram.ui.Components.l9 l9Var = this.a;
        md mdVar = this.b;
        if (j3 == Long.MAX_VALUE) {
            mdVar.setText(a());
            if (this.f == null) {
                this.f = new c7(getContext(), l9Var, true, R.drawable.large_repost_story, this.D);
            }
            l9Var.j(null, null, this.f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j3);
            org.telegram.ui.Components.w5 w5Var = this.G;
            org.telegram.ui.Components.w5 w5Var2 = this.E;
            int i7 = this.y;
            if (E) {
                this.h = qp.s1(i7).a2(Long.valueOf(j3));
                TL_account.RequirementToContact J2 = qp.s1(i7).J2(j3);
                this.F = J2 instanceof TL_account.requirementToContactPremium;
                this.H = org.telegram.messenger.m5.k(J2);
                org.telegram.ui.ActionBar.r6.V(mdVar, this.F ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, this.D);
                w5Var2.a(this.F);
                w5Var.a(this.H > 0);
                invalidate();
                b7Var.r(this.h);
                int i10 = this.n;
                if (i10 != 2 && t10.z(this.h)) {
                    mdVar.setText(id.M0(2131746267, null));
                    b7Var.g(12);
                    l9Var.j(null, null, b7Var, this.h);
                } else if (i10 == 2 || !t10.B(this.h)) {
                    if (charSequence != null) {
                        mdVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            mdVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            mdVar.setText("");
                        }
                    }
                    l9Var.e(this.h, b7Var);
                } else {
                    mdVar.setText(id.M0(2131745904, null));
                    b7Var.g(1);
                    l9Var.j(null, null, b7Var, this.h);
                }
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.F = false;
                w5Var2.e(true, 0.0f);
                this.H = qp.s1(i7).N1(j3);
                w5Var.getClass();
                w5Var.e(true, 0.0f);
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                if (charSequence != null) {
                    mdVar.setText(charSequence);
                } else if (M0 == null) {
                    mdVar.setText("");
                } else if (M0.monoforum) {
                    mdVar.setText(qg.d.i(i7, M0, false));
                } else {
                    mdVar.setText(M0.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    qg.d.o(i7, M0, b7Var, l9Var);
                } else {
                    b7Var.q(M0);
                    l9Var.e(M0, b7Var);
                }
                l9Var.setRoundRadius((M0 == null || !(M0.forum || M0.monoforum)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
            }
        }
        this.w = j3;
        this.d.a(z9, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z9, boolean z10) {
        boolean z11 = this.x;
        boolean z12 = tL_forumTopic != null;
        if (z11 == z12 && z10) {
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        r1.g gVar = (r1.g) k5Var.getTag(R.id.spring_tag);
        if (gVar != null) {
            gVar.d();
        }
        if (z12) {
            if (z9) {
                k5Var.l(qp.s1(this.y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                k5Var.l(qg.d.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        if (z10) {
            r1.g gVar2 = new r1.g(new r1.f(z12 ? 0.0f : 1000.0f));
            r1.h hVar = new r1.h(z12 ? 1000.0f : 0.0f);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            gVar2.b(new r1.d() { // from class: org.telegram.ui.Cells.z6
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    d7 d7Var = d7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = d7Var.c;
                    k5Var2.setAlpha(f12);
                    md mdVar = d7Var.b;
                    float f13 = 1.0f - f12;
                    mdVar.setAlpha(f13);
                    k5Var2.setTranslationX(f13 * (-org.telegram.messenger.g0.L(10.0f)));
                    mdVar.setTranslationX(f12 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() { // from class: org.telegram.ui.Cells.a7
                @Override // r1.c
                public final void a(r1.g gVar3, boolean z13, float f10, float f11) {
                    d7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            k5Var.setTag(R.id.spring_tag, gVar2);
            gVar2.h();
        } else {
            md mdVar = this.b;
            if (z12) {
                k5Var.setAlpha(1.0f);
                mdVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                mdVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                mdVar.setAlpha(1.0f);
                k5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                mdVar.setTranslationX(0.0f);
            }
        }
        this.x = z12;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.i3) {
            TLRPC.User user = this.h;
            int i11 = this.y;
            TL_account.RequirementToContact J2 = user != null ? qp.s1(i11).J2(this.h.id) : null;
            long N1 = this.w < 0 ? qp.s1(i11).N1(this.w) : org.telegram.messenger.m5.k(J2);
            boolean z9 = J2 instanceof TL_account.requirementToContactPremium;
            if (this.F == z9 && this.H == N1) {
                return;
            }
            this.F = z9;
            this.H = N1;
            org.telegram.ui.ActionBar.r6.V(this.b, z9 ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, this.D);
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
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        float f12;
        boolean z9;
        float f13;
        my0 my0Var;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.l9 l9Var = this.a;
        if (view == l9Var && this.n != 2 && (user = this.h) != null && !qp.F2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.s;
            long j11 = j10 <= 17 ? j10 : 17L;
            this.s = elapsedRealtime;
            float d = this.G.d(this.H > 0);
            org.telegram.ui.ActionBar.f6 f6Var2 = this.D;
            if (d > 0.0f) {
                float measuredWidth = (l9Var.getMeasuredWidth() / 2.0f) + l9Var.getLeft() + org.telegram.messenger.g0.L(18.0f);
                float measuredHeight = ((l9Var.getMeasuredHeight() / 2.0f) + l9Var.getTop()) - org.telegram.messenger.g0.L(20.83f);
                if (this.M != null) {
                    f10 = 0.0f;
                    f12 = 5.0f;
                    long j12 = this.L;
                    f13 = measuredWidth;
                    long j13 = this.H;
                    if (j12 == j13 || j13 <= 0) {
                        my0 my0Var2 = this.M;
                        float L = (my0Var2 != null ? f10 : my0Var2.c) + org.telegram.messenger.g0.L(10.0f);
                        float L2 = org.telegram.messenger.g0.L(14.33f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f14 = L / 2.0f;
                        float f15 = f13 - f14;
                        float f16 = L2 / 2.0f;
                        rectF.set(f15, measuredHeight - f16, f13 + f14, f16 + measuredHeight);
                        rectF.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, f6Var2);
                        Paint paint = this.K;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, f6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        my0Var = this.M;
                        if (my0Var == null) {
                            float L3 = org.telegram.messenger.g0.L(f12) + f15;
                            f6Var = f6Var2;
                            f11 = 9.33f;
                            my0Var.c(L3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            f6Var = f6Var2;
                            f11 = 9.33f;
                        }
                    }
                } else {
                    f13 = measuredWidth;
                    f10 = 0.0f;
                    f12 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j14 = this.H;
                this.L = j14;
                sb2.append(org.telegram.messenger.g0.o0((int) j14, 0));
                this.M = new my0(dd.U0(sb2.toString(), 0.65f, null), 9.33f, org.telegram.messenger.g0.o());
                my0 my0Var22 = this.M;
                float L4 = (my0Var22 != null ? f10 : my0Var22.c) + org.telegram.messenger.g0.L(10.0f);
                float L22 = org.telegram.messenger.g0.L(14.33f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f142 = L4 / 2.0f;
                float f152 = f13 - f142;
                float f162 = L22 / 2.0f;
                rectF2.set(f152, measuredHeight - f162, f13 + f142, f162 + measuredHeight);
                rectF2.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                int w022 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, f6Var2);
                Paint paint2 = this.K;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, f6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                my0Var = this.M;
                if (my0Var == null) {
                }
            } else {
                f6Var = f6Var2;
                f10 = 0.0f;
                f11 = 9.33f;
                f12 = 5.0f;
            }
            float d2 = this.E.d(this.F);
            if (d2 > f10) {
                int bottom = l9Var.getBottom() - org.telegram.messenger.g0.L(9.0f);
                int right = l9Var.getRight() - org.telegram.messenger.g0.L(f11);
                canvas.save();
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var));
                float f17 = right;
                float f18 = bottom;
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(12.0f) * d2, org.telegram.ui.ActionBar.k6.t0);
                if (this.I == null) {
                    this.I = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.D);
                }
                this.I.d(right - org.telegram.messenger.g0.L(10.0f), 0.0f, bottom - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + right, 0.0f, org.telegram.messenger.g0.L(10.0f) + bottom);
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(10.0f) * d2, this.I.f);
                if (this.J == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.J = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.J.setBounds((int) (f17 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d2)), (int) (f18 - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * d2)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * d2) + f17), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * d2) + f18));
                this.J.setAlpha((int) (255.0f * d2));
                this.J.draw(canvas);
                canvas.restore();
            }
            if (!this.F) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i7 = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || qp.s1(i7).Z.containsKey(Long.valueOf(this.h.id))) {
                        z9 = true;
                        if (!z9 || this.r != f10) {
                            int bottom2 = l9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
                            int right2 = l9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
                            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var));
                            float f19 = right2;
                            float f20 = bottom2;
                            float f21 = 1.0f - d2;
                            float f22 = 1.0f - d;
                            canvas.drawCircle(f19, f20, org.telegram.messenger.g0.L(7.0f) * this.r * f21 * f22, org.telegram.ui.ActionBar.k6.t0);
                            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, f6Var));
                            canvas.drawCircle(f19, f20, com.google.android.recaptcha.internal.a.D(org.telegram.messenger.g0.L(f12), this.r, f21, f22), org.telegram.ui.ActionBar.k6.t0);
                            if (z9) {
                                float f23 = this.r;
                                if (f23 > f10) {
                                    float f24 = f23 - (j11 / 150.0f);
                                    this.r = f24;
                                    if (f24 < f10) {
                                        this.r = f10;
                                    }
                                    l9Var.invalidate();
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
                                    l9Var.invalidate();
                                    invalidate();
                                    return drawChild;
                                }
                            }
                        }
                    }
                }
            }
            z9 = false;
            if (!z9) {
            }
            int bottom22 = l9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
            int right22 = l9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var));
            float f192 = right22;
            float f202 = bottom22;
            float f212 = 1.0f - d2;
            float f222 = 1.0f - d;
            canvas.drawCircle(f192, f202, org.telegram.messenger.g0.L(7.0f) * this.r * f212 * f222, org.telegram.ui.ActionBar.k6.t0);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, f6Var));
            canvas.drawCircle(f192, f202, com.google.android.recaptcha.internal.a.D(org.telegram.messenger.g0.L(f12), this.r, f212, f222), org.telegram.ui.ActionBar.k6.t0);
            if (z9) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.y).c(this, qs.i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.y).n(this, qs.i3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.l9 l9Var = this.a;
        int measuredWidth = (l9Var.getMeasuredWidth() / 2) + l9Var.getLeft();
        int measuredHeight = (l9Var.getMeasuredHeight() / 2) + l9Var.getTop();
        org.telegram.ui.ActionBar.k6.o0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, this.D));
        org.telegram.ui.ActionBar.k6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = org.telegram.messenger.g0.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, l9Var.getRoundRadius()[0], l9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.k6.o0);
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
