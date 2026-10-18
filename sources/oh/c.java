package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Components.bs;
import w7.z5;
import zf.p;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ne.d, y5 {
    public ShapeDrawable a;
    public final d6 b;
    public final e8 c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, d6 d6Var) {
        super(context);
        this.e = new ne.b(0, this, bs.h, 380L, false);
        this.b = d6Var;
        e8 e8Var = new e8(context, d6Var, false);
        this.c = e8Var;
        addView(e8Var, z5.a(45.0f, 0.0f, 8.0f, 0.0f, 0.0f, 45, 49));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 5.0f, -1, 80));
        d();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = h6.c0(AndroidUtilities.dp(10.0f), i0.a.o(h6.w0(h6.Wk, this.b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f != z10 || z11) {
            bVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        ShapeDrawable shapeDrawable = this.a;
        d6 d6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable c02 = h6.c0(AndroidUtilities.dp(10.0f), i0.a.o(h6.w0(h6.Wk, d6Var), 25));
            this.a = c02;
            c02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.o(h6.w0(h6.Wk, d6Var), 229));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            ne.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                p.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
            }
        }
        super.dispatchDraw(canvas);
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

    @Override // ne.d
    public final void u(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
