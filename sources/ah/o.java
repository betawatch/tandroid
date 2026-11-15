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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.u5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class o extends ScrollView implements z5 {
    public final u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final e6 a;
    public final i b;
    public final int c;
    public final n d;
    public final ArrayList e;
    public f20 f;
    public boolean h;
    public z10 n;
    public int r;
    public final u5 s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public o(Context context, e6 e6Var) {
        super(context);
        this.e = new ArrayList();
        er erVar = er.h;
        this.s = new u5(this, 0L, 300L, erVar);
        int i7 = 0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new u5(this, 0L, 300L, erVar);
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
        int x02 = j6.x0(null, j6.d6, false);
        this.r = x02;
        g0.y3(this, x02);
        n nVar = new n(this, context);
        this.d = nVar;
        addView(nVar, ja.c(-2.0f, -1));
        i iVar = new i(i7, context, this);
        this.b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        q6.l(iVar, 34, j6.Oi, e6Var);
        q6.U(iVar, j6.G6, e6Var);
        int i10 = j6.Pi;
        q6.l(iVar, 30, i10, e6Var);
        q6.l(iVar, 36, i10, e6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | ns.G2);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        iVar.setGravity((hd.a0 ? 5 : 3) | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.M0(2131745836, null));
        this.c = (int) iVar.getPaint().measureText(hd.M0(2131745836, null));
        iVar.addTextChangedListener(new j(this, i7));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.e.contains(view)) {
            f20 f20Var = (f20) view;
            if (!f20Var.E) {
                f20 f20Var2 = this.f;
                if (f20Var2 != null) {
                    f20Var2.a();
                    this.f = null;
                }
                this.f = f20Var;
                f20Var.b();
                return;
            }
            this.f = null;
            n nVar = this.d;
            o oVar = (o) nVar.n;
            oVar.I = true;
            oVar.e.remove(f20Var);
            f20Var.setOnClickListener(null);
            nVar.c();
            nVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.b = animatorSet;
            animatorSet.addListener(new l(0, nVar, f20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(f20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.e.clear();
            arrayList2.add(f20Var);
            ArrayList arrayList3 = nVar.f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, (Property<f20, Float>) View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            hashSet.remove(Long.valueOf(f20Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i7;
        Property property;
        Property property2;
        Property property3;
        np npVar;
        Object obj;
        ArrayList arrayList3 = arrayList;
        np s12 = np.s1(m10.t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            f20 f20Var = (f20) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(f20Var.getUid()))) {
                arrayList4.add(f20Var);
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
                            npVar = s12;
                            if (tL_help_country.default_name.hashCode() == longValue) {
                                obj = tL_help_country;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = npVar;
                            }
                        }
                    }
                    npVar = s12;
                    obj = a22;
                    if (obj != null) {
                        f20 f20Var2 = new f20(getContext(), obj, null, true, this.a);
                        f20Var2.setOnClickListener(new g(this, hashSet, runnable, 0));
                        arrayList5.add(f20Var2);
                    }
                } else {
                    if (((f20) arrayList2.get(i11)).getUid() == longValue) {
                        npVar = s12;
                        break;
                    }
                    i11++;
                }
            }
            arrayList3 = arrayList;
            s12 = npVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n nVar = this.d;
            ArrayList arrayList6 = nVar.e;
            ArrayList arrayList7 = nVar.d;
            ArrayList arrayList8 = nVar.f;
            o oVar = (o) nVar.n;
            oVar.I = true;
            ArrayList arrayList9 = oVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((f20) arrayList4.get(i13)).setOnClickListener(null);
            }
            nVar.c();
            if (z10) {
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
                    f20 f20Var3 = (f20) arrayList4.get(i14);
                    arrayList6.add(f20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, (Property<f20, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    f20 f20Var4 = (f20) arrayList5.get(i15);
                    arrayList7.add(f20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, (Property<f20, Float>) property, 0.0f, 1.0f));
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
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, ns.e4, 31);
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
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
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
        n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(z10 z10Var) {
        this.n = z10Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.b.setText(charSequence);
        this.h = false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = j6.x0(null, j6.d6, false);
            int i7 = this.r;
            if (i7 == 0 || x02 == i7) {
                return;
            }
            this.r = x02;
            g0.y3(this, x02);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
