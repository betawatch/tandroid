package bi;

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
import java.util.HashSet;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class a5 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public i3 D;
    public boolean E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.p6 n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public a5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.F = new int[4];
        this.n = p6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setPadding(0, 0, 0, 0);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        addView(horizontalScrollView, w7.b6.e(-1, -2, 16));
        updateColors();
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    public final void g(a aVar, i3 i3Var) {
        u a2;
        this.a = aVar;
        this.D = i3Var;
        c(aVar);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a2 = u.a(source, org.telegram.messenger.i0.L(tz.W0 + 4), false)) != null) {
            this.x = a2.a;
        }
        this.w.setImageBitmap(this.x);
        invalidate();
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        int[] iArr = this.F;
        j(iArr);
        arrayList.add(v7.b5.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    public final void j(int[] iArr) {
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (this.x != null && this.w.getWidth() > this.s.getWidth()) {
            iArr[0] = getPaddingLeft();
            iArr[1] = paddingTop;
            iArr[2] = getWidth() - getPaddingRight();
            iArr[3] = height;
            return;
        }
        Bitmap bitmap = this.x;
        int width = bitmap != null ? bitmap.getWidth() : Math.max(1, getWidth() / 2);
        int width2 = (getWidth() - width) / 2;
        iArr[0] = width2 - org.telegram.messenger.i0.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = org.telegram.messenger.i0.L(4.0f) + width2 + width;
        iArr[3] = height;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i3 i3Var;
        k9 textSelectionHelper;
        if (this.y != org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.n)) {
            updateColors();
        }
        if (this.x == null || (i3Var = this.D) == null || (textSelectionHelper = i3Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.x() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
            j(this.F);
            canvas.drawRoundRect(r0[0], r0[1], r0[2], r0[3], org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.r);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.ig;
        org.telegram.ui.ActionBar.p6 p6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var);
        if (!this.E || w02 != this.y) {
            this.E = true;
            this.y = w02;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
