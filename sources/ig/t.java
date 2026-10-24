package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final n5 a;
    public final wh.n b;
    public final n5 c;
    public final g6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public t(Context context, g6 g6Var) {
        super(context);
        this.d = g6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = k6.Oh;
        ShapeDrawable K = k6.K(dp, k6.x0(null, i10, false));
        n6 O = r6.O(i10);
        imageView.setBackground(K);
        r6.k(imageView, K, O, null, null);
        imageView.setOnClickListener(new hg.r0(this, 6));
        addView(imageView, z5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.a = n5Var;
        n5Var.setTextSize(15);
        r6.Z(n5Var, k6.G6, null);
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(n5Var, z5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        n5 n5Var2 = new n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(14);
        int i11 = k6.z6;
        r6.Z(n5Var2, i11, null);
        n5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(n5Var2, z5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        wh.n nVar = new wh.n(context);
        this.b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.W(nVar, i11, g6Var);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.r = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = k6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = k6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), V0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        n5 n5Var = this.c;
        n5 n5Var2 = this.a;
        if (z11) {
            n5Var2.setPadding(n5Var.getTextWidth(), 0, 0, 0);
        } else {
            n5Var2.setPadding(0, 0, n5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
