package jh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.y10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t9 extends y10 {
    public final /* synthetic */ int G0 = 0;
    public final a5.e H0;
    public final /* synthetic */ z10 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(oh.g gVar, Activity activity) {
        super(gVar, activity);
        this.I0 = gVar;
        this.H0 = new a5.e();
    }

    @Override // org.telegram.ui.Components.ic0, r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        int i14;
        switch (this.G0) {
            case 0:
                ia iaVar = (ia) this.I0;
                if (viewGroup == iaVar.c && iaVar.N.isAttachedToWindow()) {
                    lVar = ((org.telegram.ui.ActionBar.o2) iaVar).actionBar;
                    boolean z10 = lVar.j0;
                    int top = (((View) iaVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    int bottom = ((View) iaVar.N.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                jl0 currentListView = iaVar.N.getCurrentListView();
                                if ((iaVar.c.getHeight() - iaVar.c.getPaddingBottom()) - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    iaVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            jl0 currentListView2 = iaVar.N.getCurrentListView();
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
                        if ((iaVar.c.getHeight() - iaVar.c.getPaddingBottom()) - bottom >= 0) {
                            jl0 currentListView3 = iaVar.N.getCurrentListView();
                            int L0 = ((f2.j0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                f2.n1 K = currentListView3.K(L0);
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
                oh.g gVar = (oh.g) this.I0;
                if (viewGroup == gVar.c && gVar.N.isAttachedToWindow()) {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    boolean z12 = lVar2.j0;
                    int top3 = (((View) gVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.N.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                jl0 currentListView4 = gVar.N.getCurrentListView();
                                if (gVar.c.getHeight() - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    gVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            jl0 currentListView5 = gVar.N.getCurrentListView();
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
                            jl0 currentListView6 = gVar.N.getCurrentListView();
                            int L02 = ((f2.j0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                f2.n1 K2 = currentListView6.K(L02);
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

    @Override // org.telegram.ui.Components.ic0, r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.G0;
    }

    @Override // org.telegram.ui.Components.ic0, r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.G0) {
            case 0:
                ia iaVar = (ia) this.I0;
                try {
                    if (viewGroup == iaVar.c && iaVar.N.isAttachedToWindow()) {
                        jl0 currentListView = iaVar.N.getCurrentListView();
                        if ((iaVar.c.getHeight() - iaVar.c.getPaddingBottom()) - ((View) iaVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new o(this, 14));
                    return;
                }
                break;
            default:
                oh.g gVar = (oh.g) this.I0;
                try {
                    if (viewGroup == gVar.c && gVar.N.isAttachedToWindow()) {
                        jl0 currentListView2 = gVar.N.getCurrentListView();
                        if (gVar.c.getHeight() - ((View) gVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new nh.m6(this, 12));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ic0, r0.m
    public final void n(int i10, View view) {
        switch (this.G0) {
            case 0:
                this.H0.a = 0;
                break;
            default:
                this.H0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ic0, r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        switch (this.G0) {
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

    @Override // org.telegram.ui.Components.ic0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.G0;
    }

    @Override // org.telegram.ui.Components.ic0, r0.m
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.G0) {
            case 0:
                this.H0.a = i10;
                break;
            default:
                this.H0.a = i10;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(ia iaVar, Activity activity) {
        super(iaVar, activity);
        this.I0 = iaVar;
        this.H0 = new a5.e();
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
