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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tb0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;

    public tb0(Context context) {
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
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, tg.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        int i7;
        int i10;
        i9 i9Var;
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.e20 e20Var = (org.telegram.messenger.e20) arrayList.get(i11);
            byte b10 = e20Var.a;
            View view = null;
            if (b10 == 0) {
                i9 i9Var2 = new i9(getContext());
                i9Var2.setLayerNum(12);
                i9Var2.setAspectFit(true);
                ImageReceiver imageReceiver = i9Var2.getImageReceiver();
                if (z10) {
                    imageReceiver.x0 = true;
                    imageReceiver.v0 = false;
                    if (z11) {
                        imageReceiver.h1 = new rb0(0);
                    }
                }
                imageReceiver.u0(org.telegram.messenger.gc.b(e20Var.B), null, null, null, org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(e20Var.B.thumbs, 90, false, null, false), e20Var.B), null, null, 0L, "webp", e20Var.C, 1);
                if ((e20Var.b & 2) != 0) {
                    i9Var2.setScaleX(-1.0f);
                }
                e20Var.I = i9Var2;
                i9Var = i9Var2;
            } else {
                if (b10 == 1) {
                    ?? sb0Var = new sb0(getContext());
                    sb0Var.setBackgroundColor(0);
                    sb0Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
                    sb0Var.setTextSize(0, e20Var.m);
                    sb0Var.setTypeface(e20Var.n.d());
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.j6.m(e20Var.j, sb0Var.getPaint().getFontMetricsInt(), false, null, 0));
                    ArrayList arrayList2 = e20Var.k;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) obj;
                        p5 p5Var = new p5(d20Var.document_id, sb0Var.getPaint().getFontMetricsInt());
                        int i13 = d20Var.offset;
                        spannableString.setSpan(p5Var, i13, d20Var.length + i13, 33);
                    }
                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannableString.getSpans(0, spannableString.length(), org.telegram.messenger.g6.class);
                    if (g6VarArr != null) {
                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    sb0Var.setText(spannableString);
                    int i14 = 17;
                    sb0Var.setGravity(17);
                    int i15 = e20Var.p;
                    if (i15 != 1) {
                        i7 = 2;
                        i14 = i15 != 2 ? 19 : 21;
                    } else {
                        i7 = 2;
                    }
                    sb0Var.setGravity(i14);
                    int i16 = e20Var.p;
                    if (i16 != 1) {
                        i10 = 3;
                        if (i16 == i7 ? org.telegram.messenger.hd.a0 : !org.telegram.messenger.hd.a0) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 4;
                    }
                    sb0Var.setTextAlignment(i10);
                    sb0Var.setHorizontallyScrolling(false);
                    sb0Var.setImeOptions(TLObject.FLAG_28);
                    sb0Var.setFocusableInTouchMode(true);
                    sb0Var.setEnabled(false);
                    sb0Var.setInputType(sb0Var.getInputType() | TLObject.FLAG_14);
                    sb0Var.setBreakStrategy(0);
                    sb0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i17 = e20Var.l;
                    byte b11 = e20Var.b;
                    if (b11 == 0) {
                        sb0Var.setFrameColor(i17);
                        i17 = org.telegram.messenger.g0.B(e20Var.l) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        sb0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b11 == 2) {
                        sb0Var.setFrameColor(org.telegram.messenger.g0.B(i17) >= 0.25f ? -16777216 : -1);
                    } else {
                        sb0Var.setFrameColor(0);
                    }
                    sb0Var.setTextColor(i17);
                    sb0Var.setCursorColor(i17);
                    sb0Var.setHandlesColor(i17);
                    sb0Var.setHighlightColor(org.telegram.ui.ActionBar.j6.r1(0.4f, i17));
                    e20Var.I = sb0Var;
                    i9Var = sb0Var;
                }
                if (view == null) {
                    addView(view);
                    view.setRotation((float) (((-e20Var.e) / 3.141592653589793d) * 180.0d));
                    this.b.put(view, e20Var);
                }
            }
            view = i9Var;
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
                org.telegram.messenger.e20 e20Var = (org.telegram.messenger.e20) this.b.get(childAt);
                if (e20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof tg.b) {
                        if (e20Var.A) {
                            i13 = ((int) (((e20Var.f / 2.0f) + e20Var.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((e20Var.g / 2.0f) + e20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * e20Var.y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * e20Var.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * e20Var.c);
                        i14 = (int) (measuredHeight2 * e20Var.d);
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
                org.telegram.messenger.e20 e20Var = (org.telegram.messenger.e20) this.b.get(childAt);
                if (e20Var != null) {
                    if (childAt instanceof tg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(e20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = e20Var.A ? (e20Var.f * getMeasuredWidth()) / e20Var.q : e20Var.v * ((e20Var.w * measuredWidth) / e20Var.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * e20Var.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * e20Var.g), TLObject.FLAG_30));
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
