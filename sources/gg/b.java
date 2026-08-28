package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import ih.d4;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends va {
    public final TextView T;
    public final FrameLayout U;
    public Drawable V;
    public Drawable W;
    public TL_stories.Boost a0;
    public final a b0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.b0 = new a(getContext());
        this.U = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.T = textView;
        textView.setTextColor(f6.v0(f6.G6, this.y));
        this.T.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(12.0f);
        this.T.setGravity(17);
        this.U.addView(this.T, e6.c(22.0f, -2));
        this.U.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.U;
        boolean z10 = LocaleController.isRTL;
        addView(frameLayout, e6.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i9) {
        z8 z8Var = this.A;
        if (i9 == 12) {
            z8Var.i(-31392, -2796986);
        } else if (i9 == 6) {
            z8Var.i(-10703110, -12481584);
        } else {
            z8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.a0;
    }

    @Override // org.telegram.ui.Cells.va
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.va, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, f6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.a0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.U;
        TextView textView = this.T;
        h5 h5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i9 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            d4 d4Var = this.a;
            z8 z8Var = this.A;
            if (j10 > 0) {
                h5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                z8Var.g(26);
                d4Var.e(null, z8Var);
                h5Var.i(null);
            } else if (boost.unclaimed) {
                h5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                z8Var.g(18);
                setAvatarColorByMonths(i9);
                d4Var.e(null, z8Var);
                h5Var.i(null);
            } else if (boost.user_id == -1) {
                h5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                z8Var.g(19);
                setAvatarColorByMonths(i9);
                d4Var.e(null, z8Var);
                h5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            h5 h5Var2 = this.c;
            if (j11 > 0) {
                h5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                h5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.W == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.W = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.W, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(f6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), f6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.V == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.V = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.V, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(f6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), f6.l1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i10 = boost.multiplier;
        if (i10 > 0) {
            String valueOf = String.valueOf(i10);
            a aVar = this.b0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            h5Var.i(aVar);
        } else {
            h5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            h5Var.setPadding(0, h5Var.getPaddingTop(), 0, h5Var.getPaddingBottom());
        } else {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            h5Var.setPadding(LocaleController.isRTL ? dp : 0, h5Var.getPaddingTop(), LocaleController.isRTL ? 0 : dp, h5Var.getPaddingBottom());
        }
    }
}
