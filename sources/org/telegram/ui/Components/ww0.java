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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class ww0 extends ll0 {
    public static final uw0 x3 = new uw0();
    public static final vw0 y3 = new vw0();
    public float X2;
    public sw0[] Y2;
    public final nw0 Z2;
    public final c6 a3;
    public Drawable b3;
    public Drawable c3;
    public Paint d3;
    public final Paint e3;
    public int f3;
    public int g3;
    public Utilities.Callback h3;
    public Utilities.Callback i3;
    public boolean j3;
    public boolean k3;
    public ci.eb l3;
    public int m3;
    public Utilities.Callback n3;
    public float o3;
    public ValueAnimator p3;
    public boolean q3;
    public final c6 r3;
    public final c6 s3;
    public final RectF t3;
    public final RectF u3;
    public final RectF v3;
    public boolean w3;

    static {
        new HashSet();
    }

    public ww0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.a3 = new c6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.e3 = paint;
        this.m3 = -1;
        this.o3 = 0.0f;
        this.q3 = true;
        this.r3 = new c6(this, 350L, qrVar);
        this.s3 = new c6(this, 350L, qrVar);
        this.t3 = new RectF();
        this.u3 = new RectF();
        this.v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        nw0 nw0Var = new nw0(this);
        this.Z2 = nw0Var;
        setAdapter(nw0Var);
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
        x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (!(childAt instanceof rw0)) {
            return -childAt.getLeft();
        }
        return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f3 + (-childAt.getLeft());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoriesShownT(float f7) {
        this.o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof rw0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((rw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(ww0 ww0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        ww0Var.Y2 = new sw0[tL_messages_emojiGroups.groups.size()];
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            sw0[] sw0VarArr = ww0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            sw0 sw0Var = new sw0();
            sw0Var.c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                sw0Var.a = "premium";
            } else {
                sw0Var.a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            sw0Var.b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            sw0Var.d = emojiGroup.title;
            sw0VarArr[i10] = sw0Var;
        }
        ww0Var.Y2 = ww0Var.B1(ww0Var.Y2);
        ww0Var.Z2.l();
        ww0Var.setCategoriesShownT(0.0f);
        ww0Var.G1(ww0Var.q3, System.currentTimeMillis() - j3 > 16);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof rw0) {
            rw0 rw0Var = (rw0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, rw0Var.E, 0.15f, 0.85f) * rw0Var.y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.m3) + ((-getScrollToStartWidth()) - Math.max(0, this.g3));
        scrollBy(dp, 0);
        post(new id((ci.k2) this, dp, 10));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void E1(int i10) {
        if (this.m3 < 0 && i10 >= 0) {
            this.s3.d(i10, true);
        }
        this.m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof rw0) {
                ((rw0) childAt).l(this.m3 == RecyclerView.R(childAt) - 1, true);
            }
        }
        invalidate();
    }

    public final void F1(sw0 sw0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                sw0[] sw0VarArr = this.Y2;
                if (i10 >= sw0VarArr.length) {
                    break;
                } else if (sw0VarArr[i10] == sw0Var) {
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
        this.q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p3 = null;
        }
        if (!z11) {
            setCategoriesShownT(r52 != 0 ? 1.0f : 0.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.o3, r52 != 0 ? 1.0f : 0.0f);
        this.p3 = ofFloat;
        ofFloat.addUpdateListener(new h70(this, 23));
        this.p3.addListener(new jd0(this, 16));
        this.p3.setInterpolator(qr.h);
        this.p3.setDuration((this.Y2 == null ? 5 : r6.length) * 120);
        this.p3.start();
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof rw0) || E.getAlpha() < 0.5f) {
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
        if (this.d3 != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = TLObject.FLAG_31;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof rw0) {
                    i10 = Math.min(i10, childAt.getLeft());
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
            if (i10 < i11) {
                int z10 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.o3, AndroidUtilities.dp(32.0f) + getWidth(), i10);
                int z11 = (int) com.google.android.gms.internal.vision.e2.z(1.0f, this.o3, AndroidUtilities.dp(32.0f) + getWidth(), i11);
                canvas2 = canvas;
                canvas2.drawRect(z10, 0.0f, z11, getHeight(), this.d3);
                if (z11 < getWidth() && (drawable2 = this.b3) != null) {
                    drawable2.setAlpha(255);
                    Drawable drawable3 = this.b3;
                    drawable3.setBounds(z11, 0, drawable3.getIntrinsicWidth() + z11, getHeight());
                    this.b3.draw(canvas2);
                }
                d = this.r3.d(this.m3 < 0 ? 1.0f : 0.0f, false);
                int i13 = this.m3;
                c6 c6Var = this.s3;
                float d10 = i13 < 0 ? c6Var.d(i13, false) : c6Var.c;
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
                    Paint paint = this.e3;
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * d));
                    if (view != null && view2 != null) {
                        float f10 = max == max2 ? 0.5f : (f7 - max) / (max2 - max);
                        RectF rectF = this.t3;
                        z1(rectF, view);
                        RectF rectF2 = this.u3;
                        z1(rectF2, view2);
                        RectF rectF3 = this.v3;
                        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                    }
                    paint.setAlpha(alpha);
                }
                super.draw(canvas2);
                drawable = this.b3;
                if (drawable == null) {
                    drawable.setAlpha((int) (this.a3.d((canScrollHorizontally(-1) && this.k3) ? 1.0f : 0.0f, false) * 255.0f * this.o3));
                    if (this.b3.getAlpha() > 0) {
                        Drawable drawable4 = this.b3;
                        drawable4.setBounds(0, 0, drawable4.getIntrinsicWidth(), getHeight());
                        this.b3.draw(canvas2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        d = this.r3.d(this.m3 < 0 ? 1.0f : 0.0f, false);
        int i132 = this.m3;
        c6 c6Var2 = this.s3;
        if (i132 < 0) {
        }
        if (d > 0.0f) {
        }
        super.draw(canvas2);
        drawable = this.b3;
        if (drawable == null) {
        }
    }

    public int getCategoryIndex() {
        return this.m3;
    }

    public sw0 getSelectedCategory() {
        int i10;
        sw0[] sw0VarArr = this.Y2;
        if (sw0VarArr == null || (i10 = this.m3) < 0 || i10 >= sw0VarArr.length) {
            return null;
        }
        return sw0VarArr[i10];
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof rw0) {
                z10 = true;
            } else {
                z11 = childAt.getRight() <= this.g3;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.j3;
        if (z12 != z11) {
            this.j3 = z11;
            Utilities.Callback callback2 = this.h3;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(z11 ? Math.max(0, getScrollToStartWidth() - (this.f3 - this.g3)) : 0));
            }
            invalidate();
        } else if (z12 && (callback = this.h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f3 - this.g3))));
        }
        if (this.k3 != z10) {
            this.k3 = z10;
            Utilities.Callback callback3 = this.i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.q3, false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.d3 == null) {
            this.d3 = new Paint(1);
        }
        this.d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<sw0> callback) {
        this.n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public sw0[] B1(sw0[] sw0VarArr) {
        return sw0VarArr;
    }
}
