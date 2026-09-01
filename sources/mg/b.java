package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import k7.c6;
import oh.a4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b extends va {
    public final TextView U;
    public final FrameLayout V;
    public Drawable W;
    public Drawable a0;
    public TL_stories.Boost b0;
    public final a c0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.c0 = new a(getContext());
        this.V = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.U = textView;
        textView.setTextColor(k6.v0(k6.G6, this.y));
        this.U.setTypeface(AndroidUtilities.bold());
        this.U.setTextSize(12.0f);
        this.U.setGravity(17);
        this.V.addView(this.U, c6.c(22.0f, -2));
        this.V.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.V;
        boolean z4 = LocaleController.isRTL;
        addView(frameLayout, c6.d(-2, -2.0f, (z4 ? 3 : 5) | 48, z4 ? 9 : 0, 9.0f, z4 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        z8 z8Var = this.B;
        if (i10 == 12) {
            z8Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            z8Var.i(-10703110, -12481584);
        } else {
            z8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.b0;
    }

    @Override // org.telegram.ui.Cells.va
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.va, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.P) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, k6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.b0 = boost;
        boolean z4 = boost.gift;
        FrameLayout frameLayout = this.V;
        TextView textView = this.U;
        l5 l5Var = this.b;
        if (z4 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i10 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            a4 a4Var = this.a;
            z8 z8Var = this.B;
            if (j10 > 0) {
                l5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                z8Var.g(26);
                a4Var.e(null, z8Var);
                l5Var.i(null);
            } else if (boost.unclaimed) {
                l5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                z8Var.g(18);
                setAvatarColorByMonths(i10);
                a4Var.e(null, z8Var);
                l5Var.i(null);
            } else if (boost.user_id == -1) {
                l5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                z8Var.g(19);
                setAvatarColorByMonths(i10);
                a4Var.e(null, z8Var);
                l5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            l5 l5Var2 = this.c;
            if (j11 > 0) {
                l5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                l5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.a0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.a0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.a0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(k6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.W == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.W = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.W, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(k6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.l1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i11 = boost.multiplier;
        if (i11 > 0) {
            String valueOf = String.valueOf(i11);
            a aVar = this.c0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            l5Var.i(aVar);
        } else {
            l5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            l5Var.setPadding(0, l5Var.getPaddingTop(), 0, l5Var.getPaddingBottom());
        } else {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            l5Var.setPadding(LocaleController.isRTL ? dp : 0, l5Var.getPaddingTop(), LocaleController.isRTL ? 0 : dp, l5Var.getPaddingBottom());
        }
    }
}
