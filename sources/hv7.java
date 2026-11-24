// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hv7 extends cja {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ FrameLayout n0;
    public final /* synthetic */ d o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv7(d dVar, Context context, FrameLayout frameLayout, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
        this.n0 = frameLayout;
    }

    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        pha phaVar;
        int measuredHeight2;
        byte b = this.m0;
        d dVar = this.o0;
        FrameLayout frameLayout = this.n0;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() == 8 || Q() < gl.L(20.0f)) {
                    if (passcodeActivity.w.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - gl.L(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.n0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = Q() + (getMeasuredHeight() - gl.L(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                phaVar = ((d) passcodeActivity).simpleActionBar;
                View view = phaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), gl.L(230.0f) + measuredHeight);
                R();
                break;
            default:
                zab zabVar = (zab) frameLayout;
                p3c p3cVar = (p3c) dVar;
                if (p3cVar.f0.getVisibility() == 8 || Q() < gl.L(20.0f)) {
                    if (p3cVar.f0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - gl.L(230.0f);
                        zabVar.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        zabVar.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (p3cVar.l0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - gl.L(230.0f));
                    zabVar.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    zabVar.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                p3cVar.f0.layout(0, measuredHeight2, getMeasuredWidth(), gl.L(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        pha phaVar;
        byte b = this.m0;
        FrameLayout frameLayout = this.n0;
        d dVar = this.o0;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.w.getVisibility() == 8 || Q() >= gl.L(20.0f)) ? size2 : size2 - gl.L(230.0f), TLObject.FLAG_30));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(230.0f), TLObject.FLAG_30));
                phaVar = ((d) passcodeActivity).simpleActionBar;
                View view = phaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                p3c p3cVar = (p3c) dVar;
                if (p3cVar.f0.getVisibility() != 8 && Q() < gl.L(20.0f)) {
                    size4 -= gl.L(230.0f);
                }
                ((zab) frameLayout).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                p3cVar.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
