package jg;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u extends FrameLayout {
    public final b6 a;
    public final xh.n b;
    public final b6 c;
    public final u6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public u(Context context, u6 u6Var) {
        super(context);
        this.d = u6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = y6.Oh;
        ShapeDrawable K = y6.K(dp, y6.x0(null, i10, false));
        b7 N = f7.N(i10);
        imageView.setBackground(K);
        f7.k(imageView, K, N, null, null);
        imageView.setOnClickListener(new ig.d0(this, 7));
        addView(imageView, kb1.m(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        b6 b6Var = new b6(context);
        this.a = b6Var;
        b6Var.setTextSize(15);
        f7.Y(b6Var, y6.G6, null);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(b6Var, kb1.m(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        b6 b6Var2 = new b6(context);
        this.c = b6Var2;
        b6Var2.setTextSize(14);
        int i11 = y6.z6;
        f7.Y(b6Var2, i11, null);
        b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(b6Var2, kb1.m(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xh.n nVar = new xh.n(context);
        this.b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        f7.V(nVar, i11, u6Var);
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.r = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, kb1.m(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = y6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = y6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), V0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        b6 b6Var = this.c;
        b6 b6Var2 = this.a;
        if (z11) {
            b6Var2.setPadding(b6Var.getTextWidth(), 0, 0, 0);
        } else {
            b6Var2.setPadding(0, 0, b6Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
