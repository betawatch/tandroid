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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y7 extends sj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public w7 f;
    public boolean h;
    public final /* synthetic */ z7 n;

    public y7(z7 z7Var, Context context) {
        this.n = z7Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return (this.n.m2 && d1Var.b() == 0) ? false : true;
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
            w7 w7Var = new w7(this, str, 0);
            this.f = w7Var;
            p5Var.e(w7Var, 300L);
        }
    }

    @Override // u4.h0
    public final int b() {
        int size;
        z7 z7Var = this.n;
        boolean z10 = z7Var.m2;
        if (z7Var.n1) {
            size = this.d.size();
        } else {
            if (z7Var.o2.size() <= 1) {
                return 0;
            }
            size = z7Var.o2.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // u4.h0
    public final int d(int i3) {
        return (this.n.m2 && i3 == 0) ? 1 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        z7 z7Var = this.n;
        View view = z7Var.m1;
        g7 g7Var = z7Var.v1;
        l7 l7Var = z7Var.p1;
        if ((z7Var.o2.size() > 1) != this.h) {
            boolean z10 = z7Var.o2.size() > 1;
            this.h = z10;
            if (z10) {
                l7Var.setVisibility(0);
                l7Var.setTranslationY(org.telegram.messenger.g0.q.y);
                final int i3 = 0;
                l7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.v7
                    public final /* synthetic */ y7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i3) {
                            case 0:
                                this.b.n.b.invalidate();
                                break;
                            default:
                                this.b.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(xq.h).start();
            } else {
                final int i10 = 1;
                l7Var.animate().translationY(org.telegram.messenger.g0.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.v7
                    public final /* synthetic */ y7 b;

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
                }).setDuration(420L).setInterpolator(xq.h).withEndAction(new vf(this, 9)).start();
            }
        }
        if (z7Var.o2.size() > 1) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, g7Var, z7Var.J0);
            view.setVisibility(0);
            l7Var.setPadding(0, l7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, g7Var, z7Var.J0);
            view.setVisibility(0);
            l7Var.setPadding(0, l7Var.getPaddingTop(), 0, 0);
        }
        z7Var.s1.setVisibility((z7Var.o1 && z7Var.r1.b() == 0) ? 0 : 8);
        z7Var.Z0();
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
    
        if (((r0.o2.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if ((r12 + 1) < r0.o2.size()) goto L11;
     */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.messenger.zi ziVar;
        boolean z10;
        z7 z7Var = this.n;
        if (z7Var.m2) {
            if (i3 == 0) {
                return;
            } else {
                i3--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) d1Var.a;
        int i10 = 2;
        if (z7Var.n1) {
            ziVar = (org.telegram.messenger.zi) this.d.get(i3);
        } else if (z7Var.n2 == null ? !org.telegram.messenger.az.O0 : org.telegram.messenger.az.O0) {
            ArrayList arrayList = z7Var.o2;
            ziVar = (org.telegram.messenger.zi) arrayList.get((arrayList.size() - i3) - 1);
        } else {
            ziVar = (org.telegram.messenger.zi) z7Var.o2.get(i3);
        }
        if (ziVar != null) {
            ziVar.L5(this.e, true);
        }
        gi.n1 n1Var = z7Var.O0() ? new gi.n1(i10, this, wVar) : null;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, wVar, z7Var.J0);
        boolean O0 = z7Var.O0();
        ai.h hVar = (z7Var.O0() || z7Var.q2 || ziVar.f1() <= 0) ? null : new ai.h(this, wVar, ziVar, 24);
        RadialProgress2 radialProgress2 = wVar.I;
        ImageView imageView = wVar.w;
        wVar.x = ziVar;
        if (wVar.y != z10) {
            wVar.invalidate();
        }
        wVar.y = z10;
        imageView.setImageResource(O0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((O0 || hVar != null) ? 0 : 8);
        imageView.setOnClickListener(hVar);
        imageView.setOnTouchListener(n1Var);
        TLRPC.Document F0 = ziVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false) : null;
        if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w10, F0, ziVar);
        } else {
            String u02 = ziVar.u0(true);
            if (TextUtils.isEmpty(u02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u02);
            }
        }
        wVar.requestLayout();
        wVar.b(false, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.c;
        if (i3 != 1) {
            return new bj0(new org.telegram.ui.Cells.w(MediaController.B().D0 == null ? 0 : 1, context, this.n.J0));
        }
        sm smVar = new sm(context, 10);
        smVar.setTag(-33024);
        return new bj0(smVar);
    }
}
