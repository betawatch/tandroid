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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final j5 a;
    public final vh.o b;
    public final j5 c;
    public final e6 d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public v(Context context, e6 e6Var) {
        super(context);
        this.d = e6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(i6.K(AndroidUtilities.dp(36.0f), i6.w0(null, i6.Oh, false)));
        imageView.setOnClickListener(new ai.v0(this, 25));
        addView(imageView, x5.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.a = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTextColor(i6.w0(null, i6.G6, false));
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j5Var, x5.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        j5 j5Var2 = new j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(14);
        int i10 = i6.z6;
        j5Var2.setTextColor(i6.w0(null, i10, false));
        j5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j5Var2, x5.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        vh.o oVar = new vh.o(context);
        this.b = oVar;
        oVar.setTextSize(1, 13.0f);
        oVar.setMaxLines(1);
        oVar.setEllipsize(TextUtils.TruncateAt.END);
        oVar.setTextColor(i6.v0(i10, e6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.f = false;
        oVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(oVar);
        addView(oVar, x5.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint T0 = i6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = i6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        j5 j5Var = this.c;
        j5 j5Var2 = this.a;
        if (z11) {
            j5Var2.setPadding(j5Var.getTextWidth(), 0, 0, 0);
        } else {
            j5Var2.setPadding(0, 0, j5Var.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
