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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class gw0 extends zk0 {
    public static final ew0 t3 = new ew0();
    public static final fw0 u3 = new fw0();
    public float T2;
    public cw0[] U2;
    public final xv0 V2;
    public final y5 W2;
    public Drawable X2;
    public Drawable Y2;
    public Paint Z2;
    public final Paint a3;
    public int b3;
    public int c3;
    public Utilities.Callback d3;
    public Utilities.Callback e3;
    public boolean f3;
    public boolean g3;
    public ag.s0 h3;
    public int i3;
    public Utilities.Callback j3;
    public float k3;
    public ValueAnimator l3;
    public boolean m3;
    public final y5 n3;
    public final y5 o3;
    public final RectF p3;
    public final RectF q3;
    public final RectF r3;
    public boolean s3;

    static {
        new HashSet();
    }

    public gw0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = 6.5f;
        this.U2 = null;
        er erVar = er.h;
        this.W2 = new y5(this, 360L, erVar);
        Paint paint = new Paint(1);
        this.a3 = paint;
        this.i3 = -1;
        this.k3 = 0.0f;
        this.m3 = true;
        this.n3 = new y5(this, 350L, erVar);
        this.o3 = new y5(this, 350L, erVar);
        this.p3 = new RectF();
        this.q3 = new RectF();
        this.r3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        xv0 xv0Var = new xv0(this);
        this.V2 = xv0Var;
        setAdapter(xv0Var);
        f2.k0 k0Var = new f2.k0();
        setLayoutManager(k0Var);
        k0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.g6.i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(i11, this.l2));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, this.l2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        t3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new lh.b9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof bw0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.b3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f10) {
        this.k3 = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof bw0) {
                float cascade = AndroidUtilities.cascade(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((bw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(gw0 gw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        gw0Var.U2 = new cw0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            cw0[] cw0VarArr = gw0Var.U2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            cw0 cw0Var = new cw0();
            cw0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                cw0Var.a = "premium";
            } else {
                cw0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            cw0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            cw0Var.d = emojiGroup.title;
            cw0VarArr[i10] = cw0Var;
        }
        gw0Var.U2 = gw0Var.B1(gw0Var.U2);
        gw0Var.V2.l();
        gw0Var.setCategoriesShownT(0.0f);
        gw0Var.G1(gw0Var.m3, System.currentTimeMillis() - j10 > 16);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof bw0) {
            bw0 bw0Var = (bw0) view;
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, bw0Var.A, 0.15f, 0.85f) * bw0Var.y;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.i3) + ((-getScrollToStartWidth()) - Math.max(0, this.c3));
        scrollBy(dp, 0);
        post(new xl((lh.d2) this, dp, 8));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, er.h);
    }

    public void E1(int i10) {
        if (this.i3 < 0 && i10 >= 0) {
            this.o3.d(i10, true);
        }
        this.i3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof bw0) {
                ((bw0) childAt).l(this.i3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void F1(cw0 cw0Var) {
        int i10;
        if (this.U2 != null) {
            i10 = 0;
            while (true) {
                cw0[] cw0VarArr = this.U2;
                if (i10 >= cw0VarArr.length) {
                    break;
                } else if (cw0VarArr[i10] == cw0Var) {
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
    public final void G1(boolean z10, boolean z11) {
        this.m3 = z10;
        ?? r52 = z10;
        if (this.U2 == null) {
            r52 = 0;
        }
        if (this.k3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.k3, r52 != 0 ? 1.0f : 0.0f);
        this.l3 = ofFloat;
        ofFloat.addUpdateListener(new v60(this, 23));
        this.l3.addListener(new sz(this, 24));
        this.l3.setInterpolator(er.h);
        this.l3.setDuration((this.U2 == null ? 5 : r6.length) * 120);
        this.l3.start();
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof bw0) || E.getAlpha() < 0.5f) {
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
        if (this.Z2 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof bw0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int z10 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.k3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int z11 = (int) com.google.android.recaptcha.internal.a.z(1.0f, this.k3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.Z2);
                if (z11 < getWidth() && (drawable2 = this.X2) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.X2;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.X2.draw(canvas2);
                }
                d = this.n3.d(this.i3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.i3;
                y5 y5Var = this.o3;
                float d10 = i13 < 0 ? y5Var.d(i13, false) : y5Var.c;
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
                    Paint paint = this.a3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f11 = max == max2 ? 0.5f : (f10 - max) / (max2 - max);
                        RectF rectF = this.p3;
                        z1(rectF, view);
                        RectF rectF2 = this.q3;
                        z1(rectF2, view2);
                        RectF rectF3 = this.r3;
                        AndroidUtilities.lerp(rectF, rectF2, f11, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.X2;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.W2.d((canScrollHorizontally(-1) && this.g3) ? 1.0f : 0.0f, false) * 255.0f * this.k3));
                    if (this.X2.getAlpha() > 0) {
                        Drawable drawable4 = this.X2;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.X2.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        d = this.n3.d(this.i3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.i3;
        y5 y5Var2 = this.o3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.X2;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.i3;
    }

    public cw0 getSelectedCategory() {
        int i10;
        cw0[] cw0VarArr = this.U2;
        if (cw0VarArr == null || (i10 = this.i3) < 0 || i10 >= cw0VarArr.length) {
            return null;
        }
        return cw0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof bw0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.c3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f3;
        if (z12 != z11) {
            this.f3 = z11;
            Utilities.Callback callback2 = this.d3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.b3 - this.c3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.d3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.b3 - this.c3))));
        }
        if (this.g3 != z10) {
            this.g3 = z10;
            Utilities.Callback callback3 = this.e3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.m3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ag.s0 s0Var = this.h3;
        if (s0Var != null) {
            s0Var.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.Z2 == null) {
            this.Z2 = new Paint(1);
        }
        this.Z2.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.X2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.Y2 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.c3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<cw0> callback) {
        this.j3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.e3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.d3 = callback;
    }

    public void setShownButtonsAtStart(float f10) {
        this.T2 = f10;
    }

    public cw0[] B1(cw0[] cw0VarArr) {
        return cw0VarArr;
    }
}
