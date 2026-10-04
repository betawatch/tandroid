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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class rx0 extends zl0 {
    public static final px0 E3 = new px0();
    public static final qx0 F3 = new qx0();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float e3;
    public nx0[] f3;
    public final ix0 g3;
    public final e6 h3;
    public Drawable i3;
    public Drawable j3;
    public Paint k3;
    public final Paint l3;
    public int m3;
    public int n3;
    public Utilities.Callback o3;
    public Utilities.Callback p3;
    public boolean q3;
    public boolean r3;
    public ci.ab s3;
    public int t3;
    public Utilities.Callback u3;
    public float v3;
    public ValueAnimator w3;
    public boolean x3;
    public final e6 y3;
    public final e6 z3;

    static {
        new HashSet();
    }

    public rx0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.e3 = 6.5f;
        this.f3 = null;
        tr trVar = tr.h;
        this.h3 = new e6(this, 360L, trVar);
        Paint paint = new Paint(1);
        this.l3 = paint;
        this.t3 = -1;
        this.v3 = 0.0f;
        this.x3 = true;
        this.y3 = new e6(this, 350L, trVar);
        this.z3 = new e6(this, 350L, trVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        ix0 ix0Var = new ix0(this);
        this.g3 = ix0Var;
        setAdapter(ix0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.i6.i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(i11, this.p2));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i11, this.p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.o9(this, currentTimeMillis, 2));
    }

    public static void B1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof mx0) {
            mx0 mx0Var = (mx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, mx0Var.E, 0.15f, 0.85f) * mx0Var.y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof mx0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.m3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.v3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof mx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((mx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void z1(rx0 rx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        rx0Var.f3 = new nx0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            nx0[] nx0VarArr = rx0Var.f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            nx0 nx0Var = new nx0();
            nx0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                nx0Var.a = "premium";
            } else {
                nx0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            nx0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            nx0Var.d = emojiGroup.title;
            nx0VarArr[i10] = nx0Var;
        }
        rx0Var.f3 = rx0Var.D1(rx0Var.f3);
        rx0Var.g3.l();
        rx0Var.setCategoriesShownT(0.0f);
        rx0Var.I1(rx0Var.x3, System.currentTimeMillis() - j3 > 16);
    }

    public abstract boolean C1();

    public final void E1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.t3) + ((-getScrollToStartWidth()) - Math.max(0, this.n3));
        scrollBy(dp, 0);
        post(new br0((ci.k2) this, dp));
    }

    public final void F1() {
        w0(-getScrollToStartWidth(), 0, tr.h);
    }

    public void G1(int i10) {
        if (this.t3 < 0 && i10 >= 0) {
            this.z3.d(i10, true);
        }
        this.t3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof mx0) {
                ((mx0) childAt).l(this.t3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void H1(nx0 nx0Var) {
        int i10;
        if (this.f3 != null) {
            i10 = 0;
            while (true) {
                nx0[] nx0VarArr = this.f3;
                if (i10 >= nx0VarArr.length) {
                    break;
                } else if (nx0VarArr[i10] == nx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            G1(i10);
        }
        i10 = -1;
        G1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void I1(boolean z10, boolean z11) {
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
        ofFloat.addUpdateListener(new v70(this, 23));
        this.w3.addListener(new hd0(this, 17));
        this.w3.setInterpolator(tr.h);
        this.w3.setDuration((this.f3 == null ? 5 : r6.length) * 120);
        this.w3.start();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof mx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0090  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float d;
        Drawable drawable;
        Drawable drawable2;
        if (this.k3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof mx0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.v3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.v3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.k3);
                if (z11 < getWidth() && (drawable2 = this.i3) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.i3;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.i3.draw(canvas2);
                }
                d = this.y3.d(this.t3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.t3;
                e6 e6Var = this.z3;
                float d10 = i13 < 0 ? e6Var.d(i13, false) : e6Var.c;
                if (d > 0.0f) {
                    float f7 = d10 + 1.0f;
                    double d11 = f7;
                    int max = Math.max(1, (int) Math.floor(d11));
                    int max2 = Math.max(1, (int) Math.ceil(d11));
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
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.A3;
                        B1(rectF, view);
                        RectF rectF2 = this.B3;
                        B1(rectF2, view2);
                        RectF rectF3 = this.C3;
                        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.i3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.h3.d((canScrollHorizontally(-1) && this.r3) ? 1.0f : 0.0f, false) * 255.0f * this.v3));
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
        d = this.y3.d(this.t3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.t3;
        e6 e6Var2 = this.z3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.i3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.t3;
    }

    public nx0 getSelectedCategory() {
        int i10;
        nx0[] nx0VarArr = this.f3;
        if (nx0VarArr == null || (i10 = this.t3) < 0 || i10 >= nx0VarArr.length) {
            return null;
        }
        return nx0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof mx0) {
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
            Utilities.Callback callback2 = this.o3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.o3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.m3 - this.n3))));
        }
        if (this.r3 != z10) {
            this.r3 = z10;
            Utilities.Callback callback3 = this.p3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        I1(this.x3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.ab abVar = this.s3;
        if (abVar != null) {
            abVar.requestLayout();
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

    public void setOnCategoryClick(Utilities.Callback<nx0> callback) {
        this.u3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.p3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.o3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.e3 = f7;
    }

    public nx0[] D1(nx0[] nx0VarArr) {
        return nx0VarArr;
    }
}
