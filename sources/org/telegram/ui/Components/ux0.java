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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class ux0 extends mm0 implements org.telegram.ui.ActionBar.b6 {
    public static final sx0 y3 = new sx0();
    public static final tx0 z3 = new tx0();
    public float Y2;
    public qx0[] Z2;
    public final lx0 a3;
    public final f6 b3;
    public Drawable c3;
    public Drawable d3;
    public Paint e3;
    public final Paint f3;
    public int g3;
    public int h3;
    public Utilities.Callback i3;
    public Utilities.Callback j3;
    public boolean k3;
    public boolean l3;
    public ai.jc m3;
    public int n3;
    public Utilities.Callback o3;
    public float p3;
    public ValueAnimator q3;
    public boolean r3;
    public final f6 s3;
    public final f6 t3;
    public final RectF u3;
    public final RectF v3;
    public final RectF w3;
    public boolean x3;

    static {
        new HashSet();
    }

    public ux0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = 6.5f;
        this.Z2 = null;
        bs bsVar = bs.h;
        this.b3 = new f6(this, 360L, bsVar);
        Paint paint = new Paint(1);
        this.f3 = paint;
        this.n3 = -1;
        this.p3 = 0.0f;
        this.r3 = true;
        this.s3 = new f6(this, 350L, bsVar);
        this.t3 = new f6(this, 350L, bsVar);
        this.u3 = new RectF();
        this.v3 = new RectF();
        this.w3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        lx0 lx0Var = new lx0(this);
        this.a3 = lx0Var;
        setAdapter(lx0Var);
        s4.b0 b0Var = new s4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i11, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, this.n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        y3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ei.c9(this, currentTimeMillis, 2));
    }

    public static void D1(ux0 ux0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        ux0Var.Z2 = new qx0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            qx0[] qx0VarArr = ux0Var.Z2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            qx0 qx0Var = new qx0();
            qx0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                qx0Var.a = "premium";
            } else {
                qx0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            qx0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            qx0Var.d = emojiGroup.title;
            qx0VarArr[i10] = qx0Var;
        }
        ux0Var.Z2 = ux0Var.H1(ux0Var.Z2);
        ux0Var.a3.l();
        ux0Var.setCategoriesShownT(0.0f);
        ux0Var.M1(ux0Var.r3, System.currentTimeMillis() - j10 > 16);
    }

    public static void F1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof px0) {
            px0 px0Var = (px0) view;
            f7 = com.google.android.gms.internal.play_billing.k3.y(1.0f, px0Var.E, 0.15f, 0.85f) * px0Var.y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof px0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.g3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.p3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof px0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((px0) childAt).j();
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
        int dp = (AndroidUtilities.dp(34.0f) * this.n3) + ((-getScrollToStartWidth()) - Math.max(0, this.h3));
        scrollBy(dp, 0);
        post(new d2((ei.g2) this, dp, 12));
    }

    public final void J1() {
        v0(-getScrollToStartWidth(), 0, bs.h);
    }

    public void K1(int i10) {
        if (this.n3 < 0 && i10 >= 0) {
            this.t3.d(i10, true);
        }
        this.n3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof px0) {
                ((px0) childAt).l(this.n3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void L1(qx0 qx0Var) {
        int i10;
        if (this.Z2 != null) {
            i10 = 0;
            while (true) {
                qx0[] qx0VarArr = this.Z2;
                if (i10 >= qx0VarArr.length) {
                    break;
                } else if (qx0VarArr[i10] == qx0Var) {
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
        this.r3 = z10;
        ?? r52 = z10;
        if (this.Z2 == null) {
            r52 = 0;
        }
        if (this.p3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.q3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p3, r52 != 0 ? 1.0f : 0.0f);
        this.q3 = ofFloat;
        ofFloat.addUpdateListener(new d80(this, 24));
        this.q3.addListener(new i60(this, 23));
        this.q3.setInterpolator(bs.h);
        this.q3.setDuration((this.Z2 == null ? 5 : r6.length) * 120);
        this.q3.start();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof px0) || E.getAlpha() < 0.5f) {
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
        if (this.e3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof px0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int y10 = (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, this.p3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int y11 = (int) com.google.android.gms.internal.play_billing.k3.y(1.0f, this.p3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(y10, 0.0f, y11, getHeight(), this.e3);
                if (y11 < getWidth() && (drawable2 = this.c3) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.c3;
                    drawable3.setBounds(y11, 0, drawable3.getIntrinsicWidth() + y11, getHeight());
                    this.c3.draw(canvas2);
                }
                d = this.s3.d(this.n3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.n3;
                f6 f6Var = this.t3;
                float d10 = i13 < 0 ? f6Var.d(i13, false) : f6Var.c;
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
                    Paint paint = this.f3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.u3;
                        F1(rectF, view);
                        RectF rectF2 = this.v3;
                        F1(rectF2, view2);
                        RectF rectF3 = this.w3;
                        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.c3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.b3.d((canScrollHorizontally(-1) && this.l3) ? 1.0f : 0.0f, false) * 255.0f * this.p3));
                    if (this.c3.getAlpha() > 0) {
                        Drawable drawable4 = this.c3;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.c3.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        d = this.s3.d(this.n3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.n3;
        f6 f6Var2 = this.t3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.c3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.n3;
    }

    public qx0 getSelectedCategory() {
        int i10;
        qx0[] qx0VarArr = this.Z2;
        if (qx0VarArr == null || (i10 = this.n3) < 0 || i10 >= qx0VarArr.length) {
            return null;
        }
        return qx0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof px0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.h3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.k3;
        if (z12 != z11) {
            this.k3 = z11;
            Utilities.Callback callback2 = this.i3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.g3 - this.h3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.i3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.g3 - this.h3))));
        }
        if (this.l3 != z10) {
            this.l3 = z10;
            Utilities.Callback callback3 = this.j3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M1(this.r3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.jc jcVar = this.m3;
        if (jcVar != null) {
            jcVar.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.e3 == null) {
            this.e3 = new Paint(1);
        }
        this.e3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.c3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.d3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.h3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<qx0> callback) {
        this.o3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.j3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.i3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.Y2 = f7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.f3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.n2));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public qx0[] H1(qx0[] qx0VarArr) {
        return qx0VarArr;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
