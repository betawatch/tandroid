package org.telegram.ui;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public hh(x30 x30Var, org.telegram.messenger.s3 s3Var, boolean z10) {
        this.d = x30Var;
        this.c = s3Var;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.d;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qi qiVar = wmVar.p1;
                if (qiVar != null) {
                    qiVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return wmVar.K8();
            default:
                x30 x30Var = (x30) this.d;
                f30 f30Var = x30Var.I1;
                f30Var.getViewTreeObserver().removeOnPreDrawListener(this);
                x30Var.i4 = null;
                u10 u10Var = x30Var.S3;
                org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) this.c;
                u10Var.j(s3Var);
                if (x30Var.k2) {
                    x30Var.k2 = false;
                    x30Var.Q0(true);
                    if (this.b && s3Var != null) {
                        f30Var.v0(0);
                    }
                    x30Var.k2 = true;
                } else {
                    x30Var.Q0(true);
                }
                x30Var.b.requestLayout();
                return false;
        }
    }

    public hh(wm wmVar, ViewTreeObserver viewTreeObserver) {
        this.d = wmVar;
        this.c = viewTreeObserver;
    }
}
