package ii;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import v7.p8;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class q4 extends a0 implements org.telegram.ui.ActionBar.z5, p9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.e6 n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView v;
    public Bitmap w;
    public int x;
    public a3 y;

    public q4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new Paint(1);
        this.x = 0;
        this.E = new int[4];
        this.n = e6Var;
        setWillNotDraw(false);
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.y5.e(-1, -2, 16));
        e();
    }

    private String getSource() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            return ((TL_iv.pageBlockMath) pageBlock).source;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = j6.uf;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        this.r.setColor(j6.v0(i10, e6Var));
        this.x = j6.v0(j6.G6, e6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(p8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, a3 a3Var) {
        s a2;
        this.a = aVar;
        this.y = a3Var;
        c(aVar);
        this.w = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = s.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
            this.w = a2.a;
        }
        this.v.setImageBitmap(this.w);
        invalidate();
    }

    public final void i(int[] iArr) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.w != null && this.v.getWidth() > this.s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.w;
        int width = bitmap != null ? bitmap.getWidth() : Math.max(1, getWidth() / 2);
        int width2 = (getWidth() - width) / 2;
        iArr[0] = width2 - AndroidUtilities.dp(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = AndroidUtilities.dp(4.0f) + width2 + width;
        iArr[3] = height;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a3 a3Var;
        q9 textSelectionHelper;
        if (this.x != j6.v0(j6.G6, this.n)) {
            e();
        }
        if (this.w == null || (a3Var = this.y) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.y() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int S = RecyclerView.S(this);
        if (S >= 0 && S >= textSelectionHelper.u0 && S <= textSelectionHelper.x0) {
            i(this.E);
            canvas.drawRoundRect(r0[0], r0[1], r0[2], r0[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.r);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
