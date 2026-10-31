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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lc0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public lc0(Context context) {
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
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.widget.TextView, jg.b, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        g9 g9Var;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            org.telegram.messenger.v20 v20Var = (org.telegram.messenger.v20) arrayList.get(i12);
            byte b10 = v20Var.a;
            View view = null;
            if (b10 == 0) {
                g9 g9Var2 = new g9(getContext());
                g9Var2.setLayerNum(12);
                g9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = g9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.w0 = true;
                    imageReceiver.u0 = false;
                    if (z11) {
                        imageReceiver.g1 = new au(9);
                    }
                }
                imageReceiver.u0(org.telegram.messenger.ic.b(v20Var.B), null, null, null, org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(v20Var.B.thumbs, 90, false, null, false), v20Var.B), null, null, 0L, "webp", v20Var.C, 1);
                if ((v20Var.b & 2) != 0) {
                    g9Var2.setScaleX(-1.0f);
                }
                v20Var.I = g9Var2;
                g9Var = g9Var2;
            } else {
                if (b10 == 1) {
                    ?? kc0Var = new kc0(getContext());
                    kc0Var.setBackgroundColor(0);
                    kc0Var.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
                    kc0Var.setTextSize(0, v20Var.m);
                    kc0Var.setTypeface(v20Var.n.d());
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.k6.m(v20Var.j, kc0Var.getPaint().getFontMetricsInt(), false, null, 0));
                    ArrayList arrayList2 = v20Var.k;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        org.telegram.messenger.u20 u20Var = (org.telegram.messenger.u20) obj;
                        o5 o5Var = new o5(u20Var.document_id, kc0Var.getPaint().getFontMetricsInt());
                        int i14 = u20Var.offset;
                        spannableString.setSpan(o5Var, i14, u20Var.length + i14, 33);
                    }
                    org.telegram.messenger.h6[] h6VarArr = (org.telegram.messenger.h6[]) spannableString.getSpans(0, spannableString.length(), org.telegram.messenger.h6.class);
                    if (h6VarArr != null) {
                        for (org.telegram.messenger.h6 h6Var : h6VarArr) {
                            h6Var.b = 0.85f;
                        }
                    }
                    kc0Var.setText(spannableString);
                    int i15 = 17;
                    kc0Var.setGravity(17);
                    int i16 = v20Var.p;
                    if (i16 != 1) {
                        i10 = 2;
                        i15 = i16 != 2 ? 19 : 21;
                    } else {
                        i10 = 2;
                    }
                    kc0Var.setGravity(i15);
                    int i17 = v20Var.p;
                    if (i17 != 1) {
                        i11 = 3;
                        if (i17 == i10 ? org.telegram.messenger.cd.X : !org.telegram.messenger.cd.X) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 4;
                    }
                    kc0Var.setTextAlignment(i11);
                    kc0Var.setHorizontallyScrolling(false);
                    kc0Var.setImeOptions(TLObject.FLAG_28);
                    kc0Var.setFocusableInTouchMode(true);
                    kc0Var.setEnabled(false);
                    kc0Var.setInputType(kc0Var.getInputType() | TLObject.FLAG_14);
                    kc0Var.setBreakStrategy(0);
                    kc0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i18 = v20Var.l;
                    byte b11 = v20Var.b;
                    if (b11 == 0) {
                        kc0Var.setFrameColor(i18);
                        i18 = org.telegram.messenger.i0.B(v20Var.l) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        kc0Var.setFrameColor(org.telegram.messenger.i0.B(i18) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b11 == 2) {
                        kc0Var.setFrameColor(org.telegram.messenger.i0.B(i18) >= 0.25f ? -16777216 : -1);
                    } else {
                        kc0Var.setFrameColor(0);
                    }
                    kc0Var.setTextColor(i18);
                    kc0Var.setCursorColor(i18);
                    kc0Var.setHandlesColor(i18);
                    kc0Var.setHighlightColor(org.telegram.ui.ActionBar.t6.r1(0.4f, i18));
                    v20Var.I = kc0Var;
                    g9Var = kc0Var;
                }
                if (view == null) {
                    addView(view);
                    view.setRotation((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d));
                    this.b.put(view, v20Var);
                }
            }
            view = g9Var;
            if (view == null) {
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setVisibility(0);
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
        float max = Math.max(measuredWidth / org.telegram.messenger.i0.L(120.0f), measuredHeight / org.telegram.messenger.i0.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 1.0f / max;
        canvas.scale(f7, f7);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                org.telegram.messenger.v20 v20Var = (org.telegram.messenger.v20) this.b.get(childAt);
                if (v20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof jg.b) {
                        if (v20Var.A) {
                            i14 = ((int) (((v20Var.f / 2.0f) + v20Var.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (((v20Var.g / 2.0f) + v20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i14 = ((int) (measuredWidth * v20Var.y)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (measuredHeight2 * v20Var.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i15 = i16 - measuredHeight;
                    } else {
                        i14 = (int) (measuredWidth * v20Var.c);
                        i15 = (int) (measuredHeight2 * v20Var.d);
                    }
                    childAt.layout(i14, i15, measuredWidth2 + i14, measuredHeight3 + i15);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                org.telegram.messenger.v20 v20Var = (org.telegram.messenger.v20) this.b.get(childAt);
                if (v20Var != null) {
                    if (childAt instanceof jg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(v20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = v20Var.A ? (v20Var.f * getMeasuredWidth()) / v20Var.q : v20Var.v * ((v20Var.w * measuredWidth) / v20Var.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * v20Var.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * v20Var.g), TLObject.FLAG_30));
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
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f7));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f7);
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
