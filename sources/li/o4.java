package li;

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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class o4 extends y implements org.telegram.ui.ActionBar.a6, h9 {
    public y2 D;
    public boolean E;
    public final int[] F;
    public final f6 n;
    public final Paint r;
    public final HorizontalScrollView s;
    public final ImageView w;
    public Bitmap x;
    public int y;

    public o4(Context context, f6 f6Var) {
        super(context);
        this.r = new Paint(1);
        this.y = 0;
        this.F = new int[4];
        this.n = f6Var;
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
        addView(horizontalScrollView, ha.e(-1, -2, 16));
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    public final void g(a aVar, y2 y2Var) {
        q a10;
        this.a = aVar;
        this.D = y2Var;
        c(aVar);
        this.x = null;
        this.s.scrollTo(0, 0);
        String source = getSource();
        if (!TextUtils.isEmpty(source) && (a10 = q.a(source, org.telegram.messenger.g0.L(iz.W0 + 4), false)) != null) {
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

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        int[] iArr = this.F;
        h(iArr);
        arrayList.add(c8.m1.a(iArr[0], iArr[1], iArr[2], iArr[3]));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y2 y2Var;
        i9 textSelectionHelper;
        if (this.y != k6.w0(k6.G6, this.n)) {
            updateColors();
        }
        if (this.x == null || (y2Var = this.D) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null || !textSelectionHelper.x() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R >= 0 && R >= textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
            h(this.F);
            canvas.drawRoundRect(r0[0], r0[1], r0[2], r0[3], org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.r);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = k6.ig;
        f6 f6Var = this.n;
        this.r.setColor(k6.w0(i7, f6Var));
        int w02 = k6.w0(k6.G6, f6Var);
        if (!this.E || w02 != this.y) {
            this.E = true;
            this.y = w02;
            this.w.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
