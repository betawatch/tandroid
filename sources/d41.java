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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d41 extends FrameLayout {
    public final jia a;
    public final wla b;
    public final jia c;
    public final wjb d;
    public boolean e;
    public TL_account.TL_businessChatLink f;

    public d41(Context context, wjb wjbVar) {
        super(context);
        this.d = wjbVar;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(gl.L(9.0f), gl.L(9.0f), gl.L(9.0f), gl.L(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gl.L(36.0f);
        int i = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.w0(null, i, false));
        vkb M = zkb.M(i);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, null);
        imageView.setOnClickListener(new j1(this, (byte) 24));
        addView(imageView, nme.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(15);
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        addView(jiaVar, nme.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        int i2 = bkb.y6;
        zkb.W(jiaVar2, i2, null);
        jiaVar2.setGravity(k96.a0 ? 3 : 5);
        addView(jiaVar2, nme.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        wla wlaVar = new wla(context);
        this.b = wlaVar;
        wlaVar.setTextSize(1, 13.0f);
        wlaVar.setMaxLines(1);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(wlaVar, i2, wjbVar);
        wlaVar.setGravity(k96.a0 ? 5 : 3);
        wlaVar.r = false;
        wlaVar.setUseAlphaForEmoji(false);
        kk7.i(wlaVar);
        addView(wlaVar, nme.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = bkb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(k96.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - gl.L(k96.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = k96.a0;
        jia jiaVar = this.c;
        jia jiaVar2 = this.a;
        if (z2) {
            jiaVar2.setPadding(jiaVar.getTextWidth(), 0, 0, 0);
        } else {
            jiaVar2.setPadding(0, 0, jiaVar.getTextWidth(), 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }
}
