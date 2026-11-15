package oi;

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
import c8.da;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class l4 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public w2 E;
    public boolean F;
    public final int[] G;
    public final e6 n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public l4(Context context, e6 e6Var) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.G = new int[4];
        this.n = e6Var;
        setWillNotDraw(false);
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f));
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
        addView(horizontalScrollView, ja.e(-1, -2, 16));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.lg));
        hashSet.add(Integer.valueOf(j6.G6));
    }

    public final void g(a aVar, w2 w2Var) {
        p a10;
        this.a = aVar;
        this.E = w2Var;
        c(aVar);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = p.a(source, org.telegram.messenger.g0.L(gz.W0 + 4), false)) != null) {
            this.x = a10.a;
        }
        this.w.setImageBitmap(this.x);
        invalidate();
    }

    public a getRow() {
        return this.a;
    }

    public final void h(int[] iArr) {
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
        iArr[0] = width2 - org.telegram.messenger.g0.L(4.0f);
        iArr[1] = paddingTop;
        iArr[2] = org.telegram.messenger.g0.L(4.0f) + width2 + width;
        iArr[3] = height;
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        int[] iArr = this.G;
        h(iArr);
        arrayList.add(da.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        w2 w2Var;
        h9 textSelectionHelper;
        if (this.y != j6.w0(j6.G6, this.n)) {
            updateColors();
        }
        if (this.x == null || (w2Var = this.E) == null || (textSelectionHelper = w2Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.x() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
            h(this.G);
            canvas.drawRoundRect(r0[0], r0[1], r0[2], r0[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.r);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = j6.lg;
        e6 e6Var = this.n;
        this.r.setColor(j6.w0(i7, e6Var));
        int w02 = j6.w0(j6.G6, e6Var);
        if (!this.F || w02 != this.y) {
            this.F = true;
            this.y = w02;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
