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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class xu0 extends tj0 implements org.telegram.ui.ActionBar.z5 {
    public static final vu0 F3 = new vu0();
    public static final wu0 G3 = new wu0();
    public final u5 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public tu0[] g3;
    public final ou0 h3;
    public final u5 i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public org.telegram.messenger.u10 p3;
    public org.telegram.messenger.u10 q3;
    public boolean r3;
    public boolean s3;
    public ai.x2 t3;
    public int u3;
    public org.telegram.messenger.u10 v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final u5 z3;

    static {
        new HashSet();
    }

    public xu0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f3 = 6.5f;
        this.g3 = null;
        xq xqVar = xq.h;
        this.i3 = new u5(this, 360L, xqVar);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new u5(this, 350L, xqVar);
        this.A3 = new u5(this, 350L, xqVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        ou0 ou0Var = new ou0(this);
        this.h3 = ou0Var;
        setAdapter(ou0Var);
        u4.b0 b0Var = new u4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i10, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.h10.t0, Integer.valueOf(i3), new gi.e8(this, currentTimeMillis, 2));
    }

    public static void A1(xu0 xu0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        xu0Var.g3 = new tu0[tL_messages_emojiGroups.groups.size()];
        for (int i3 = 0; i3 < tL_messages_emojiGroups.groups.size(); i3++) {
            tu0[] tu0VarArr = xu0Var.g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i3);
            tu0 tu0Var = new tu0();
            tu0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                tu0Var.a = "premium";
            } else {
                tu0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            tu0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            tu0Var.d = emojiGroup.title;
            tu0VarArr[i3] = tu0Var;
        }
        xu0Var.g3 = xu0Var.E1(xu0Var.g3);
        xu0Var.h3.f();
        xu0Var.setCategoriesShownT(0.0f);
        xu0Var.J1(xu0Var.y3, System.currentTimeMillis() - j10 > 16);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof su0) {
            su0 su0Var = (su0) view;
            f10 = com.google.android.recaptcha.internal.a.y(1.0f, su0Var.F, 0.15f, 0.85f) * su0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof su0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f10) {
        this.w3 = f10;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof su0) {
                float s6 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s6 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((su0) childAt).j();
                }
                childAt.setAlpha(s6);
                childAt.setScaleX(s6);
                childAt.setScaleY(s6);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.g0.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new sp0((gi.c2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, xq.h);
    }

    public void H1(int i3) {
        if (this.u3 < 0 && i3 >= 0) {
            this.A3.e(true, i3);
        }
        this.u3 = i3;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof su0) {
                ((su0) childAt).l(this.u3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(tu0 tu0Var) {
        int i3;
        if (this.g3 != null) {
            i3 = 0;
            while (true) {
                tu0[] tu0VarArr = this.g3;
                if (i3 >= tu0VarArr.length) {
                    break;
                } else if (tu0VarArr[i3] == tu0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            H1(i3);
        }
        i3 = -1;
        H1(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void J1(boolean z10, boolean z11) {
        this.y3 = z10;
        ?? r5 = z10;
        if (this.g3 == null) {
            r5 = 0;
        }
        if (this.w3 == ((float) r5)) {
            return;
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r5 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, r5 != 0 ? 1.0f : 0.0f);
        this.x3 = ofFloat;
        ofFloat.addUpdateListener(new y50(this, 22));
        this.x3.addListener(new a60(this, 23));
        this.x3.setInterpolator(xq.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof su0) || E.getAlpha() < 0.5f) {
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
        if (this.l3 != null) {
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = TLObject.FLAG_31;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof su0) {
                    i3 = Math.min(i3, childAt.getLeft());
                    i10 = Math.max(i10, childAt.getRight());
                }
            }
            if (i3 < i10) {
                int y9 = (int) com.google.android.recaptcha.internal.a.y(1.0f, this.w3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i3);
                int y10 = (int) com.google.android.recaptcha.internal.a.y(1.0f, this.w3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i10);
                canvas2 = canvas;
                canvas2.drawRect(y9, 0.0f, y10, getHeight(), this.l3);
                if (y10 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(org.telegram.messenger.hs.e4);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(y10, 0, drawable3.getIntrinsicWidth() + y10, getHeight());
                    this.j3.draw(canvas2);
                }
                e10 = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
                int i12 = this.u3;
                u5 u5Var = this.A3;
                float e11 = i12 < 0 ? u5Var.e(false, i12) : u5Var.c;
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
                    Paint paint = this.m3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * e10));
                    if (view != null && view2 != null) {
                        float f11 = max == max2 ? 0.5f : (f10 - max) / (max2 - max);
                        RectF rectF = this.B3;
                        C1(rectF, view);
                        RectF rectF2 = this.C3;
                        C1(rectF2, view2);
                        RectF rectF3 = this.D3;
                        org.telegram.messenger.g0.Z1(rectF, rectF2, f11, rectF3);
                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.j3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.i3.e(false, (canScrollHorizontally(-1) && this.s3) ? 1.0f : 0.0f) * 255.0f * this.w3));
                    if (this.j3.getAlpha() > 0) {
                        Drawable drawable4 = this.j3;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.j3.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        e10 = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
        int i122 = this.u3;
        u5 u5Var2 = this.A3;
        if (i122 < 0) {
        }
        if (e10 > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.j3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.u3;
    }

    public tu0 getSelectedCategory() {
        int i3;
        tu0[] tu0VarArr = this.g3;
        if (tu0VarArr == null || (i3 = this.u3) < 0 || i3 >= tu0VarArr.length) {
            return null;
        }
        return tu0VarArr[i3];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.u10 u10Var;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof su0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.o3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.r3;
        if (z12 != z11) {
            this.r3 = z11;
            org.telegram.messenger.u10 u10Var2 = this.p3;
            if (u10Var2 != null) {
                u10Var2.a(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z12 && (u10Var = this.p3) != null) {
            u10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z10) {
            this.s3 = z10;
            org.telegram.messenger.u10 u10Var3 = this.q3;
            if (u10Var3 != null) {
                u10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.x2 x2Var = this.t3;
        if (x2Var != null) {
            x2Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (this.l3 == null) {
            this.l3 = new Paint(1);
        }
        this.l3.setColor(i3);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i3, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i3, mode));
    }

    public void setDontOccupyWidth(int i3) {
        this.o3 = i3;
    }

    public void setOnCategoryClick(org.telegram.messenger.u10 u10Var) {
        this.v3 = u10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.u10 u10Var) {
        this.q3 = u10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.u10 u10Var) {
        this.p3 = u10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f3 = f10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.m3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public tu0[] E1(tu0[] tu0VarArr) {
        return tu0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
