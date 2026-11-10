package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import di.d4;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.v8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        textView.setTextColor(m6.w0(m6.G6, this.D));
        this.b0.setTypeface(g0.o());
        this.b0.setTextSize(12.0f);
        this.b0.setGravity(17);
        this.c0.addView(this.b0, ha.c(22.0f, -2));
        this.c0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.c0;
        boolean z9 = id.a0;
        addView(frameLayout, ha.d(-2, -2.0f, (z9 ? 3 : 5) | 48, z9 ? 9 : 0, 9.0f, z9 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        v8 v8Var = this.E;
        if (i7 == 12) {
            v8Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            v8Var.i(-10703110, -12481584);
        } else {
            v8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(id.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, m6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.f0 = boost;
        boolean z9 = boost.gift;
        FrameLayout frameLayout = this.c0;
        TextView textView = this.b0;
        m5 m5Var = this.b;
        if (z9 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i7 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            d4 d4Var = this.a;
            v8 v8Var = this.E;
            if (j3 > 0) {
                m5Var.l(id.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                v8Var.g(26);
                d4Var.e(null, v8Var);
                m5Var.i(null);
            } else if (boost.unclaimed) {
                m5Var.l(id.M0(2131753177, null), false);
                v8Var.g(18);
                setAvatarColorByMonths(i7);
                d4Var.e(null, v8Var);
                m5Var.i(null);
            } else if (boost.user_id == -1) {
                m5Var.l(id.M0(2131753178, null), false);
                v8Var.g(19);
                setAvatarColorByMonths(i7);
                d4Var.e(null, v8Var);
                m5Var.i(null);
            }
            String format = id.E0().o0().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            m5 m5Var2 = this.c;
            if (j10 > 0) {
                m5Var2.l(id.a0(null, null, 2131753244, format), false);
            } else {
                m5Var2.l(id.a0(null, null, 2131753524, format), false);
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
                textView.setText(id.M0(2131753501, null));
                frameLayout.setBackground(m6.e0(g0.L(12.0f), g0.L(12.0f), m6.r1(0.2f, -3240417)));
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
                textView.setText(id.M0(2131753492, null));
                frameLayout.setBackground(m6.e0(g0.L(12.0f), g0.L(12.0f), m6.r1(0.2f, -13397548)));
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
            m5Var.i(aVar);
        } else {
            m5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            m5Var.setPadding(0, m5Var.getPaddingTop(), 0, m5Var.getPaddingBottom());
        } else {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            m5Var.setPadding(id.a0 ? L : 0, m5Var.getPaddingTop(), id.a0 ? 0 : L, m5Var.getPaddingBottom());
        }
    }
}
