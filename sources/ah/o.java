package ah;

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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class o extends ScrollView implements b6 {
    public final w5 D;
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final g6 a;
    public final i b;
    public final int c;
    public final n d;
    public final ArrayList e;
    public d20 f;
    public boolean h;
    public c20 n;
    public int r;
    public final w5 s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public o(Context context, g6 g6Var) {
        super(context);
        this.e = new ArrayList();
        xq xqVar = xq.h;
        this.s = new w5(this, 0L, 300L, xqVar);
        int i7 = 0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.D = new w5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = g6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = l6.x0(null, l6.d6, false);
        this.r = x02;
        g0.z3(this, x02);
        n nVar = new n(this, context);
        this.d = nVar;
        addView(nVar, ha.c(-2.0f, -1));
        i iVar = new i(i7, context, this);
        this.b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        s6.l(iVar, 34, l6.Li, g6Var);
        s6.U(iVar, l6.G6, g6Var);
        int i10 = l6.Mi;
        s6.l(iVar, 30, i10, g6Var);
        s6.l(iVar, 36, i10, g6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | qs.G2);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        iVar.setGravity((id.a0 ? 5 : 3) | 16);
        nVar.addView(iVar);
        iVar.setHintText(id.M0(2131745836, null));
        this.c = (int) iVar.getPaint().measureText(id.M0(2131745836, null));
        iVar.addTextChangedListener(new j(this, i7));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            d20 d20Var = (d20) view;
            if (!d20Var.D) {
                d20 d20Var2 = this.f;
                if (d20Var2 != null) {
                    d20Var2.a();
                    this.f = null;
                }
                this.f = d20Var;
                d20Var.b();
                return;
            }
            this.f = null;
            n nVar = this.d;
            o oVar = (o) nVar.n;
            oVar.H = true;
            oVar.e.remove(d20Var);
            d20Var.setOnClickListener(null);
            nVar.c();
            nVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.b = animatorSet;
            animatorSet.addListener(new l(0, nVar, d20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(d20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.e.clear();
            arrayList2.add(d20Var);
            ArrayList arrayList3 = nVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(d20Var, (Property<d20, Float>) View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            hashSet.remove(Long.valueOf(d20Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z9, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i7;
        Property property;
        Property property2;
        Property property3;
        qp qpVar;
        Object obj;
        ArrayList arrayList3 = arrayList;
        qp s12 = qp.s1(p10.s0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            d20 d20Var = (d20) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(d20Var.getUid()))) {
                arrayList4.add(d20Var);
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
                            qpVar = s12;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = qpVar;
                            }
                        }
                    }
                    qpVar = s12;
                    obj = a22;
                    if (obj != null) {
                        d20 d20Var2 = new d20(getContext(), obj, null, true, this.a);
                        d20Var2.setOnClickListener(new g(this, hashSet, runnable, 0));
                        arrayList5.add(d20Var2);
                    }
                } else {
                    if (((d20) arrayList2.get(i11)).getUid() == longValue) {
                        qpVar = s12;
                        break;
                    }
                    i11++;
                }
            }
            arrayList3 = arrayList;
            s12 = qpVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n nVar = this.d;
            ArrayList arrayList6 = nVar.e;
            ArrayList arrayList7 = nVar.d;
            ArrayList arrayList8 = nVar.f;
            o oVar = (o) nVar.n;
            oVar.H = true;
            ArrayList arrayList9 = oVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((d20) arrayList4.get(i13)).setOnClickListener(null);
            }
            nVar.c();
            if (z9) {
                nVar.c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nVar.b = animatorSet;
                animatorSet.addListener(new m(nVar, arrayList4, 0));
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
                    d20 d20Var3 = (d20) arrayList4.get(i14);
                    arrayList6.add(d20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var3, (Property<d20, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var3, (Property<d20, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var3, (Property<d20, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    d20 d20Var4 = (d20) arrayList5.get(i15);
                    arrayList7.add(d20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var4, (Property<d20, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var4, (Property<d20, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(d20Var4, (Property<d20, Float>) property, 0.0f, 1.0f));
                }
                i7 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nVar.b = null;
                i7 = 0;
                nVar.c = false;
                oVar.b.setAllowDrawCursor(true);
            }
            for (int i17 = i7; i17 < arrayList5.size(); i17++) {
                nVar.addView((View) arrayList5.get(i17));
            }
            nVar.requestLayout();
        }
        this.b.setOnKeyListener(new k(this, hashSet, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, qs.e4, 31);
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
        float d2 = this.D.d(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - g0.L(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - g0.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = k5.C(20.0f, this.I, rect.top);
        rect.bottom = k5.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setContainerHeight(float f10) {
        this.J = f10;
        n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(c20 c20Var) {
        this.n = c20Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int x02 = l6.x0(null, l6.d6, false);
            int i7 = this.r;
            if (i7 == 0 || x02 == i7) {
                return;
            }
            this.r = x02;
            g0.z3(this, x02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
