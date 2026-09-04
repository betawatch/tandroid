package ei;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import s4.c0;
import s4.c1;
import zh.m2;
import zh.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f extends q20 {
    public final /* synthetic */ int K0 = 0;
    public final q0 L0;
    public final /* synthetic */ r20 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Activity activity) {
        super(iVar, activity);
        this.M0 = iVar;
        this.L0 = new q0();
    }

    @Override // org.telegram.ui.Components.nc0, r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k kVar;
        int i13;
        k kVar2;
        int i14;
        switch (this.K0) {
            case 0:
                i iVar = (i) this.M0;
                if (viewGroup == iVar.c && iVar.R.isAttachedToWindow()) {
                    kVar = ((n2) iVar).actionBar;
                    boolean z10 = kVar.n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                ll0 currentListView = iVar.R.getCurrentListView();
                                if (iVar.c.getHeight() - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    iVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            ll0 currentListView2 = iVar.R.getCurrentListView();
                            iArr[1] = i11;
                            if (top > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                                currentListView2.scrollBy(0, i13);
                                break;
                            }
                        }
                    } else {
                        if (iVar.c.getHeight() - bottom >= 0) {
                            ll0 currentListView3 = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                c1 K = currentListView3.K(L0);
                                int top2 = K != null ? K.a.getTop() : -1;
                                int paddingTop = currentListView3.getPaddingTop();
                                if (top2 != paddingTop || L0 != 0) {
                                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView3.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                break;
                            } else {
                                iArr[1] = i11;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                v7 v7Var = (v7) this.M0;
                if (viewGroup == v7Var.c && v7Var.R.isAttachedToWindow()) {
                    kVar2 = ((n2) v7Var).actionBar;
                    boolean z12 = kVar2.n0;
                    int top3 = (((View) v7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom2 = ((View) v7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                ll0 currentListView4 = v7Var.R.getCurrentListView();
                                if ((v7Var.c.getHeight() - v7Var.c.getPaddingBottom()) - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    v7Var.c.B0();
                                    break;
                                }
                            }
                        } else {
                            ll0 currentListView5 = v7Var.R.getCurrentListView();
                            iArr[1] = i11;
                            if (top3 > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView5 != null && (i14 = iArr[1]) > 0) {
                                currentListView5.scrollBy(0, i14);
                                break;
                            }
                        }
                    } else {
                        if ((v7Var.c.getHeight() - v7Var.c.getPaddingBottom()) - bottom2 >= 0) {
                            ll0 currentListView6 = v7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                c1 K2 = currentListView6.K(L02);
                                int top4 = K2 != null ? K2.a.getTop() : -1;
                                int paddingTop2 = currentListView6.getPaddingTop();
                                if (top4 != paddingTop2 || L02 != 0) {
                                    iArr[1] = L02 != 0 ? i11 : Math.max(i11, top4 - paddingTop2);
                                    currentListView6.scrollBy(0, i11);
                                    z13 = true;
                                }
                            }
                        }
                        if (z12) {
                            if (!z13 && top3 < 0) {
                                iArr[1] = i11 - Math.max(top3, i11);
                                break;
                            } else {
                                iArr[1] = i11;
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nc0, r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.K0;
    }

    @Override // org.telegram.ui.Components.nc0, r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                i iVar = (i) this.M0;
                try {
                    if (viewGroup == iVar.c && iVar.R.isAttachedToWindow()) {
                        ll0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new nb(this, 8));
                    return;
                }
                break;
            default:
                v7 v7Var = (v7) this.M0;
                try {
                    if (viewGroup == v7Var.c && v7Var.R.isAttachedToWindow()) {
                        ll0 currentListView2 = v7Var.R.getCurrentListView();
                        if ((v7Var.c.getHeight() - v7Var.c.getPaddingBottom()) - ((View) v7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new m2(this, 8));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nc0, r0.l
    public final void n(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.a = 0;
                break;
            default:
                this.L0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.nc0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override // org.telegram.ui.Components.nc0, r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.K0) {
            case 0:
                if (i10 == 2) {
                }
                break;
            default:
                if (i10 == 2) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nc0, r0.l
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.K0) {
            case 0:
                this.L0.a = i10;
                break;
            default:
                this.L0.a = i10;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v7 v7Var, Activity activity) {
        super(v7Var, activity);
        this.M0 = v7Var;
        this.L0 = new q0();
    }

    private final void e0(View view) {
    }

    private final void f0(View view) {
    }

    private final void c0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void d0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
