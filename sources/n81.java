// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n81 extends cja {
    public final /* synthetic */ byte m0;
    public Object n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n81(byte b, Context context, Object obj) {
        super(context, null);
        this.m0 = b;
        this.n0 = obj;
    }

    @Override // cja
    public final boolean O() {
        switch (this.m0) {
            case 3:
            case 9:
                return false;
            default:
                return super.O();
        }
    }

    @Override // cja
    public final boolean P() {
        switch (this.m0) {
            case 9:
                return false;
            default:
                return super.P();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        switch (this.m0) {
            case 2:
                if (view instanceof t14) {
                    ViewGroup.LayoutParams layoutParams = ((t14) view).getLayoutParams();
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

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qw4 qw4Var;
        switch (this.m0) {
            case 8:
                d8a d8aVar = (d8a) this.n0;
                d8aVar.o0();
                super.dispatchDraw(canvas);
                qw4Var = ((d) d8aVar).glassEngine;
                qw4Var.g();
                if (!d8aVar.O) {
                    gl.O(canvas, this, d8aVar.getThemedColor(bkb.c6), d8aVar.d0, 1.0f);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.m0) {
            case 6:
                if (motionEvent.getY() < ((f37) this.n0).U) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // cja
    public final Drawable getNewDrawable() {
        switch (this.m0) {
            case 3:
                if (!gba.D0) {
                    break;
                } else {
                    int w0 = bkb.w0(null, bkb.ta, false);
                    ColorDrawable colorDrawable = (ColorDrawable) this.n0;
                    if (colorDrawable == null || colorDrawable.getColor() != w0) {
                        this.n0 = new ColorDrawable(w0);
                    }
                    break;
                }
            case 6:
                Drawable l = ((ku1) ((f37) this.n0).d0.G).l();
                if (l == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // cja
    public final boolean getNewDrawableMotion() {
        switch (this.m0) {
            case 3:
                return !gba.D0 && super.getNewDrawableMotion();
            default:
                return super.getNewDrawableMotion();
        }
    }

    @Override // cja
    public final wjb getResourceProvider() {
        switch (this.m0) {
            case 9:
                return ((wfb) this.n0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        kd4 kd4Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 16;
        int i14 = 5;
        int i15 = -1;
        int i16 = 8;
        int i17 = 1;
        switch (this.m0) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                ((z81) this.n0).a0();
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
                contactsActivity.c0();
                xha xhaVar = contactsActivity.n;
                if (xhaVar != null) {
                    ot2 ot2Var = contactsActivity.b;
                    xhaVar.Y((ot2Var == null || ot2Var.J) ? false : true, true);
                }
                contactsActivity.d0();
                break;
            case 2:
                int childCount = getChildCount();
                int Q = Q();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i3 - i) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i18 = i4 - i2;
                int paddingBottom = i18 - getPaddingBottom();
                int i19 = 0;
                while (i19 < childCount) {
                    View childAt = getChildAt(i19);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i20 = layoutParams.gravity;
                        if (i20 == -1) {
                            i20 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection());
                        int i21 = i20 & kk7.w1;
                        int i22 = absoluteGravity & 7;
                        if (i22 == i17) {
                            i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i6 = layoutParams.rightMargin;
                        } else if (i22 != 5) {
                            i7 = layoutParams.leftMargin + paddingLeft;
                            if (i21 == i13) {
                                if (i21 == 48) {
                                    i9 = layoutParams.topMargin;
                                } else if (i21 != 80) {
                                    i9 = layoutParams.topMargin;
                                } else {
                                    i8 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                                }
                                i8 = i9 + paddingTop;
                            } else {
                                i8 = (((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                            }
                            if (childAt instanceof t14) {
                                WeakHashMap weakHashMap = jdc.a;
                                vxc a = cdc.a(this);
                                int i23 = a != null ? a.a.f(8).d : 0;
                                i8 = (i23 <= 0 || (kd4Var = ((pd4) this.n0).L) == null || !kd4Var.b.y) ? gl.O1() ? i18 - measuredHeight : (i18 + Q) - measuredHeight : (i18 - i23) - gl.L(200.0f);
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
                        } else {
                            i5 = paddingRight - measuredWidth;
                            i6 = layoutParams.rightMargin;
                        }
                        i7 = i5 - i6;
                        if (i21 == i13) {
                        }
                        if (childAt instanceof t14) {
                        }
                        childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
                    }
                    i19++;
                    i13 = 16;
                    i17 = 1;
                }
                R();
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
            case 4:
                s36 s36Var = (s36) this.n0;
                int scrollY = s36Var.K.getScrollY();
                super.onLayout(z, i, i2, i3, i4);
                if (scrollY != s36Var.K.getScrollY()) {
                    s36Var.K.setTranslationY(r0.getScrollY() - scrollY);
                    s36Var.K.animate().cancel();
                    s36Var.K.animate().translationY(0.0f).setDuration(250L).setInterpolator(gb.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.n0;
                int childCount2 = getChildCount();
                int emojiPadding = Q() <= gl.L(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                int i24 = 0;
                while (i24 < childCount2) {
                    View childAt2 = getChildAt(i24);
                    if (childAt2.getVisibility() != i16) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i25 = layoutParams2.gravity;
                        if (i25 == i15) {
                            i25 = 51;
                        }
                        int i26 = i25 & kk7.w1;
                        int i27 = i25 & 7;
                        int i28 = i27 != 1 ? i27 != i14 ? layoutParams2.leftMargin : (i3 - measuredWidth2) - layoutParams2.rightMargin : ((((i3 - i) - measuredWidth2) / 2) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                        if (i26 == 16) {
                            i10 = ((((i4 - emojiPadding) - i2) - measuredHeight2) / 2) + layoutParams2.topMargin;
                            i11 = layoutParams2.bottomMargin;
                        } else if (i26 != 80) {
                            i12 = layoutParams2.topMargin;
                            if (!popupNotificationActivity.b.R0(childAt2)) {
                                i12 = getMeasuredHeight();
                                if (emojiPadding != 0) {
                                    i12 -= emojiPadding;
                                }
                            } else if (childAt2 == popupNotificationActivity.b.D2) {
                                i12 = ((popupNotificationActivity.F.getMeasuredHeight() + popupNotificationActivity.F.getTop()) - childAt2.getMeasuredHeight()) - layoutParams2.bottomMargin;
                                i28 = ((popupNotificationActivity.F.getMeasuredWidth() + popupNotificationActivity.F.getLeft()) - childAt2.getMeasuredWidth()) - layoutParams2.rightMargin;
                            }
                            childAt2.layout(i28, i12, i28 + measuredWidth2, measuredHeight2 + i12);
                        } else {
                            i10 = tb4.f(i4, emojiPadding, i2, measuredHeight2);
                            i11 = layoutParams2.bottomMargin;
                        }
                        i12 = i10 - i11;
                        if (!popupNotificationActivity.b.R0(childAt2)) {
                        }
                        childAt2.layout(i28, i12, i28 + measuredWidth2, measuredHeight2 + i12);
                    }
                    i24++;
                    i14 = 5;
                    i15 = -1;
                    i16 = 8;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        pha phaVar;
        pha phaVar2;
        switch (this.m0) {
            case 0:
                ((z81) this.n0).b0();
                super.onMeasure(i, i2);
                break;
            case 1:
                ContactsActivity contactsActivity = (ContactsActivity) this.n0;
                phaVar = ((d) contactsActivity).simpleActionBar;
                measureChildWithMargins(phaVar, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                phaVar2 = ((d) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = phaVar2.getMeasuredHeight();
                super.onMeasure(i, i2);
                break;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.onMeasure(i, i2);
                break;
            case 4:
                s36 s36Var = (s36) this.n0;
                super.onMeasure(i, i2);
                Q();
                int i3 = this.f;
                if (i3 != 0 && i3 < gl.L(20.0f)) {
                    s36Var.G.clearFocus();
                    s36Var.L.clearFocus();
                }
                s36Var.I.setVisibility(this.f <= gl.L(20.0f) ? 0 : 8);
                break;
            case 5:
                mf6 mf6Var = (mf6) this.n0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) mf6Var.O.getLayoutParams();
                int L = mf6Var.r1() ? gl.L(226.0f) : 0;
                if (mf6Var.r1() && Q() > gl.L(20.0f)) {
                    L -= Q();
                }
                m21 m21Var = m21.w;
                if (m21Var == null || !m21Var.l) {
                    marginLayoutParams2.bottomMargin = gl.L(14.0f) + L;
                } else {
                    super.onMeasure(i, i2);
                    marginLayoutParams2.bottomMargin = b00.z(10.0f, m21.w.e.getMeasuredHeight() + gl.L(14.0f), L);
                }
                int i4 = gl.O1() ? 0 : gl.m;
                ((ViewGroup.MarginLayoutParams) mf6Var.V.getLayoutParams()).topMargin = gl.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) mf6Var.X.getLayoutParams()).topMargin = gl.L(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) mf6Var.W.getLayoutParams()).topMargin = gl.L(16.0f) + i4;
                TextView textView = mf6Var.g0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = gl.L(16.0f) + i4;
                }
                if (mf6Var.n0.getMinimumHeight() != i4) {
                    mf6Var.n0.setMinimumHeight(i4);
                }
                if (Q() > gl.L(20.0f) && mf6Var.c.getVisibility() != 8 && !gl.A1() && !mf6Var.b0) {
                    ValueAnimator valueAnimator = mf6Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    mf6Var.c.setVisibility(8);
                }
                super.onMeasure(i, i2);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.n0;
                View.MeasureSpec.getMode(i);
                View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                if (Q() <= gl.L(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i5 = size2;
                int childCount = getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.R0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.D2) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(gl.L(10.0f), gl.L(2.0f) + i5), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 9:
                super.onMeasure(i, i2);
                setMeasuredDimension(View.MeasureSpec.getSize(i), ((wfb) this.n0).d.getMeasuredHeight() + gl.L(24.0f));
                break;
        }
    }

    @Override // cja, tjb
    public final void updateColors() {
        switch (this.m0) {
            case 8:
                try {
                    ((d8a) this.n0).p0();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n81(Context context, ui5 ui5Var) {
        super(context, ui5Var);
        this.m0 = (byte) 3;
    }
}
