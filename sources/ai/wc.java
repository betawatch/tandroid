package ai;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.im0;
import org.telegram.ui.x10;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class wc extends x10 {
    public final /* synthetic */ int K0 = 0;
    public final b2.u0 L0;
    public final /* synthetic */ y10 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(fi.g gVar, Activity activity) {
        super(gVar, activity);
        this.M0 = gVar;
        this.L0 = new b2.u0();
    }

    @Override // org.telegram.ui.Components.gd0, r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.K0) {
            case 0:
                md mdVar = (md) this.M0;
                if (viewGroup == mdVar.c && mdVar.R.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) mdVar).actionBar;
                    boolean z10 = kVar.n0;
                    int top = (((View) mdVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) mdVar.R.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                im0 currentListView = mdVar.R.getCurrentListView();
                                if ((mdVar.c.getHeight() - mdVar.c.getPaddingBottom()) - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    mdVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            im0 currentListView2 = mdVar.R.getCurrentListView();
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
                        if ((mdVar.c.getHeight() - mdVar.c.getPaddingBottom()) - bottom >= 0) {
                            im0 currentListView3 = mdVar.R.getCurrentListView();
                            int L0 = ((s4.b0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.b1 K = currentListView3.K(L0);
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
                fi.g gVar = (fi.g) this.M0;
                if (viewGroup == gVar.c && gVar.R.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                    boolean z12 = kVar2.n0;
                    int top3 = (((View) gVar.R.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.R.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                im0 currentListView4 = gVar.R.getCurrentListView();
                                if (gVar.c.getHeight() - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    gVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            im0 currentListView5 = gVar.R.getCurrentListView();
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
                            im0 currentListView6 = gVar.R.getCurrentListView();
                            int L02 = ((s4.b0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                s4.b1 K2 = currentListView6.K(L02);
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

    @Override // org.telegram.ui.Components.gd0, r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.K0;
    }

    @Override // org.telegram.ui.Components.gd0, r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                md mdVar = (md) this.M0;
                try {
                    if (viewGroup == mdVar.c && mdVar.R.isAttachedToWindow()) {
                        im0 currentListView = mdVar.R.getCurrentListView();
                        if ((mdVar.c.getHeight() - mdVar.c.getPaddingBottom()) - ((View) mdVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new a3.d(this, 23));
                    return;
                }
                break;
            default:
                fi.g gVar = (fi.g) this.M0;
                try {
                    if (viewGroup == gVar.c && gVar.R.isAttachedToWindow()) {
                        im0 currentListView2 = gVar.R.getCurrentListView();
                        if (gVar.c.getHeight() - ((View) gVar.R.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    FileLog.e(th3);
                    AndroidUtilities.runOnUIThread(new ei.bc(this, 1));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gd0, r0.l
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

    @Override // org.telegram.ui.Components.gd0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override // org.telegram.ui.Components.gd0, r0.l
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

    @Override // org.telegram.ui.Components.gd0, r0.l
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
    public wc(md mdVar, Activity activity) {
        super(mdVar, activity);
        this.M0 = mdVar;
        this.L0 = new b2.u0();
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
