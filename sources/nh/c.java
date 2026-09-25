package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.rr;
import w7.y5;
import yf.p;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements e, x5 {
    public ShapeDrawable a;
    public final d6 b;
    public final f8 c;
    public final TextView d;
    public final le.c e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.e = new le.c(0, this, rr.h, 380L, false);
        this.b = d6Var;
        f8 f8Var = new f8(context, d6Var, false);
        this.c = f8Var;
        addView(f8Var, y5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, f fVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = h6.b0(AndroidUtilities.dp(10.0f), i0.a.k(h6.v0(h6.Wk, this.b), 25));
        }
        le.c cVar = this.e;
        if (cVar.f != z10 || z11) {
            cVar.a(z10, z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            le.c cVar = this.e;
            if (cVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, cVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        ShapeDrawable shapeDrawable = this.a;
        d6 d6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = h6.b0(AndroidUtilities.dp(10.0f), i0.a.k(h6.v0(h6.Wk, d6Var), 25));
            this.a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(h6.v0(h6.Wk, d6Var), TLRPC.LAYER));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.e.f;
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
