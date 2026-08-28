package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class eh0 extends FrameLayout {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final org.telegram.ui.Components.d11 F;
    public final /* synthetic */ hh0 G;
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
    public final Paint v;
    public final RectF w;
    public final ImageView x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(hh0 hh0Var, Context context) {
        super(context);
        this.G = hh0Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new RectF();
        this.A = 1.0f;
        this.F = new org.telegram.ui.Components.d11();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.f6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        linearLayout.addView(textView2, g7.e6.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Uh, false));
        imageView.setOnClickListener(new q50(this, 9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
        addView(imageView, g7.e6.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, g7.e6.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        j3.r0.w(i10, null, false, textView4, 5);
        linearLayout2.addView(textView4, g7.e6.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, g7.e6.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i9) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.uj, false);
        }
        if (i9 == 3) {
            return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false);
        }
        if (i9 != 1) {
            return i9 == 2 ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.oa, false) : i9 == 4 ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V8, false) : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
        }
        if (f10 > 0.5f) {
            return i0.a.d(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.na, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.oa, false));
        }
        return i0.a.d(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.oa, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i9) {
        int i10;
        String formatPluralString;
        int i11;
        this.E = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.A = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i9;
        if (tL_chatInviteExported == null) {
            return;
        }
        int dp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.x;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder X0 = gh.oa.X0(false, j3.r0.n(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f;
            textView.setText(X0);
            int i12 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i12 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i12 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i12 == 60) {
                textView2.setText("each minute");
            }
            dp = AndroidUtilities.dp(28.0f) + ((int) Math.max(kh.x3.g(textView.getText(), textView.getPaint()), kh.x3.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = dp;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        hh0 hh0Var = this.G;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.o2) hh0Var).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
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
        int i13 = tL_chatInviteExported.usage;
        if (i13 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            formatPluralString = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
        } else {
            int i14 = tL_chatInviteExported.usage_limit;
            if (i14 > 0 && i13 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                formatPluralString = LocaleController.formatPluralString("CanJoin", i14, new Object[0]);
            } else if (i14 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                formatPluralString = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                formatPluralString = i13 > 0 ? LocaleController.formatPluralString("PeopleJoined", i13, new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        formatPluralString = ta.b.j(formatPluralString, ", ");
                    }
                    StringBuilder n10 = e2.c.n(formatPluralString);
                    n10.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    formatPluralString = n10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(formatPluralString);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.qs qsVar = new org.telegram.ui.Components.qs();
            qsVar.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String string = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.qs qsVar2 = new org.telegram.ui.Components.qs();
            qsVar2.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (z10 || (i11 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i11) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(z10 ? R.string.Revoked : R.string.Expired));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.qs qsVar3 = new org.telegram.ui.Components.qs();
            qsVar3.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((hh0Var.j0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (currentTimeMillis / 86400000), new Object[0]));
            } else {
                long j10 = currentTimeMillis / 1000;
                int i15 = (int) (j10 % 60);
                long j11 = j10 / 60;
                int i16 = (int) (j11 % 60);
                int i17 = (int) (j11 / 60);
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf(i17))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i16))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i15)));
                this.E = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.qs qsVar4 = new org.telegram.ui.Components.qs();
            qsVar4.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(qsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
        }
        this.d.setText(spannableStringBuilder2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        if (r6.revoked == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        int i9;
        float f11;
        float f12;
        boolean z10;
        int i10;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int dp = AndroidUtilities.dp(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z11 = tL_chatInviteExported2.expired;
        hh0 hh0Var = this.G;
        if (z11 || tL_chatInviteExported2.revoked) {
            f10 = 32.0f;
            i9 = tL_chatInviteExported2.revoked ? 4 : 3;
            f11 = 1.0f;
            f12 = 0.0f;
        } else {
            int i11 = tL_chatInviteExported2.expire_date;
            if (i11 > 0 || tL_chatInviteExported2.usage_limit > 0) {
                if (i11 > 0) {
                    long currentTimeMillis = (hh0Var.j0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                    f10 = 32.0f;
                    long j10 = tL_chatInviteExported3.expire_date * 1000;
                    int i12 = tL_chatInviteExported3.start_date;
                    if (i12 <= 0) {
                        i12 = tL_chatInviteExported3.date;
                    }
                    long j11 = i12 * 1000;
                    f11 = 1.0f - ((currentTimeMillis - j11) / (j10 - j11));
                } else {
                    f10 = 32.0f;
                    f11 = 1.0f;
                }
                int i13 = this.n.usage_limit;
                f12 = Math.min(f11, i13 > 0 ? (i13 - r3.usage) / i13 : 1.0f);
                if (f12 <= 0.0f) {
                    this.n.expired = true;
                    AndroidUtilities.updateVisibleRows(hh0Var.b);
                    i9 = 3;
                } else {
                    i9 = 1;
                }
            } else {
                f11 = 1.0f;
                f12 = 0.0f;
                i9 = 0;
                f10 = 32.0f;
            }
        }
        int i14 = this.a;
        if (i9 != i14 && i14 >= 0) {
            this.y = i14;
            this.A = 0.0f;
            if ((i14 != 2 && i14 != 1) || i9 == 2 || i9 == 1) {
                this.C = false;
            } else {
                this.C = true;
            }
        }
        this.a = i9;
        float f13 = this.A;
        if (f13 != 1.0f) {
            float f14 = f13 + 0.064f;
            this.A = f14;
            if (f14 >= 1.0f) {
                this.A = 1.0f;
                this.C = false;
            } else {
                invalidate();
            }
        }
        int d = this.A != 1.0f ? i0.a.d(this.A, a(f12, this.y), a(f12, i9)) : a(f12, i9);
        Paint paint = this.s;
        paint.setColor(d);
        canvas2.drawCircle(dp, measuredHeight, AndroidUtilities.dp(f10) / 2.0f, paint);
        boolean z12 = this.C;
        if (!z12) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
            if (!tL_chatInviteExported4.expired) {
                if (tL_chatInviteExported4.expire_date > 0) {
                }
            }
            tL_chatInviteExported = this.n;
            if (tL_chatInviteExported.subscription_pricing == null) {
                hh0Var.W.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                hh0Var.W.draw(canvas2);
            } else if (tL_chatInviteExported.revoked) {
                hh0Var.V.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                hh0Var.V.draw(canvas2);
            } else {
                hh0Var.U.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                hh0Var.U.draw(canvas2);
            }
            if (this.D) {
                return;
            }
            canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
            return;
        }
        if (z12) {
            f11 = this.B;
        }
        float f15 = f11;
        Paint paint2 = this.v;
        paint2.setColor(d);
        float dp2 = dp - AndroidUtilities.dp(20.0f);
        float dp3 = measuredHeight - AndroidUtilities.dp(20.0f);
        float dp4 = AndroidUtilities.dp(20.0f) + dp;
        float dp5 = AndroidUtilities.dp(20.0f) + measuredHeight;
        RectF rectF = this.w;
        rectF.set(dp2, dp3, dp4, dp5);
        if (this.A == 1.0f || (((i10 = this.y) == 2 || i10 == 1) && !this.C)) {
            float f16 = (-f15) * 360.0f;
            canvas.drawArc(rectF, -90.0f, f16, false, paint2);
            this.F.a(f16, 1.0f, canvas, paint2, rectF);
            canvas2 = canvas;
        } else {
            canvas2.save();
            float f17 = this.C ? 1.0f - this.A : this.A;
            float f18 = (float) ((0.3f * f17) + 0.7d);
            canvas2.scale(f18, f18, rectF.centerX(), rectF.centerY());
            float f19 = (-f15) * 360.0f;
            canvas2.drawArc(rectF, -90.0f, f19, false, paint2);
            this.F.a(f19, f17, canvas, paint2, rectF);
            canvas.restore();
            canvas2 = canvas;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) hh0Var).isPaused;
        if (!z10) {
            invalidate();
        }
        this.B = f15;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing == null) {
        }
        if (this.D) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
