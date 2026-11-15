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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x7 extends tj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public String e;
    public v7 f;
    public boolean h;
    public final /* synthetic */ y7 n;

    public x7(y7 y7Var, Context context) {
        this.n = y7Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return (this.n.p2 && e1Var.b() == 0) ? false : true;
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
            v7 v7Var = new v7(this, str, 0);
            this.f = v7Var;
            p5Var.d(v7Var, 300L);
        }
    }

    @Override // v4.h0
    public final int b() {
        int size;
        y7 y7Var = this.n;
        boolean z10 = y7Var.p2;
        if (y7Var.q1) {
            size = this.d.size();
        } else {
            if (y7Var.r2.size() <= 1) {
                return 0;
            }
            size = y7Var.r2.size();
        }
        return size + (z10 ? 1 : 0);
    }

    @Override // v4.h0
    public final int d(int i7) {
        return (this.n.p2 && i7 == 0) ? 1 : 0;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        y7 y7Var = this.n;
        View view = y7Var.p1;
        f7 f7Var = y7Var.y1;
        k7 k7Var = y7Var.s1;
        if ((y7Var.r2.size() > 1) != this.h) {
            boolean z10 = y7Var.r2.size() > 1;
            this.h = z10;
            if (z10) {
                k7Var.setVisibility(0);
                k7Var.setTranslationY(org.telegram.messenger.g0.q.y);
                final int i7 = 0;
                k7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.u7
                    public final /* synthetic */ x7 b;

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
                }).setDuration(420L).setInterpolator(er.h).start();
            } else {
                final int i10 = 1;
                k7Var.animate().translationY(org.telegram.messenger.g0.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.u7
                    public final /* synthetic */ x7 b;

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
                }).setDuration(420L).setInterpolator(er.h).withEndAction(new dg(this, 9)).start();
            }
        }
        if (y7Var.r2.size() > 1) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Ij, f7Var, y7Var.J0);
            view.setVisibility(0);
            k7Var.setPadding(0, k7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Ij, f7Var, y7Var.J0);
            view.setVisibility(0);
            k7Var.setPadding(0, k7Var.getPaddingTop(), 0, 0);
        }
        y7Var.v1.setVisibility((y7Var.r1 && y7Var.u1.b() == 0) ? 0 : 8);
        y7Var.Z0();
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
    
        if (((r0.r2.size() - r12) - 2) >= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0047, code lost:
    
        if ((r12 + 1) < r0.r2.size()) goto L11;
     */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.messenger.gj gjVar;
        boolean z10;
        y7 y7Var = this.n;
        if (y7Var.p2) {
            if (i7 == 0) {
                return;
            } else {
                i7--;
            }
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) e1Var.a;
        int i10 = 2;
        if (y7Var.q1) {
            gjVar = (org.telegram.messenger.gj) this.d.get(i7);
        } else if (y7Var.q2 == null ? !org.telegram.messenger.gz.O0 : org.telegram.messenger.gz.O0) {
            ArrayList arrayList = y7Var.r2;
            gjVar = (org.telegram.messenger.gj) arrayList.get((arrayList.size() - i7) - 1);
        } else {
            gjVar = (org.telegram.messenger.gj) y7Var.r2.get(i7);
        }
        if (gjVar != null) {
            gjVar.K5(this.e, true);
        }
        hi.p1 p1Var = y7Var.O0() ? new hi.p1(i10, this, wVar) : null;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, wVar, y7Var.J0);
        boolean O0 = y7Var.O0();
        ah.g gVar = (y7Var.O0() || y7Var.t2 || gjVar.e1() <= 0) ? null : new ah.g(this, wVar, gjVar, 24);
        RadialProgress2 radialProgress2 = wVar.I;
        ImageView imageView = wVar.w;
        wVar.x = gjVar;
        if (wVar.y != z10) {
            wVar.invalidate();
        }
        wVar.y = z10;
        imageView.setImageResource(O0 ? R.drawable.list_reorder : R.drawable.ic_ab_other);
        imageView.setVisibility((O0 || gVar != null) ? 0 : 8);
        imageView.setOnClickListener(gVar);
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

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        if (i7 != 1) {
            return new cj0(new org.telegram.ui.Cells.w(MediaController.B().D0 == null ? 0 : 1, context, this.n.J0));
        }
        bn bnVar = new bn(context, 9);
        bnVar.setTag(-33024);
        return new cj0(bnVar);
    }
}
