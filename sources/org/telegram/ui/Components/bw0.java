package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class bw0 extends tk0 implements org.telegram.ui.ActionBar.k6 {
    public static final zv0 E3 = new zv0();
    public static final aw0 F3 = new aw0();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float e3;
    public xv0[] f3;
    public final sv0 g3;
    public final t5 h3;
    public Drawable i3;
    public Drawable j3;
    public Paint k3;
    public final Paint l3;
    public int m3;
    public int n3;
    public org.telegram.messenger.q20 o3;
    public org.telegram.messenger.q20 p3;
    public boolean q3;
    public boolean r3;
    public bi.t0 s3;
    public int t3;
    public org.telegram.messenger.q20 u3;
    public float v3;
    public ValueAnimator w3;
    public boolean x3;
    public final t5 y3;
    public final t5 z3;

    static {
        new HashSet();
    }

    public bw0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.e3 = 6.5f;
        this.f3 = null;
        gr grVar = gr.h;
        this.h3 = new t5(this, 360L, grVar);
        Paint paint = new Paint(1);
        this.l3 = paint;
        this.t3 = -1;
        this.v3 = 0.0f;
        this.x3 = true;
        this.y3 = new t5(this, 350L, grVar);
        this.z3 = new t5(this, 350L, grVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.i0.L(2.0f), 0);
        sv0 sv0Var = new sv0(this);
        this.g3 = sv0Var;
        setAdapter(sv0Var);
        s4.a0 a0Var = new s4.a0();
        setLayoutManager(a0Var);
        a0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.i0.L(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.ActionBar.a7.m(this, 20, i11, p6Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.d20.s0, Integer.valueOf(i10), new org.telegram.ui.ActionBar.u3(this, currentTimeMillis, 1));
    }

    public static void A1(bw0 bw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        bw0Var.f3 = new xv0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            xv0[] xv0VarArr = bw0Var.f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            xv0 xv0Var = new xv0();
            xv0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                xv0Var.a = "premium";
            } else {
                xv0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            xv0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            xv0Var.d = emojiGroup.title;
            xv0VarArr[i10] = xv0Var;
        }
        bw0Var.f3 = bw0Var.E1(bw0Var.f3);
        bw0Var.g3.f();
        bw0Var.setCategoriesShownT(0.0f);
        bw0Var.J1(bw0Var.x3, System.currentTimeMillis() - j10 > 16);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.i0.L(1.0f);
        if (view instanceof wv0) {
            wv0 wv0Var = (wv0) view;
            f7 = c3.i0.z(1.0f, wv0Var.E, 0.15f, 0.85f) * wv0Var.D;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof wv0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.m3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.v3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof wv0) {
                float s10 = org.telegram.messenger.i0.s(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s10 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((wv0) childAt).j();
                }
                childAt.setAlpha(s10);
                childAt.setScaleX(s10);
                childAt.setScaleY(s10);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.i0.L(34.0f) * this.t3) + ((-getScrollToStartWidth()) - Math.max(0, this.n3));
        scrollBy(L, 0);
        post(new uo0((vh.o1) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, gr.h);
    }

    public void H1(int i10) {
        if (this.t3 < 0 && i10 >= 0) {
            this.z3.e(true, i10);
        }
        this.t3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof wv0) {
                ((wv0) childAt).l(this.t3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(xv0 xv0Var) {
        int i10;
        if (this.f3 != null) {
            i10 = 0;
            while (true) {
                xv0[] xv0VarArr = this.f3;
                if (i10 >= xv0VarArr.length) {
                    break;
                } else if (xv0VarArr[i10] == xv0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            H1(i10);
        }
        i10 = -1;
        H1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J1(boolean z10, boolean z11) {
        this.x3 = z10;
        ?? r52 = z10;
        if (this.f3 == null) {
            r52 = 0;
        }
        if (this.v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v3, r52 != 0 ? 1.0f : 0.0f);
        this.w3 = ofFloat;
        ofFloat.addUpdateListener(new r60(this, 22));
        this.w3.addListener(new t60(this, 23));
        this.w3.setInterpolator(gr.h);
        this.w3.setDuration((this.f3 == null ? 5 : r6.length) * 120);
        this.w3.start();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof wv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008f  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float e;
        Drawable drawable;
        Drawable drawable2;
        if (this.k3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof wv0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int z10 = (int) c3.i0.z(1.0f, this.v3, org.telegram.messenger.i0.L(32.0f) + getWidth(), i10);
                int z11 = (int) c3.i0.z(1.0f, this.v3, org.telegram.messenger.i0.L(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.k3);
                if (z11 < getWidth() && (drawable2 = this.i3) != null) {
                    drawable2.setAlpha(org.telegram.messenger.zs.e4);
                    Drawable drawable3 = this.i3;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.i3.draw(canvas2);
                }
                e = this.y3.e(false, this.t3 < 0 ? 1.0f : 0.0f);
                int i13 = this.t3;
                t5 t5Var = this.z3;
                float e7 = i13 < 0 ? t5Var.e(false, i13) : t5Var.c;
                if (e > 0.0f) {
                    float f7 = e7 + 1.0f;
                    double d = f7;
                    int max = Math.max(1, (int) Math.floor(d));
                    int max2 = Math.max(1, (int) Math.ceil(d));
                    View view = null;
                    View view2 = null;
                    for (int i14 = 0; i14 < getChildCount(); i14++) {
                        View childAt2 = getChildAt(i14);
                        int R = RecyclerView.R(childAt2);
                        if (R == max) {
                            view = childAt2;
                        }
                        if (R == max2) {
                            view2 = childAt2;
                        }
                        if (view != null && view2 != null) {
                            break;
                        }
                    }
                    Paint paint = this.l3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * e));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.A3;
                        C1(rectF, view);
                        RectF rectF2 = this.B3;
                        C1(rectF2, view2);
                        RectF rectF3 = this.C3;
                        org.telegram.messenger.i0.Z1(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.i3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.h3.e(false, (canScrollHorizontally(-1) && this.r3) ? 1.0f : 0.0f) * 255.0f * this.v3));
                    if (this.i3.getAlpha() > 0) {
                        Drawable drawable4 = this.i3;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.i3.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        e = this.y3.e(false, this.t3 < 0 ? 1.0f : 0.0f);
        int i132 = this.t3;
        t5 t5Var2 = this.z3;
        if (i132 < 0) {
        }
        if (e > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.i3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.t3;
    }

    public xv0 getSelectedCategory() {
        int i10;
        xv0[] xv0VarArr = this.f3;
        if (xv0VarArr == null || (i10 = this.t3) < 0 || i10 >= xv0VarArr.length) {
            return null;
        }
        return xv0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.q20 q20Var;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof wv0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.n3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.q3;
        if (z12 != z11) {
            this.q3 = z11;
            org.telegram.messenger.q20 q20Var2 = this.o3;
            if (q20Var2 != null) {
                q20Var2.a(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3)) : 0));
            }
            invalidate();
        } else if (z12 && (q20Var = this.o3) != null) {
            q20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3))));
        }
        if (this.r3 != z10) {
            this.r3 = z10;
            org.telegram.messenger.q20 q20Var3 = this.p3;
            if (q20Var3 != null) {
                q20Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.x3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.t0 t0Var = this.s3;
        if (t0Var != null) {
            t0Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.k3 == null) {
            this.k3 = new Paint(1);
        }
        this.k3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.n3 = i10;
    }

    public void setOnCategoryClick(org.telegram.messenger.q20 q20Var) {
        this.u3 = q20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.q20 q20Var) {
        this.p3 = q20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.q20 q20Var) {
        this.o3 = q20Var;
    }

    public void setShownButtonsAtStart(float f7) {
        this.e3 = f7;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.l3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.n2));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public xv0[] E1(xv0[] xv0VarArr) {
        return xv0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
