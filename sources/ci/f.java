package ci;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.r20;
import org.telegram.ui.s20;
import s4.c0;
import s4.c1;
import xh.x;
import xh.z7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f extends r20 {
    public final /* synthetic */ int K0 = 0;
    public final q0 L0;
    public final /* synthetic */ s20 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Activity activity) {
        super(jVar, activity);
        this.M0 = jVar;
        this.L0 = new q0();
    }

    @Override // org.telegram.ui.Components.vc0, r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        l lVar;
        int i13;
        l lVar2;
        int i14;
        switch (this.K0) {
            case 0:
                j jVar = (j) this.M0;
                if (viewGroup == jVar.c && jVar.R.isAttachedToWindow()) {
                    lVar = ((p2) jVar).actionBar;
                    boolean z10 = lVar.n0;
                    int top = (((View) jVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom = ((View) jVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                vl0 currentListView = jVar.R.getCurrentListView();
                                if (jVar.c.getHeight() - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    jVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            vl0 currentListView2 = jVar.R.getCurrentListView();
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
                        if (jVar.c.getHeight() - bottom >= 0) {
                            vl0 currentListView3 = jVar.R.getCurrentListView();
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
                z7 z7Var = (z7) this.M0;
                if (viewGroup == z7Var.c && z7Var.R.isAttachedToWindow()) {
                    lVar2 = ((p2) z7Var).actionBar;
                    boolean z12 = lVar2.n0;
                    int top3 = (((View) z7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - l.getCurrentActionBarHeight();
                    int bottom2 = ((View) z7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                vl0 currentListView4 = z7Var.R.getCurrentListView();
                                if ((z7Var.c.getHeight() - z7Var.c.getPaddingBottom()) - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    z7Var.c.B0();
                                    break;
                                }
                            }
                        } else {
                            vl0 currentListView5 = z7Var.R.getCurrentListView();
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
                        if ((z7Var.c.getHeight() - z7Var.c.getPaddingBottom()) - bottom2 >= 0) {
                            vl0 currentListView6 = z7Var.R.getCurrentListView();
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

    @Override // org.telegram.ui.Components.vc0, r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.K0;
    }

    @Override // org.telegram.ui.Components.vc0, r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                j jVar = (j) this.M0;
                try {
                    if (viewGroup == jVar.c && jVar.R.isAttachedToWindow()) {
                        vl0 currentListView = jVar.R.getCurrentListView();
                        if (jVar.c.getHeight() - ((View) jVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new wc(this, 8));
                    return;
                }
                break;
            default:
                z7 z7Var = (z7) this.M0;
                try {
                    if (viewGroup == z7Var.c && z7Var.R.isAttachedToWindow()) {
                        vl0 currentListView2 = z7Var.R.getCurrentListView();
                        if ((z7Var.c.getHeight() - z7Var.c.getPaddingBottom()) - ((View) z7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new x(this, 12));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.vc0, r0.l
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

    @Override // org.telegram.ui.Components.vc0, r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
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

    @Override // org.telegram.ui.Components.vc0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override // org.telegram.ui.Components.vc0, r0.l
    public final void r(View view, View view2, int i10, int i11) {
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
    public f(z7 z7Var, Activity activity) {
        super(z7Var, activity);
        this.M0 = z7Var;
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
