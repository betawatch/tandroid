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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ec0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public ec0(Context context) {
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, tg.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        int i7;
        int i10;
        q9 q9Var;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) arrayList.get(i11);
            byte b10 = d20Var.a;
            View view = null;
            if (b10 == 0) {
                q9 q9Var2 = new q9(getContext());
                q9Var2.setLayerNum(12);
                q9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = q9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.x0 = true;
                    imageReceiver.v0 = false;
                    if (z11) {
                        imageReceiver.h1 = new xb0(1);
                    }
                }
                imageReceiver.u0(org.telegram.messenger.gc.b(d20Var.B), null, null, null, org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(d20Var.B.thumbs, 90, false, null, false), d20Var.B), null, null, 0L, "webp", d20Var.C, 1);
                if ((d20Var.b & 2) != 0) {
                    q9Var2.setScaleX(-1.0f);
                }
                d20Var.I = q9Var2;
                q9Var = q9Var2;
            } else {
                if (b10 == 1) {
                    ?? dc0Var = new dc0(getContext());
                    dc0Var.setBackgroundColor(0);
                    dc0Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
                    dc0Var.setTextSize(0, d20Var.m);
                    dc0Var.setTypeface(d20Var.n.d());
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.j6.m(d20Var.j, dc0Var.getPaint().getFontMetricsInt(), false, null, 0));
                    ArrayList arrayList2 = d20Var.k;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                        y5 y5Var = new y5(c20Var.document_id, dc0Var.getPaint().getFontMetricsInt());
                        int i13 = c20Var.offset;
                        spannableString.setSpan(y5Var, i13, c20Var.length + i13, 33);
                    }
                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannableString.getSpans(0, spannableString.length(), org.telegram.messenger.g6.class);
                    if (g6VarArr != null) {
                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    dc0Var.setText(spannableString);
                    int i14 = 17;
                    dc0Var.setGravity(17);
                    int i15 = d20Var.p;
                    if (i15 != 1) {
                        i7 = 2;
                        i14 = i15 != 2 ? 19 : 21;
                    } else {
                        i7 = 2;
                    }
                    dc0Var.setGravity(i14);
                    int i16 = d20Var.p;
                    if (i16 != 1) {
                        i10 = 3;
                        if (i16 == i7 ? org.telegram.messenger.hd.a0 : !org.telegram.messenger.hd.a0) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 4;
                    }
                    dc0Var.setTextAlignment(i10);
                    dc0Var.setHorizontallyScrolling(false);
                    dc0Var.setImeOptions(TLObject.FLAG_28);
                    dc0Var.setFocusableInTouchMode(true);
                    dc0Var.setEnabled(false);
                    dc0Var.setInputType(dc0Var.getInputType() | TLObject.FLAG_14);
                    dc0Var.setBreakStrategy(0);
                    dc0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i17 = d20Var.l;
                    byte b11 = d20Var.b;
                    if (b11 == 0) {
                        dc0Var.setFrameColor(i17);
                        i17 = org.telegram.messenger.g0.B(d20Var.l) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        dc0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b11 == 2) {
                        dc0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -16777216 : -1);
                    } else {
                        dc0Var.setFrameColor(0);
                    }
                    dc0Var.setTextColor(i17);
                    dc0Var.setCursorColor(i17);
                    dc0Var.setHandlesColor(i17);
                    dc0Var.setHighlightColor(org.telegram.ui.ActionBar.m6.r1(0.4f, i17));
                    d20Var.I = dc0Var;
                    q9Var = dc0Var;
                }
                if (view == null) {
                    addView(view);
                    view.setRotation((float) (((-d20Var.e) / 3.141592653589793d) * 180.0d));
                    this.b.put(view, d20Var);
                }
            }
            view = q9Var;
            if (view == null) {
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.e) {
            return super.drawChild(canvas, view, j3);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
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
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) this.b.get(childAt);
                if (d20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof tg.b) {
                        if (d20Var.A) {
                            i13 = ((int) (((d20Var.f / 2.0f) + d20Var.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((d20Var.g / 2.0f) + d20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * d20Var.y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * d20Var.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * d20Var.c);
                        i14 = (int) (measuredHeight2 * d20Var.d);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) this.b.get(childAt);
                if (d20Var != null) {
                    if (childAt instanceof tg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(d20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = d20Var.A ? (d20Var.f * getMeasuredWidth()) / d20Var.q : d20Var.v * ((d20Var.w * measuredWidth) / d20Var.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * d20Var.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * d20Var.g), TLObject.FLAG_30));
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
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
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
