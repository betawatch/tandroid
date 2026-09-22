package di;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import s4.c0;
import s4.c1;
import yh.s2;
import yh.w7;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class f extends q20 {
    public final /* synthetic */ int J0 = 0;
    public final q0 K0;
    public final /* synthetic */ r20 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Activity activity) {
        super(iVar, activity);
        this.L0 = iVar;
        this.K0 = new q0();
    }

    @Override // org.telegram.ui.Components.xc0, r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k kVar;
        int i13;
        k kVar2;
        int i14;
        switch (this.J0) {
            case 0:
                i iVar = (i) this.L0;
                if (viewGroup == iVar.c && iVar.R.isAttachedToWindow()) {
                    kVar = ((n2) iVar).actionBar;
                    boolean z10 = kVar.n0;
                    int top = (((View) iVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom = ((View) iVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                yl0 currentListView = iVar.R.getCurrentListView();
                                if (iVar.c.getHeight() - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    iVar.c.C0();
                                    break;
                                }
                            }
                        } else {
                            yl0 currentListView2 = iVar.R.getCurrentListView();
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
                            yl0 currentListView3 = iVar.R.getCurrentListView();
                            int L0 = ((c0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                c1 L = currentListView3.L(L0);
                                int top2 = L != null ? L.a.getTop() : -1;
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
                w7 w7Var = (w7) this.L0;
                if (viewGroup == w7Var.c && w7Var.R.isAttachedToWindow()) {
                    kVar2 = ((n2) w7Var).actionBar;
                    boolean z12 = kVar2.n0;
                    int top3 = (((View) w7Var.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - k.getCurrentActionBarHeight();
                    int bottom2 = ((View) w7Var.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                yl0 currentListView4 = w7Var.R.getCurrentListView();
                                if ((w7Var.c.getHeight() - w7Var.c.getPaddingBottom()) - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    w7Var.c.C0();
                                    break;
                                }
                            }
                        } else {
                            yl0 currentListView5 = w7Var.R.getCurrentListView();
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
                        if ((w7Var.c.getHeight() - w7Var.c.getPaddingBottom()) - bottom2 >= 0) {
                            yl0 currentListView6 = w7Var.R.getCurrentListView();
                            int L02 = ((c0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                c1 L2 = currentListView6.L(L02);
                                int top4 = L2 != null ? L2.a.getTop() : -1;
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

    @Override // org.telegram.ui.Components.xc0, r0.l
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.J0;
    }

    @Override // org.telegram.ui.Components.xc0, r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.J0) {
            case 0:
                i iVar = (i) this.L0;
                try {
                    if (viewGroup == iVar.c && iVar.R.isAttachedToWindow()) {
                        yl0 currentListView = iVar.R.getCurrentListView();
                        if (iVar.c.getHeight() - ((View) iVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new uc(this, 4));
                    return;
                }
                break;
            default:
                w7 w7Var = (w7) this.L0;
                try {
                    if (viewGroup == w7Var.c && w7Var.R.isAttachedToWindow()) {
                        yl0 currentListView2 = w7Var.R.getCurrentListView();
                        if ((w7Var.c.getHeight() - w7Var.c.getPaddingBottom()) - ((View) w7Var.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new s2(this, 6));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.xc0, r0.l
    public final void o(int i10, View view) {
        switch (this.J0) {
            case 0:
                this.K0.a = 0;
                break;
            default:
                this.K0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.xc0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.J0;
    }

    @Override // org.telegram.ui.Components.xc0, r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.J0) {
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

    @Override // org.telegram.ui.Components.xc0, r0.l
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.J0) {
            case 0:
                this.K0.a = i10;
                break;
            default:
                this.K0.a = i10;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w7 w7Var, Activity activity) {
        super(w7Var, activity);
        this.L0 = w7Var;
        this.K0 = new q0();
    }

    private final void c0(View view) {
    }

    private final void d0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
