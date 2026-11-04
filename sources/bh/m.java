package bh;

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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m extends ScrollView implements z5 {
    public final u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final e6 a;
    public final g b;
    public final int c;
    public final l d;
    public final ArrayList e;
    public y10 f;
    public boolean h;
    public u10 n;
    public int r;
    public final u5 s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public m(Context context, e6 e6Var) {
        super(context);
        this.e = new ArrayList();
        xq xqVar = xq.h;
        this.s = new u5(this, 0L, 300L, xqVar);
        int i3 = 0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new u5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = e6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = k6.x0(null, k6.d6, false);
        this.r = x02;
        g0.z3(this, x02);
        l lVar = new l(this, context);
        this.d = lVar;
        addView(lVar, mf.c(-2.0f, -1));
        g gVar = new g(i3, context, this);
        this.b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        r6.m(gVar, 34, k6.Li, e6Var);
        r6.V(gVar, k6.G6, e6Var);
        int i10 = k6.Mi;
        r6.m(gVar, 30, i10, e6Var);
        r6.m(gVar, 36, i10, e6Var);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | hs.G2);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        gVar.setGravity((bd.a0 ? 5 : 3) | 16);
        lVar.addView(gVar);
        gVar.setHintText(bd.M0(2131745846, null));
        this.c = (int) gVar.getPaint().measureText(bd.M0(2131745846, null));
        gVar.addTextChangedListener(new h(this, i3));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            y10 y10Var = (y10) view;
            if (!y10Var.E) {
                y10 y10Var2 = this.f;
                if (y10Var2 != null) {
                    y10Var2.a();
                    this.f = null;
                }
                this.f = y10Var;
                y10Var.b();
                return;
            }
            this.f = null;
            l lVar = this.d;
            m mVar = (m) lVar.n;
            mVar.I = true;
            mVar.e.remove(y10Var);
            y10Var.setOnClickListener(null);
            lVar.c();
            lVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.b = animatorSet;
            animatorSet.addListener(new j(0, lVar, y10Var));
            ArrayList arrayList = lVar.h;
            arrayList.clear();
            arrayList.add(y10Var);
            ArrayList arrayList2 = lVar.d;
            arrayList2.clear();
            lVar.e.clear();
            arrayList2.add(y10Var);
            ArrayList arrayList3 = lVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) View.ALPHA, 1.0f, 0.0f));
            lVar.requestLayout();
            hashSet.remove(Long.valueOf(y10Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i3;
        Property property;
        Property property2;
        Property property3;
        hp hpVar;
        Object obj;
        ArrayList arrayList3 = arrayList;
        hp s12 = hp.s1(h10.t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            y10 y10Var = (y10) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(y10Var.getUid()))) {
                arrayList4.add(y10Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    Object a22 = longValue >= 0 ? s12.a2(l10) : s12.M0(Long.valueOf(-longValue));
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                            hpVar = s12;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = hpVar;
                            }
                        }
                    }
                    hpVar = s12;
                    obj = a22;
                    if (obj != null) {
                        y10 y10Var2 = new y10(getContext(), obj, null, true, this.a);
                        y10Var2.setOnClickListener(new ai.h(this, hashSet, runnable, 5));
                        arrayList5.add(y10Var2);
                    }
                } else {
                    if (((y10) arrayList2.get(i11)).getUid() == longValue) {
                        hpVar = s12;
                        break;
                    }
                    i11++;
                }
            }
            arrayList3 = arrayList;
            s12 = hpVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            l lVar = this.d;
            ArrayList arrayList6 = lVar.e;
            ArrayList arrayList7 = lVar.d;
            ArrayList arrayList8 = lVar.f;
            m mVar = (m) lVar.n;
            mVar.I = true;
            ArrayList arrayList9 = mVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = lVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((y10) arrayList4.get(i13)).setOnClickListener(null);
            }
            lVar.c();
            if (z10) {
                lVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                lVar.b = animatorSet;
                animatorSet.addListener(new k(lVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    y10 y10Var3 = (y10) arrayList4.get(i14);
                    arrayList6.add(y10Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, (Property<y10, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    y10 y10Var4 = (y10) arrayList5.get(i15);
                    arrayList7.add(y10Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, (Property<y10, Float>) property, 0.0f, 1.0f));
                }
                i3 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    lVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                lVar.b = null;
                i3 = 0;
                lVar.c = false;
                mVar.b.setAllowDrawCursor(true);
            }
            for (int i17 = i3; i17 < arrayList5.size(); i17++) {
                lVar.addView((View) arrayList5.get(i17));
            }
            lVar.requestLayout();
        }
        this.b.setOnKeyListener(new i(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, hs.e4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), g0.L(8.0f) + r0, paint);
        float d10 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - g0.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = k5.C(20.0f, this.J, rect.top);
        rect.bottom = k5.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        l lVar = this.d;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(u10 u10Var) {
        this.n = u10Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.d6, false);
            int i3 = this.r;
            if (i3 == 0 || x02 == i3) {
                return;
            }
            this.r = x02;
            g0.z3(this, x02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
