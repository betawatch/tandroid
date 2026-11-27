// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class nea extends FrameLayout implements fn7 {
    public final vnb E;
    public final mm F;
    public boolean G;
    public final mm H;
    public long I;
    public al8 J;
    public Drawable K;
    public final Paint L;
    public long M;
    public pkb N;
    public final de0 a;
    public final c19 b;
    public final ema c;
    public final og2 d;
    public final lea e;
    public mea f;
    public TLRPC.User h;
    public final byte n;
    public float r;
    public long s;
    public long w;
    public boolean x;
    public final int y;

    /* JADX WARN: Multi-variable type inference failed */
    public nea(int i, vnb vnbVar, Context context) {
        super(context);
        this.y = yac.t0;
        k43 k43Var = k43.h;
        this.F = new mm(this, 0L, 350L, k43Var);
        this.H = new mm(this, 0L, 350L, k43Var);
        this.L = new Paint();
        this.E = vnbVar;
        this.e = new lea(this, vnbVar, (byte) 0);
        setWillNotDraw(false);
        this.n = i;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(28.0f));
        byte b = 2;
        if (i == 2) {
            addView(de0Var, tre.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(de0Var, tre.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        c19 c19Var = new c19(context, b);
        this.b = c19Var;
        jn7.i(c19Var);
        yob.X(c19Var, this.G ? aob.C6 : aob.j5, vnbVar);
        c19Var.setTextSize(1, 12.0f);
        c19Var.setMaxLines(2);
        c19Var.setGravity(49);
        c19Var.setLines(2);
        c19Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(c19Var, tre.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        ema emaVar = new ema(context);
        this.c = emaVar;
        yob.W(emaVar, aob.j5, vnbVar);
        emaVar.setTextSize(12);
        emaVar.setMaxLines(2);
        emaVar.setGravity(49);
        emaVar.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(emaVar, tre.d(-1, -2.0f, 51, 6.0f, i == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        og2 og2Var = new og2(21, vnbVar, context);
        this.d = og2Var;
        og2Var.b(aob.B5, aob.h5, aob.C5);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(4);
        og2Var.setProgressDelegate(new ye9(this, (byte) 27));
        addView(og2Var, tre.d(24, 24.0f, 49, 19.0f, i == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        int i2 = aob.i6;
        Drawable Y = aob.Y(aob.v0(i2, vnbVar), hl.L(2.0f), hl.L(2.0f));
        uob M = yob.M(i2);
        setBackground(Y);
        yob.j(this, Y, null, M, vnbVar);
    }

    public String a() {
        return ob6.M0(2131750449, null);
    }

    public final void b(boolean z, boolean z2) {
        this.d.a(z, z2);
        if (z) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j, boolean z, CharSequence charSequence) {
        String str = charSequence;
        lea leaVar = this.e;
        leaVar.p = 1.0f;
        c19 c19Var = this.b;
        de0 de0Var = this.a;
        if (j == Long.MAX_VALUE) {
            c19Var.setText(a());
            mea meaVar = this.f;
            if (meaVar == null) {
                mea meaVar2 = new mea(getContext(), de0Var, true, R.drawable.large_repost_story, this.E);
                this.f = meaVar2;
                meaVar = meaVar2;
            }
            de0Var.m(null, null, meaVar, null);
        } else {
            boolean D = wf3.D(j);
            mm mmVar = this.H;
            mm mmVar2 = this.F;
            int i = this.y;
            if (D) {
                this.h = uc7.s1(i).X1(Long.valueOf(j));
                TL_account.RequirementToContact P2 = uc7.s1(i).P2(j);
                this.G = P2 instanceof TL_account.requirementToContactPremium;
                this.I = wf3.j(P2);
                int i2 = this.G ? aob.C6 : aob.j5;
                vnb vnbVar = this.E;
                yob.X(c19Var, i2, vnbVar);
                mmVar2.a(this.G);
                mmVar.a(this.I > 0);
                invalidate();
                leaVar.q(this.h);
                if (this.n != 2) {
                    if (lbc.B(this.h)) {
                        c19Var.setText(ob6.M0(2131745993, null));
                        leaVar.f(12);
                        de0Var.m(null, null, leaVar, this.h);
                    } else if (lbc.D(this.h)) {
                        c19Var.setText(ob6.M0(2131745629, null));
                        leaVar.f(1);
                        de0Var.m(null, null, leaVar, this.h);
                    }
                    de0Var.setRoundRadius(hl.L(28.0f));
                }
                if (str == null) {
                    TLRPC.User user = this.h;
                    str = user != null ? lv2.m(0, user.first_name, user.last_name) : "";
                }
                if (this.h != null && uc7.s1(i).r2(j)) {
                    yt9 yt9Var = new yt9(2);
                    yt9Var.b(aob.v0(aob.j9, vnbVar));
                    wm2 wm2Var = new wm2(2, yt9Var);
                    wm2Var.d = false;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    str = spannableStringBuilder;
                }
                c19Var.setText(str);
                de0Var.f(this.h, leaVar);
                de0Var.setRoundRadius(hl.L(28.0f));
            } else {
                this.h = null;
                this.G = false;
                mmVar2.e(true, 0.0f);
                this.I = uc7.s1(i).M1(j);
                mmVar.getClass();
                mmVar.e(true, 0.0f);
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
                if (str != null) {
                    c19Var.setText(str);
                } else if (M0 == null) {
                    c19Var.setText("");
                } else if (M0.monoforum) {
                    c19Var.setText(ro4.j(i, M0, false));
                } else {
                    c19Var.setText(M0.title);
                }
                if (xc2.p0(M0)) {
                    ro4.o(i, M0, leaVar, de0Var);
                } else {
                    leaVar.p(M0);
                    de0Var.f(M0, leaVar);
                }
                de0Var.setRoundRadius((M0 == null || !(M0.forum || M0.monoforum)) ? hl.L(28.0f) : hl.L(16.0f));
            }
        }
        this.w = j;
        this.d.a(z, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2) {
        boolean z3 = this.x;
        boolean z4 = tL_forumTopic != null;
        if (z3 == z4 && z2) {
            return;
        }
        ema emaVar = this.c;
        vpa vpaVar = (vpa) emaVar.getTag(R.id.spring_tag);
        if (vpaVar != null) {
            vpaVar.d();
        }
        if (z4) {
            if (z) {
                emaVar.l(uc7.s1(this.y).A1(wf3.n(tL_forumTopic.from_id), false), false);
            } else {
                emaVar.l(ro4.k(tL_forumTopic, emaVar.getTextPaint(), null), false);
            }
            emaVar.requestLayout();
        }
        if (z2) {
            vpa vpaVar2 = new vpa(new xk4(z4 ? 0.0f : 1000.0f));
            wpa wpaVar = new wpa(z4 ? 1000.0f : 0.0f);
            wpaVar.b(1500.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            vpaVar2.b(new i10(this, (byte) 17));
            vpaVar2.a(new iw0(this, (byte) 12));
            emaVar.setTag(R.id.spring_tag, vpaVar2);
            vpaVar2.h();
        } else {
            c19 c19Var = this.b;
            if (z4) {
                emaVar.setAlpha(1.0f);
                c19Var.setAlpha(0.0f);
                emaVar.setTranslationX(0.0f);
                c19Var.setTranslationX(hl.L(10.0f));
            } else {
                emaVar.setAlpha(0.0f);
                c19Var.setAlpha(1.0f);
                emaVar.setTranslationX(-hl.L(10.0f));
                c19Var.setTranslationX(0.0f);
            }
        }
        this.x = z4;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.k3) {
            TLRPC.User user = this.h;
            int i3 = this.y;
            TL_account.RequirementToContact P2 = user != null ? uc7.s1(i3).P2(this.h.id) : null;
            long M1 = this.w < 0 ? uc7.s1(i3).M1(this.w) : wf3.j(P2);
            boolean z = P2 instanceof TL_account.requirementToContactPremium;
            if (this.G == z && this.I == M1) {
                return;
            }
            this.G = z;
            this.I = M1;
            yob.X(this.b, z ? aob.C6 : aob.j5, this.E);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TLRPC.User user;
        vnb vnbVar;
        float f;
        float f2;
        float f3;
        boolean z;
        al8 al8Var;
        float f4;
        pkb pkbVar;
        boolean drawChild = super.drawChild(canvas, view, j);
        de0 de0Var = this.a;
        if (view == de0Var && this.n != 2 && (user = this.h) != null && !uc7.K2(user)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.s;
            long j3 = j2 <= 17 ? j2 : 17L;
            this.s = elapsedRealtime;
            float d = this.H.d(this.I > 0);
            vnb vnbVar2 = this.E;
            if (d > 0.0f) {
                float measuredWidth = (de0Var.getMeasuredWidth() / 2.0f) + de0Var.getLeft() + hl.L(18.0f);
                float measuredHeight = ((de0Var.getMeasuredHeight() / 2.0f) + de0Var.getTop()) - hl.L(20.83f);
                pkb pkbVar2 = this.N;
                if (pkbVar2 != null) {
                    f = 0.0f;
                    f3 = 5.0f;
                    long j4 = this.M;
                    f4 = measuredWidth;
                    long j5 = this.I;
                    if (j4 == j5 || j5 <= 0) {
                        f2 = 9.33f;
                        float L = pkbVar2.c + hl.L(10.0f);
                        float L2 = hl.L(14.33f);
                        RectF rectF = hl.P;
                        float f5 = L / 2.0f;
                        float f6 = f4 - f5;
                        float f7 = L2 / 2.0f;
                        rectF.set(f6, measuredHeight - f7, f4 + f5, f7 + measuredHeight);
                        rectF.inset(-hl.L(1.33f), hl.L(-1.33f));
                        int v0 = aob.v0(aob.h5, vnbVar2);
                        Paint paint = this.L;
                        paint.setColor(v0);
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        rectF.inset(hl.L(1.33f), hl.L(1.33f));
                        paint.setColor(aob.v0(aob.B5, vnbVar2));
                        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                        pkbVar = this.N;
                        if (pkbVar == null) {
                            vnbVar = vnbVar2;
                            pkbVar.c(hl.L(f3) + f6, measuredHeight, 1.0f, -1, canvas);
                        } else {
                            vnbVar = vnbVar2;
                        }
                    }
                } else {
                    f4 = measuredWidth;
                    f = 0.0f;
                    f3 = 5.0f;
                }
                StringBuilder sb = new StringBuilder("⭐️");
                long j6 = this.I;
                this.M = j6;
                sb.append(hl.o0((int) j6, 0));
                f2 = 9.33f;
                pkbVar2 = new pkb(nza.U0(sb.toString(), 0.65f, null), 9.33f, hl.o());
                this.N = pkbVar2;
                float L3 = pkbVar2.c + hl.L(10.0f);
                float L22 = hl.L(14.33f);
                RectF rectF2 = hl.P;
                float f52 = L3 / 2.0f;
                float f62 = f4 - f52;
                float f72 = L22 / 2.0f;
                rectF2.set(f62, measuredHeight - f72, f4 + f52, f72 + measuredHeight);
                rectF2.inset(-hl.L(1.33f), hl.L(-1.33f));
                int v02 = aob.v0(aob.h5, vnbVar2);
                Paint paint2 = this.L;
                paint2.setColor(v02);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(hl.L(1.33f), hl.L(1.33f));
                paint2.setColor(aob.v0(aob.B5, vnbVar2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                pkbVar = this.N;
                if (pkbVar == null) {
                }
            } else {
                vnbVar = vnbVar2;
                f = 0.0f;
                f2 = 9.33f;
                f3 = 5.0f;
            }
            float d2 = this.F.d(this.G);
            if (d2 > f) {
                int bottom = de0Var.getBottom() - hl.L(9.0f);
                int right = de0Var.getRight() - hl.L(f2);
                canvas.save();
                aob.s0.setColor(aob.v0(aob.d6, vnbVar));
                float f8 = right;
                float f9 = bottom;
                canvas.drawCircle(f8, f9, hl.L(12.0f) * d2, aob.s0);
                al8 al8Var2 = this.J;
                if (al8Var2 == null) {
                    al8Var = new al8(aob.Ck, aob.Dk, -1, -1, this.E);
                    this.J = al8Var;
                } else {
                    al8Var = al8Var2;
                }
                al8Var.d(right - hl.L(10.0f), 0.0f, bottom - hl.L(10.0f), hl.L(10.0f) + right, 0.0f, hl.L(10.0f) + bottom);
                canvas.drawCircle(f8, f9, hl.L(10.0f) * d2, this.J.f);
                if (this.K == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.K = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                this.K.setBounds((int) (f8 - (((r2.getIntrinsicWidth() / 2.0f) * 0.875f) * d2)), (int) (f9 - (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f) * d2)), (int) (((this.K.getIntrinsicWidth() / 2.0f) * 0.875f * d2) + f8), (int) (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f * d2) + f9));
                this.K.setAlpha((int) (255.0f * d2));
                this.K.draw(canvas);
                canvas.restore();
            }
            if (!this.G) {
                TLRPC.User user2 = this.h;
                if (!user2.self && !user2.bot) {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i = this.y;
                    if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || uc7.s1(i).a0.containsKey(Long.valueOf(this.h.id))) {
                        z = true;
                        if (!z || this.r != f) {
                            int bottom2 = de0Var.getBottom() - hl.L(6.0f);
                            int right2 = de0Var.getRight() - hl.L(10.0f);
                            aob.s0.setColor(aob.v0(aob.d6, vnbVar));
                            float f10 = right2;
                            float f11 = bottom2;
                            float f12 = 1.0f - d2;
                            float f13 = 1.0f - d;
                            canvas.drawCircle(f10, f11, hl.L(7.0f) * this.r * f12 * f13, aob.s0);
                            aob.s0.setColor(aob.v0(aob.T8, vnbVar));
                            canvas.drawCircle(f10, f11, xnb.C(hl.L(f3), this.r, f12, f13), aob.s0);
                            float f14 = this.r;
                            if (z) {
                                if (f14 > f) {
                                    float f15 = f14 - (j3 / 150.0f);
                                    this.r = f15;
                                    if (f15 < f) {
                                        this.r = f;
                                    }
                                    de0Var.invalidate();
                                    invalidate();
                                }
                            } else if (f14 < 1.0f) {
                                float f16 = (j3 / 150.0f) + f14;
                                this.r = f16;
                                if (f16 > 1.0f) {
                                    this.r = 1.0f;
                                }
                                de0Var.invalidate();
                                invalidate();
                                return drawChild;
                            }
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
            int bottom22 = de0Var.getBottom() - hl.L(6.0f);
            int right22 = de0Var.getRight() - hl.L(10.0f);
            aob.s0.setColor(aob.v0(aob.d6, vnbVar));
            float f102 = right22;
            float f112 = bottom22;
            float f122 = 1.0f - d2;
            float f132 = 1.0f - d;
            canvas.drawCircle(f102, f112, hl.L(7.0f) * this.r * f122 * f132, aob.s0);
            aob.s0.setColor(aob.v0(aob.T8, vnbVar));
            canvas.drawCircle(f102, f112, xnb.C(hl.L(f3), this.r, f122, f132), aob.s0);
            float f142 = this.r;
            if (z) {
            }
        }
        return drawChild;
    }

    public long getCurrentDialog() {
        return this.w;
    }

    public de0 getImageView() {
        return this.a;
    }

    public long getStarsPrice() {
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.y).b(this, jn7.k3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.y).n(this, jn7.k3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        de0 de0Var = this.a;
        int measuredWidth = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
        int measuredHeight = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
        aob.n0.setColor(aob.v0(aob.B5, this.E));
        aob.n0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int L = hl.L(this.n == 2 ? 24.0f : 28.0f);
        RectF rectF = hl.P;
        rectF.set(measuredWidth - L, measuredHeight - L, measuredWidth + L, measuredHeight + L);
        canvas.drawRoundRect(rectF, de0Var.getRoundRadius()[0], de0Var.getRoundRadius()[0], aob.n0);
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
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.n == 2 ? 95.0f : 103.0f), TLObject.FLAG_30));
    }
}
