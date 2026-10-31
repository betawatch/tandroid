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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v7 extends sk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public t7 f;
    public boolean h;
    public final /* synthetic */ w7 n;

    public v7(w7 w7Var, Context context) {
        this.n = w7Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return (this.n.l2 && c1Var.b() == 0) ? false : true;
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
            org.telegram.messenger.r5 r5Var = Utilities.g;
            t7 t7Var = new t7(this, str, 0);
            this.f = t7Var;
            r5Var.d(t7Var, 300L);
        }
    }

    @Override // s4.g0
    public final int b() {
        int size;
        w7 w7Var = this.n;
        boolean z10 = w7Var.l2;
        if (w7Var.m1) {
            size = this.d.size();
        } else {
            if (w7Var.n2.size() <= 1) {
                return 0;
            }
            size = w7Var.n2.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        return (this.n.l2 && i10 == 0) ? 1 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        w7 w7Var = this.n;
        View view = w7Var.l1;
        e7 e7Var = w7Var.u1;
        j7 j7Var = w7Var.o1;
        if ((w7Var.n2.size() > 1) != this.h) {
            boolean z10 = w7Var.n2.size() > 1;
            this.h = z10;
            if (z10) {
                j7Var.setVisibility(0);
                j7Var.setTranslationY(org.telegram.messenger.i0.q.y);
                final int i10 = 0;
                j7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.s7
                    public final /* synthetic */ v7 b;

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
                }).setDuration(420L).setInterpolator(gr.h).start();
            } else {
                final int i11 = 1;
                j7Var.animate().translationY(org.telegram.messenger.i0.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.s7
                    public final /* synthetic */ v7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                this.b.n.b.invalidate();
                                break;
                            default:
                                this.b.n.b.invalidate();
                                break;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).withEndAction(new tf(this, 10)).start();
            }
        }
        if (w7Var.n2.size() > 1) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Fj, e7Var, w7Var.I0);
            view.setVisibility(0);
            j7Var.setPadding(0, j7Var.getPaddingTop(), 0, org.telegram.messenger.i0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Fj, e7Var, w7Var.I0);
            view.setVisibility(0);
            j7Var.setPadding(0, j7Var.getPaddingTop(), 0, 0);
        }
        w7Var.r1.setVisibility((w7Var.n1 && w7Var.q1.b() == 0) ? 0 : 8);
        w7Var.Z0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r12 + 1) < r10.d.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0028, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        if (((r0.n2.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.n2.size()) goto L11;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.messenger.jj jjVar;
        boolean z10;
        w7 w7Var = this.n;
        if (w7Var.l2) {
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) c1Var.a;
        int i11 = 1;
        if (w7Var.m1) {
            jjVar = (org.telegram.messenger.jj) this.d.get(i10);
        } else if (w7Var.m2 == null ? !org.telegram.messenger.tz.O0 : org.telegram.messenger.tz.O0) {
            ArrayList arrayList = w7Var.n2;
            jjVar = (org.telegram.messenger.jj) arrayList.get((arrayList.size() - i10) - 1);
        } else {
            jjVar = (org.telegram.messenger.jj) w7Var.n2.get(i10);
        }
        if (jjVar != null) {
            jjVar.J5(this.e, true);
        }
        org.telegram.ui.ActionBar.d1 d1Var = w7Var.O0() ? new org.telegram.ui.ActionBar.d1(i11, this, wVar) : null;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, wVar, w7Var.I0);
        boolean O0 = w7Var.O0();
        ag.i iVar = (w7Var.O0() || w7Var.p2 || jjVar.f1() <= 0) ? null : new ag.i(this, wVar, jjVar, 9);
        RadialProgress2 radialProgress2 = wVar.H;
        ImageView imageView = wVar.w;
        wVar.x = jjVar;
        if (wVar.y != z10) {
            wVar.invalidate();
        }
        wVar.y = z10;
        imageView.setImageResource(O0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((O0 || iVar != null) ? 0 : 8);
        imageView.setOnClickListener(iVar);
        imageView.setOnTouchListener(d1Var);
        TLRPC.Document F0 = jjVar.F0();
        TLRPC.PhotoSize w9 = F0 != null ? org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false) : null;
        if ((w9 instanceof TLRPC.TL_photoSize) || (w9 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w9, F0, jjVar);
        } else {
            String u02 = jjVar.u0(true);
            if (TextUtils.isEmpty(u02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u02);
            }
        }
        wVar.requestLayout();
        wVar.b(false, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        if (i10 != 1) {
            return new ck0(new org.telegram.ui.Cells.w(MediaController.B().C0 == null ? 0 : 1, context, this.n.I0));
        }
        bn bnVar = new bn(context, 6);
        bnVar.setTag(-33024);
        return new ck0(bnVar);
    }
}
