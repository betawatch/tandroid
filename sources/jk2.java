// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jk2 extends FrameLayout {
    public final hw a;
    public fk2 b;
    public p8c c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public jk2(Context context, mi4 mi4Var) {
        super(context);
        hw hwVar = new hw(this, context);
        this.a = hwVar;
        hwVar.setAdapter(new hk2(this, context, mi4Var, (byte) 0));
        hwVar.setLayoutManager(new t26(0, false));
        hwVar.setClipToPadding(false);
        hwVar.setVisibility(8);
        hwVar.setWillNotDraw(false);
        hwVar.setOnItemClickListener(new u(this, (byte) 14));
        addView(hwVar, nme.c(56.0f, -1));
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z) {
            return;
        }
        this.e = z;
        hw hwVar = this.a;
        if (!z2) {
            this.d = z ? 1.0f : 0.0f;
            hwVar.invalidate();
            hwVar.setVisibility(z ? 0 : 8);
            return;
        }
        hwVar.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new uz1(this, (byte) 12));
        this.f.addListener(new y7((byte) 21, (Object) this, z));
        this.f.setInterpolator(s33.h);
        this.f.setDuration(340L);
        this.f.start();
    }

    public void setOnLayoutClick(p8c p8cVar) {
        this.c = p8cVar;
    }

    public void setSelected(fk2 fk2Var) {
        this.b = fk2Var;
        gl.V3(this.a);
    }
}
