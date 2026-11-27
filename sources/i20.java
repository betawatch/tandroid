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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i20 extends c79 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public g20 f;
    public boolean h;
    public final /* synthetic */ j20 n;

    public i20(j20 j20Var, Activity activity) {
        this.n = j20Var;
        this.c = activity;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return (this.n.o2 && f89Var.b() == 0) ? false : true;
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
            to3 to3Var = Utilities.g;
            g20 g20Var = new g20(this, str, (byte) 0);
            this.f = g20Var;
            to3Var.d(g20Var, 300L);
        }
    }

    @Override // j79
    public final int b() {
        int size;
        j20 j20Var = this.n;
        boolean z = j20Var.o2;
        if (j20Var.p1) {
            size = this.d.size();
        } else {
            if (j20Var.q2.size() <= 1) {
                return 0;
            }
            size = j20Var.q2.size();
        }
        return size + (z ? 1 : 0);
    }

    @Override // j79
    public final int d(int i) {
        return (this.n.o2 && i == 0) ? 1 : 0;
    }

    @Override // j79
    public final void f() {
        super.f();
        j20 j20Var = this.n;
        View view = j20Var.o1;
        q10 q10Var = j20Var.r1;
        final byte b = 1;
        if ((j20Var.q2.size() > 1) != this.h) {
            boolean z = j20Var.q2.size() > 1;
            this.h = z;
            if (z) {
                q10Var.setVisibility(0);
                q10Var.setTranslationY(hl.q.y);
                q10Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f20
                    public final /* synthetic */ i20 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = r2;
                        i20 i20Var = this.b;
                        switch (b2) {
                            case 0:
                                i20Var.n.b.invalidate();
                                break;
                            default:
                                i20Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).start();
            } else {
                q10Var.animate().translationY(hl.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f20
                    public final /* synthetic */ i20 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = b;
                        i20 i20Var = this.b;
                        switch (b2) {
                            case 0:
                                i20Var.n.b.invalidate();
                                break;
                            default:
                                i20Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).withEndAction(new pz(this, (byte) 2)).start();
            }
        }
        int size = j20Var.q2.size();
        l10 l10Var = j20Var.x1;
        if (size > 1) {
            yob.h(aob.Ij, j20Var.J0, l10Var);
            view.setVisibility(0);
            q10Var.setPadding(0, q10Var.getPaddingTop(), 0, hl.L(231.0f));
        } else {
            yob.h(aob.Ij, j20Var.J0, l10Var);
            view.setVisibility(0);
            q10Var.setPadding(0, q10Var.getPaddingTop(), 0, 0);
        }
        j20Var.u1.setVisibility((j20Var.q1 && j20Var.t1.b() == 0) ? (byte) 0 : (byte) 8);
        j20Var.U0();
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        r47 r47Var;
        boolean z;
        j20 j20Var = this.n;
        if (j20Var.o2) {
            if (i == 0) {
                return;
            } else {
                i--;
            }
        }
        k20 k20Var = (k20) f89Var.a;
        byte b = 1;
        if (j20Var.p1) {
            r47Var = (r47) this.d.get(i);
        } else if (j20Var.p2 == null ? !xea.K0 : xea.K0) {
            ArrayList arrayList = j20Var.q2;
            r47Var = (r47) arrayList.get((arrayList.size() - i) - 1);
        } else {
            r47Var = (r47) j20Var.q2.get(i);
        }
        if (r47Var != null) {
            r47Var.J5(this.e, true);
        }
        g8 g8Var = j20Var.J0() ? new g8(this, k20Var, b) : null;
        yob.h(aob.h5, j20Var.J0, k20Var);
        boolean J0 = j20Var.J0();
        c0 c0Var = (j20Var.J0() || j20Var.s2 || r47Var.e1() <= 0) ? null : new c0(this, k20Var, r47Var, (byte) 10);
        RadialProgress2 radialProgress2 = k20Var.I;
        ImageView imageView = k20Var.w;
        k20Var.x = r47Var;
        if (k20Var.y != z) {
            k20Var.invalidate();
        }
        k20Var.y = z;
        imageView.setImageResource(J0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((J0 || c0Var != null) ? 0 : 8);
        imageView.setOnClickListener(c0Var);
        imageView.setOnTouchListener(g8Var);
        TLRPC.Document F0 = r47Var.F0();
        TLRPC.PhotoSize w = F0 != null ? xb4.w(F0.thumbs, 90, false, null, false) : null;
        if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w, F0, r47Var);
        } else {
            String u0 = r47Var.u0(true);
            if (TextUtils.isEmpty(u0)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u0);
            }
        }
        k20Var.requestLayout();
        k20Var.b(false, false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        if (i != 1) {
            return new n69(new k20(MediaController.z().D0 == null ? 0 : 1, this.n.J0, activity));
        }
        t62 t62Var = new t62(activity, (byte) 3);
        t62Var.setTag(-33024);
        return new n69(t62Var);
    }
}
