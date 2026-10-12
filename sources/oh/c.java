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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.es;
import w7.a6;
import zf.q;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements ne.d, x5 {
    public ShapeDrawable a;
    public final c6 b;
    public final f8 c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, c6 c6Var) {
        super(context);
        this.e = new ne.b(0, this, es.h, 380L, false);
        this.b = c6Var;
        f8 f8Var = new f8(context, c6Var, false);
        this.c = f8Var;
        addView(f8Var, a6.a(45.0f, 0.0f, 8.0f, 0.0f, 0.0f, 45, 49));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, a6.a(-2.0f, 6.0f, 0.0f, 6.0f, 5.0f, -1, 80));
        d();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = g6.c0(AndroidUtilities.dp(10.0f), i0.a.k(g6.w0(g6.Wk, this.b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f != z10 || z11) {
            bVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        ShapeDrawable shapeDrawable = this.a;
        c6 c6Var = this.b;
        if (shapeDrawable != null) {
            ShapeDrawable c02 = g6.c0(AndroidUtilities.dp(10.0f), i0.a.k(g6.w0(g6.Wk, c6Var), 25));
            this.a = c02;
            c02.setAlpha((int) (this.e.e * 255.0f));
        }
        this.d.setTextColor(i0.a.k(g6.w0(g6.Wk, c6Var), 229));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            ne.b bVar = this.e;
            if (bVar.e > 0.0f) {
                shapeDrawable.setBounds(0, 0, getWidth(), getHeight());
                q.b(canvas, this.a, AndroidUtilities.lerp(0.9f, 1.0f, bVar.e));
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

    @Override // ne.d
    public final void p(int i10, float f7, float f10, e eVar) {
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            shapeDrawable.setAlpha((int) (f7 * 255.0f));
        }
        invalidate();
    }

    public void setPack(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d.setText(tL_messages_stickerSet.set.short_name);
        this.c.d(!tL_messages_stickerSet.documents.isEmpty() ? tL_messages_stickerSet.documents.get(0) : null, null, null, null, false, false);
    }

    @Override // ne.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
