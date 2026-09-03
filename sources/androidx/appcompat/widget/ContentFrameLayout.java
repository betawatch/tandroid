package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.q;
import l.k;
import m.h;
import m.j1;
import m.k1;
import m.o3;
import org.telegram.tgnet.TLObject;
import r0.m0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect h;
    public j1 n;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.a == null) {
            this.a = new TypedValue();
        }
        return this.a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j1 j1Var = this.n;
        if (j1Var != null) {
            j1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h hVar;
        super.onDetachedFromWindow();
        j1 j1Var = this.n;
        if (j1Var != null) {
            q qVar = (q) ((ja.c) j1Var).b;
            k1 k1Var = qVar.s;
            if (k1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                actionBarOverlayLayout.f();
                ActionMenuView actionMenuView = ((o3) actionBarOverlayLayout.e).a.a;
                if (actionMenuView != null && (hVar = actionMenuView.G) != null) {
                    hVar.f();
                    m.d dVar = hVar.G;
                    if (dVar != null && dVar.b()) {
                        dVar.i.dismiss();
                    }
                }
            }
            if (qVar.B != null) {
                qVar.f.getDecorView().removeCallbacks(qVar.C);
                if (qVar.B.isShowing()) {
                    try {
                        qVar.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                qVar.B = null;
            }
            m0 m0Var = qVar.D;
            if (m0Var != null) {
                m0Var.b();
            }
            k kVar = qVar.p(0).h;
            if (kVar != null) {
                kVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z4;
        int i13;
        int measuredWidth;
        TypedValue typedValue;
        int i14;
        int i15;
        float fraction;
        int i16;
        int i17;
        float fraction2;
        int i18;
        int i19;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z10 = true;
        boolean z11 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.h;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z11 ? this.d : this.c;
            if (typedValue2 != null && (i18 = typedValue2.type) != 0) {
                if (i18 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i18 == 6) {
                    int i20 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i20, i20);
                } else {
                    i19 = 0;
                    if (i19 > 0) {
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30);
                        z4 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z11 ? this.e : this.f;
                            if (typedValue3 != null && (i16 = typedValue3.type) != 0) {
                                if (i16 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i16 == 6) {
                                    int i21 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i21, i21);
                                } else {
                                    i17 = 0;
                                    if (i17 > 0) {
                                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), TLObject.FLAG_30);
                                        super.onMeasure(i12, i13);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                                        if (!z4 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z11 ? this.b : this.a;
                                            if (typedValue != null && (i14 = typedValue.type) != 0) {
                                                if (i14 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i14 == 6) {
                                                    int i22 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i22, i22);
                                                } else {
                                                    i15 = 0;
                                                    if (i15 > 0) {
                                                        i15 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i15) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30);
                                                        if (z10) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i13);
                                                        return;
                                                    }
                                                }
                                                i15 = (int) fraction;
                                                if (i15 > 0) {
                                                }
                                                if (measuredWidth < i15) {
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                        }
                                    }
                                }
                                i17 = (int) fraction2;
                                if (i17 > 0) {
                                }
                            }
                        }
                        i13 = i11;
                        super.onMeasure(i12, i13);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                        if (!z4) {
                            if (!z11) {
                            }
                            if (typedValue != null) {
                                if (i14 != 5) {
                                }
                                i15 = (int) fraction;
                                if (i15 > 0) {
                                }
                                if (measuredWidth < i15) {
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                }
                i19 = (int) fraction3;
                if (i19 > 0) {
                }
            }
        }
        i12 = i10;
        z4 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i13 = i11;
        super.onMeasure(i12, i13);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
        if (!z4) {
        }
        z10 = false;
        if (z10) {
        }
    }

    public void setAttachListener(j1 j1Var) {
        this.n = j1Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.h = new Rect();
    }
}
