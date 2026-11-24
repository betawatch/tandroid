// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class j1a extends ScrollView implements vlb {
    public final ln E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final ylb a;
    public final l7 b;
    public final int c;
    public final i1a d;
    public final ArrayList e;
    public wc5 f;
    public boolean h;
    public qac n;
    public int r;
    public final ln s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public j1a(Context context, ylb ylbVar) {
        super(context);
        this.e = new ArrayList();
        d53 d53Var = d53.h;
        this.s = new ln(this, 0L, 300L, d53Var);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new ln(this, 0L, 300L, d53Var);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = ylbVar;
        setVerticalScrollBarEnabled(false);
        int w0 = cmb.w0(null, cmb.c6, false);
        this.r = w0;
        gm.u3(this, w0);
        i1a i1aVar = new i1a(this, context);
        this.d = i1aVar;
        addView(i1aVar, qoe.c(-2.0f, -1));
        l7 l7Var = new l7((byte) 6, context, this);
        this.b = l7Var;
        if (Build.VERSION.SDK_INT >= 25) {
            l7Var.setRevealOnFocusHint(false);
        }
        l7Var.setTextSize(1, 16.0f);
        anb.l(l7Var, 34, cmb.Ni, ylbVar);
        anb.X(l7Var, cmb.F6, ylbVar);
        int i = cmb.Oi;
        anb.l(l7Var, 30, i, ylbVar);
        anb.l(l7Var, 36, i, ylbVar);
        l7Var.setCursorWidth(1.5f);
        l7Var.setInputType(l7Var.getInputType() | nm7.F2);
        l7Var.setSingleLine(true);
        l7Var.setBackgroundDrawable(null);
        l7Var.setVerticalScrollBarEnabled(false);
        l7Var.setHorizontalScrollBarEnabled(false);
        l7Var.setTextIsSelectable(false);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setImeOptions(268435462);
        l7Var.setGravity((jb6.a0 ? 5 : 3) | 16);
        i1aVar.addView(l7Var);
        l7Var.setHintText(jb6.M0(2131745570, null));
        this.c = (int) l7Var.getPaint().measureText(jb6.M0(2131745570, null));
        l7Var.addTextChangedListener(new og6(this, (byte) 12));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            wc5 wc5Var = (wc5) view;
            if (!wc5Var.E) {
                wc5 wc5Var2 = this.f;
                if (wc5Var2 != null) {
                    wc5Var2.a();
                    this.f = null;
                }
                this.f = wc5Var;
                wc5Var.b();
                return;
            }
            this.f = null;
            i1a i1aVar = this.d;
            j1a j1aVar = (j1a) i1aVar.n;
            j1aVar.I = true;
            j1aVar.e.remove(wc5Var);
            wc5Var.setOnClickListener(null);
            i1aVar.c();
            i1aVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            i1aVar.b = animatorSet;
            animatorSet.addListener(new ic8((Object) i1aVar, (Object) wc5Var, (byte) 15));
            ArrayList arrayList = i1aVar.h;
            arrayList.clear();
            arrayList.add(wc5Var);
            ArrayList arrayList2 = i1aVar.d;
            arrayList2.clear();
            i1aVar.e.clear();
            arrayList2.add(wc5Var);
            ArrayList arrayList3 = i1aVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(wc5Var, (Property<wc5, Float>) View.ALPHA, 1.0f, 0.0f));
            i1aVar.requestLayout();
            hashSet.remove(Long.valueOf(wc5Var.getUid()));
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i;
        Property property;
        Property property2;
        Property property3;
        oc7 oc7Var;
        Object obj;
        ArrayList arrayList3 = arrayList;
        oc7 r1 = oc7.r1(z8c.t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i2 >= arrayList2.size()) {
                break;
            }
            wc5 wc5Var = (wc5) arrayList2.get(i2);
            if (!hashSet.contains(Long.valueOf(wc5Var.getUid()))) {
                arrayList4.add(wc5Var);
            }
            i2++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList2.size()) {
                    Object W1 = longValue >= 0 ? r1.W1(l) : r1.L0(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                            oc7Var = r1;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                r1 = oc7Var;
                            }
                        }
                    }
                    oc7Var = r1;
                    obj = W1;
                    if (obj != null) {
                        wc5 wc5Var2 = new wc5(getContext(), obj, null, true, this.a);
                        wc5Var2.setOnClickListener(new jw4(this, hashSet, runnable, (byte) 19));
                        arrayList5.add(wc5Var2);
                    }
                } else {
                    if (((wc5) arrayList2.get(i3)).getUid() == longValue) {
                        oc7Var = r1;
                        break;
                    }
                    i3++;
                }
            }
            arrayList3 = arrayList;
            r1 = oc7Var;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            i1a i1aVar = this.d;
            ArrayList arrayList6 = i1aVar.e;
            ArrayList arrayList7 = i1aVar.d;
            ArrayList arrayList8 = i1aVar.f;
            j1a j1aVar = (j1a) i1aVar.n;
            j1aVar.I = true;
            ArrayList arrayList9 = j1aVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = i1aVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                ((wc5) arrayList4.get(i5)).setOnClickListener(null);
            }
            i1aVar.c();
            Object[] objArr = 0;
            if (z) {
                i1aVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                i1aVar.b = animatorSet;
                animatorSet.addListener(new h1a(i1aVar, arrayList4, objArr == true ? 1 : 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i6 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i6 >= size2) {
                        break;
                    }
                    wc5 wc5Var3 = (wc5) arrayList4.get(i6);
                    arrayList6.add(wc5Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var3, (Property<wc5, Float>) property, 1.0f, 0.0f));
                    i6++;
                }
                for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                    wc5 wc5Var4 = (wc5) arrayList5.get(i7);
                    arrayList7.add(wc5Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(wc5Var4, (Property<wc5, Float>) property, 0.0f, 1.0f));
                }
                i = 0;
            } else {
                for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                    i1aVar.removeView((View) arrayList4.get(i8));
                }
                arrayList10.clear();
                i1aVar.b = null;
                i = 0;
                i1aVar.c = false;
                j1aVar.b.setAllowDrawCursor(true);
            }
            for (int i9 = i; i9 < arrayList5.size(); i9++) {
                i1aVar.addView((View) arrayList5.get(i9));
            }
            i1aVar.requestLayout();
        }
        this.b.setOnKeyListener(new g1a(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, nm7.d4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), gm.L(8.0f) + r0, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - gm.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - gm.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = hg9.v(20.0f, this.J, rect.top);
        rect.bottom = hg9.v(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void setContainerHeight(float f) {
        this.K = f;
        i1a i1aVar = this.d;
        if (i1aVar != null) {
            i1aVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(qac qacVar) {
        this.n = qacVar;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.c6, false);
            int i = this.r;
            if (i == 0 || w0 == i) {
                return;
            }
            this.r = w0;
            gm.u3(this, w0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
