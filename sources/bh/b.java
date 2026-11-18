package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import fi.t3;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Components.b9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b extends qa {
    public final TextView c0;
    public final FrameLayout d0;
    public Drawable e0;
    public Drawable f0;
    public TL_stories.Boost g0;
    public final a h0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.h0 = new a(getContext());
        this.d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextColor(n6.w0(n6.G6, this.E));
        this.c0.setTypeface(g0.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, ma.c(22.0f, -2));
        this.d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z10 = gd.a0;
        addView(frameLayout, ma.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        b9 b9Var = this.F;
        if (i7 == 12) {
            b9Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            b9Var.i(-10703110, -12481584);
        } else {
            b9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.qa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(gd.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (gd.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, n6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        n5 n5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i7 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            t3 t3Var = this.a;
            b9 b9Var = this.F;
            if (j3 > 0) {
                n5Var.l(gd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                b9Var.g(26);
                t3Var.f(null, b9Var);
                n5Var.i(null);
            } else if (boost.unclaimed) {
                n5Var.l(gd.M0(2131753175, null), false);
                b9Var.g(18);
                setAvatarColorByMonths(i7);
                t3Var.f(null, b9Var);
                n5Var.i(null);
            } else if (boost.user_id == -1) {
                n5Var.l(gd.M0(2131753176, null), false);
                b9Var.g(19);
                setAvatarColorByMonths(i7);
                t3Var.f(null, b9Var);
                n5Var.i(null);
            }
            String format = gd.E0().o0().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            n5 n5Var2 = this.c;
            if (j10 > 0) {
                n5Var2.l(gd.a0(null, null, 2131753242, format), false);
            } else {
                n5Var2.l(gd.a0(null, null, 2131753522, format), false);
            }
            if (boost.gift) {
                if (this.f0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(gd.M0(2131753499, null));
                frameLayout.setBackground(n6.e0(g0.L(12.0f), g0.L(12.0f), n6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(gd.M0(2131753490, null));
                frameLayout.setBackground(n6.e0(g0.L(12.0f), g0.L(12.0f), n6.r1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i10 = boost.multiplier;
        if (i10 > 0) {
            String valueOf = String.valueOf(i10);
            a aVar = this.h0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            n5Var.i(aVar);
        } else {
            n5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            n5Var.setPadding(0, n5Var.getPaddingTop(), 0, n5Var.getPaddingBottom());
        } else {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            n5Var.setPadding(gd.a0 ? L : 0, n5Var.getPaddingTop(), gd.a0 ? 0 : L, n5Var.getPaddingBottom());
        }
    }
}
