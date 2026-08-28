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
import m.e;
import m.i;
import m.j1;
import m.k1;
import m.p3;
import org.telegram.tgnet.TLObject;
import r0.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        i iVar;
        super.onDetachedFromWindow();
        j1 j1Var = this.n;
        if (j1Var != null) {
            q qVar = (q) ((k5.i) j1Var).b;
            k1 k1Var = qVar.s;
            if (k1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                actionBarOverlayLayout.f();
                ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.e).a.a;
                if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
                    iVar.f();
                    e eVar = iVar.F;
                    if (eVar != null && eVar.b()) {
                        eVar.i.dismiss();
                    }
                }
            }
            if (qVar.A != null) {
                qVar.f.getDecorView().removeCallbacks(qVar.B);
                if (qVar.A.isShowing()) {
                    try {
                        qVar.A.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                qVar.A = null;
            }
            m0 m0Var = qVar.C;
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z10;
        int i12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.h;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.d : this.c;
            if (typedValue2 != null && (i17 = typedValue2.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i9)), TLObject.FLAG_30);
                        z10 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z12 ? this.e : this.f;
                            if (typedValue3 != null && (i15 = typedValue3.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i20 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i20, i20);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30);
                                        super.onMeasure(i11, i12);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                                        if (!z10 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z12 ? this.b : this.a;
                                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                                if (i13 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i13 == 6) {
                                                    int i21 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i21, i21);
                                                } else {
                                                    i14 = 0;
                                                    if (i14 > 0) {
                                                        i14 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i14) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30);
                                                        if (z11) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i12);
                                                        return;
                                                    }
                                                }
                                                i14 = (int) fraction;
                                                if (i14 > 0) {
                                                }
                                                if (measuredWidth < i14) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        i12 = i10;
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
                        if (!z10) {
                            if (!z12) {
                            }
                            if (typedValue != null) {
                                if (i13 != 5) {
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        i11 = i9;
        z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i12 = i10;
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30);
        if (!z10) {
        }
        z11 = false;
        if (z11) {
        }
    }

    public void setAttachListener(j1 j1Var) {
        this.n = j1Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.h = new Rect();
    }
}
