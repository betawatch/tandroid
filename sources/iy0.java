// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iy0 extends wma {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Object i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(ny0 ny0Var, Context context, boolean z, boolean z2) {
        super(context, null);
        this.g0 = (byte) 0;
        this.i0 = ny0Var;
        this.h0 = z;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.g0) {
            case 0:
                ny0 ny0Var = (ny0) this.i0;
                ny0Var.S0(canvas, this);
                super.dispatchDraw(canvas);
                ny0Var.R0(canvas, this);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.g0) {
            case 0:
                ny0 ny0Var = (ny0) this.i0;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ny0Var.s0.getBounds().top) {
                    ny0Var.dismiss();
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.g0) {
            case 0:
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int measuredHeight2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        iu3 iu3Var;
        int measuredHeight3;
        int measuredHeight4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        iu3 iu3Var2;
        int measuredHeight5;
        int measuredHeight6;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        iu3 iu3Var3;
        int measuredHeight7;
        int measuredHeight8;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        o24 o24Var;
        int measuredHeight9;
        int measuredHeight10;
        byte b = this.g0;
        int i32 = 16;
        int i33 = 5;
        int i34 = -1;
        int i35 = 8;
        Object obj = this.i0;
        int i36 = 0;
        int i37 = 1;
        switch (b) {
            case 0:
                ny0 ny0Var = (ny0) obj;
                if (ny0Var.K1 != null) {
                    int childCount = getChildCount();
                    int Q = Q();
                    int paddingBottom = getPaddingBottom();
                    if (!ny0Var.d && ny0Var.K1 != null && Q <= hl.L(20.0f) && !hl.E && !hl.O1()) {
                        paddingBottom += ny0Var.K1.getEmojiPadding();
                    }
                    setBottomClip(paddingBottom);
                    while (i36 < childCount) {
                        View childAt = getChildAt(i36);
                        if (childAt.getVisibility() != 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth = childAt.getMeasuredWidth();
                            int measuredHeight11 = childAt.getMeasuredHeight();
                            int i38 = layoutParams.gravity;
                            if (i38 == -1) {
                                i38 = 51;
                            }
                            int i39 = i38 & jn7.w1;
                            int i40 = i38 & 7;
                            if (i40 == 1) {
                                i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                                i6 = layoutParams.rightMargin;
                            } else if (i40 != 5) {
                                i7 = getPaddingLeft() + layoutParams.leftMargin;
                                int f = i39 == i32 ? i39 != 48 ? i39 != 80 ? layoutParams.topMargin : qd4.f(i4, paddingBottom, i2, measuredHeight11) - layoutParams.bottomMargin : layoutParams.topMargin + getPaddingTop() : (((((i4 - paddingBottom) - i2) - measuredHeight11) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                                if (childAt instanceof o24) {
                                    if (hl.O1()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + Q;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    f = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i7, f, measuredWidth + i7, measuredHeight11 + f);
                            } else {
                                i5 = (((i3 - i) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                                i6 = ny0Var.u0;
                            }
                            i7 = i5 - i6;
                            if (i39 == i32) {
                            }
                            if (childAt instanceof o24) {
                            }
                            childAt.layout(i7, f, measuredWidth + i7, measuredHeight11 + f);
                        }
                        i36++;
                        i32 = 16;
                    }
                    R();
                    break;
                } else {
                    super.onLayout(z, i, i2, i3, i4);
                    break;
                }
                break;
            case 1:
                gi1 gi1Var = (gi1) obj;
                int childCount2 = getChildCount();
                int Q2 = Q();
                int emojiPadding = (Q2 > hl.L(20.0f) || hl.E || hl.O1()) ? 0 : gi1Var.d.getEmojiPadding();
                setBottomClip(emojiPadding);
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight12 = childAt2.getMeasuredHeight();
                        int i41 = layoutParams2.gravity;
                        if (i41 == -1) {
                            i41 = 51;
                        }
                        int i42 = i41 & jn7.w1;
                        int i43 = i41 & 7;
                        if (i43 == 1) {
                            i8 = (((i3 - i) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                            i9 = layoutParams2.rightMargin;
                        } else if (i43 != 5) {
                            i10 = layoutParams2.leftMargin;
                            if (i42 == 16) {
                                if (i42 == 48) {
                                    i13 = layoutParams2.topMargin + getPaddingTop();
                                } else if (i42 != 80) {
                                    i13 = layoutParams2.topMargin;
                                } else {
                                    i11 = qd4.f(i4, emojiPadding, i2, measuredHeight12);
                                    i12 = layoutParams2.bottomMargin;
                                }
                                iu3Var = gi1Var.d;
                                if (iu3Var != null && iu3Var.l(childAt2)) {
                                    if (hl.O1()) {
                                        measuredHeight3 = getMeasuredHeight() + Q2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    i13 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i10, i13, measuredWidth2 + i10, measuredHeight12 + i13);
                            } else {
                                i11 = ((((i4 - emojiPadding) - i2) - measuredHeight12) / 2) + layoutParams2.topMargin;
                                i12 = layoutParams2.bottomMargin;
                            }
                            i13 = i11 - i12;
                            iu3Var = gi1Var.d;
                            if (iu3Var != null) {
                                if (hl.O1()) {
                                }
                                i13 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i10, i13, measuredWidth2 + i10, measuredHeight12 + i13);
                        } else {
                            i8 = i3 - measuredWidth2;
                            i9 = layoutParams2.rightMargin;
                        }
                        i10 = i8 - i9;
                        if (i42 == 16) {
                        }
                        i13 = i11 - i12;
                        iu3Var = gi1Var.d;
                        if (iu3Var != null) {
                        }
                        childAt2.layout(i10, i13, measuredWidth2 + i10, measuredHeight12 + i13);
                    }
                    i36++;
                }
                R();
                break;
            case 2:
                g92 g92Var = (g92) obj;
                int childCount3 = getChildCount();
                int Q3 = Q();
                int emojiPadding2 = (Q3 > hl.L(20.0f) || hl.E || hl.O1()) ? 0 : g92Var.w.getEmojiPadding();
                setBottomClip(emojiPadding2);
                while (i36 < childCount3) {
                    View childAt3 = getChildAt(i36);
                    if (childAt3.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt3.getLayoutParams();
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight13 = childAt3.getMeasuredHeight();
                        int i44 = layoutParams3.gravity;
                        if (i44 == -1) {
                            i44 = 51;
                        }
                        int i45 = i44 & jn7.w1;
                        int i46 = i44 & 7;
                        if (i46 == 1) {
                            i14 = (((i3 - i) - measuredWidth3) / 2) + layoutParams3.leftMargin;
                            i15 = layoutParams3.rightMargin;
                        } else if (i46 != 5) {
                            i16 = layoutParams3.leftMargin;
                            if (i45 == 16) {
                                if (i45 == 48) {
                                    i19 = layoutParams3.topMargin + getPaddingTop();
                                } else if (i45 != 80) {
                                    i19 = layoutParams3.topMargin;
                                } else {
                                    i17 = qd4.f(i4, emojiPadding2, i2, measuredHeight13);
                                    i18 = layoutParams3.bottomMargin;
                                }
                                iu3Var2 = g92Var.w;
                                if (iu3Var2 != null && iu3Var2.l(childAt3)) {
                                    if (hl.O1()) {
                                        measuredHeight5 = getMeasuredHeight() + Q3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    i19 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i16, i19, measuredWidth3 + i16, measuredHeight13 + i19);
                            } else {
                                i17 = ((((i4 - emojiPadding2) - i2) - measuredHeight13) / 2) + layoutParams3.topMargin;
                                i18 = layoutParams3.bottomMargin;
                            }
                            i19 = i17 - i18;
                            iu3Var2 = g92Var.w;
                            if (iu3Var2 != null) {
                                if (hl.O1()) {
                                }
                                i19 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i16, i19, measuredWidth3 + i16, measuredHeight13 + i19);
                        } else {
                            i14 = i3 - measuredWidth3;
                            i15 = layoutParams3.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i45 == 16) {
                        }
                        i19 = i17 - i18;
                        iu3Var2 = g92Var.w;
                        if (iu3Var2 != null) {
                        }
                        childAt3.layout(i16, i19, measuredWidth3 + i16, measuredHeight13 + i19);
                    }
                    i36++;
                }
                R();
                break;
            case 3:
                xc5 xc5Var = (xc5) obj;
                int childCount4 = getChildCount();
                int Q4 = Q();
                int emojiPadding3 = (Q4 > hl.L(20.0f) || hl.E || hl.O1()) ? 0 : xc5Var.c.getEmojiPadding();
                setBottomClip(emojiPadding3);
                while (i36 < childCount4) {
                    View childAt4 = getChildAt(i36);
                    if (childAt4.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt4.getLayoutParams();
                        int measuredWidth4 = childAt4.getMeasuredWidth();
                        int measuredHeight14 = childAt4.getMeasuredHeight();
                        int i47 = layoutParams4.gravity;
                        if (i47 == -1) {
                            i47 = 51;
                        }
                        int i48 = i47 & jn7.w1;
                        int i49 = i47 & 7;
                        if (i49 == i37) {
                            i20 = (((i3 - i) - measuredWidth4) / 2) + layoutParams4.leftMargin;
                            i21 = layoutParams4.rightMargin;
                        } else if (i49 != 5) {
                            i22 = layoutParams4.leftMargin;
                            if (i48 == 16) {
                                if (i48 == 48) {
                                    i25 = layoutParams4.topMargin + getPaddingTop();
                                } else if (i48 != 80) {
                                    i25 = layoutParams4.topMargin;
                                } else {
                                    i23 = qd4.f(i4, emojiPadding3, i2, measuredHeight14);
                                    i24 = layoutParams4.bottomMargin;
                                }
                                iu3Var3 = xc5Var.c;
                                if (iu3Var3 != null && iu3Var3.l(childAt4)) {
                                    if (hl.O1()) {
                                        measuredHeight7 = getMeasuredHeight() + Q4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    i25 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i22, i25, measuredWidth4 + i22, measuredHeight14 + i25);
                            } else {
                                i23 = ((((i4 - emojiPadding3) - i2) - measuredHeight14) / 2) + layoutParams4.topMargin;
                                i24 = layoutParams4.bottomMargin;
                            }
                            i25 = i23 - i24;
                            iu3Var3 = xc5Var.c;
                            if (iu3Var3 != null) {
                                if (hl.O1()) {
                                }
                                i25 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i22, i25, measuredWidth4 + i22, measuredHeight14 + i25);
                        } else {
                            i20 = i3 - measuredWidth4;
                            i21 = layoutParams4.rightMargin;
                        }
                        i22 = i20 - i21;
                        if (i48 == 16) {
                        }
                        i25 = i23 - i24;
                        iu3Var3 = xc5Var.c;
                        if (iu3Var3 != null) {
                        }
                        childAt4.layout(i22, i25, measuredWidth4 + i22, measuredHeight14 + i25);
                    }
                    i36++;
                    i37 = 1;
                }
                R();
                break;
            default:
                wh8 wh8Var = (wh8) obj;
                int childCount5 = getChildCount();
                int Q5 = Q();
                int i50 = (Q5 > hl.L(20.0f) || hl.E || hl.O1()) ? 0 : wh8Var.W;
                setBottomClip(i50);
                while (i36 < childCount5) {
                    View childAt5 = getChildAt(i36);
                    if (childAt5.getVisibility() != i35) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) childAt5.getLayoutParams();
                        int measuredWidth5 = childAt5.getMeasuredWidth();
                        int measuredHeight15 = childAt5.getMeasuredHeight();
                        int i51 = layoutParams5.gravity;
                        if (i51 == i34) {
                            i51 = 51;
                        }
                        int i52 = i51 & jn7.w1;
                        int i53 = i51 & 7;
                        if (i53 == 1) {
                            i26 = (((i3 - i) - measuredWidth5) / 2) + layoutParams5.leftMargin;
                            i27 = layoutParams5.rightMargin;
                        } else if (i53 != i33) {
                            i28 = layoutParams5.leftMargin;
                            if (i52 == 16) {
                                if (i52 == 48) {
                                    i31 = layoutParams5.topMargin + getPaddingTop();
                                } else if (i52 != 80) {
                                    i31 = layoutParams5.topMargin;
                                } else {
                                    i29 = qd4.f(i4, i50, i2, measuredHeight15);
                                    i30 = layoutParams5.bottomMargin;
                                }
                                o24Var = wh8Var.S;
                                if (o24Var != null && o24Var == childAt5) {
                                    if (hl.O1()) {
                                        measuredHeight9 = getMeasuredHeight() + Q5;
                                        measuredHeight10 = childAt5.getMeasuredHeight();
                                    } else {
                                        measuredHeight9 = getMeasuredHeight();
                                        measuredHeight10 = childAt5.getMeasuredHeight();
                                    }
                                    i31 = measuredHeight9 - measuredHeight10;
                                }
                                childAt5.layout(i28, i31, i28 + measuredWidth5, measuredHeight15 + i31);
                            } else {
                                i29 = ((((i4 - i50) - i2) - measuredHeight15) / 2) + layoutParams5.topMargin;
                                i30 = layoutParams5.bottomMargin;
                            }
                            i31 = i29 - i30;
                            o24Var = wh8Var.S;
                            if (o24Var != null) {
                                if (hl.O1()) {
                                }
                                i31 = measuredHeight9 - measuredHeight10;
                            }
                            childAt5.layout(i28, i31, i28 + measuredWidth5, measuredHeight15 + i31);
                        } else {
                            i26 = i3 - measuredWidth5;
                            i27 = layoutParams5.rightMargin;
                        }
                        i28 = i26 - i27;
                        if (i52 == 16) {
                        }
                        i31 = i29 - i30;
                        o24Var = wh8Var.S;
                        if (o24Var != null) {
                        }
                        childAt5.layout(i28, i31, i28 + measuredWidth5, measuredHeight15 + i31);
                    }
                    i36++;
                    i33 = 5;
                    i34 = -1;
                    i35 = 8;
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        lt3 lt3Var;
        a aVar;
        a aVar2;
        jla jlaVar;
        jla jlaVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        byte b = this.g0;
        Object obj = this.i0;
        int i3 = 0;
        switch (b) {
            case 0:
                ny0 ny0Var = (ny0) obj;
                ny0Var.q1 = View.MeasureSpec.getSize(i2);
                ny0Var.O0(i, i2);
                int makeMeasureSpec = this.h0 ? View.MeasureSpec.makeMeasureSpec(ny0Var.q1, TLObject.FLAG_30) : i2;
                if (ny0Var.K1 == null) {
                    super.onMeasure(i, makeMeasureSpec);
                    break;
                } else {
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(makeMeasureSpec);
                    setMeasuredDimension(size, size2);
                    lt3 lt3Var2 = ny0Var.K1;
                    if (lt3Var2 != null && !lt3Var2.O && hl.L(20.0f) >= 0) {
                        lt3 lt3Var3 = ny0Var.K1;
                        if (!lt3Var3.e && !lt3Var3.P) {
                            lt3Var3.j();
                        }
                    }
                    if (hl.L(20.0f) >= 0) {
                        int emojiPadding = (ny0Var.d || (lt3Var = ny0Var.K1) == null) ? 0 : lt3Var.getEmojiPadding();
                        if (!hl.E) {
                            size2 -= emojiPadding;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
                        }
                    }
                    int i4 = makeMeasureSpec;
                    int i5 = size2;
                    int childCount = getChildCount();
                    while (i3 < childCount) {
                        View childAt = getChildAt(i3);
                        if (childAt != null && childAt.getVisibility() != 8) {
                            lt3 lt3Var4 = ny0Var.K1;
                            if (lt3Var4 == null || !lt3Var4.l(childAt)) {
                                measureChildWithMargins(childAt, i, 0, i4, 0);
                            } else if (!hl.E && !hl.O1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (i5 - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i5 - hl.m), TLObject.FLAG_30));
                            }
                        }
                        i3++;
                    }
                    break;
                }
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                int paddingTop = size4 - getPaddingTop();
                gi1 gi1Var = (gi1) obj;
                aVar = ((e) gi1Var).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    this.h0 = true;
                    gi1Var.d.j();
                    this.h0 = false;
                }
                int childCount2 = getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = getChildAt(i3);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        aVar2 = ((e) gi1Var).actionBar;
                        if (childAt2 != aVar2) {
                            iu3 iu3Var = gi1Var.d;
                            if (iu3Var == null || !iu3Var.l(childAt2)) {
                                measureChildWithMargins(childAt2, i, 0, i2, 0);
                            } else if (!hl.E && !hl.O1()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - hl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                    i3++;
                }
                break;
            case 2:
                int size5 = View.MeasureSpec.getSize(i);
                int size6 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size5, size6);
                int paddingTop2 = size6 - getPaddingTop();
                g92 g92Var = (g92) obj;
                jlaVar = ((e) g92Var).simpleActionBar;
                measureChildWithMargins(jlaVar, i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    this.h0 = true;
                    g92Var.w.j();
                    this.h0 = false;
                }
                int childCount3 = getChildCount();
                while (i3 < childCount3) {
                    View childAt3 = getChildAt(i3);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        jlaVar2 = ((e) g92Var).simpleActionBar;
                        if (childAt3 != jlaVar2) {
                            iu3 iu3Var2 = g92Var.w;
                            if (iu3Var2 == null || !iu3Var2.l(childAt3)) {
                                measureChildWithMargins(childAt3, i, 0, i2, 0);
                            } else if (!hl.E && !hl.O1()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop2 - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - hl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                    i3++;
                }
                break;
            case 3:
                int size7 = View.MeasureSpec.getSize(i);
                int size8 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size7, size8);
                int paddingTop3 = size8 - getPaddingTop();
                xc5 xc5Var = (xc5) obj;
                aVar3 = ((e) xc5Var).actionBar;
                measureChildWithMargins(aVar3, i, 0, i2, 0);
                if (Q() > hl.L(20.0f)) {
                    iu3 iu3Var3 = xc5Var.c;
                    if (!iu3Var3.e) {
                        this.h0 = true;
                        iu3Var3.j();
                        this.h0 = false;
                    }
                }
                int childCount4 = getChildCount();
                while (i3 < childCount4) {
                    View childAt4 = getChildAt(i3);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        aVar4 = ((e) xc5Var).actionBar;
                        if (childAt4 != aVar4) {
                            iu3 iu3Var4 = xc5Var.c;
                            if (iu3Var4 == null || !iu3Var4.l(childAt4)) {
                                measureChildWithMargins(childAt4, i, 0, i2, 0);
                            } else if (!hl.E && !hl.O1()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop3 - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - hl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                    i3++;
                }
                break;
            default:
                int size9 = View.MeasureSpec.getSize(i);
                int size10 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size9, size10);
                int paddingTop4 = size10 - getPaddingTop();
                wh8 wh8Var = (wh8) obj;
                aVar5 = ((e) wh8Var).actionBar;
                int i6 = i;
                measureChildWithMargins(aVar5, i6, 0, i2, 0);
                int Q = Q();
                if (Q > hl.L(20.0f) && !wh8Var.Q && !wh8Var.C0) {
                    this.h0 = true;
                    wh8Var.m0();
                    this.h0 = false;
                }
                int i7 = (Q > hl.L(20.0f) || hl.E || hl.O1()) ? 0 : wh8Var.W;
                if (Q > hl.L(20.0f) && wh8Var.C0) {
                    i7 = hl.L(120.0f);
                }
                int i8 = i7;
                int childCount5 = getChildCount();
                while (i3 < childCount5) {
                    View childAt5 = getChildAt(i3);
                    if (childAt5 != null && childAt5.getVisibility() != 8) {
                        aVar6 = ((e) wh8Var).actionBar;
                        if (childAt5 != aVar6) {
                            o24 o24Var = wh8Var.S;
                            if (o24Var == null || o24Var != childAt5) {
                                if (wh8Var.c == childAt5) {
                                    childAt5.measure(i6, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i8, TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt5, i6, 0, i2, 0);
                                }
                            } else if (!hl.E && !hl.O1()) {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt5.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (hl.O1()) {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop4 - hl.m)), TLObject.FLAG_30));
                            } else {
                                childAt5.measure(View.MeasureSpec.makeMeasureSpec(size9, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - hl.m), TLObject.FLAG_30));
                            }
                        }
                    }
                    i3++;
                    i6 = i;
                }
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.g0) {
            case 1:
                if (!this.h0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.h0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.h0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
                if (!this.h0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy0(e eVar, Context context, byte b) {
        super(context, null);
        this.g0 = b;
        this.i0 = eVar;
    }
}
