// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jx7 extends ela {
    public final /* synthetic */ byte m0;
    public final /* synthetic */ FrameLayout n0;
    public final /* synthetic */ d o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx7(d dVar, Context context, FrameLayout frameLayout, byte b) {
        super(context, null);
        this.m0 = b;
        this.o0 = dVar;
        this.n0 = frameLayout;
    }

    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        rja rjaVar;
        int measuredHeight2;
        byte b = this.m0;
        d dVar = this.o0;
        FrameLayout frameLayout = this.n0;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (passcodeActivity.w.getVisibility() == 8 || Q() < gm.L(20.0f)) {
                    if (passcodeActivity.w.getVisibility() != 8) {
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - gm.L(230.0f);
                        frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (passcodeActivity.o0()) {
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = Q() + (getMeasuredHeight() - gm.L(230.0f));
                    frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                }
                rjaVar = ((d) passcodeActivity).simpleActionBar;
                View view = rjaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                passcodeActivity.w.layout(0, measuredHeight, getMeasuredWidth(), gm.L(230.0f) + measuredHeight);
                R();
                break;
            default:
                bdb bdbVar = (bdb) frameLayout;
                p5c p5cVar = (p5c) dVar;
                if (p5cVar.f0.getVisibility() == 8 || Q() < gm.L(20.0f)) {
                    if (p5cVar.f0.getVisibility() != 8) {
                        int measuredWidth5 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight() - gm.L(230.0f);
                        bdbVar.layout(0, 0, measuredWidth5, measuredHeight2);
                    } else {
                        int measuredWidth6 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        bdbVar.layout(0, 0, measuredWidth6, measuredHeight2);
                    }
                } else if (p5cVar.m0()) {
                    int measuredWidth7 = getMeasuredWidth();
                    measuredHeight2 = Q() + (getMeasuredHeight() - gm.L(230.0f));
                    bdbVar.layout(0, 0, measuredWidth7, measuredHeight2);
                } else {
                    int measuredWidth8 = getMeasuredWidth();
                    measuredHeight2 = getMeasuredHeight();
                    bdbVar.layout(0, 0, measuredWidth8, measuredHeight2);
                }
                p5cVar.f0.layout(0, measuredHeight2, getMeasuredWidth(), gm.L(230.0f) + measuredHeight2);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        rja rjaVar;
        byte b = this.m0;
        FrameLayout frameLayout = this.n0;
        d dVar = this.o0;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((passcodeActivity.w.getVisibility() == 8 || Q() >= gm.L(20.0f)) ? size2 : size2 - gm.L(230.0f), TLObject.FLAG_30));
                passcodeActivity.w.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(230.0f), TLObject.FLAG_30));
                rjaVar = ((d) passcodeActivity).simpleActionBar;
                View view = rjaVar != null ? ((d) passcodeActivity).simpleActionBar : ((d) passcodeActivity).actionBar;
                if (view != null && view.getParent() == this) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    break;
                }
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size3, size4);
                p5c p5cVar = (p5c) dVar;
                if (p5cVar.f0.getVisibility() != 8 && Q() < gm.L(20.0f)) {
                    size4 -= gm.L(230.0f);
                }
                ((bdb) frameLayout).measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30));
                p5cVar.f0.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(230.0f), TLObject.FLAG_30));
                break;
        }
    }
}
