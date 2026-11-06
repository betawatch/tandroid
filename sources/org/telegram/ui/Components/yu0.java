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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class yu0 extends pj0 implements org.telegram.ui.ActionBar.a6 {
    public static final wu0 E3 = new wu0();
    public static final xu0 F3 = new xu0();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float e3;
    public uu0[] f3;
    public final pu0 g3;
    public final w5 h3;
    public Drawable i3;
    public Drawable j3;
    public Paint k3;
    public final Paint l3;
    public int m3;
    public int n3;
    public org.telegram.messenger.c20 o3;
    public org.telegram.messenger.c20 p3;
    public boolean q3;
    public boolean r3;
    public bi.ec s3;
    public int t3;
    public org.telegram.messenger.c20 u3;
    public float v3;
    public ValueAnimator w3;
    public boolean x3;
    public final w5 y3;
    public final w5 z3;

    static {
        new HashSet();
    }

    public yu0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.e3 = 6.5f;
        this.f3 = null;
        xq xqVar = xq.h;
        this.h3 = new w5(this, 360L, xqVar);
        Paint paint = new Paint(1);
        this.l3 = paint;
        this.t3 = -1;
        this.v3 = 0.0f;
        this.x3 = true;
        this.y3 = new w5(this, 350L, xqVar);
        this.z3 = new w5(this, 350L, xqVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        pu0 pu0Var = new pu0(this);
        this.g3 = pu0Var;
        setAdapter(pu0Var);
        v4.b0 b0Var = new v4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i10, f6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.p10.s0, Integer.valueOf(i7), new fi.f8(this, currentTimeMillis, 2));
    }

    public static void A1(yu0 yu0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        yu0Var.f3 = new uu0[tL_messages_emojiGroups.groups.size()];
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            uu0[] uu0VarArr = yu0Var.f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            uu0 uu0Var = new uu0();
            uu0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                uu0Var.a = "premium";
            } else {
                uu0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            uu0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            uu0Var.d = emojiGroup.title;
            uu0VarArr[i7] = uu0Var;
        }
        yu0Var.f3 = yu0Var.E1(yu0Var.f3);
        yu0Var.g3.f();
        yu0Var.setCategoriesShownT(0.0f);
        yu0Var.J1(yu0Var.x3, System.currentTimeMillis() - j3 > 16);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof tu0) {
            tu0 tu0Var = (tu0) view;
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, tu0Var.E, 0.15f, 0.85f) * tu0Var.D;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof tu0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.m3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f10) {
        this.v3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof tu0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((tu0) childAt).j();
                }
                childAt.setAlpha(s5);
                childAt.setScaleX(s5);
                childAt.setScaleY(s5);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.g0.L(34.0f) * this.t3) + ((-getScrollToStartWidth()) - Math.max(0, this.n3));
        scrollBy(L, 0);
        post(new ir0((fi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, xq.h);
    }

    public void H1(int i7) {
        if (this.t3 < 0 && i7 >= 0) {
            this.z3.e(true, i7);
        }
        this.t3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tu0) {
                ((tu0) childAt).l(this.t3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(uu0 uu0Var) {
        int i7;
        if (this.f3 != null) {
            i7 = 0;
            while (true) {
                uu0[] uu0VarArr = this.f3;
                if (i7 >= uu0VarArr.length) {
                    break;
                } else if (uu0VarArr[i7] == uu0Var) {
                    break;
                } else {
                    i7++;
                }
            }
            H1(i7);
        }
        i7 = -1;
        H1(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J1(boolean z9, boolean z10) {
        this.x3 = z9;
        ?? r52 = z9;
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
        if (!z10) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v3, r52 != 0 ? 1.0f : 0.0f);
        this.w3 = ofFloat;
        ofFloat.addUpdateListener(new c60(this, 21));
        this.w3.addListener(new e60(this, 23));
        this.w3.setInterpolator(xq.h);
        this.w3.setDuration((this.f3 == null ? 5 : r6.length) * 120);
        this.w3.start();
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof tu0) || E.getAlpha() < 0.5f) {
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
        float e10;
        Drawable drawable;
        Drawable drawable2;
        if (this.k3 != null) {
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = TLObject.FLAG_31;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof tu0) {
                    i7 = Math.min(i7, childAt.getLeft());
                    i10 = Math.max(i10, childAt.getRight());
                }
            }
            if (i7 < i10) {
                int z9 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.v3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i7);
                int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.v3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i10);
                canvas2 = canvas;
                canvas2.drawRect(z9, 0.0f, z10, getHeight(), this.k3);
                if (z10 < getWidth() && (drawable2 = this.i3) != null) {
                    drawable2.setAlpha(org.telegram.messenger.qs.e4);
                    Drawable drawable3 = this.i3;
                    drawable3.setBounds(z10, 0, drawable3.getIntrinsicWidth() + z10, getHeight());
                    this.i3.draw(canvas2);
                }
                e10 = this.y3.e(false, this.t3 < 0 ? 1.0f : 0.0f);
                int i12 = this.t3;
                w5 w5Var = this.z3;
                float e11 = i12 < 0 ? w5Var.e(false, i12) : w5Var.c;
                if (e10 > 0.0f) {
                    float f10 = e11 + 1.0f;
                    double d = f10;
                    int max = Math.max(1, (int) Math.floor(d));
                    int max2 = Math.max(1, (int) Math.ceil(d));
                    View view = null;
                    View view2 = null;
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        View childAt2 = getChildAt(i13);
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
                    paint.setAlpha((int) (alpha * e10));
                    if (view != null && view2 != null) {
                        float f11 = max == max2 ? 0.5f : (f10 - max) / (max2 - max);
                        RectF rectF = this.A3;
                        C1(rectF, view);
                        RectF rectF2 = this.B3;
                        C1(rectF2, view2);
                        RectF rectF3 = this.C3;
                        org.telegram.messenger.g0.Z1(rectF, rectF2, f11, rectF3);
                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
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
        e10 = this.y3.e(false, this.t3 < 0 ? 1.0f : 0.0f);
        int i122 = this.t3;
        w5 w5Var2 = this.z3;
        if (i122 < 0) {
        }
        if (e10 > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.i3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.t3;
    }

    public uu0 getSelectedCategory() {
        int i7;
        uu0[] uu0VarArr = this.f3;
        if (uu0VarArr == null || (i7 = this.t3) < 0 || i7 >= uu0VarArr.length) {
            return null;
        }
        return uu0VarArr[i7];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean z9;
        boolean z10;
        org.telegram.messenger.c20 c20Var;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof tu0) {
                z9 = true;
            } else {
                z10 = childAt.getRight() <= this.n3;
                z9 = false;
            }
        } else {
            z9 = false;
            z10 = false;
        }
        boolean z11 = this.q3;
        if (z11 != z10) {
            this.q3 = z10;
            org.telegram.messenger.c20 c20Var2 = this.o3;
            if (c20Var2 != null) {
                c20Var2.a(Integer.valueOf(z10 ? Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3)) : 0));
            }
            invalidate();
        } else if (z11 && (c20Var = this.o3) != null) {
            c20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3))));
        }
        if (this.r3 != z9) {
            this.r3 = z9;
            org.telegram.messenger.c20 c20Var3 = this.p3;
            if (c20Var3 != null) {
                c20Var3.a(Boolean.valueOf(z9));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.x3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.ec ecVar = this.s3;
        if (ecVar != null) {
            ecVar.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (this.k3 == null) {
            this.k3 = new Paint(1);
        }
        this.k3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.n3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.c20 c20Var) {
        this.u3 = c20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.c20 c20Var) {
        this.p3 = c20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.c20 c20Var) {
        this.o3 = c20Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.e3 = f10;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.l3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.n2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public uu0[] E1(uu0[] uu0VarArr) {
        return uu0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
