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
import di.lb;
import di.tb;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class c7 extends FrameLayout implements is {
    public final org.telegram.ui.ActionBar.e6 E;
    public final org.telegram.ui.Components.u5 F;
    public boolean G;
    public final org.telegram.ui.Components.u5 H;
    public long I;
    public ug.z0 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public oy0 N;
    public final org.telegram.ui.Components.i9 a;
    public final tb b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final fp d;
    public final a7 e;
    public b7 f;
    public TLRPC.User h;
    public final int n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    public c7(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.y = m10.t0;
        er erVar = er.h;
        this.F = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.H = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.L = new Paint();
        this.E = e6Var;
        this.e = new a7(this, e6Var, 0);
        setWillNotDraw(false);
        this.n = i7;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        if (i7 == 2) {
            addView(i9Var, c8.ja.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(i9Var, c8.ja.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        tb tbVar = new tb(context, 8);
        this.b = tbVar;
        ns.i(tbVar);
        org.telegram.ui.ActionBar.q6.U(tbVar, this.G ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, e6Var);
        tbVar.setTextSize(1, 12.0f);
        tbVar.setMaxLines(2);
        tbVar.setGravity(49);
        tbVar.setLines(2);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(tbVar, c8.ja.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.j5, e6Var);
        j5Var.setTextSize(12);
        j5Var.setMaxLines(2);
        j5Var.setGravity(49);
        j5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(j5Var, c8.ja.d(-1, -2.0f, 51, 6.0f, i7 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        fp fpVar = new fp(21, context, e6Var);
        this.d = fpVar;
        fpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.C5);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(4);
        fpVar.setProgressDelegate(new ca(this, 5));
        addView(fpVar, c8.ja.d(24, 24.0f, 49, 19.0f, i7 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, e6Var);
    }

    public String a() {
        return hd.M0(2131750488, null);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j3, boolean z10, CharSequence charSequence) {
        a7 a7Var = this.e;
        a7Var.p = 1.0f;
        org.telegram.ui.Components.i9 i9Var = this.a;
        tb tbVar = this.b;
        if (j3 == Long.MAX_VALUE) {
            tbVar.setText(a());
            if (this.f == null) {
                this.f = new b7(getContext(), i9Var, true, R.drawable.large_repost_story, this.E);
            }
            i9Var.j(null, null, this.f, null);
        } else {
            boolean E = org.telegram.messenger.m5.E(j3);
            org.telegram.ui.Components.u5 u5Var = this.H;
            org.telegram.ui.Components.u5 u5Var2 = this.F;
            int i7 = this.y;
            if (E) {
                this.h = np.s1(i7).a2(Long.valueOf(j3));
                TL_account.RequirementToContact J2 = np.s1(i7).J2(j3);
                this.G = J2 instanceof TL_account.requirementToContactPremium;
                this.I = org.telegram.messenger.m5.k(J2);
                org.telegram.ui.ActionBar.q6.U(tbVar, this.G ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, this.E);
                u5Var2.a(this.G);
                u5Var.a(this.I > 0);
                invalidate();
                a7Var.r(this.h);
                int i10 = this.n;
                if (i10 != 2 && q10.z(this.h)) {
                    tbVar.setText(hd.M0(2131746266, null));
                    a7Var.g(12);
                    i9Var.j(null, null, a7Var, this.h);
                } else if (i10 == 2 || !q10.B(this.h)) {
                    if (charSequence != null) {
                        tbVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            tbVar.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                        } else {
                            tbVar.setText("");
                        }
                    }
                    i9Var.f(this.h, a7Var);
                } else {
                    tbVar.setText(hd.M0(2131745901, null));
                    a7Var.g(1);
                    i9Var.j(null, null, a7Var, this.h);
                }
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                u5Var2.e(true, 0.0f);
                this.I = np.s1(i7).N1(j3);
                u5Var.getClass();
                u5Var.e(true, 0.0f);
                TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                if (charSequence != null) {
                    tbVar.setText(charSequence);
                } else if (M0 == null) {
                    tbVar.setText("");
                } else if (M0.monoforum) {
                    tbVar.setText(qg.c.i(i7, M0, false));
                } else {
                    tbVar.setText(M0.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    qg.c.o(i7, M0, a7Var, i9Var);
                } else {
                    a7Var.q(M0);
                    i9Var.f(M0, a7Var);
                }
                i9Var.setRoundRadius((M0 == null || !(M0.forum || M0.monoforum)) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
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
        org.telegram.ui.ActionBar.j5 j5Var = this.c;
        r1.g gVar = (r1.g) j5Var.getTag(R.id.spring_tag);
        if (gVar != null) {
            gVar.d();
        }
        if (z13) {
            if (z10) {
                j5Var.l(np.s1(this.y).B1(org.telegram.messenger.m5.o(tL_forumTopic.from_id), false), false);
            } else {
                j5Var.l(qg.c.j(tL_forumTopic, j5Var.getTextPaint(), null), false);
            }
            j5Var.requestLayout();
        }
        if (z11) {
            r1.g gVar2 = new r1.g(new r1.f(z13 ? 0.0f : 1000.0f));
            r1.h hVar = new r1.h(z13 ? 1000.0f : 0.0f);
            hVar.b(1500.0f);
            hVar.a(1.0f);
            gVar2.m = hVar;
            gVar2.b(new r1.d() { // from class: org.telegram.ui.Cells.y6
                @Override // r1.d
                public final void a(r1.g gVar3, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    c7 c7Var = c7.this;
                    org.telegram.ui.ActionBar.j5 j5Var2 = c7Var.c;
                    j5Var2.setAlpha(f12);
                    tb tbVar = c7Var.b;
                    float f13 = 1.0f - f12;
                    tbVar.setAlpha(f13);
                    j5Var2.setTranslationX(f13 * (-org.telegram.messenger.g0.L(10.0f)));
                    tbVar.setTranslationX(f12 * org.telegram.messenger.g0.L(10.0f));
                }
            });
            gVar2.a(new r1.c() { // from class: org.telegram.ui.Cells.z6
                @Override // r1.c
                public final void a(r1.g gVar3, boolean z14, float f10, float f11) {
                    c7.this.c.setTag(R.id.spring_tag, null);
                }
            });
            j5Var.setTag(R.id.spring_tag, gVar2);
            gVar2.h();
        } else {
            tb tbVar = this.b;
            if (z13) {
                j5Var.setAlpha(1.0f);
                tbVar.setAlpha(0.0f);
                j5Var.setTranslationX(0.0f);
                tbVar.setTranslationX(org.telegram.messenger.g0.L(10.0f));
            } else {
                j5Var.setAlpha(0.0f);
                tbVar.setAlpha(1.0f);
                j5Var.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
                tbVar.setTranslationX(0.0f);
            }
        }
        this.x = z13;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.i3) {
            TLRPC.User user = this.h;
            int i11 = this.y;
            TL_account.RequirementToContact J2 = user != null ? np.s1(i11).J2(this.h.id) : null;
            long N1 = this.w < 0 ? np.s1(i11).N1(this.w) : org.telegram.messenger.m5.k(J2);
            boolean z10 = J2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z10 && this.I == N1) {
                return;
            }
            this.G = z10;
            this.I = N1;
            org.telegram.ui.ActionBar.q6.U(this.b, z10 ? org.telegram.ui.ActionBar.j6.C6 : org.telegram.ui.ActionBar.j6.j5, this.E);
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
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        oy0 oy0Var;
        boolean drawChild = super.drawChild(canvas, view, j3);
        org.telegram.ui.Components.i9 i9Var = this.a;
        if (view == i9Var && this.n != 2 && (user = this.h) != null && !np.F2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.s;
            long j11 = j10 <= 17 ? j10 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            org.telegram.ui.ActionBar.e6 e6Var2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (i9Var.getMeasuredWidth() / 2.0f) + i9Var.getLeft() + org.telegram.messenger.g0.L(18.0f);
                float measuredHeight = ((i9Var.getMeasuredHeight() / 2.0f) + i9Var.getTop()) - org.telegram.messenger.g0.L(20.83f);
                if (this.N != null) {
                    f10 = 0.0f;
                    f12 = 5.0f;
                    long j12 = this.M;
                    f13 = measuredWidth;
                    long j13 = this.I;
                    if (j12 == j13 || j13 <= 0) {
                        oy0 oy0Var2 = this.N;
                        float L = (oy0Var2 != null ? f10 : oy0Var2.c) + org.telegram.messenger.g0.L(10.0f);
                        float L2 = org.telegram.messenger.g0.L(14.33f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        float f14 = L / 2.0f;
                        float f15 = f13 - f14;
                        float f16 = L2 / 2.0f;
                        rectF.set(f15, measuredHeight - f16, f13 + f14, f16 + measuredHeight);
                        rectF.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var2);
                        Paint paint = this.L;
                        paint.setColor(w02);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B5, e6Var2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        oy0Var = this.N;
                        if (oy0Var == null) {
                            float L3 = org.telegram.messenger.g0.L(f12) + f15;
                            e6Var = e6Var2;
                            f11 = 9.33f;
                            oy0Var.c(L3, measuredHeight, 1.0f, -1, canvas);
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
                long j14 = this.I;
                this.M = j14;
                sb2.append(org.telegram.messenger.g0.o0((int) j14, 0));
                this.N = new oy0(lb.U0(sb2.toString(), 0.65f, null), 9.33f, org.telegram.messenger.g0.o());
                oy0 oy0Var22 = this.N;
                float L4 = (oy0Var22 != null ? f10 : oy0Var22.c) + org.telegram.messenger.g0.L(10.0f);
                float L22 = org.telegram.messenger.g0.L(14.33f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f142 = L4 / 2.0f;
                float f152 = f13 - f142;
                float f162 = L22 / 2.0f;
                rectF2.set(f152, measuredHeight - f162, f13 + f142, f162 + measuredHeight);
                rectF2.inset(-org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(-1.33f));
                int w022 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, e6Var2);
                Paint paint2 = this.L;
                paint2.setColor(w022);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B5, e6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                oy0Var = this.N;
                if (oy0Var == null) {
                }
            } else {
                e6Var = e6Var2;
                f10 = 0.0f;
                f11 = 9.33f;
                f12 = 5.0f;
            }
            float d2 = this.F.d(this.G);
            if (d2 > f10) {
                int bottom = i9Var.getBottom() - org.telegram.messenger.g0.L(9.0f);
                int right = i9Var.getRight() - org.telegram.messenger.g0.L(f11);
                canvas.save();
                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
                float f17 = right;
                float f18 = bottom;
                canvas.drawCircle(f17, f18, org.telegram.messenger.g0.L(12.0f) * d2, org.telegram.ui.ActionBar.j6.t0);
                if (this.J == null) {
                    this.J = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, this.E);
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
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || np.s1(i7).a0.containsKey(Long.valueOf(this.h.id))) {
                        z10 = true;
                        if (!z10 || this.r != f10) {
                            int bottom2 = i9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
                            int right2 = i9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
                            float f19 = right2;
                            float f20 = bottom2;
                            float f21 = 1.0f - d2;
                            float f22 = 1.0f - d;
                            canvas.drawCircle(f19, f20, org.telegram.messenger.g0.L(7.0f) * this.r * f21 * f22, org.telegram.ui.ActionBar.j6.t0);
                            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.T8, e6Var));
                            canvas.drawCircle(f19, f20, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.g0.L(f12), this.r, f21, f22), org.telegram.ui.ActionBar.j6.t0);
                            if (z10) {
                                float f23 = this.r;
                                if (f23 > f10) {
                                    float f24 = f23 - (j11 / 150.0f);
                                    this.r = f24;
                                    if (f24 < f10) {
                                        this.r = f10;
                                    }
                                    i9Var.invalidate();
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
                                    i9Var.invalidate();
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
            int bottom22 = i9Var.getBottom() - org.telegram.messenger.g0.L(6.0f);
            int right22 = i9Var.getRight() - org.telegram.messenger.g0.L(10.0f);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var));
            float f192 = right22;
            float f202 = bottom22;
            float f212 = 1.0f - d2;
            float f222 = 1.0f - d;
            canvas.drawCircle(f192, f202, org.telegram.messenger.g0.L(7.0f) * this.r * f212 * f222, org.telegram.ui.ActionBar.j6.t0);
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.T8, e6Var));
            canvas.drawCircle(f192, f202, com.google.android.gms.internal.vision.e2.D(org.telegram.messenger.g0.L(f12), this.r, f212, f222), org.telegram.ui.ActionBar.j6.t0);
            if (z10) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.y).c(this, ns.i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.y).n(this, ns.i3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.i9 i9Var = this.a;
        int measuredWidth = (i9Var.getMeasuredWidth() / 2) + i9Var.getLeft();
        int measuredHeight = (i9Var.getMeasuredHeight() / 2) + i9Var.getTop();
        org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B5, this.E));
        org.telegram.ui.ActionBar.j6.o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = org.telegram.messenger.g0.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, i9Var.getRoundRadius()[0], i9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.j6.o0);
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
