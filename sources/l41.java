// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l41 extends FrameLayout {
    public final ema a;
    public final tpa b;
    public final ema c;
    public final vnb d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public l41(Context context, vnb vnbVar) {
        super(context);
        this.d = vnbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(hl.L(9.0f), hl.L(9.0f), hl.L(9.0f), hl.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(36.0f);
        int i = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.w0(null, i, false));
        uob M = yob.M(i);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, null);
        imageView.setOnClickListener(new k1(this, (byte) 26));
        addView(imageView, tre.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(15);
        yob.W(emaVar, aob.G6, null);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        addView(emaVar, tre.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(14);
        int i2 = aob.z6;
        yob.W(emaVar2, i2, null);
        emaVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(emaVar2, tre.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        tpa tpaVar = new tpa(context);
        this.b = tpaVar;
        tpaVar.setTextSize(1, 13.0f);
        tpaVar.setMaxLines(1);
        tpaVar.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(tpaVar, i2, vnbVar);
        tpaVar.setGravity(ob6.a0 ? 5 : 3);
        tpaVar.r = false;
        tpaVar.setUseAlphaForEmoji(false);
        jn7.i(tpaVar);
        addView(tpaVar, tre.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = aob.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = aob.j0;
            }
            canvas.drawRect(hl.L(ob6.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - hl.L(ob6.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = ob6.a0;
        ema emaVar = this.c;
        ema emaVar2 = this.a;
        if (z2) {
            emaVar2.setPadding(emaVar.getTextWidth(), 0, 0, 0);
        } else {
            emaVar2.setPadding(0, 0, emaVar.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
