package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.c31;
import org.telegram.ui.e90;
import org.telegram.ui.ez;
import org.telegram.ui.h9;
import org.telegram.ui.qr;
import org.telegram.ui.um;
import org.telegram.ui.xd0;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h5 extends qt0 {
    public final /* synthetic */ int g0;
    public Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(int i3, Context context, Object obj) {
        super(context, null);
        this.g0 = i3;
        this.h0 = obj;
    }

    @Override // org.telegram.ui.Components.qt0
    public boolean O() {
        switch (this.g0) {
            case 3:
                return false;
            case 6:
                return false;
            default:
                return super.O();
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public boolean P() {
        switch (this.g0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        switch (this.g0) {
            case 5:
                if (view instanceof ey) {
                    ViewGroup.LayoutParams layoutParams = ((ey) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                break;
            default:
                super.addView(view);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        pi.q qVar;
        switch (this.g0) {
            case 10:
                c31 c31Var = (c31) this.h0;
                c31Var.p0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.d2) c31Var).glassEngine;
                qVar.g();
                if (!c31Var.O) {
                    org.telegram.messenger.g0.O(canvas, this, c31Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6), c31Var.d0, 1.0f);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.g0) {
            case 2:
                if (motionEvent.getY() < ((x90) this.h0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public Drawable getNewDrawable() {
        switch (this.g0) {
            case 2:
                Drawable m10 = ((um) ((x90) this.h0).d0.G).m();
                if (m10 == null) {
                    break;
                }
                break;
            case 6:
                if (!az.H0) {
                    break;
                } else {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ua, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.h0;
                    if (colorDrawable == null || colorDrawable.getColor() != x02) {
                        this.h0 = new ColorDrawable(x02);
                    }
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qt0
    public boolean getNewDrawableMotion() {
        switch (this.g0) {
            case 6:
                return !az.H0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.g0) {
            case 3:
                return ((dy0) this.h0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zy zyVar;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 80;
        int i26 = 5;
        int i27 = -1;
        int i28 = 8;
        int i29 = 1;
        switch (this.g0) {
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                ((h9) this.h0).g0();
                break;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
            case 4:
                super.onLayout(z10, i3, i10, i11, i12);
                ContactsActivity contactsActivity = (ContactsActivity) this.h0;
                contactsActivity.i0();
                org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.n;
                if (f5Var != null) {
                    qr qrVar = contactsActivity.b;
                    f5Var.Y((qrVar == null || qrVar.J) ? false : true, true);
                }
                contactsActivity.j0();
                break;
            case 5:
                int childCount = getChildCount();
                int Q = Q();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i11 - i3) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i30 = i12 - i10;
                int paddingBottom = i30 - getPaddingBottom();
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt = getChildAt(i31);
                    if (childAt.getVisibility() != i28) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i32 = layoutParams.gravity;
                        if (i32 == -1) {
                            i32 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
                        int i33 = i32 & hs.x1;
                        int i34 = absoluteGravity & 7;
                        if (i34 == i29) {
                            i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i34 != 5) {
                            i16 = layoutParams.leftMargin + paddingLeft;
                            if (i33 == 16) {
                                if (i33 == 48) {
                                    i21 = layoutParams.topMargin;
                                } else if (i33 != i25) {
                                    i21 = layoutParams.topMargin;
                                } else {
                                    i17 = paddingBottom - measuredHeight;
                                    i18 = layoutParams.bottomMargin;
                                }
                                i19 = i21 + paddingTop;
                                if (childAt instanceof ey) {
                                    WeakHashMap weakHashMap = r0.i0.a;
                                    r0.k1 a10 = r0.b0.a(this);
                                    if (a10 != null) {
                                        i13 = 8;
                                        i20 = a10.a.f(8).d;
                                    } else {
                                        i13 = 8;
                                        i20 = 0;
                                    }
                                    i19 = (i20 <= 0 || (zyVar = ((ez) this.h0).L) == null || !zyVar.b.y) ? org.telegram.messenger.g0.Q1() ? i30 - measuredHeight : (i30 + Q) - measuredHeight : (i30 - i20) - org.telegram.messenger.g0.L(200.0f);
                                } else {
                                    i13 = 8;
                                }
                                childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                            } else {
                                i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (childAt instanceof ey) {
                            }
                            childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                        } else {
                            i14 = paddingRight - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i33 == 16) {
                        }
                        i19 = i17 - i18;
                        if (childAt instanceof ey) {
                        }
                        childAt.layout(i16, i19, i16 + measuredWidth, i19 + measuredHeight);
                    } else {
                        i13 = i28;
                    }
                    i31++;
                    i28 = i13;
                    i25 = 80;
                    i29 = 1;
                }
                R();
                break;
            case 7:
                e90 e90Var = (e90) this.h0;
                int scrollY = e90Var.K.getScrollY();
                super.onLayout(z10, i3, i10, i11, i12);
                if (scrollY != e90Var.K.getScrollY()) {
                    e90Var.K.setTranslationY(r3.getScrollY() - scrollY);
                    e90Var.K.animate().cancel();
                    e90Var.K.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
                    break;
                }
                break;
            case 9:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.h0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= org.telegram.messenger.g0.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                int i35 = 0;
                while (i35 < childCount2) {
                    View childAt2 = getChildAt(i35);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i36 = layoutParams2.gravity;
                        if (i36 == i27) {
                            i36 = 51;
                        }
                        int i37 = i36 & hs.x1;
                        int i38 = i36 & 7;
                        int i39 = i38 != 1 ? i38 != i26 ? layoutParams2.leftMargin : (i11 - measuredWidth2) - layoutParams2.rightMargin : ((((i11 - i3) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i37 == 16) {
                            i22 = ((((i12 - emojiPadding) - i10) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i23 = layoutParams2.bottomMargin;
                        } else if (i37 != 80) {
                            i24 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.s0(childAt2)) {
                                i24 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i24 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.O1) {
                                i24 = ((popupNotificationActivity.F.getMeasuredHeight() + popupNotificationActivity.F.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i39 = ((popupNotificationActivity.F.getMeasuredWidth() + popupNotificationActivity.F.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i39, i24, measuredWidth2 + i39, measuredHeight2 + i24);
                        } else {
                            i22 = ((i12 - emojiPadding) - i10) - measuredHeight2;
                            i23 = layoutParams2.bottomMargin;
                        }
                        i24 = i22 - i23;
                        if (!popupNotificationActivity.b.s0(childAt2)) {
                        }
                        childAt2.layout(i39, i24, measuredWidth2 + i39, measuredHeight2 + i24);
                    }
                    i35++;
                    i26 = 5;
                    i27 = -1;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.y4 y4Var2;
        switch (this.g0) {
            case 0:
                i6 i6Var = (i6) this.h0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i6Var.E.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.d2) i6Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i6Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.d2) i6Var).actionBar;
                layoutParams2.topMargin = org.telegram.messenger.g0.L(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i6Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.d2) i6Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) i6Var.x.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.d2) i6Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
                super.onMeasure(i3, i10);
                break;
            case 1:
                ((h9) this.h0).h0();
                super.onMeasure(i3, i10);
                break;
            case 2:
            case 5:
            case 6:
            default:
                super.onMeasure(i3, i10);
                break;
            case 3:
                super.onMeasure(i3, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i3), ((dy0) this.h0).d.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.h0;
                y4Var = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                measureChildWithMargins(y4Var, i3, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                y4Var2 = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = y4Var2.getMeasuredHeight();
                super.onMeasure(i3, i10);
                break;
            case 7:
                e90 e90Var = (e90) this.h0;
                super.onMeasure(i3, i10);
                Q();
                int i11 = this.f;
                if (i11 != 0 && i11 < org.telegram.messenger.g0.L(20.0f)) {
                    e90Var.G.clearFocus();
                    e90Var.L.clearFocus();
                }
                e90Var.I.setVisibility(this.f > org.telegram.messenger.g0.L(20.0f) ? 8 : 0);
                break;
            case 8:
                xd0 xd0Var = (xd0) this.h0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) xd0Var.O.getLayoutParams();
                int L = xd0Var.q1() ? org.telegram.messenger.g0.L(226.0f) : 0;
                if (xd0Var.q1() && Q() > org.telegram.messenger.g0.L(20.0f)) {
                    L -= Q();
                }
                ac acVar = ac.w;
                if (acVar == null || !acVar.l) {
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.g0.L(14.0f) + L;
                } else {
                    super.onMeasure(i3, i10);
                    marginLayoutParams2.bottomMargin = org.telegram.messenger.camera.q.D(10.0f, ac.w.e.getMeasuredHeight() + org.telegram.messenger.g0.L(14.0f), L);
                }
                int i12 = org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m;
                ((ViewGroup.MarginLayoutParams) xd0Var.V.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) xd0Var.X.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) xd0Var.W.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                TextView textView = xd0Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + i12;
                }
                if (Q() > org.telegram.messenger.g0.L(20.0f) && xd0Var.c.getVisibility() != 8 && !org.telegram.messenger.g0.C1() && !xd0Var.b0) {
                    ValueAnimator valueAnimator = xd0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xd0Var.c.setVisibility(8);
                }
                super.onMeasure(i3, i10);
                break;
            case 9:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.h0;
                View.MeasureSpec.getMode(i3);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (Q() <= org.telegram.messenger.g0.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i13 = size2;
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.s0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.O1) {
                            measureChildWithMargins(childAt, i3, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f) + i13), TLObject.FLAG_30));
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0, org.telegram.ui.ActionBar.z5
    public void updateColors() {
        switch (this.g0) {
            case 10:
                try {
                    ((c31) this.h0).q0();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
        super(context, q4Var);
        this.g0 = 6;
    }
}
