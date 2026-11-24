// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ed6 extends FrameLayout implements vlb {
    public final ylb a;
    public final FrameLayout b;
    public int c;
    public boolean d;

    public ed6(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(ulb.e(cmb.v0(cmb.Ei, ylbVar), 8.0f));
        addView(frameLayout, qoe.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        lka lkaVar = new lka(context);
        lkaVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        lkaVar.setGravity(17);
        lkaVar.setDrawablePadding(gm.L(8.0f));
        anb.W(lkaVar, cmb.Ii, ylbVar);
        lkaVar.setTextSize(14);
        lkaVar.l(jb6.M0(2131751373, null), false);
        lkaVar.setLeftDrawable(R.drawable.filled_directions);
        lkaVar.setTypeface(gm.o());
        frameLayout.addView(lkaVar, qoe.c(-1.0f, -1));
        frameLayout.setOutlineProvider(agc.b);
        frameLayout.setClipToOutline(true);
        rve.b(frameLayout, 0.02f, 1.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(73.0f), TLObject.FLAG_30));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int v0 = cmb.v0(cmb.Ei, this.a);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null && (v0 != this.c || this.d != cmb.I.o())) {
                this.d = cmb.I.o();
                this.c = v0;
                cmb.F1(frameLayout.getBackground(), v0, false);
                cmb.F1(frameLayout.getBackground(), ulb.b(v0), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
