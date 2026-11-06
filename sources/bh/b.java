package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import di.c4;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.w8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b extends pa {
    public final TextView b0;
    public final FrameLayout c0;
    public Drawable d0;
    public Drawable e0;
    public TL_stories.Boost f0;
    public final a g0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.g0 = new a(getContext());
        this.c0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.b0 = textView;
        textView.setTextColor(k6.w0(k6.G6, this.D));
        this.b0.setTypeface(g0.o());
        this.b0.setTextSize(12.0f);
        this.b0.setGravity(17);
        this.c0.addView(this.b0, ha.c(22.0f, -2));
        this.c0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.c0;
        boolean z9 = hd.a0;
        addView(frameLayout, ha.d(-2, -2.0f, (z9 ? 3 : 5) | 48, z9 ? 9 : 0, 9.0f, z9 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        w8 w8Var = this.E;
        if (i7 == 12) {
            w8Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            w8Var.i(-10703110, -12481584);
        } else {
            w8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(hd.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, k6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.f0 = boost;
        boolean z9 = boost.gift;
        FrameLayout frameLayout = this.c0;
        TextView textView = this.b0;
        k5 k5Var = this.b;
        if (z9 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i7 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            c4 c4Var = this.a;
            w8 w8Var = this.E;
            if (j3 > 0) {
                k5Var.l(hd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                w8Var.g(26);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            } else if (boost.unclaimed) {
                k5Var.l(hd.M0(2131753177, null), false);
                w8Var.g(18);
                setAvatarColorByMonths(i7);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            } else if (boost.user_id == -1) {
                k5Var.l(hd.M0(2131753178, null), false);
                w8Var.g(19);
                setAvatarColorByMonths(i7);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            }
            String format = hd.E0().o0().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            k5 k5Var2 = this.c;
            if (j10 > 0) {
                k5Var2.l(hd.a0(null, null, 2131753244, format), false);
            } else {
                k5Var2.l(hd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.e0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753501, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753492, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i10 = boost.multiplier;
        if (i10 > 0) {
            String valueOf = String.valueOf(i10);
            a aVar = this.g0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            k5Var.i(aVar);
        } else {
            k5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            k5Var.setPadding(0, k5Var.getPaddingTop(), 0, k5Var.getPaddingBottom());
        } else {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            k5Var.setPadding(hd.a0 ? L : 0, k5Var.getPaddingTop(), hd.a0 ? 0 : L, k5Var.getPaddingBottom());
        }
    }
}
