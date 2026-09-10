package hi;

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
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import v7.g8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t4 extends b0 implements org.telegram.ui.ActionBar.a6, r9 {
    public final int[] E;
    public final org.telegram.ui.ActionBar.f6 n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView v;
    public Bitmap w;
    public int x;
    public d3 y;

    public t4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new Paint(1);
        this.x = 0;
        this.E = new int[4];
        this.n = f6Var;
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
        addView(horizontalScrollView, w7.a6.e(-1, -2, 16));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.uf;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.x = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
        this.v.setColorFilter(new PorterDuffColorFilter(this.x, PorterDuff.Mode.SRC_IN));
        invalidate();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        int[] iArr = this.E;
        i(iArr);
        arrayList.add(g8.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, d3 d3Var) {
        t a2;
        this.a = aVar;
        this.y = d3Var;
        c(aVar);
        this.w = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = t.a(source, AndroidUtilities.dp(SharedConfig.fontSize + 4), false)) != null) {
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
        d3 d3Var;
        s9 textSelectionHelper;
        if (this.x != org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.n)) {
            e();
        }
        if (this.w == null || (d3Var = this.y) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.y() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R >= 0 && R >= textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
            i(this.E);
            canvas.drawRoundRect(r0[0], r0[1], r0[2], r0[3], AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.r);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
