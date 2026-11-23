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
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cc0 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public bc0 h;
    public boolean n;
    public final rc r;

    public cc0(Context context) {
        super(context);
        this.e = true;
        this.r = new rc(this, 12);
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ac0, org.telegram.ui.Components.pt, tg.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        int i7;
        boolean z13;
        p9 p9Var;
        ?? r22 = 0;
        this.n = false;
        rc rcVar = this.r;
        removeCallbacks(rcVar);
        setClipChildren(z12);
        a();
        this.b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) arrayList.get(i10);
                byte b10 = b20Var.a;
                View view = null;
                if (b10 == 0) {
                    p9 p9Var2 = new p9(getContext());
                    p9Var2.setLayerNum(12);
                    p9Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = p9Var2.getImageReceiver();
                    if (z10) {
                        imageReceiver.x0 = true;
                        imageReceiver.v0 = r22;
                        if (z11) {
                            imageReceiver.h1 = new ub0(1);
                        }
                    }
                    imageReceiver.v0(org.telegram.messenger.fc.b(b20Var.B), null, null, null, org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(b20Var.B.thumbs, 90, r22, null, r22), b20Var.B), null, null, 0L, "webp", b20Var.C, 1);
                    if ((b20Var.b & 2) != 0) {
                        p9Var2.setScaleX(-1.0f);
                    }
                    b20Var.I = p9Var2;
                    z13 = r22;
                    p9Var = p9Var2;
                } else if (b10 == 1 || b10 == 11) {
                    ?? ac0Var = new ac0(getContext(), 0);
                    ac0Var.setBackgroundColor(r22);
                    ac0Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
                    ac0Var.setTextSize(r22, b20Var.m);
                    ac0Var.setTypeface(b20Var.n.d());
                    SpannableString spannableString = new SpannableString(org.telegram.messenger.j6.m(b20Var.j, ac0Var.getPaint().getFontMetricsInt(), r22, null, r22));
                    ArrayList arrayList2 = b20Var.k;
                    int size2 = arrayList2.size();
                    int i11 = r22;
                    while (i11 < size2) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        org.telegram.messenger.a20 a20Var = (org.telegram.messenger.a20) obj;
                        x5 x5Var = new x5(a20Var.document_id, ac0Var.getPaint().getFontMetricsInt());
                        int i12 = a20Var.offset;
                        spannableString.setSpan(x5Var, i12, a20Var.length + i12, 33);
                    }
                    org.telegram.messenger.g6[] g6VarArr = (org.telegram.messenger.g6[]) spannableString.getSpans(0, spannableString.length(), org.telegram.messenger.g6.class);
                    if (g6VarArr != null) {
                        for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                            g6Var.b = 0.85f;
                        }
                    }
                    ac0Var.setText(spannableString);
                    int i13 = 17;
                    ac0Var.setGravity(17);
                    int i14 = b20Var.p;
                    if (i14 != 1) {
                        i7 = 2;
                        i13 = i14 != 2 ? 19 : 21;
                    } else {
                        i7 = 2;
                    }
                    ac0Var.setGravity(i13);
                    int i15 = b20Var.p;
                    ac0Var.setTextAlignment(i15 != 1 ? (i15 == i7 ? !org.telegram.messenger.gd.a0 : org.telegram.messenger.gd.a0) ? 3 : 2 : 4);
                    ac0Var.setHorizontallyScrolling(false);
                    ac0Var.setImeOptions(TLObject.FLAG_28);
                    ac0Var.setFocusableInTouchMode(true);
                    ac0Var.setEnabled(false);
                    ac0Var.setInputType(ac0Var.getInputType() | TLObject.FLAG_14);
                    ac0Var.setBreakStrategy(0);
                    ac0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i16 = b20Var.l;
                    byte b11 = b20Var.b;
                    if (b11 == 0) {
                        ac0Var.setFrameColor(i16);
                        i16 = org.telegram.messenger.g0.B(b20Var.l) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        ac0Var.setFrameColor(org.telegram.messenger.g0.B(i16) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b11 == 2) {
                        ac0Var.setFrameColor(org.telegram.messenger.g0.B(i16) >= 0.25f ? -16777216 : -1);
                    } else {
                        z13 = false;
                        ac0Var.setFrameColor(0);
                        ac0Var.setTextColor(i16);
                        ac0Var.setCursorColor(i16);
                        ac0Var.setHandlesColor(i16);
                        ac0Var.setHighlightColor(org.telegram.ui.ActionBar.n6.r1(0.4f, i16));
                        if (b20Var.a == 11) {
                            ac0Var.setMaxLines(3);
                            tg.d.v(ac0Var, b20Var.b);
                            ac0Var.setTallFrame(true);
                            ac0Var.setSpokenWords(b20Var.X);
                            ac0Var.setVisibility(4);
                            this.n = true;
                        }
                        b20Var.I = ac0Var;
                        p9Var = ac0Var;
                    }
                    z13 = false;
                    ac0Var.setTextColor(i16);
                    ac0Var.setCursorColor(i16);
                    ac0Var.setHandlesColor(i16);
                    ac0Var.setHighlightColor(org.telegram.ui.ActionBar.n6.r1(0.4f, i16));
                    if (b20Var.a == 11) {
                    }
                    b20Var.I = ac0Var;
                    p9Var = ac0Var;
                } else {
                    z13 = r22;
                    if (view == null) {
                        addView(view);
                        view.setRotation((float) (((-b20Var.e) / 3.141592653589793d) * 180.0d));
                        this.b.put(view, b20Var);
                    }
                    i10++;
                    r22 = z13;
                }
                view = p9Var;
                if (view == null) {
                }
                i10++;
                r22 = z13;
            }
        }
        if (this.n && isAttachedToWindow()) {
            d();
            postOnAnimation(rcVar);
        }
    }

    public final void c() {
        this.f = false;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setVisibility(0);
        }
        setBackground(this.d);
    }

    public final void d() {
        bc0 bc0Var;
        if (this.b == null || (bc0Var = this.h) == null) {
            return;
        }
        h61 h61Var = ((org.telegram.ui.qn0) bc0Var).a.G2;
        long S = h61Var != null ? h61Var.S() : 0L;
        for (Map.Entry entry : this.b.entrySet()) {
            org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) entry.getValue();
            if (b20Var.a == 11) {
                boolean z10 = !this.f && S >= b20Var.V && S < b20Var.W;
                View view = (View) entry.getKey();
                if ((view.getVisibility() == 0) != z10) {
                    view.setVisibility(z10 ? 0 : 4);
                }
                if (z10 && (view instanceof tg.f)) {
                    ((tg.f) view).A(S);
                }
            }
        }
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rc rcVar = this.r;
        removeCallbacks(rcVar);
        if (this.n) {
            postOnAnimation(rcVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r);
        super.onDetachedFromWindow();
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
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.b.get(childAt);
                if (b20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof tg.f) {
                        if (b20Var.A) {
                            i13 = ((int) (((b20Var.f / 2.0f) + b20Var.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((b20Var.g / 2.0f) + b20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * b20Var.y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * b20Var.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * b20Var.c);
                        i14 = (int) (measuredHeight2 * b20Var.d);
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
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.b.get(childAt);
                if (b20Var != null) {
                    if (childAt instanceof tg.f) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(b20Var.q, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = b20Var.A ? (b20Var.f * getMeasuredWidth()) / b20Var.q : b20Var.v * ((b20Var.w * measuredWidth) / b20Var.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * b20Var.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * b20Var.g), TLObject.FLAG_30));
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

    public void setVideoPosition(bc0 bc0Var) {
        this.h = bc0Var;
    }
}
