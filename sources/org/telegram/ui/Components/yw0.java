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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class yw0 extends tl0 {
    public static final ww0 u3 = new ww0();
    public static final xw0 v3 = new xw0();
    public float U2;
    public uw0[] V2;
    public final pw0 W2;
    public final z5 X2;
    public Drawable Y2;
    public Drawable Z2;
    public Paint a3;
    public final Paint b3;
    public int c3;
    public int d3;
    public Utilities.Callback e3;
    public Utilities.Callback f3;
    public boolean g3;
    public boolean h3;
    public fg.h0 i3;
    public int j3;
    public Utilities.Callback k3;
    public float l3;
    public ValueAnimator m3;
    public boolean n3;
    public final z5 o3;
    public final z5 p3;
    public final RectF q3;
    public final RectF r3;
    public final RectF s3;
    public boolean t3;

    static {
        new HashSet();
    }

    public yw0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 6.5f;
        this.V2 = null;
        pr prVar = pr.h;
        this.X2 = new z5(this, 360L, prVar);
        Paint paint = new Paint(1);
        this.b3 = paint;
        this.j3 = -1;
        this.l3 = 0.0f;
        this.n3 = true;
        this.o3 = new z5(this, 350L, prVar);
        this.p3 = new z5(this, 350L, prVar);
        this.q3 = new RectF();
        this.r3 = new RectF();
        this.s3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        pw0 pw0Var = new pw0(this);
        this.W2 = pw0Var;
        setAdapter(pw0Var);
        f2.j0 j0Var = new f2.j0();
        setLayoutManager(j0Var);
        j0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(i11, this.m2));
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i11, this.m2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        u3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new org.telegram.ui.ActionBar.b4(this, currentTimeMillis, 1));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof tw0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.c3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f10) {
        this.l3 = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tw0) {
                float cascade = AndroidUtilities.cascade(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((tw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(yw0 yw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        yw0Var.V2 = new uw0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            uw0[] uw0VarArr = yw0Var.V2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            uw0 uw0Var = new uw0();
            uw0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                uw0Var.a = "premium";
            } else {
                uw0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            uw0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            uw0Var.d = emojiGroup.title;
            uw0VarArr[i10] = uw0Var;
        }
        yw0Var.V2 = yw0Var.B1(yw0Var.V2);
        yw0Var.W2.l();
        yw0Var.setCategoriesShownT(0.0f);
        yw0Var.G1(yw0Var.n3, System.currentTimeMillis() - j10 > 16);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof tw0) {
            tw0 tw0Var = (tw0) view;
            f10 = e2.c.w(1.0f, tw0Var.B, 0.15f, 0.85f) * tw0Var.y;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.j3) + ((-getScrollToStartWidth()) - Math.max(0, this.d3));
        scrollBy(dp, 0);
        post(new jm((qh.r1) this, dp, 8));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, pr.h);
    }

    public void E1(int i10) {
        if (this.j3 < 0 && i10 >= 0) {
            this.p3.d(i10, true);
        }
        this.j3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof tw0) {
                ((tw0) childAt).l(this.j3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void F1(uw0 uw0Var) {
        int i10;
        if (this.V2 != null) {
            i10 = 0;
            while (true) {
                uw0[] uw0VarArr = this.V2;
                if (i10 >= uw0VarArr.length) {
                    break;
                } else if (uw0VarArr[i10] == uw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            E1(i10);
        }
        i10 = -1;
        E1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void G1(boolean z4, boolean z10) {
        this.n3 = z4;
        ?? r52 = z4;
        if (this.V2 == null) {
            r52 = 0;
        }
        if (this.l3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.m3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.m3 = null;
        }
        if (!z10) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l3, r52 != 0 ? 1.0f : 0.0f);
        this.m3 = ofFloat;
        ofFloat.addUpdateListener(new k70(this, 23));
        this.m3.addListener(new pd0(this, 15));
        this.m3.setInterpolator(pr.h);
        this.m3.setDuration((this.V2 == null ? 5 : r6.length) * 120);
        this.m3.start();
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof tw0) || E.getAlpha() < 0.5f) {
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
        if (this.a3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof tw0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int w10 = (int) e2.c.w(1.0f, this.l3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int w11 = (int) e2.c.w(1.0f, this.l3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(w10, 0.0f, w11, getHeight(), this.a3);
                if (w11 < getWidth() && (drawable2 = this.Y2) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.Y2;
                    drawable3.setBounds(w11, 0, drawable3.getIntrinsicWidth() + w11, getHeight());
                    this.Y2.draw(canvas2);
                }
                d = this.o3.d(this.j3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.j3;
                z5 z5Var = this.p3;
                float d10 = i13 < 0 ? z5Var.d(i13, false) : z5Var.c;
                if (d > 0.0f) {
                    float f10 = d10 + 1.0f;
                    double d11 = f10;
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
                    Paint paint = this.b3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f11 = max == max2 ? 0.5f : (f10 - max) / (max2 - max);
                        RectF rectF = this.q3;
                        z1(rectF, view);
                        RectF rectF2 = this.r3;
                        z1(rectF2, view2);
                        RectF rectF3 = this.s3;
                        AndroidUtilities.lerp(rectF, rectF2, f11, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.Y2;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.X2.d((canScrollHorizontally(-1) && this.h3) ? 1.0f : 0.0f, false) * 255.0f * this.l3));
                    if (this.Y2.getAlpha() > 0) {
                        Drawable drawable4 = this.Y2;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.Y2.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        d = this.o3.d(this.j3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.j3;
        z5 z5Var2 = this.p3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.Y2;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.j3;
    }

    public uw0 getSelectedCategory() {
        int i10;
        uw0[] uw0VarArr = this.V2;
        if (uw0VarArr == null || (i10 = this.j3) < 0 || i10 >= uw0VarArr.length) {
            return null;
        }
        return uw0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean z4;
        boolean z10;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof tw0) {
                z4 = true;
            } else {
                z10 = childAt.getRight() <= this.d3;
                z4 = false;
            }
        } else {
            z4 = false;
            z10 = false;
        }
        boolean z11 = this.g3;
        if (z11 != z10) {
            this.g3 = z10;
            Utilities.Callback callback2 = this.e3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z10 ? Math.max(0, getScrollToStartWidth() - (this.c3 - this.d3)) : 0));
            }
            invalidate();
        } else if (z11 && (callback = this.e3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.c3 - this.d3))));
        }
        if (this.h3 != z4) {
            this.h3 = z4;
            Utilities.Callback callback3 = this.f3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z4));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.n3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fg.h0 h0Var = this.i3;
        if (h0Var != null) {
            h0Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.a3 == null) {
            this.a3 = new Paint(1);
        }
        this.a3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Y2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Z2 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.d3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<uw0> callback) {
        this.k3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.e3 = callback;
    }

    public void setShownButtonsAtStart(float f10) {
        this.U2 = f10;
    }

    public uw0[] B1(uw0[] uw0VarArr) {
        return uw0VarArr;
    }
}
