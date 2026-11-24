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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ju7 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public iu7 h;
    public boolean n;
    public final bg7 r;

    public ju7(Context context) {
        super(context);
        this.e = true;
        this.r = new bg7(this, (byte) 4);
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
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView, hu7, lt3, org.telegram.ui.Components.EditTextBoldCursor, st3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        be0 be0Var;
        ?? r2 = 0;
        this.n = false;
        bg7 bg7Var = this.r;
        removeCallbacks(bg7Var);
        setClipChildren(z3);
        a();
        this.b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                mac macVar = (mac) arrayList.get(i2);
                byte b = macVar.a;
                View view = null;
                if (b == 0) {
                    be0 be0Var2 = new be0(getContext());
                    be0Var2.setLayerNum(12);
                    be0Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = be0Var2.getImageReceiver();
                    if (z) {
                        imageReceiver.x0 = true;
                        imageReceiver.v0 = r2;
                        if (z2) {
                            imageReceiver.h1 = new fi7((byte) 20);
                        }
                    }
                    imageReceiver.Y(gl5.b(macVar.B), null, null, null, gl5.c(ba4.w(macVar.B.thumbs, 90, r2, null, r2), macVar.B), null, null, 0L, "webp", macVar.C, 1);
                    if ((macVar.b & 2) != 0) {
                        be0Var2.setScaleX(-1.0f);
                    }
                    macVar.I = be0Var2;
                    z4 = r2;
                    be0Var = be0Var2;
                } else if (b == 1 || b == 11) {
                    ?? hu7Var = new hu7(getContext(), r2);
                    hu7Var.setBackgroundColor(r2);
                    hu7Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
                    hu7Var.setTextSize(r2, macVar.m);
                    hu7Var.setTypeface(macVar.n.b());
                    SpannableString spannableString = new SpannableString(vu3.m(macVar.j, hu7Var.getPaint().getFontMetricsInt(), r2, null, r2));
                    ArrayList arrayList2 = macVar.k;
                    int size2 = arrayList2.size();
                    int i3 = r2;
                    while (i3 < size2) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        lac lacVar = (lac) obj;
                        gm gmVar = new gm(lacVar.document_id, hu7Var.getPaint().getFontMetricsInt());
                        int i4 = lacVar.offset;
                        spannableString.setSpan(gmVar, i4, lacVar.length + i4, 33);
                    }
                    su3[] su3VarArr = (su3[]) spannableString.getSpans(0, spannableString.length(), su3.class);
                    if (su3VarArr != null) {
                        for (su3 su3Var : su3VarArr) {
                            su3Var.b = 0.85f;
                        }
                    }
                    hu7Var.setText(spannableString);
                    hu7Var.setGravity(17);
                    int i5 = macVar.p;
                    hu7Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
                    int i6 = macVar.p;
                    if (i6 != 1) {
                        boolean z5 = k96.a0;
                        i = (i6 == 2 ? !z5 : z5) ? 3 : 2;
                    } else {
                        i = 4;
                    }
                    hu7Var.setTextAlignment(i);
                    hu7Var.setHorizontallyScrolling(false);
                    hu7Var.setImeOptions(TLObject.FLAG_28);
                    hu7Var.setFocusableInTouchMode(true);
                    hu7Var.setEnabled(false);
                    hu7Var.setInputType(hu7Var.getInputType() | TLObject.FLAG_14);
                    hu7Var.setBreakStrategy(0);
                    hu7Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i7 = macVar.l;
                    byte b2 = macVar.b;
                    if (b2 == 0) {
                        hu7Var.setFrameColor(i7);
                        i7 = gl.B(macVar.l) >= 0.721f ? -16777216 : -1;
                    } else if (b2 == 1) {
                        hu7Var.setFrameColor(gl.B(i7) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b2 == 2) {
                        hu7Var.setFrameColor(gl.B(i7) >= 0.25f ? -16777216 : -1);
                    } else {
                        z4 = false;
                        hu7Var.setFrameColor(0);
                        hu7Var.setTextColor(i7);
                        hu7Var.setCursorColor(i7);
                        hu7Var.setHandlesColor(i7);
                        hu7Var.setHighlightColor(bkb.p1(0.4f, i7));
                        if (macVar.a == 11) {
                            hu7Var.setMaxLines(3);
                            cc1.v(hu7Var, macVar.b);
                            hu7Var.setTallFrame(true);
                            hu7Var.setSpokenWords(macVar.X);
                            hu7Var.setVisibility(4);
                            this.n = true;
                        }
                        macVar.I = hu7Var;
                        be0Var = hu7Var;
                    }
                    z4 = false;
                    hu7Var.setTextColor(i7);
                    hu7Var.setCursorColor(i7);
                    hu7Var.setHandlesColor(i7);
                    hu7Var.setHighlightColor(bkb.p1(0.4f, i7));
                    if (macVar.a == 11) {
                    }
                    macVar.I = hu7Var;
                    be0Var = hu7Var;
                } else {
                    z4 = r2;
                    if (view == null) {
                        addView(view);
                        view.setRotation((float) (((-macVar.e) / 3.141592653589793d) * 180.0d));
                        this.b.put(view, macVar);
                    }
                    i2++;
                    r2 = z4;
                }
                view = be0Var;
                if (view == null) {
                }
                i2++;
                r2 = z4;
            }
        }
        if (this.n && isAttachedToWindow()) {
            d();
            postOnAnimation(bg7Var);
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
        iu7 iu7Var;
        if (this.b == null || (iu7Var = this.h) == null) {
            return;
        }
        PhotoViewer photoViewer = ((r68) iu7Var).a;
        Drawable[] drawableArr = PhotoViewer.f9;
        lbc lbcVar = photoViewer.G2;
        long S = lbcVar != null ? lbcVar.S() : 0L;
        for (Map.Entry entry : this.b.entrySet()) {
            mac macVar = (mac) entry.getValue();
            if (macVar.a == 11) {
                boolean z = !this.f && S >= macVar.V && S < macVar.W;
                View view = (View) entry.getKey();
                if ((view.getVisibility() == 0) != z) {
                    view.setVisibility(z ? 0 : 4);
                }
                if (z && (view instanceof st3)) {
                    ((st3) view).A(S);
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
        float max = Math.max(measuredWidth / gl.L(120.0f), measuredHeight / gl.L(120.0f));
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
        bg7 bg7Var = this.r;
        removeCallbacks(bg7Var);
        if (this.n) {
            postOnAnimation(bg7Var);
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
                mac macVar = (mac) this.b.get(childAt);
                if (macVar != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof st3) {
                        if (macVar.A) {
                            i5 = ((int) (((macVar.f / 2.0f) + macVar.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (((macVar.g / 2.0f) + macVar.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * macVar.y)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * macVar.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * macVar.c);
                        i6 = (int) (measuredHeight2 * macVar.d);
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
                mac macVar = (mac) this.b.get(childAt);
                if (macVar != null) {
                    if (childAt instanceof st3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, TLObject.FLAG_30), 0);
                        float measuredWidth2 = macVar.A ? (macVar.f * getMeasuredWidth()) / macVar.q : macVar.v * ((macVar.w * measuredWidth) / macVar.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * macVar.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * macVar.g), TLObject.FLAG_30));
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

    public void setVideoPosition(iu7 iu7Var) {
        this.h = iu7Var;
    }
}
