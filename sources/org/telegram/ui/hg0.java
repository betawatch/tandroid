package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hg0 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.h11 J;
    public final /* synthetic */ kg0 K;
    public int a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported n;
    public int r;
    public final Paint s;
    public final Paint w;
    public final RectF x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg0(kg0 kg0Var, Context context) {
        super(context);
        this.K = kg0Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.h11();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        linearLayout.addView(textView2, w7.b6.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Ii, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new f50(this, 10));
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        addView(imageView, w7.b6.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView3, i10, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, w7.b6.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, w7.b6.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f7, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ik, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ka, false);
        }
        if (i10 != 1) {
            return i10 == 2 ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.oa, false) : i10 == 4 ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.V8, false) : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        }
        if (f7 > 0.5f) {
            return i0.b.f(1.0f - ((f7 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.na, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.oa, false));
        }
        return i0.b.f(1.0f - (f7 / 0.5f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.oa, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        int i11;
        String G;
        int i12;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.E = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.y;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder Z0 = rh.h8.Z0(false, i0.a.k(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f;
            textView.setText(Z0);
            int i13 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i13 == 2592000) {
                textView2.setText(org.telegram.messenger.cd.L0(2131745074, null));
            } else if (i13 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i13 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.i0.L(28.0f) + ((int) Math.max(vh.p2.g(textView.getText(), textView.getPaint()), vh.p2.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        kg0 kg0Var = this.K;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.k6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i11 = ((org.telegram.ui.ActionBar.k2) kg0Var).currentAccount;
            sb2.append(org.telegram.messenger.vp.r1(i11).U2);
            sb2.append("/");
            sb2.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb2.toString());
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i14 = tL_chatInviteExported.usage;
        if (i14 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            G = org.telegram.messenger.cd.L0(tL_chatInviteExported.subscription_pricing != null ? 2131748202 : 2131748204, null);
        } else {
            int i15 = tL_chatInviteExported.usage_limit;
            if (i15 > 0 && i14 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.cd.G(i15, "CanJoin", new Object[0]);
            } else if (i15 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.cd.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.cd.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                G = i14 > 0 ? org.telegram.messenger.cd.G(i14, "PeopleJoined", new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        G = sc.e.A(G, ", ");
                    }
                    StringBuilder t10 = a1.g.t(G);
                    t10.append(org.telegram.messenger.cd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    G = t10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs();
            qsVar.b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131747337, null));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String L0 = org.telegram.messenger.cd.L0(tL_chatInviteExported.subscription_pricing != null ? 2131748202 : 2131748204, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) L0);
            }
            org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs();
            qsVar2.b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (z10 || (i12 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i12) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(z10 ? 2131746032 : 2131750877, null));
            } else {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131748910, null));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.qs qsVar3 = new org.telegram.ui.Components.qs();
            qsVar3.b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((kg0Var.n0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
            } else {
                long j10 = currentTimeMillis / 1000;
                int i16 = (int) (j10 % 60);
                long j11 = j10 / 60;
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j11 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j11 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i16)));
                this.I = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.qs qsVar4 = new org.telegram.ui.Components.qs();
            qsVar4.b = org.telegram.messenger.i0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.cd.L0(2131754209, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r6.revoked == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        boolean z10;
        float f13;
        Paint paint;
        RectF rectF;
        boolean z11;
        int i12;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z12 = tL_chatInviteExported2.expired;
        kg0 kg0Var = this.K;
        if (z12 || tL_chatInviteExported2.revoked) {
            f7 = 32.0f;
            i10 = tL_chatInviteExported2.revoked ? 4 : 3;
        } else {
            int i13 = tL_chatInviteExported2.expire_date;
            if (i13 > 0 || tL_chatInviteExported2.usage_limit > 0) {
                if (i13 > 0) {
                    long currentTimeMillis = (kg0Var.n0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                    f7 = 32.0f;
                    long j10 = tL_chatInviteExported3.expire_date * 1000;
                    int i14 = tL_chatInviteExported3.start_date;
                    if (i14 <= 0) {
                        i14 = tL_chatInviteExported3.date;
                    }
                    long j11 = i14 * 1000;
                    f11 = 1.0f - ((currentTimeMillis - j11) / (j10 - j11));
                } else {
                    f7 = 32.0f;
                    f11 = 1.0f;
                }
                int i15 = this.n.usage_limit;
                f10 = Math.min(f11, i15 > 0 ? (i15 - r3.usage) / i15 : 1.0f);
                if (f10 <= 0.0f) {
                    this.n.expired = true;
                    org.telegram.messenger.i0.a4(kg0Var.b);
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                i11 = this.a;
                if (i10 != i11 && i11 >= 0) {
                    this.D = i11;
                    this.E = 0.0f;
                    if ((i11 == 2 && i11 != 1) || i10 == 2 || i10 == 1) {
                        this.G = false;
                    } else {
                        this.G = true;
                    }
                }
                this.a = i10;
                f12 = this.E;
                if (f12 != 1.0f) {
                    float f14 = f12 + 0.064f;
                    this.E = f14;
                    if (f14 >= 1.0f) {
                        this.E = 1.0f;
                        this.G = false;
                    } else {
                        invalidate();
                    }
                }
                int f15 = this.E == 1.0f ? i0.b.f(this.E, a(f10, this.D), a(f10, i10)) : a(f10, i10);
                Paint paint2 = this.s;
                paint2.setColor(f15);
                canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.i0.L(f7) / 2.0f, paint2);
                z10 = this.G;
                if (!z10) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
                    if (!tL_chatInviteExported4.expired) {
                        if (tL_chatInviteExported4.expire_date > 0) {
                        }
                    }
                    tL_chatInviteExported = this.n;
                    if (tL_chatInviteExported.subscription_pricing != null) {
                        kg0Var.a0.setBounds(L - org.telegram.messenger.i0.L(12.0f), measuredHeight - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + L, org.telegram.messenger.i0.L(12.0f) + measuredHeight);
                        kg0Var.a0.draw(canvas2);
                    } else if (tL_chatInviteExported.revoked) {
                        kg0Var.Z.setBounds(L - org.telegram.messenger.i0.L(12.0f), measuredHeight - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + L, org.telegram.messenger.i0.L(12.0f) + measuredHeight);
                        kg0Var.Z.draw(canvas2);
                    } else {
                        kg0Var.Y.setBounds(L - org.telegram.messenger.i0.L(12.0f), measuredHeight - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + L, org.telegram.messenger.i0.L(12.0f) + measuredHeight);
                        kg0Var.Y.draw(canvas2);
                    }
                    if (this.H) {
                        canvas2.drawLine(org.telegram.messenger.i0.L(70.0f), getMeasuredHeight() - 1, org.telegram.messenger.i0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    f11 = this.F;
                }
                f13 = f11;
                paint = this.w;
                paint.setColor(f15);
                float L2 = L - org.telegram.messenger.i0.L(20.0f);
                float L3 = measuredHeight - org.telegram.messenger.i0.L(20.0f);
                float L4 = org.telegram.messenger.i0.L(20.0f) + L;
                float L5 = org.telegram.messenger.i0.L(20.0f) + measuredHeight;
                rectF = this.x;
                rectF.set(L2, L3, L4, L5);
                if (this.E != 1.0f || (((i12 = this.D) == 2 || i12 == 1) && !this.G)) {
                    float f16 = (-f13) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f16, false, paint);
                    this.J.a(f16, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    canvas2.save();
                    float f17 = this.G ? 1.0f - this.E : this.E;
                    float f18 = (float) ((0.3f * f17) + 0.7d);
                    canvas2.scale(f18, f18, rectF.centerX(), rectF.centerY());
                    float f19 = (-f13) * 360.0f;
                    canvas2.drawArc(rectF, -90.0f, f19, false, paint);
                    this.J.a(f19, f17, canvas, paint, rectF);
                    canvas.restore();
                    canvas2 = canvas;
                }
                z11 = ((org.telegram.ui.ActionBar.k2) kg0Var).isPaused;
                if (!z11) {
                    invalidate();
                }
                this.F = f13;
                tL_chatInviteExported = this.n;
                if (tL_chatInviteExported.subscription_pricing != null) {
                }
                if (this.H) {
                }
            } else {
                f7 = 32.0f;
                i10 = 0;
            }
        }
        f10 = 0.0f;
        f11 = 1.0f;
        i11 = this.a;
        if (i10 != i11) {
            this.D = i11;
            this.E = 0.0f;
            if (i11 == 2) {
            }
            this.G = true;
        }
        this.a = i10;
        f12 = this.E;
        if (f12 != 1.0f) {
        }
        if (this.E == 1.0f) {
        }
        Paint paint22 = this.s;
        paint22.setColor(f15);
        canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.i0.L(f7) / 2.0f, paint22);
        z10 = this.G;
        if (!z10) {
        }
        if (z10) {
        }
        f13 = f11;
        paint = this.w;
        paint.setColor(f15);
        float L22 = L - org.telegram.messenger.i0.L(20.0f);
        float L32 = measuredHeight - org.telegram.messenger.i0.L(20.0f);
        float L42 = org.telegram.messenger.i0.L(20.0f) + L;
        float L52 = org.telegram.messenger.i0.L(20.0f) + measuredHeight;
        rectF = this.x;
        rectF.set(L22, L32, L42, L52);
        if (this.E != 1.0f) {
        }
        float f162 = (-f13) * 360.0f;
        canvas.drawArc(rectF, -90.0f, f162, false, paint);
        this.J.a(f162, 1.0f, canvas, paint, rectF);
        canvas2 = canvas;
        z11 = ((org.telegram.ui.ActionBar.k2) kg0Var).isPaused;
        if (!z11) {
        }
        this.F = f13;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing != null) {
        }
        if (this.H) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
        this.w.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }
}
