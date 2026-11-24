// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h20 extends n39 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public f20 f;
    public boolean h;
    public final /* synthetic */ i20 n;

    public h20(i20 i20Var, Activity activity) {
        this.n = i20Var;
        this.c = activity;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return (this.n.o2 && s49Var.b() == 0) ? false : true;
    }

    public final void E(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            f();
        } else {
            co3 co3Var = Utilities.g;
            f20 f20Var = new f20(this, str, (byte) 0);
            this.f = f20Var;
            co3Var.d(f20Var, 300L);
        }
    }

    @Override // w39
    public final int b() {
        int size;
        i20 i20Var = this.n;
        boolean z = i20Var.o2;
        if (i20Var.p1) {
            size = this.d.size();
        } else {
            if (i20Var.q2.size() <= 1) {
                return 0;
            }
            size = i20Var.q2.size();
        }
        return size + (z ? 1 : 0);
    }

    @Override // w39
    public final int d(int i) {
        return (this.n.o2 && i == 0) ? 1 : 0;
    }

    @Override // w39
    public final void f() {
        super.f();
        i20 i20Var = this.n;
        View view = i20Var.o1;
        p10 p10Var = i20Var.r1;
        final byte b = 1;
        if ((i20Var.q2.size() > 1) != this.h) {
            boolean z = i20Var.q2.size() > 1;
            this.h = z;
            if (z) {
                p10Var.setVisibility(0);
                p10Var.setTranslationY(gl.q.y);
                p10Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e20
                    public final /* synthetic */ h20 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = r2;
                        h20 h20Var = this.b;
                        switch (b2) {
                            case 0:
                                h20Var.n.b.invalidate();
                                break;
                            default:
                                h20Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(s33.h).start();
            } else {
                p10Var.animate().translationY(gl.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e20
                    public final /* synthetic */ h20 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = b;
                        h20 h20Var = this.b;
                        switch (b2) {
                            case 0:
                                h20Var.n.b.invalidate();
                                break;
                            default:
                                h20Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(s33.h).withEndAction(new oz(this, (byte) 2)).start();
            }
        }
        int size = i20Var.q2.size();
        k10 k10Var = i20Var.x1;
        if (size > 1) {
            zkb.h(bkb.Hj, i20Var.J0, k10Var);
            view.setVisibility(0);
            p10Var.setPadding(0, p10Var.getPaddingTop(), 0, gl.L(231.0f));
        } else {
            zkb.h(bkb.Hj, i20Var.J0, k10Var);
            view.setVisibility(0);
            p10Var.setPadding(0, p10Var.getPaddingTop(), 0, 0);
        }
        i20Var.u1.setVisibility((i20Var.q1 && i20Var.t1.b() == 0) ? (byte) 0 : (byte) 8);
        i20Var.T0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r11 + 1) < r9.d.size()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005f, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005d, code lost:
    
        if (((r0.q2.size() - r11) - 2) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0043, code lost:
    
        if ((r11 + 1) < r0.q2.size()) goto L24;
     */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        k27 k27Var;
        boolean z;
        i20 i20Var = this.n;
        if (i20Var.o2) {
            if (i == 0) {
                return;
            } else {
                i--;
            }
        }
        j20 j20Var = (j20) s49Var.a;
        byte b = 1;
        if (i20Var.p1) {
            k27Var = (k27) this.d.get(i);
        } else if (i20Var.p2 == null ? !gba.K0 : gba.K0) {
            ArrayList arrayList = i20Var.q2;
            k27Var = (k27) arrayList.get((arrayList.size() - i) - 1);
        } else {
            k27Var = (k27) i20Var.q2.get(i);
        }
        if (k27Var != null) {
            k27Var.J5(this.e, true);
        }
        f8 f8Var = i20Var.I0() ? new f8(this, j20Var, b) : null;
        zkb.h(bkb.g5, i20Var.J0, j20Var);
        boolean I0 = i20Var.I0();
        b0 b0Var = (i20Var.I0() || i20Var.s2 || k27Var.e1() <= 0) ? null : new b0(this, j20Var, k27Var, (byte) 10);
        RadialProgress2 radialProgress2 = j20Var.I;
        ImageView imageView = j20Var.w;
        j20Var.x = k27Var;
        if (j20Var.y != z) {
            j20Var.invalidate();
        }
        j20Var.y = z;
        imageView.setImageResource(I0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((I0 || b0Var != null) ? 0 : 8);
        imageView.setOnClickListener(b0Var);
        imageView.setOnTouchListener(f8Var);
        TLRPC.Document F0 = k27Var.F0();
        TLRPC.PhotoSize w = F0 != null ? ba4.w(F0.thumbs, 90, false, null, false) : null;
        if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w, F0, k27Var);
        } else {
            String u0 = k27Var.u0(true);
            if (TextUtils.isEmpty(u0)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u0);
            }
        }
        j20Var.requestLayout();
        j20Var.b(false, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        if (i != 1) {
            return new y29(new j20(MediaController.w().D0 == null ? 0 : 1, this.n.J0, activity));
        }
        d62 d62Var = new d62(activity, (byte) 3);
        d62Var.setTag(-33024);
        return new y29(d62Var);
    }
}
