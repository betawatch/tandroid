package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e8;
import org.telegram.ui.Components.bs;
import w7.z5;
import zf.p;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class c extends FrameLayout implements ne.d, b6 {
    public ShapeDrawable a;
    public final g6 b;
    public final e8 c;
    public final TextView d;
    public final ne.b e;

    public c(Context context, g6 g6Var) {
        super(context);
        this.e = new ne.b(0, this, bs.h, 380L, false);
        this.b = g6Var;
        e8 e8Var = new e8(context, g6Var, false);
        this.c = e8Var;
        addView(e8Var, z5.d(45, 45.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 10.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        addView(textView, z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 5.0f));
        updateColors();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 && this.a == null) {
            this.a = k6.c0(AndroidUtilities.dp(10.0f), i0.a.o(k6.w0(k6.Wk, this.b), 25));
        }
        ne.b bVar = this.e;
        if (bVar.f != z10 || z11) {
            bVar.a(z10, z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Wk));
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

    @Override // android.view.View
    public final boolean isSelected() {
        return this.e.f;
    }

    @Override // ne.d
    public final void o(int i10, float f7, float f10, e eVar) {
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.a;
        g6 g6Var = this.b;
        if (shapeDrawable != null) {
            k6.z1(i0.a.o(k6.w0(k6.Wk, g6Var), 25), shapeDrawable);
            this.a.setAlpha((int) (this.e.e * 255.0f));
            invalidate();
        }
        this.d.setTextColor(i0.a.o(k6.w0(k6.Wk, g6Var), 229));
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
