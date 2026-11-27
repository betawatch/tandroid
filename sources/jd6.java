// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jd6 extends FrameLayout implements snb {
    public final vnb a;
    public final FrameLayout b;
    public int c;
    public boolean d;

    public jd6(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(rnb.e(aob.v0(aob.Fi, vnbVar), 8.0f));
        addView(frameLayout, tre.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        ema emaVar = new ema(context);
        emaVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        emaVar.setGravity(17);
        emaVar.setDrawablePadding(hl.L(8.0f));
        yob.W(emaVar, aob.Ji, vnbVar);
        emaVar.setTextSize(14);
        emaVar.l(ob6.M0(2131751401, null), false);
        emaVar.setLeftDrawable(R.drawable.filled_directions);
        emaVar.setTypeface(hl.o());
        frameLayout.addView(emaVar, tre.c(-1.0f, -1));
        frameLayout.setOutlineProvider(yhc.b);
        frameLayout.setClipToOutline(true);
        iye.b(frameLayout, 0.02f, 1.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(73.0f), TLObject.FLAG_30));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // snb
    public final void updateColors() {
        try {
            int v0 = aob.v0(aob.Fi, this.a);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null && (v0 != this.c || this.d != aob.I.o())) {
                this.d = aob.I.o();
                this.c = v0;
                aob.F1(frameLayout.getBackground(), v0, false);
                aob.F1(frameLayout.getBackground(), rnb.b(v0), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
