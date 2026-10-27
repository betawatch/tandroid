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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class cy0 extends nm0 implements org.telegram.ui.ActionBar.p6 {
    public static final ay0 F3 = new ay0();
    public static final by0 G3 = new by0();
    public final h6 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f3;
    public yx0[] g3;
    public final tx0 h3;
    public final h6 i3;
    public Drawable j3;
    public Drawable k3;
    public Paint l3;
    public final Paint m3;
    public int n3;
    public int o3;
    public Utilities.Callback p3;
    public Utilities.Callback q3;
    public boolean r3;
    public boolean s3;
    public bi.cc t3;
    public int u3;
    public Utilities.Callback v3;
    public float w3;
    public ValueAnimator x3;
    public boolean y3;
    public final h6 z3;

    static {
        new HashSet();
    }

    public cy0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f3 = 6.5f;
        this.g3 = null;
        ds dsVar = ds.h;
        this.i3 = new h6(this, 360L, dsVar);
        Paint paint = new Paint(1);
        this.m3 = paint;
        this.u3 = -1;
        this.w3 = 0.0f;
        this.y3 = true;
        this.z3 = new h6(this, 350L, dsVar);
        this.A3 = new h6(this, 350L, dsVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        tx0 tx0Var = new tx0(this);
        this.h3 = tx0Var;
        setAdapter(tx0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.k1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.f7.m(this, 20, i11, u6Var);
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new fi.y8(this, currentTimeMillis, 2));
    }

    public static void D1(cy0 cy0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        cy0Var.g3 = new yx0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            yx0[] yx0VarArr = cy0Var.g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            yx0 yx0Var = new yx0();
            yx0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                yx0Var.a = "premium";
            } else {
                yx0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            yx0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            yx0Var.d = emojiGroup.title;
            yx0VarArr[i10] = yx0Var;
        }
        cy0Var.g3 = cy0Var.H1(cy0Var.g3);
        cy0Var.h3.l();
        cy0Var.setCategoriesShownT(0.0f);
        cy0Var.M1(cy0Var.y3, System.currentTimeMillis() - j10 > 16);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof xx0) {
            xx0 xx0Var = (xx0) view;
            f7 = c3.h0.z(1.0f, xx0Var.E, 0.15f, 0.85f) * xx0Var.y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof xx0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.n3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.w3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof xx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((xx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public abstract boolean G1();

    public final void I1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.u3) + ((-getScrollToStartWidth()) - Math.max(0, this.o3));
        scrollBy(dp, 0);
        post(new np0((fi.e2) this, dp));
    }

    public final void J1() {
        w0(-getScrollToStartWidth(), 0, ds.h);
    }

    public void K1(int i10) {
        if (this.u3 < 0 && i10 >= 0) {
            this.A3.d(i10, true);
        }
        this.u3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof xx0) {
                ((xx0) childAt).l(this.u3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void L1(yx0 yx0Var) {
        int i10;
        if (this.g3 != null) {
            i10 = 0;
            while (true) {
                yx0[] yx0VarArr = this.g3;
                if (i10 >= yx0VarArr.length) {
                    break;
                } else if (yx0VarArr[i10] == yx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            K1(i10);
        }
        i10 = -1;
        K1(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void M1(boolean z10, boolean z11) {
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
        ofFloat.addUpdateListener(new f80(this, 23));
        this.x3.addListener(new i10(this, 24));
        this.x3.setInterpolator(ds.h);
        this.x3.setDuration((this.g3 == null ? 5 : r6.length) * 120);
        this.x3.start();
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof xx0) || E.getAlpha() < 0.5f) {
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
        if (this.l3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof xx0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int z10 = (int) c3.h0.z(1.0f, this.w3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int z11 = (int) c3.h0.z(1.0f, this.w3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.l3);
                if (z11 < getWidth() && (drawable2 = this.j3) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.j3;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.j3.draw(canvas2);
                }
                d = this.z3.d(this.u3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.u3;
                h6 h6Var = this.A3;
                float d10 = i13 < 0 ? h6Var.d(i13, false) : h6Var.c;
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
                    Paint paint = this.m3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.B3;
                        F1(rectF, view);
                        RectF rectF2 = this.C3;
                        F1(rectF2, view2);
                        RectF rectF3 = this.D3;
                        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.j3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.i3.d((canScrollHorizontally(-1) && this.s3) ? 1.0f : 0.0f, false) * 255.0f * this.w3));
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
        d = this.z3.d(this.u3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.u3;
        h6 h6Var2 = this.A3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.j3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.u3;
    }

    public yx0 getSelectedCategory() {
        int i10;
        yx0[] yx0VarArr = this.g3;
        if (yx0VarArr == null || (i10 = this.u3) < 0 || i10 >= yx0VarArr.length) {
            return null;
        }
        return yx0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof xx0) {
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
            Utilities.Callback callback2 = this.p3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.p3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.n3 - this.o3))));
        }
        if (this.s3 != z10) {
            this.s3 = z10;
            Utilities.Callback callback3 = this.q3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M1(this.y3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.cc ccVar = this.t3;
        if (ccVar != null) {
            ccVar.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.l3 == null) {
            this.l3 = new Paint(1);
        }
        this.l3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.o3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<yx0> callback) {
        this.v3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.q3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.p3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f3 = f7;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.m3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.i6, this.n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public yx0[] H1(yx0[] yx0VarArr) {
        return yx0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
