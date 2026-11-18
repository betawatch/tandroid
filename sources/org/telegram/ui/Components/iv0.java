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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class iv0 extends ck0 implements org.telegram.ui.ActionBar.c6 {
    public static final gv0 F3 = new gv0();
    public static final hv0 G3 = new hv0();
    public final c6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public ev0[] g3;
    public final zu0 h3;
    public final c6 i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public org.telegram.messenger.x10 p3;
    public org.telegram.messenger.x10 q3;
    public boolean r3;
    public boolean s3;
    public bi.i3 t3;
    public int u3;
    public org.telegram.messenger.x10 v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final c6 z3;

    static {
        new HashSet();
    }

    public iv0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f3 = 6.5f;
        this.g3 = null;
        lr lrVar = lr.h;
        this.i3 = new c6(this, 360L, lrVar);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new c6(this, 350L, lrVar);
        this.A3 = new c6(this, 350L, lrVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        zu0 zu0Var = new zu0(this);
        this.h3 = zu0Var;
        setAdapter(zu0Var);
        v4.c0 c0Var = new v4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.u6.l(this, 20, i10, i6Var);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, this.o2));
        setWillNotDraw(false);
        setOnItemClickListener(new n(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.j10.t0, Integer.valueOf(i7), new hi.d8(this, currentTimeMillis, 3));
    }

    public static void A1(iv0 iv0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        iv0Var.g3 = new ev0[tL_messages_emojiGroups.groups.size()];
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            ev0[] ev0VarArr = iv0Var.g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ev0 ev0Var = new ev0();
            ev0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                ev0Var.a = "premium";
            } else {
                ev0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            ev0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            ev0Var.d = emojiGroup.title;
            ev0VarArr[i7] = ev0Var;
        }
        iv0Var.g3 = iv0Var.E1(iv0Var.g3);
        iv0Var.h3.f();
        iv0Var.setCategoriesShownT(0.0f);
        iv0Var.J1(iv0Var.y3, System.currentTimeMillis() - j3 > 16);
    }

    public static void C1(View view, RectF rectF) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof dv0) {
            dv0 dv0Var = (dv0) view;
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, dv0Var.F, 0.15f, 0.85f) * dv0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof dv0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f10) {
        this.w3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof dv0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((dv0) childAt).j();
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(L, 0);
        post(new ap0((hi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, lr.h);
    }

    public void H1(int i7) {
        if (this.u3 < 0 && i7 >= 0) {
            this.A3.e(true, i7);
        }
        this.u3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof dv0) {
                ((dv0) childAt).l(this.u3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void I1(ev0 ev0Var) {
        int i7;
        if (this.g3 != null) {
            i7 = 0;
            while (true) {
                ev0[] ev0VarArr = this.g3;
                if (i7 >= ev0VarArr.length) {
                    break;
                } else if (ev0VarArr[i7] == ev0Var) {
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
    public final void J1(boolean z10, boolean z11) {
        this.y3 = z10;
        ?? r52 = z10;
        if (this.g3 == null) {
            r52 = 0;
        }
        if (this.w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w3, r52 != 0 ? 1.0f : 0.0f);
        this.x3 = ofFloat;
        int i7 = 23;
        ofFloat.addUpdateListener(new e60(this, i7));
        this.x3.addListener(new q60(this, i7));
        this.x3.setInterpolator(lr.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof dv0) || E.getAlpha() < 0.5f) {
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
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = TLObject.FLAG_31;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof dv0) {
                    i7 = Math.min(i7, childAt.getLeft());
                    i10 = Math.max(i10, childAt.getRight());
                }
            }
            if (i7 < i10) {
                int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.w3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i7);
                int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.w3, org.telegram.messenger.g0.L(32.0f) + getWidth(), i10);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.l3);
                if (z11 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(org.telegram.messenger.ks.e4);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.j3.draw(canvas2);
                }
                e10 = this.z3.e(false, this.u3 < 0 ? 1.0f : 0.0f);
                int i12 = this.u3;
                c6 c6Var = this.A3;
                float e11 = i12 < 0 ? c6Var.e(false, i12) : c6Var.c;
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
                        C1(view, rectF);
                        RectF rectF2 = this.C3;
                        C1(view2, rectF2);
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
        c6 c6Var2 = this.A3;
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

    public ev0 getSelectedCategory() {
        int i7;
        ev0[] ev0VarArr = this.g3;
        if (ev0VarArr == null || (i7 = this.u3) < 0 || i7 >= ev0VarArr.length) {
            return null;
        }
        return ev0VarArr[i7];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.x10 x10Var;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof dv0) {
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
            org.telegram.messenger.x10 x10Var2 = this.p3;
            if (x10Var2 != null) {
                x10Var2.a(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z12 && (x10Var = this.p3) != null) {
            x10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z10) {
            this.s3 = z10;
            org.telegram.messenger.x10 x10Var3 = this.q3;
            if (x10Var3 != null) {
                x10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.i3 i3Var = this.t3;
        if (i3Var != null) {
            i3Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (this.l3 == null) {
            this.l3 = new Paint(1);
        }
        this.l3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.o3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.x10 x10Var) {
        this.v3 = x10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.x10 x10Var) {
        this.q3 = x10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.x10 x10Var) {
        this.p3 = x10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f3 = f10;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.m3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, this.o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public ev0[] E1(ev0[] ev0VarArr) {
        return ev0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
