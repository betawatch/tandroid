package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout implements xd.b, a6 {
    public ShapeDrawable a;
    public final f6 b;
    public final d8 c;
    public final TextView d;
    public final xd.a e;

    public e(Context context, f6 f6Var) {
        super(context);
        this.e = new xd.a(0, this, nr.h, 380L, false);
        this.b = f6Var;
        d8 d8Var = new d8(context, f6Var, false);
        this.c = d8Var;
        addView(d8Var, b6.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        e();
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f10 * 255.0f));
        }
        invalidate();
    }

    public final void a(boolean z4, boolean z10) {
        if (z4 && this.a == null) {
            this.a = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, this.b), 25));
        }
        xd.a aVar = this.e;
        if (aVar.f != z4 || z10) {
            aVar.a(z4, z10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            xd.a aVar = this.e;
            if (aVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                r.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, aVar.e));
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        ShapeDrawable shapeDrawable = this.a;
        f6 f6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable b02 = j6.b0(AndroidUtilities.dp(10.0f), i0.a.k(j6.v0(j6.Wk, f6Var), 25));
            this.a = b02;
            b02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(j6.v0(j6.Wk, f6Var), TLRPC.LAYER));
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

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
