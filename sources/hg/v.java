package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final h5 a;
    public final vh.n b;
    public final h5 c;
    public final d6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public v(Context context, d6 d6Var) {
        super(context);
        this.d = d6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(h6.K(AndroidUtilities.dp(36.0f), h6.w0(null, h6.Oh, false)));
        imageView.setOnClickListener(new ai.v0(this, 25));
        addView(imageView, y5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(h6.w0(null, h6.G6, false));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var, y5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.c = h5Var2;
        h5Var2.setTextSize(14);
        int i10 = h6.z6;
        h5Var2.setTextColor(h6.w0(null, i10, false));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2, y5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        vh.n nVar = new vh.n(context);
        this.b = nVar;
        nVar.setTextSize(1, 13.0f);
        nVar.setMaxLines(1);
        nVar.setEllipsize(TextUtils.TruncateAt.END);
        nVar.setTextColor(h6.v0(i10, d6Var));
        nVar.setGravity(LocaleController.isRTL ? 5 : 3);
        nVar.f = false;
        nVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, y5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = h6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = h6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        h5 h5Var = this.c;
        h5 h5Var2 = this.a;
        if (z11) {
            h5Var2.setPadding(h5Var.getTextWidth(), 0, 0, 0);
        } else {
            h5Var2.setPadding(0, 0, h5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
