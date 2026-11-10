package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z7 extends oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public x7 f;
    public boolean h;
    public final /* synthetic */ a8 n;

    public z7(a8 a8Var, Context context) {
        this.n = a8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return (this.n.o2 && d1Var.b() == 0) ? false : true;
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
            org.telegram.messenger.p5 p5Var = Utilities.g;
            x7 x7Var = new x7(this, str, 0);
            this.f = x7Var;
            p5Var.d(x7Var, 300L);
        }
    }

    @Override // v4.g0
    public final int b() {
        int size;
        a8 a8Var = this.n;
        boolean z9 = a8Var.o2;
        if (a8Var.p1) {
            size = this.d.size();
        } else {
            if (a8Var.q2.size() <= 1) {
                return 0;
            }
            size = a8Var.q2.size();
        }
        return size + (z9 ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        return (this.n.o2 && i7 == 0) ? 1 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        a8 a8Var = this.n;
        View view = a8Var.o1;
        h7 h7Var = a8Var.x1;
        m7 m7Var = a8Var.r1;
        if ((a8Var.q2.size() > 1) != this.h) {
            boolean z9 = a8Var.q2.size() > 1;
            this.h = z9;
            if (z9) {
                m7Var.setVisibility(0);
                m7Var.setTranslationY(org.telegram.messenger.g0.q.y);
                final int i7 = 0;
                m7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.w7
                    public final /* synthetic */ z7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i7) {
                            case 0:
                                this.b.n.b.invalidate();
                                break;
                            default:
                                this.b.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(wq.h).start();
            } else {
                final int i10 = 1;
                m7Var.animate().translationY(org.telegram.messenger.g0.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.w7
                    public final /* synthetic */ z7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                this.b.n.b.invalidate();
                                break;
                            default:
                                this.b.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(wq.h).withEndAction(new wf(this, 9)).start();
            }
        }
        if (a8Var.q2.size() > 1) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Fj, h7Var, a8Var.I0);
            view.setVisibility(0);
            m7Var.setPadding(0, m7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Fj, h7Var, a8Var.I0);
            view.setVisibility(0);
            m7Var.setPadding(0, m7Var.getPaddingTop(), 0, 0);
        }
        a8Var.u1.setVisibility((a8Var.q1 && a8Var.t1.b() == 0) ? 0 : 8);
        a8Var.Z0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r12 + 1) < r10.d.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0029, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        if (((r0.q2.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if ((r12 + 1) < r0.q2.size()) goto L11;
     */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.messenger.ij ijVar;
        boolean z9;
        a8 a8Var = this.n;
        if (a8Var.o2) {
            if (i7 == 0) {
                return;
            } else {
                i7--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) d1Var.a;
        int i10 = 2;
        if (a8Var.p1) {
            ijVar = (org.telegram.messenger.ij) this.d.get(i7);
        } else if (a8Var.p2 == null ? !org.telegram.messenger.iz.O0 : org.telegram.messenger.iz.O0) {
            ArrayList arrayList = a8Var.q2;
            ijVar = (org.telegram.messenger.ij) arrayList.get((arrayList.size() - i7) - 1);
        } else {
            ijVar = (org.telegram.messenger.ij) a8Var.q2.get(i7);
        }
        if (ijVar != null) {
            ijVar.K5(this.e, true);
        }
        fi.n1 n1Var = a8Var.O0() ? new fi.n1(i10, this, wVar) : null;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, wVar, a8Var.I0);
        boolean O0 = a8Var.O0();
        ah.g gVar = (a8Var.O0() || a8Var.s2 || ijVar.e1() <= 0) ? null : new ah.g(this, wVar, ijVar, 19);
        RadialProgress2 radialProgress2 = wVar.H;
        ImageView imageView = wVar.w;
        wVar.x = ijVar;
        if (wVar.y != z9) {
            wVar.invalidate();
        }
        wVar.y = z9;
        imageView.setImageResource(O0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((O0 || gVar != null) ? 0 : 8);
        imageView.setOnClickListener(gVar);
        imageView.setOnTouchListener(n1Var);
        TLRPC.Document F0 = ijVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false) : null;
        if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w10, F0, ijVar);
        } else {
            String u02 = ijVar.u0(true);
            if (TextUtils.isEmpty(u02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u02);
            }
        }
        wVar.requestLayout();
        wVar.b(false, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 != 1) {
            return new xi0(new org.telegram.ui.Cells.w(MediaController.B().C0 == null ? 0 : 1, context, this.n.I0));
        }
        sm smVar = new sm(context, 9);
        smVar.setTag(-33024);
        return new xi0(smVar);
    }
}
