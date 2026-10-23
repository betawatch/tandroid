package ai;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.a20;
import org.telegram.ui.b20;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class xc extends a20 {
    public final /* synthetic */ int K0 = 0;
    public final b2.u0 L0;
    public final /* synthetic */ b20 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(fi.g gVar, Activity activity) {
        super(gVar, activity);
        this.M0 = gVar;
        this.L0 = new b2.u0();
    }

    @Override // org.telegram.ui.Components.id0, r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.K0) {
            case 0:
                nd ndVar = (nd) this.M0;
                if (viewGroup == ndVar.c && ndVar.T.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ndVar).actionBar;
                    boolean z10 = kVar.n0;
                    int top = (((View) ndVar.T.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) ndVar.T.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                mm0 currentListView = ndVar.T.getCurrentListView();
                                if ((ndVar.c.getHeight() - ndVar.c.getPaddingBottom()) - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    ndVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            mm0 currentListView2 = ndVar.T.getCurrentListView();
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
                        if ((ndVar.c.getHeight() - ndVar.c.getPaddingBottom()) - bottom >= 0) {
                            mm0 currentListView3 = ndVar.T.getCurrentListView();
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
                if (viewGroup == gVar.c && gVar.T.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) gVar).actionBar;
                    boolean z12 = kVar2.n0;
                    int top3 = (((View) gVar.T.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.T.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                mm0 currentListView4 = gVar.T.getCurrentListView();
                                if (gVar.c.getHeight() - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    gVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            mm0 currentListView5 = gVar.T.getCurrentListView();
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
                            mm0 currentListView6 = gVar.T.getCurrentListView();
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

    @Override // org.telegram.ui.Components.id0, r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.K0;
    }

    @Override // org.telegram.ui.Components.id0, r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.K0) {
            case 0:
                nd ndVar = (nd) this.M0;
                try {
                    if (viewGroup == ndVar.c && ndVar.T.isAttachedToWindow()) {
                        mm0 currentListView = ndVar.T.getCurrentListView();
                        if ((ndVar.c.getHeight() - ndVar.c.getPaddingBottom()) - ((View) ndVar.T.getParent()).getBottom() >= 0) {
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
                    if (viewGroup == gVar.c && gVar.T.isAttachedToWindow()) {
                        mm0 currentListView2 = gVar.T.getCurrentListView();
                        if (gVar.c.getHeight() - ((View) gVar.T.getParent()).getBottom() >= 0) {
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

    @Override // org.telegram.ui.Components.id0, r0.l
    public final void m(int i10, View view) {
        switch (this.K0) {
            case 0:
                this.L0.a = 0;
                break;
            default:
                this.L0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.id0, r0.l
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

    @Override // org.telegram.ui.Components.id0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.K0;
    }

    @Override // org.telegram.ui.Components.id0, r0.l
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
    public xc(nd ndVar, Activity activity) {
        super(ndVar, activity);
        this.M0 = ndVar;
        this.L0 = new b2.u0();
    }

    private final void d0(View view) {
    }

    private final void e0(View view) {
    }

    private final void b0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }

    private final void c0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
