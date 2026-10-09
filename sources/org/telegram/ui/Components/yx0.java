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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class yx0 extends qm0 {
    public static final wx0 v3 = new wx0();
    public static final xx0 w3 = new xx0();
    public float V2;
    public ux0[] W2;
    public final px0 X2;
    public final g6 Y2;
    public Drawable Z2;
    public Drawable a3;
    public Paint b3;
    public final Paint c3;
    public int d3;
    public int e3;
    public Utilities.Callback f3;
    public Utilities.Callback g3;
    public boolean h3;
    public boolean i3;
    public ci.bb j3;
    public int k3;
    public Utilities.Callback l3;
    public float m3;
    public ValueAnimator n3;
    public boolean o3;
    public final g6 p3;
    public final g6 q3;
    public final RectF r3;
    public final RectF s3;
    public final RectF t3;
    public boolean u3;

    static {
        new HashSet();
    }

    public yx0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V2 = 6.5f;
        this.W2 = null;
        hs hsVar = hs.h;
        this.Y2 = new g6(this, 360L, hsVar);
        Paint paint = new Paint(1);
        this.c3 = paint;
        this.k3 = -1;
        this.m3 = 0.0f;
        this.o3 = true;
        this.p3 = new g6(this, 350L, hsVar);
        this.q3 = new g6(this, 350L, hsVar);
        this.r3 = new RectF();
        this.s3 = new RectF();
        this.t3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        px0 px0Var = new px0(this);
        this.X2 = px0Var;
        setAdapter(px0Var);
        s4.d0 d0Var = new s4.d0();
        setLayoutManager(d0Var);
        d0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.i6.i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.w0(i11, this.n2));
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i11, this.n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        v3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.p9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof tx0) {
            tx0 tx0Var = (tx0) view;
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, tx0Var.E, 0.15f, 0.85f) * tx0Var.y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof tx0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.d3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.m3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((tx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(yx0 yx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        yx0Var.W2 = new ux0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            ux0[] ux0VarArr = yx0Var.W2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ux0 ux0Var = new ux0();
            ux0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                ux0Var.a = "premium";
            } else {
                ux0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            ux0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            ux0Var.d = emojiGroup.title;
            ux0VarArr[i10] = ux0Var;
        }
        yx0Var.W2 = yx0Var.C1(yx0Var.W2);
        yx0Var.X2.l();
        yx0Var.setCategoriesShownT(0.0f);
        yx0Var.H1(yx0Var.o3, System.currentTimeMillis() - j3 > 16);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.k3) + ((-getScrollToStartWidth()) - Math.max(0, this.e3));
        scrollBy(dp, 0);
        post(new nd((ci.j2) this, dp, 10));
    }

    public final void E1() {
        v0(-getScrollToStartWidth(), 0, hs.h);
    }

    public void F1(int i10) {
        if (this.k3 < 0 && i10 >= 0) {
            this.q3.d(i10, true);
        }
        this.k3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof tx0) {
                ((tx0) childAt).l(this.k3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void G1(ux0 ux0Var) {
        int i10;
        if (this.W2 != null) {
            i10 = 0;
            while (true) {
                ux0[] ux0VarArr = this.W2;
                if (i10 >= ux0VarArr.length) {
                    break;
                } else if (ux0VarArr[i10] == ux0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            F1(i10);
        }
        i10 = -1;
        F1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void H1(boolean z10, boolean z11) {
        this.o3 = z10;
        ?? r52 = z10;
        if (this.W2 == null) {
            r52 = 0;
        }
        if (this.m3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.n3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m3, r52 != 0 ? 1.0f : 0.0f);
        this.n3 = ofFloat;
        ofFloat.addUpdateListener(new j80(this, 24));
        this.n3.addListener(new vd0(this, 17));
        this.n3.setInterpolator(hs.h);
        this.n3.setDuration((this.W2 == null ? 5 : r6.length) * 120);
        this.n3.start();
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof tx0) || E.getAlpha() < 0.5f) {
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
        float d;
        Drawable drawable;
        Drawable drawable2;
        if (this.b3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof tx0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int y3 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, this.m3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int y10 = (int) com.google.android.gms.internal.vision.e2.y(1.0f, this.m3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(y3, 0.0f, y10, getHeight(), this.b3);
                if (y10 < getWidth() && (drawable2 = this.Z2) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.Z2;
                    drawable3.setBounds(y10, 0, drawable3.getIntrinsicWidth() + y10, getHeight());
                    this.Z2.draw(canvas2);
                }
                d = this.p3.d(this.k3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.k3;
                g6 g6Var = this.q3;
                float d10 = i13 < 0 ? g6Var.d(i13, false) : g6Var.c;
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
                    Paint paint = this.c3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.r3;
                        A1(rectF, view);
                        RectF rectF2 = this.s3;
                        A1(rectF2, view2);
                        RectF rectF3 = this.t3;
                        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.Z2;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.Y2.d((canScrollHorizontally(-1) && this.i3) ? 1.0f : 0.0f, false) * 255.0f * this.m3));
                    if (this.Z2.getAlpha() > 0) {
                        Drawable drawable4 = this.Z2;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.Z2.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        d = this.p3.d(this.k3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.k3;
        g6 g6Var2 = this.q3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.Z2;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.k3;
    }

    public ux0 getSelectedCategory() {
        int i10;
        ux0[] ux0VarArr = this.W2;
        if (ux0VarArr == null || (i10 = this.k3) < 0 || i10 >= ux0VarArr.length) {
            return null;
        }
        return ux0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof tx0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.e3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.h3;
        if (z12 != z11) {
            this.h3 = z11;
            Utilities.Callback callback2 = this.f3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.d3 - this.e3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.f3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.d3 - this.e3))));
        }
        if (this.i3 != z10) {
            this.i3 = z10;
            Utilities.Callback callback3 = this.g3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.o3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.bb bbVar = this.j3;
        if (bbVar != null) {
            bbVar.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.b3 == null) {
            this.b3 = new Paint(1);
        }
        this.b3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Z2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.a3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.e3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<ux0> callback) {
        this.l3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.g3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.V2 = f7;
    }

    public ux0[] C1(ux0[] ux0VarArr) {
        return ux0VarArr;
    }
}
