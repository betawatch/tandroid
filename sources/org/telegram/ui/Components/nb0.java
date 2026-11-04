package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nb0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public nb0(Context context) {
        super(context);
        this.e = true;
    }

    public final void a() {
        this.a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, ug.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        int i3;
        int i10;
        k9 k9Var;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) arrayList.get(i11);
            byte b10 = z10Var.a;
            View view = null;
            if (b10 == 0) {
                k9 k9Var2 = new k9(getContext());
                k9Var2.setLayerNum(12);
                k9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = k9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.x0 = true;
                    imageReceiver.v0 = false;
                    if (z11) {
                        imageReceiver.h1 = new a3(23);
                    }
                }
                imageReceiver.u0(org.telegram.messenger.ac.b(z10Var.B), null, null, null, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(z10Var.B.thumbs, 90, false, null, false), z10Var.B), null, null, 0L, "webp", z10Var.C, 1);
                if ((z10Var.b & 2) != 0) {
                    k9Var2.setScaleX(-1.0f);
                }
                z10Var.I = k9Var2;
                k9Var = k9Var2;
            } else {
                if (b10 == 1) {
                    ?? mb0Var = new mb0(getContext());
                    mb0Var.setBackgroundColor(0);
                    mb0Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
                    mb0Var.setTextSize(0, z10Var.m);
                    mb0Var.setTypeface(z10Var.n.d());
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.i6.m(z10Var.j, mb0Var.getPaint().getFontMetricsInt(), false, null, 0));
                    ArrayList arrayList2 = z10Var.k;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) obj;
                        p5 p5Var = new p5(y10Var.document_id, mb0Var.getPaint().getFontMetricsInt());
                        int i13 = y10Var.offset;
                        spannableString.setSpan(p5Var, i13, y10Var.length + i13, 33);
                    }
                    org.telegram.messenger.f6[] f6VarArr = (org.telegram.messenger.f6[]) spannableString.getSpans(0, spannableString.length(), org.telegram.messenger.f6.class);
                    if (f6VarArr != null) {
                        for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                            f6Var.b = 0.85f;
                        }
                    }
                    mb0Var.setText(spannableString);
                    int i14 = 17;
                    mb0Var.setGravity(17);
                    int i15 = z10Var.p;
                    if (i15 != 1) {
                        i3 = 2;
                        i14 = i15 != 2 ? 19 : 21;
                    } else {
                        i3 = 2;
                    }
                    mb0Var.setGravity(i14);
                    int i16 = z10Var.p;
                    if (i16 != 1) {
                        i10 = 3;
                        if (i16 == i3 ? org.telegram.messenger.bd.a0 : !org.telegram.messenger.bd.a0) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 4;
                    }
                    mb0Var.setTextAlignment(i10);
                    mb0Var.setHorizontallyScrolling(false);
                    mb0Var.setImeOptions(TLObject.FLAG_28);
                    mb0Var.setFocusableInTouchMode(true);
                    mb0Var.setEnabled(false);
                    mb0Var.setInputType(mb0Var.getInputType() | TLObject.FLAG_14);
                    mb0Var.setBreakStrategy(0);
                    mb0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i17 = z10Var.l;
                    byte b11 = z10Var.b;
                    if (b11 == 0) {
                        mb0Var.setFrameColor(i17);
                        i17 = org.telegram.messenger.g0.B(z10Var.l) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        mb0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b11 == 2) {
                        mb0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -16777216 : -1);
                    } else {
                        mb0Var.setFrameColor(0);
                    }
                    mb0Var.setTextColor(i17);
                    mb0Var.setCursorColor(i17);
                    mb0Var.setHandlesColor(i17);
                    mb0Var.setHighlightColor(org.telegram.ui.ActionBar.k6.r1(0.4f, i17));
                    z10Var.I = mb0Var;
                    k9Var = mb0Var;
                }
                if (view == null) {
                    addView(view);
                    view.setRotation((float) (((-z10Var.e) / 3.141592653589793d) * 180.0d));
                    this.b.put(view, z10Var);
                }
            }
            view = k9Var;
            if (view == null) {
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.e) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / org.telegram.messenger.g0.L(120.0f), measuredHeight / org.telegram.messenger.g0.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / max;
        canvas.scale(f10, f10);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.b.get(childAt);
                if (z10Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof ug.b) {
                        if (z10Var.A) {
                            i13 = ((int) (((z10Var.f / 2.0f) + z10Var.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((z10Var.g / 2.0f) + z10Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * z10Var.y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * z10Var.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * z10Var.c);
                        i14 = (int) (measuredHeight2 * z10Var.d);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.b.get(childAt);
                if (z10Var != null) {
                    if (childAt instanceof ug.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(z10Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = z10Var.A ? (z10Var.f * getMeasuredWidth()) / z10Var.q : z10Var.v * ((z10Var.w * measuredWidth) / z10Var.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * z10Var.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * z10Var.g), TLObject.FLAG_30));
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f10));
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
