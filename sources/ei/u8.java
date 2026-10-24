package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class u8 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final org.telegram.ui.Components.f6 b;
    public float c;
    public final Path d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(hi.k0 k0Var, Context context) {
        super(context);
        this.e = k0Var;
        this.b = new org.telegram.ui.Components.f6(this, 250L, bs.h);
        this.d = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3 A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        boolean z10;
        float paddingTop;
        float y3;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                r9 r9Var = (r9) this.e;
                View[] viewPages = r9Var.b.getViewPages();
                float f7 = 0.0f;
                this.c = 0.0f;
                int i14 = 0;
                while (i14 < viewPages.length) {
                    View view = viewPages[i14];
                    if (view != null) {
                        k9 k9Var = (k9) view;
                        float clamp = Utilities.clamp(1.0f - Math.abs(k9Var.getTranslationX() / k9Var.getMeasuredWidth()), 1.0f, f7);
                        float f10 = this.c;
                        mm0 mm0Var = k9Var.f;
                        FrameLayout frameLayout = k9Var.e;
                        s4.b0 b0Var = k9Var.h;
                        float f11 = (b0Var.t || k9Var.a == 0) ? AndroidUtilities.displaySize.y : f7;
                        for (int i15 = 0; i15 < mm0Var.getChildCount(); i15++) {
                            View childAt = mm0Var.getChildAt(i15);
                            if (b0Var.t) {
                                float y10 = childAt.getY() + frameLayout.getPaddingTop();
                                float alpha = childAt.getAlpha();
                                if (y10 < f11) {
                                    f11 = AndroidUtilities.lerp(f11, y10, alpha);
                                }
                            } else if (k9Var.a != 0) {
                                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                                    paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                    y3 = childAt.getTranslationY();
                                } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                    paddingTop = frameLayout.getPaddingTop();
                                    y3 = childAt.getY();
                                }
                                f11 = y3 + paddingTop;
                                this.c = (f11 * clamp) + f10;
                                z10 = ((org.telegram.ui.ActionBar.h3) r9Var).keyboardVisible;
                                if (z10) {
                                    int i16 = k9Var.a;
                                }
                                if (k9Var.getVisibility() != 0) {
                                    k9Var.j();
                                }
                            } else if (!(childAt instanceof j9)) {
                                f11 = Math.min(childAt.getY() + frameLayout.getPaddingTop(), f11);
                            }
                        }
                        this.c = (f11 * clamp) + f10;
                        z10 = ((org.telegram.ui.ActionBar.h3) r9Var).keyboardVisible;
                        if (z10) {
                        }
                        if (k9Var.getVisibility() != 0) {
                        }
                    }
                    i14++;
                    f7 = 0.0f;
                }
                float d = this.b.d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d);
                RectF rectF = AndroidUtilities.rectTmp;
                i10 = ((org.telegram.ui.ActionBar.h3) r9Var).backgroundPaddingLeft;
                float f12 = this.c;
                int width = getWidth();
                i11 = ((org.telegram.ui.ActionBar.h3) r9Var).backgroundPaddingLeft;
                rectF.set(i10, f12, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
                canvas.drawRoundRect(rectF, lerp, lerp, r9Var.R);
                canvas.save();
                Path path = this.d;
                path.rewind();
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                hi.k0 k0Var = (hi.k0) this.e;
                View[] viewPages2 = k0Var.d.getViewPages();
                this.c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        hi.h0 h0Var = (hi.h0) view2;
                        this.c = (h0Var.b() * Utilities.clamp(1.0f - Math.abs(h0Var.getTranslationX() / h0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.c;
                        if (h0Var.getVisibility() == 0) {
                            h0Var.c();
                        }
                    }
                }
                float d10 = this.b.d(this.c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.c = (Math.max(AndroidUtilities.statusBarHeight, this.c) - (AndroidUtilities.statusBarHeight * d10)) - (AndroidUtilities.dp(10.0f) * Math.max(k0Var.b.e, k0Var.c.e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                i12 = ((org.telegram.ui.ActionBar.h3) k0Var).backgroundPaddingLeft;
                float f13 = this.c;
                int width2 = getWidth();
                i13 = ((org.telegram.ui.ActionBar.h3) k0Var).backgroundPaddingLeft;
                rectF2.set(i12, f13, width2 - i13, AndroidUtilities.dp(8.0f) + getHeight());
                float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d10);
                canvas.drawRoundRect(rectF2, lerp2, lerp2, k0Var.P);
                canvas.save();
                Path path2 = this.d;
                path2.rewind();
                path2.addRoundRect(rectF2, lerp2, lerp2, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((r9) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.c) {
                    ((hi.k0) this.e).dismiss();
                    break;
                } else {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(r9 r9Var, Context context) {
        super(context);
        this.e = r9Var;
        this.b = new org.telegram.ui.Components.f6(this, 250L, bs.h);
        this.d = new Path();
    }
}
