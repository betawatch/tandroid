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
import b8.mf;
import ci.ec;
import ci.wb;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class c7 extends FrameLayout implements cs {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u5 F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public long I;
    public vg.x0 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public ly0 N;
    public final org.telegram.ui.Components.k9 a;
    public final ec b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final wo d;
    public final a7 e;
    public b7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public c7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.y = h10.t0;
        xq xqVar = xq.h;
        this.F = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.H = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.L = new Paint();
        this.E = e6Var;
        this.e = new a7(this, e6Var, 0);
        setWillNotDraw(false);
        this.n = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i3 == 2) {
            addView(k9Var, mf.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(k9Var, mf.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        ec ecVar = new ec(context, 8);
        this.b = ecVar;
        hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, this.G ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, e6Var);
        ecVar.setTextSize(1, 12.0f);
        ecVar.setMaxLines(2);
        ecVar.setGravity(49);
        ecVar.setLines(2);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(ecVar, mf.d(-1, -2.0f, 51, 6.0f, i3 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        k5Var.setTextSize(12);
        k5Var.setMaxLines(2);
        k5Var.setGravity(49);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(k5Var, mf.d(-1, -2.0f, 51, 6.0f, i3 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        wo woVar = new wo(21, context, e6Var);
        this.d = woVar;
        woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(4);
        woVar.setProgressDelegate(new ca(this, 5));
        addView(woVar, mf.d(24, 24.0f, 49, 19.0f, i3 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
    }

    public String a() {
        return bd.M0(2131750496, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        a7 a7Var = this.e;
        a7Var.p = 1.0f;
        org.telegram.ui.Components.k9 k9Var = this.a;
        ec ecVar = this.b;
        if (j10 == Long.MAX_VALUE) {
            ecVar.setText(a());
            if (this.f == null) {
                this.f = new b7(getContext(), k9Var, true, R.drawable.large_repost_story, this.E);
            }
            k9Var.j(null, null, this.f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j10);
            org.telegram.ui.Components.u5 u5Var = this.H;
            org.telegram.ui.Components.u5 u5Var2 = this.F;
            int i3 = this.y;
            if (E) {
                this.h = hp.s1(i3).a2(Long.valueOf(j10));
                TL_account.RequirementToContact J2 = hp.s1(i3).J2(j10);
                this.G = J2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.m5.k(J2);
                org.telegram.ui.ActionBar.r6.V(ecVar, this.G ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, this.E);
                u5Var2.a(this.G);
                u5Var.a(this.I > 0);
                invalidate();
                a7Var.r(this.h);
                int i10 = this.n;
                if (i10 != 2 && l10.z(this.h)) {
                    ecVar.setText(bd.M0(2131746274, null));
                    a7Var.g(12);
                    k9Var.j(null, null, a7Var, this.h);
                } else if (i10 == 2 || !l10.B(this.h)) {
                    if (charSequence != null) {
                        ecVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            ecVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            ecVar.setText("");
                        }
                    }
                    k9Var.e(this.h, a7Var);
                } else {
                    ecVar.setText(bd.M0(2131745911, null));
                    a7Var.g(1);
                    k9Var.j(null, null, a7Var, this.h);
                }
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                u5Var2.e(true, 0.0f);
                this.I = hp.s1(i3).N1(j10);
                u5Var.getClass();
                u5Var.e(true, 0.0f);
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                if (charSequence != null) {
                    ecVar.setText(charSequence);
                } else if (M0 == null) {
                    ecVar.setText("");
                } else if (M0.monoforum) {
                    ecVar.setText(rg.c.i(i3, M0, false));
                } else {
                    ecVar.setText(M0.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    rg.c.o(i3, M0, a7Var, k9Var);
                } else {
                    a7Var.q(M0);
                    k9Var.e(M0, a7Var);
                }
                k9Var.setRoundRadius((M0 == null || !(M0.forum || M0.monoforum)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
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
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        q1.g gVar = (q1.g) k5Var.getTag(R.id.spring_tag);
        if (gVar != null) {
            gVar.d();
        }
        if (z13) {
            if (z10) {
                k5Var.l(hp.s1(this.y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                k5Var.l(rg.c.j(tL_forumTopic, k5Var.getTextPaint(), null), false);
            }
            k5Var.requestLayout();
        }
        if (z11) {
            q1.g gVar2 = new q1.g(new q1.f(z13 ? 0.0f : 1000.0f));
            q1.h hVar = new q1.h(z13 ? 1000.0f : 0.0f);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            gVar2.b(new q1.d() { // from class: org.telegram.ui.Cells.y6
                @Override // q1.d
                public final void a(q1.g gVar3, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.k5 k5Var2 = c7Var.c;
                    k5Var2.setAlpha(f12);
                    ec ecVar = c7Var.b;
                    float f13 = 1.0f - f12;
                    ecVar.setAlpha(f13);
                    k5Var2.setTranslationX(f13 * (-org.telegram.messenger.g0.L(10.0f)));
                    ecVar.setTranslationX(f12 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new q1.c() { // from class: org.telegram.ui.Cells.z6
                @Override // q1.c
                public final void a(q1.g gVar3, boolean z14, float f10, float f11) {
                    c7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            k5Var.setTag(R.id.spring_tag, gVar2);
            gVar2.h();
        } else {
            ec ecVar = this.b;
            if (z13) {
                k5Var.setAlpha(1.0f);
                ecVar.setAlpha(0.0f);
                k5Var.setTranslationX(0.0f);
                ecVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                k5Var.setAlpha(0.0f);
                ecVar.setAlpha(1.0f);
                k5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                ecVar.setTranslationX(0.0f);
            }
        }
        this.x = z13;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.i3) {
            TLRPC.User user = this.h;
            int i11 = this.y;
            TL_account.RequirementToContact J2 = user != null ? hp.s1(i11).J2(this.h.id) : null;
            long N1 = this.w < 0 ? hp.s1(i11).N1(this.w) : org.telegram.messenger.m5.k(J2);
            boolean z10 = J2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z10 && this.I == N1) {
                return;
            }
            this.G = z10;
            this.I = N1;
            org.telegram.ui.ActionBar.r6.V(this.b, z10 ? org.telegram.ui.ActionBar.k6.C6 : org.telegram.ui.ActionBar.k6.j5, this.E);
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
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        ly0 ly0Var;
        boolean drawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.k9 k9Var = this.a;
        if (view == k9Var && this.n != 2 && (user = this.h) != null && !hp.F2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (k9Var.getMeasuredWidth() / 2.0f) + k9Var.getLeft() + org.telegram.messenger.g0.L(18.0f);
                float measuredHeight = ((k9Var.getMeasuredHeight() / 2.0f) + k9Var.getTop()) - org.telegram.messenger.g0.L(20.83f);
                if (this.N != null) {
                    f10 = 0.0f;
                    f12 = 5.0f;
                    long j13 = this.M;
                    f13 = measuredWidth;
                    long j14 = this.I;
                    if (j13 == j14 || j14 <= 0) {
                        ly0 ly0Var2 = this.N;
                        float L = (ly0Var2 != null ? f10 : ly0Var2.c) + org.telegram.messenger.g0.L(10.0f);
                        float L2 = org.telegram.messenger.g0.L(14.33f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f14 = L / 2.0f;
                        float f15 = f13 - f14;
                        float f16 = L2 / 2.0f;
                        rectF.set(f15, measuredHeight - f16, f13 + f14, f16 + measuredHeight);
                        rectF.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var2);
                        Paint paint = this.L;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, e6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        ly0Var = this.N;
                        if (ly0Var == null) {
                            float L3 = org.telegram.messenger.g0.L(f12) + f15;
                            e6Var = e6Var2;
                            f11 = 9.33f;
                            ly0Var.c(L3, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            e6Var = e6Var2;
                            f11 = 9.33f;
                        }
                    }
                } else {
                    f13 = measuredWidth;
                    f10 = 0.0f;
                    f12 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.I;
                this.M = j15;
                sb2.append(org.telegram.messenger.g0.o0((int) j15, 0));
                this.N = new ly0(wb.U0(sb2.toString(), 0.65f, null), 9.33f, org.telegram.messenger.g0.o());
                ly0 ly0Var22 = this.N;
                float L4 = (ly0Var22 != null ? f10 : ly0Var22.c) + org.telegram.messenger.g0.L(10.0f);
                float L22 = org.telegram.messenger.g0.L(14.33f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f142 = L4 / 2.0f;
                float f152 = f13 - f142;
                float f162 = L22 / 2.0f;
                rectF2.set(f152, measuredHeight - f162, f13 + f142, f162 + measuredHeight);
                rectF2.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                int w022 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, e6Var2);
                Paint paint2 = this.L;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, e6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                ly0Var = this.N;
                if (ly0Var == null) {
                }
            } else {
                e6Var = e6Var2;
                f10 = 0.0f;
                f11 = 9.33f;
                f12 = 5.0f;
            }
            float d10 = this.F.d(this.G);
            if (d10 > f10) {
                int bottom = k9Var.getBottom() - org.telegram.messenger.g0.L(9.0f);
                int right = k9Var.getRight() - org.telegram.messenger.g0.L(f11);
                canvas.save();
                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
                float f17 = right;
                float f18 = bottom;
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(12.0f) * d10, org.telegram.ui.ActionBar.k6.t0);
                if (this.J == null) {
                    this.J = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.E);
                }
                this.J.d(right - org.telegram.messenger.g0.L(10.0f), 0.0f, bottom - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + right, 0.0f, org.telegram.messenger.g0.L(10.0f) + bottom);
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(10.0f) * d10, this.J.f);
                if (this.K == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.K = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.K.setBounds((int) (f17 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d10)), (int) (f18 - (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f) * d10)), (int) (((this.K.getIntrinsicWidth() / 2.0f) * 0.875f * d10) + f17), (int) (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f * d10) + f18));
                this.K.setAlpha((int) (255.0f * d10));
                this.K.draw(canvas);
                canvas.restore();
            }
            if (!this.G) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i3 = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i3).getCurrentTime()) || hp.s1(i3).a0.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f10) {
                            int bottom2 = k9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
                            int right2 = k9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
                            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
                            float f19 = right2;
                            float f20 = bottom2;
                            float f21 = 1.0f - d10;
                            float f22 = 1.0f - d;
                            canvas.drawCircle(f19, f20, org.telegram.messenger.g0.L(7.0f) * this.r * f21 * f22, org.telegram.ui.ActionBar.k6.t0);
                            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, e6Var));
                            canvas.drawCircle(f19, f20, com.google.android.recaptcha.internal.a.C(org.telegram.messenger.g0.L(f12), this.r, f21, f22), org.telegram.ui.ActionBar.k6.t0);
                            if (z10) {
                                float f23 = this.r;
                                if (f23 > f10) {
                                    float f24 = f23 - (j12 / 150.0f);
                                    this.r = f24;
                                    if (f24 < f10) {
                                        this.r = f10;
                                    }
                                    k9Var.invalidate();
                                    invalidate();
                                }
                            } else {
                                float f25 = this.r;
                                if (f25 < 1.0f) {
                                    float f26 = (j12 / 150.0f) + f25;
                                    this.r = f26;
                                    if (f26 > 1.0f) {
                                        this.r = 1.0f;
                                    }
                                    k9Var.invalidate();
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
            int bottom22 = k9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
            int right22 = k9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            float f192 = right22;
            float f202 = bottom22;
            float f212 = 1.0f - d10;
            float f222 = 1.0f - d;
            canvas.drawCircle(f192, f202, org.telegram.messenger.g0.L(7.0f) * this.r * f212 * f222, org.telegram.ui.ActionBar.k6.t0);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.T8, e6Var));
            canvas.drawCircle(f192, f202, com.google.android.recaptcha.internal.a.C(org.telegram.messenger.g0.L(f12), this.r, f212, f222), org.telegram.ui.ActionBar.k6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.y).c(this, hs.i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.y).n(this, hs.i3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.k9 k9Var = this.a;
        int measuredWidth = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
        int measuredHeight = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
        org.telegram.ui.ActionBar.k6.o0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B5, this.E));
        org.telegram.ui.ActionBar.k6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = org.telegram.messenger.g0.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, k9Var.getRoundRadius()[0], k9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.k6.o0);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
