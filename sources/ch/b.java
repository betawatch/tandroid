package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ei.d4;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends pa {
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
        textView.setTextColor(k6.w0(k6.G6, this.E));
        this.c0.setTypeface(g0.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, mf.c(22.0f, -2));
        this.d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z10 = bd.a0;
        addView(frameLayout, mf.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i3) {
        u8 u8Var = this.F;
        if (i3 == 12) {
            u8Var.i(-31392, -2796986);
        } else if (i3 == 6) {
            u8Var.i(-10703110, -12481584);
        } else {
            u8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.g0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(bd.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (bd.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, k6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        k5 k5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i3 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            d4 d4Var = this.a;
            u8 u8Var = this.F;
            if (j10 > 0) {
                k5Var.l(bd.G((int) j10, "BoostingBoostStars", new Object[0]), false);
                u8Var.g(26);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            } else if (boost.unclaimed) {
                k5Var.l(bd.M0(2131753177, null), false);
                u8Var.g(18);
                setAvatarColorByMonths(i3);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            } else if (boost.user_id == -1) {
                k5Var.l(bd.M0(2131753178, null), false);
                u8Var.g(19);
                setAvatarColorByMonths(i3);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            }
            String format = bd.E0().o0().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            k5 k5Var2 = this.c;
            if (j11 > 0) {
                k5Var2.l(bd.a0(null, null, 2131753244, format), false);
            } else {
                k5Var2.l(bd.a0(null, null, 2131753524, format), false);
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
                textView.setText(bd.M0(2131753501, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -3240417)));
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
                textView.setText(bd.M0(2131753492, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -13397548)));
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
            k5Var.i(aVar);
        } else {
            k5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            k5Var.setPadding(0, k5Var.getPaddingTop(), 0, k5Var.getPaddingBottom());
        } else {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            k5Var.setPadding(bd.a0 ? L : 0, k5Var.getPaddingTop(), bd.a0 ? 0 : L, k5Var.getPaddingBottom());
        }
    }
}
