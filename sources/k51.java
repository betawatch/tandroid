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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k51 extends FrameLayout {
    public final lka a;
    public final xna b;
    public final lka c;
    public final ylb d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public k51(Context context, ylb ylbVar) {
        super(context);
        this.d = ylbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(gm.L(9.0f), gm.L(9.0f), gm.L(9.0f), gm.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(36.0f);
        int i = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.w0(null, i, false));
        wmb M = anb.M(i);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, null);
        imageView.setOnClickListener(new j1(this, (byte) 27));
        addView(imageView, qoe.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(15);
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        addView(lkaVar, qoe.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.c = lkaVar2;
        lkaVar2.setTextSize(14);
        int i2 = cmb.y6;
        anb.W(lkaVar2, i2, null);
        lkaVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(lkaVar2, qoe.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        xna xnaVar = new xna(context);
        this.b = xnaVar;
        xnaVar.setTextSize(1, 13.0f);
        xnaVar.setMaxLines(1);
        xnaVar.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(xnaVar, i2, ylbVar);
        xnaVar.setGravity(jb6.a0 ? 5 : 3);
        xnaVar.r = false;
        xnaVar.setUseAlphaForEmoji(false);
        nm7.i(xnaVar);
        addView(xnaVar, qoe.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = cmb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = jb6.a0;
        lka lkaVar = this.c;
        lka lkaVar2 = this.a;
        if (z2) {
            lkaVar2.setPadding(lkaVar.getTextWidth(), 0, 0, 0);
        } else {
            lkaVar2.setPadding(0, 0, lkaVar.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
