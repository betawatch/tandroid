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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h30 extends q59 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public f30 f;
    public boolean h;
    public final /* synthetic */ i30 n;

    public h30(i30 i30Var, Activity activity) {
        this.n = i30Var;
        this.c = activity;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return (this.n.o2 && u69Var.b() == 0) ? false : true;
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
            mp3 mp3Var = Utilities.g;
            f30 f30Var = new f30(this, str, (byte) 0);
            this.f = f30Var;
            mp3Var.d(f30Var, 300L);
        }
    }

    @Override // y59
    public final int b() {
        int size;
        i30 i30Var = this.n;
        boolean z = i30Var.o2;
        if (i30Var.p1) {
            size = this.d.size();
        } else {
            if (i30Var.q2.size() <= 1) {
                return 0;
            }
            size = i30Var.q2.size();
        }
        return size + (z ? 1 : 0);
    }

    @Override // y59
    public final int d(int i) {
        return (this.n.o2 && i == 0) ? 1 : 0;
    }

    @Override // y59
    public final void f() {
        super.f();
        i30 i30Var = this.n;
        View view = i30Var.o1;
        p20 p20Var = i30Var.r1;
        final byte b = 1;
        if ((i30Var.q2.size() > 1) != this.h) {
            boolean z = i30Var.q2.size() > 1;
            this.h = z;
            if (z) {
                p20Var.setVisibility(0);
                p20Var.setTranslationY(gm.q.y);
                p20Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e30
                    public final /* synthetic */ h30 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = r2;
                        h30 h30Var = this.b;
                        switch (b2) {
                            case 0:
                                h30Var.n.b.invalidate();
                                break;
                            default:
                                h30Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).start();
            } else {
                p20Var.animate().translationY(gm.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e30
                    public final /* synthetic */ h30 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b2 = b;
                        h30 h30Var = this.b;
                        switch (b2) {
                            case 0:
                                h30Var.n.b.invalidate();
                                break;
                            default:
                                h30Var.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).withEndAction(new f00(this, (byte) 4)).start();
            }
        }
        int size = i30Var.q2.size();
        k20 k20Var = i30Var.x1;
        if (size > 1) {
            anb.h(cmb.Hj, i30Var.J0, k20Var);
            view.setVisibility(0);
            p20Var.setPadding(0, p20Var.getPaddingTop(), 0, gm.L(231.0f));
        } else {
            anb.h(cmb.Hj, i30Var.J0, k20Var);
            view.setVisibility(0);
            p20Var.setPadding(0, p20Var.getPaddingTop(), 0, 0);
        }
        i30Var.u1.setVisibility((i30Var.q1 && i30Var.t1.b() == 0) ? (byte) 0 : (byte) 8);
        i30Var.T0();
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
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        k47 k47Var;
        boolean z;
        i30 i30Var = this.n;
        if (i30Var.o2) {
            if (i == 0) {
                return;
            } else {
                i--;
            }
        }
        j30 j30Var = (j30) u69Var.a;
        byte b = 1;
        if (i30Var.p1) {
            k47Var = (k47) this.d.get(i);
        } else if (i30Var.p2 == null ? !gda.K0 : gda.K0) {
            ArrayList arrayList = i30Var.q2;
            k47Var = (k47) arrayList.get((arrayList.size() - i) - 1);
        } else {
            k47Var = (k47) i30Var.q2.get(i);
        }
        if (k47Var != null) {
            k47Var.J5(this.e, true);
        }
        f8 f8Var = i30Var.I0() ? new f8(this, j30Var, b) : null;
        anb.h(cmb.g5, i30Var.J0, j30Var);
        boolean I0 = i30Var.I0();
        b0 b0Var = (i30Var.I0() || i30Var.s2 || k47Var.e1() <= 0) ? null : new b0(this, j30Var, k47Var, (byte) 10);
        RadialProgress2 radialProgress2 = j30Var.I;
        ImageView imageView = j30Var.w;
        j30Var.x = k47Var;
        if (j30Var.y != z) {
            j30Var.invalidate();
        }
        j30Var.y = z;
        imageView.setImageResource(I0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((I0 || b0Var != null) ? 0 : 8);
        imageView.setOnClickListener(b0Var);
        imageView.setOnTouchListener(f8Var);
        TLRPC.Document F0 = k47Var.F0();
        TLRPC.PhotoSize w = F0 != null ? bc4.w(F0.thumbs, 90, false, null, false) : null;
        if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w, F0, k47Var);
        } else {
            String u0 = k47Var.u0(true);
            if (TextUtils.isEmpty(u0)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u0);
            }
        }
        j30Var.requestLayout();
        j30Var.b(false, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        if (i != 1) {
            return new b59(new j30(MediaController.w().D0 == null ? 0 : 1, this.n.J0, activity));
        }
        o72 o72Var = new o72(activity, (byte) 3);
        o72Var.setTag(-33024);
        return new b59(o72Var);
    }
}
