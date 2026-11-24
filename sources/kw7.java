// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kw7 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public jw7 h;
    public boolean n;
    public final ei7 r;

    public kw7(Context context) {
        super(context);
        this.e = true;
        this.r = new ei7(this, (byte) 4);
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView, dv3, iw7, org.telegram.ui.Components.EditTextBoldCursor, vu3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        bf0 bf0Var;
        ?? r2 = 0;
        this.n = false;
        ei7 ei7Var = this.r;
        removeCallbacks(ei7Var);
        setClipChildren(z3);
        a();
        this.b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                pcc pccVar = (pcc) arrayList.get(i2);
                byte b = pccVar.a;
                View view = null;
                if (b == 0) {
                    bf0 bf0Var2 = new bf0(getContext());
                    bf0Var2.setLayerNum(12);
                    bf0Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = bf0Var2.getImageReceiver();
                    if (z) {
                        imageReceiver.x0 = true;
                        imageReceiver.v0 = r2;
                        if (z2) {
                            imageReceiver.h1 = new bh7((byte) 22);
                        }
                    }
                    imageReceiver.Y(gn5.b(pccVar.B), null, null, null, gn5.c(bc4.w(pccVar.B.thumbs, 90, r2, null, r2), pccVar.B), null, null, 0L, "webp", pccVar.C, 1);
                    if ((pccVar.b & 2) != 0) {
                        bf0Var2.setScaleX(-1.0f);
                    }
                    pccVar.I = bf0Var2;
                    z4 = r2;
                    bf0Var = bf0Var2;
                } else if (b == 1 || b == 11) {
                    ?? iw7Var = new iw7(getContext(), r2);
                    iw7Var.setBackgroundColor(r2);
                    iw7Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
                    iw7Var.setTextSize(r2, pccVar.m);
                    iw7Var.setTypeface(pccVar.n.b());
                    SpannableString spannableString = new SpannableString(gw3.m(pccVar.j, iw7Var.getPaint().getFontMetricsInt(), r2, null, r2));
                    ArrayList arrayList2 = pccVar.k;
                    int size2 = arrayList2.size();
                    int i3 = r2;
                    while (i3 < size2) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        occ occVar = (occ) obj;
                        gn gnVar = new gn(occVar.document_id, iw7Var.getPaint().getFontMetricsInt());
                        int i4 = occVar.offset;
                        spannableString.setSpan(gnVar, i4, occVar.length + i4, 33);
                    }
                    dw3[] dw3VarArr = (dw3[]) spannableString.getSpans(0, spannableString.length(), dw3.class);
                    if (dw3VarArr != null) {
                        for (dw3 dw3Var : dw3VarArr) {
                            dw3Var.b = 0.85f;
                        }
                    }
                    iw7Var.setText(spannableString);
                    iw7Var.setGravity(17);
                    int i5 = pccVar.p;
                    iw7Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
                    int i6 = pccVar.p;
                    if (i6 != 1) {
                        boolean z5 = jb6.a0;
                        i = (i6 == 2 ? !z5 : z5) ? 3 : 2;
                    } else {
                        i = 4;
                    }
                    iw7Var.setTextAlignment(i);
                    iw7Var.setHorizontallyScrolling(false);
                    iw7Var.setImeOptions(TLObject.FLAG_28);
                    iw7Var.setFocusableInTouchMode(true);
                    iw7Var.setEnabled(false);
                    iw7Var.setInputType(iw7Var.getInputType() | TLObject.FLAG_14);
                    iw7Var.setBreakStrategy(0);
                    iw7Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i7 = pccVar.l;
                    byte b2 = pccVar.b;
                    if (b2 == 0) {
                        iw7Var.setFrameColor(i7);
                        i7 = gm.B(pccVar.l) >= 0.721f ? -16777216 : -1;
                    } else if (b2 == 1) {
                        iw7Var.setFrameColor(gm.B(i7) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b2 == 2) {
                        iw7Var.setFrameColor(gm.B(i7) >= 0.25f ? -16777216 : -1);
                    } else {
                        z4 = false;
                        iw7Var.setFrameColor(0);
                        iw7Var.setTextColor(i7);
                        iw7Var.setCursorColor(i7);
                        iw7Var.setHandlesColor(i7);
                        iw7Var.setHighlightColor(cmb.p1(0.4f, i7));
                        if (pccVar.a == 11) {
                            iw7Var.setMaxLines(3);
                            kd1.v(iw7Var, pccVar.b);
                            iw7Var.setTallFrame(true);
                            iw7Var.setSpokenWords(pccVar.X);
                            iw7Var.setVisibility(4);
                            this.n = true;
                        }
                        pccVar.I = iw7Var;
                        bf0Var = iw7Var;
                    }
                    z4 = false;
                    iw7Var.setTextColor(i7);
                    iw7Var.setCursorColor(i7);
                    iw7Var.setHandlesColor(i7);
                    iw7Var.setHighlightColor(cmb.p1(0.4f, i7));
                    if (pccVar.a == 11) {
                    }
                    pccVar.I = iw7Var;
                    bf0Var = iw7Var;
                } else {
                    z4 = r2;
                    if (view == null) {
                        addView(view);
                        view.setRotation((float) (((-pccVar.e) / 3.141592653589793d) * 180.0d));
                        this.b.put(view, pccVar);
                    }
                    i2++;
                    r2 = z4;
                }
                view = bf0Var;
                if (view == null) {
                }
                i2++;
                r2 = z4;
            }
        }
        if (this.n && isAttachedToWindow()) {
            d();
            postOnAnimation(ei7Var);
        }
    }

    public final void c() {
        this.f = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(0);
        }
        setBackground(this.d);
    }

    public final void d() {
        jw7 jw7Var;
        if (this.b == null || (jw7Var = this.h) == null) {
            return;
        }
        PhotoViewer photoViewer = ((u88) jw7Var).a;
        Drawable[] drawableArr = PhotoViewer.d9;
        ndc ndcVar = photoViewer.G2;
        long S = ndcVar != null ? ndcVar.S() : 0L;
        for (Map.Entry entry : this.b.entrySet()) {
            pcc pccVar = (pcc) entry.getValue();
            if (pccVar.a == 11) {
                boolean z = !this.f && S >= pccVar.V && S < pccVar.W;
                View view = (View) entry.getKey();
                if ((view.getVisibility() == 0) != z) {
                    view.setVisibility(z ? 0 : 4);
                }
                if (z && (view instanceof dv3)) {
                    ((dv3) view).A(S);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.e) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / gm.L(120.0f), measuredHeight / gm.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ei7 ei7Var = this.r;
        removeCallbacks(ei7Var);
        if (this.n) {
            postOnAnimation(ei7Var);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                pcc pccVar = (pcc) this.b.get(childAt);
                if (pccVar != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof dv3) {
                        if (pccVar.A) {
                            i5 = ((int) (((pccVar.f / 2.0f) + pccVar.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (((pccVar.g / 2.0f) + pccVar.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * pccVar.y)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * pccVar.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * pccVar.c);
                        i6 = (int) (measuredHeight2 * pccVar.d);
                    }
                    childAt.layout(i5, i6, measuredWidth2 + i5, measuredHeight3 + i6);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                pcc pccVar = (pcc) this.b.get(childAt);
                if (pccVar != null) {
                    if (childAt instanceof dv3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, TLObject.FLAG_30), 0);
                        float measuredWidth2 = pccVar.A ? (pccVar.f * getMeasuredWidth()) / pccVar.q : pccVar.v * ((pccVar.w * measuredWidth) / pccVar.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * pccVar.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * pccVar.g), TLObject.FLAG_30));
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
    public void setAlpha(float f) {
        super.setAlpha(f);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public void setVideoPosition(jw7 jw7Var) {
        this.h = jw7Var;
    }
}
