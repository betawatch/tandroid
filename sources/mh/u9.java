package mh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.l20;
import org.telegram.ui.m20;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class u9 extends l20 {
    public final /* synthetic */ int H0 = 0;
    public final c5.e I0;
    public final /* synthetic */ m20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(rh.g gVar, Activity activity) {
        super(gVar, activity);
        this.J0 = gVar;
        this.I0 = new c5.e();
    }

    @Override // org.telegram.ui.Components.qc0, r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.H0) {
            case 0:
                ja jaVar = (ja) this.J0;
                if (viewGroup == jaVar.c && jaVar.O.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.p2) jaVar).actionBar;
                    boolean z4 = kVar.k0;
                    int top = (((View) jaVar.O.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) jaVar.O.getParent()).getBottom();
                    boolean z10 = false;
                    if (i11 >= 0) {
                        if (!z4) {
                            if (i11 > 0) {
                                tl0 currentListView = jaVar.O.getCurrentListView();
                                if ((jaVar.c.getHeight() - jaVar.c.getPaddingBottom()) - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    jaVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            tl0 currentListView2 = jaVar.O.getCurrentListView();
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
                        if ((jaVar.c.getHeight() - jaVar.c.getPaddingBottom()) - bottom >= 0) {
                            tl0 currentListView3 = jaVar.O.getCurrentListView();
                            int L0 = ((f2.j0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                f2.m1 K = currentListView3.K(L0);
                                int top2 = K != null ? K.a.getTop() : -1;
                                int paddingTop = currentListView3.getPaddingTop();
                                if (top2 != paddingTop || L0 != 0) {
                                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView3.scrollBy(0, i11);
                                    z10 = true;
                                }
                            }
                        }
                        if (z4) {
                            if (!z10 && top < 0) {
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
                rh.g gVar = (rh.g) this.J0;
                if (viewGroup == gVar.c && gVar.O.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) gVar).actionBar;
                    boolean z11 = kVar2.k0;
                    int top3 = (((View) gVar.O.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.O.getParent()).getBottom();
                    boolean z12 = false;
                    if (i11 >= 0) {
                        if (!z11) {
                            if (i11 > 0) {
                                tl0 currentListView4 = gVar.O.getCurrentListView();
                                if (gVar.c.getHeight() - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    gVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            tl0 currentListView5 = gVar.O.getCurrentListView();
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
                        if (gVar.c.getHeight() - bottom2 >= 0) {
                            tl0 currentListView6 = gVar.O.getCurrentListView();
                            int L02 = ((f2.j0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                f2.m1 K2 = currentListView6.K(L02);
                                int top4 = K2 != null ? K2.a.getTop() : -1;
                                int paddingTop2 = currentListView6.getPaddingTop();
                                if (top4 != paddingTop2 || L02 != 0) {
                                    iArr[1] = L02 != 0 ? i11 : Math.max(i11, top4 - paddingTop2);
                                    currentListView6.scrollBy(0, i11);
                                    z12 = true;
                                }
                            }
                        }
                        if (z11) {
                            if (!z12 && top3 < 0) {
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

    @Override // org.telegram.ui.Components.qc0, r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.H0;
    }

    @Override // org.telegram.ui.Components.qc0, r0.n
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.H0) {
            case 0:
                ja jaVar = (ja) this.J0;
                try {
                    if (viewGroup == jaVar.c && jaVar.O.isAttachedToWindow()) {
                        tl0 currentListView = jaVar.O.getCurrentListView();
                        if ((jaVar.c.getHeight() - jaVar.c.getPaddingBottom()) - ((View) jaVar.O.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new lh.c3(this, 16));
                    return;
                }
                break;
            default:
                rh.g gVar = (rh.g) this.J0;
                try {
                    if (viewGroup == gVar.c && gVar.O.isAttachedToWindow()) {
                        tl0 currentListView2 = gVar.O.getCurrentListView();
                        if (gVar.c.getHeight() - ((View) gVar.O.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new qh.v9(this, 4));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qc0, r0.m
    public final void o(int i10, View view) {
        switch (this.H0) {
            case 0:
                this.I0.a = 0;
                break;
            default:
                this.I0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.qc0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.H0;
    }

    @Override // org.telegram.ui.Components.qc0, r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.H0) {
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

    @Override // org.telegram.ui.Components.qc0, r0.m
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.H0) {
            case 0:
                this.I0.a = i10;
                break;
            default:
                this.I0.a = i10;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(ja jaVar, Activity activity) {
        super(jaVar, activity);
        this.J0 = jaVar;
        this.I0 = new c5.e();
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
