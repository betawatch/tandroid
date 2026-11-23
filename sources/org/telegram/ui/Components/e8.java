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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e8 extends dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public c8 f;
    public boolean h;
    public final /* synthetic */ f8 n;

    public e8(f8 f8Var, Context context) {
        this.n = f8Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return (this.n.p2 && f1Var.b() == 0) ? false : true;
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
            org.telegram.messenger.q5 q5Var = Utilities.g;
            c8 c8Var = new c8(this, str, 0);
            this.f = c8Var;
            q5Var.d(c8Var, 300L);
        }
    }

    @Override // v4.i0
    public final int b() {
        int size;
        f8 f8Var = this.n;
        boolean z10 = f8Var.p2;
        if (f8Var.q1) {
            size = this.d.size();
        } else {
            if (f8Var.r2.size() <= 1) {
                return 0;
            }
            size = f8Var.r2.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return (this.n.p2 && i7 == 0) ? 1 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        f8 f8Var = this.n;
        View view = f8Var.p1;
        m7 m7Var = f8Var.y1;
        r7 r7Var = f8Var.s1;
        if ((f8Var.r2.size() > 1) != this.h) {
            boolean z10 = f8Var.r2.size() > 1;
            this.h = z10;
            if (z10) {
                r7Var.setVisibility(0);
                r7Var.setTranslationY(org.telegram.messenger.g0.q.y);
                final int i7 = 0;
                r7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.b8
                    public final /* synthetic */ e8 b;

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
                }).setDuration(420L).setInterpolator(nr.h).start();
            } else {
                final int i10 = 1;
                r7Var.animate().translationY(org.telegram.messenger.g0.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.b8
                    public final /* synthetic */ e8 b;

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
                }).setDuration(420L).setInterpolator(nr.h).withEndAction(new og(this, 9)).start();
            }
        }
        if (f8Var.r2.size() > 1) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Ij, m7Var, f8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Ij, m7Var, f8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, 0);
        }
        f8Var.v1.setVisibility((f8Var.r1 && f8Var.u1.b() == 0) ? 0 : 8);
        f8Var.a1();
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
    
        if (((r0.r2.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        if ((r12 + 1) < r0.r2.size()) goto L11;
     */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.messenger.gj gjVar;
        boolean z10;
        f8 f8Var = this.n;
        if (f8Var.p2) {
            if (i7 == 0) {
                return;
            } else {
                i7--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) f1Var.a;
        int i10 = 1;
        if (f8Var.q1) {
            gjVar = (org.telegram.messenger.gj) this.d.get(i7);
        } else if (f8Var.q2 == null ? !org.telegram.messenger.cz.O0 : org.telegram.messenger.cz.O0) {
            ArrayList arrayList = f8Var.r2;
            gjVar = (org.telegram.messenger.gj) arrayList.get((arrayList.size() - i7) - 1);
        } else {
            gjVar = (org.telegram.messenger.gj) f8Var.r2.get(i7);
        }
        if (gjVar != null) {
            gjVar.K5(this.e, true);
        }
        hi.p1 p1Var = f8Var.P0() ? new hi.p1(i10, this, wVar) : null;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, wVar, f8Var.J0);
        boolean P0 = f8Var.P0();
        ah.h hVar = (f8Var.P0() || f8Var.t2 || gjVar.e1() <= 0) ? null : new ah.h(this, wVar, gjVar, 24);
        RadialProgress2 radialProgress2 = wVar.I;
        ImageView imageView = wVar.w;
        wVar.x = gjVar;
        if (wVar.y != z10) {
            wVar.invalidate();
        }
        wVar.y = z10;
        imageView.setImageResource(P0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((P0 || hVar != null) ? 0 : 8);
        imageView.setOnClickListener(hVar);
        imageView.setOnTouchListener(p1Var);
        TLRPC.Document F0 = gjVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false) : null;
        if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w10, F0, gjVar);
        } else {
            String u02 = gjVar.u0(true);
            if (TextUtils.isEmpty(u02)) {
                radialProgress2.i(null, null, null);
            } else {
                radialProgress2.h(u02);
            }
        }
        wVar.requestLayout();
        wVar.b(false, false);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 != 1) {
            return new mj0(new org.telegram.ui.Cells.w(MediaController.B().D0 == null ? 0 : 1, context, this.n.J0));
        }
        ln lnVar = new ln(context, 9);
        lnVar.setTag(-33024);
        return new mj0(lnVar);
    }
}
