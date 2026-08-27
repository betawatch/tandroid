package hh;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.a20;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z9 extends z10 {
    public final /* synthetic */ int G0 = 0;
    public final d5.p H0;
    public final /* synthetic */ a20 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(mh.g gVar, Activity activity) {
        super(gVar, activity);
        this.I0 = gVar;
        this.H0 = new d5.p();
    }

    @Override // org.telegram.ui.Components.xb0, r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        int i14;
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                if (viewGroup == oaVar.c && oaVar.N.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) oaVar).actionBar;
                    boolean z10 = kVar.j0;
                    int top = (((View) oaVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom = ((View) oaVar.N.getParent()).getBottom();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (!z10) {
                            if (i11 > 0) {
                                zk0 currentListView = oaVar.N.getCurrentListView();
                                if ((oaVar.c.getHeight() - oaVar.c.getPaddingBottom()) - bottom >= 0 && currentListView != null && !currentListView.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    oaVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            zk0 currentListView2 = oaVar.N.getCurrentListView();
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
                        if ((oaVar.c.getHeight() - oaVar.c.getPaddingBottom()) - bottom >= 0) {
                            zk0 currentListView3 = oaVar.N.getCurrentListView();
                            int L0 = ((f2.k0) currentListView3.getLayoutManager()).L0();
                            if (L0 != -1) {
                                f2.o1 K = currentListView3.K(L0);
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
                mh.g gVar = (mh.g) this.I0;
                if (viewGroup == gVar.c && gVar.N.isAttachedToWindow()) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                    boolean z12 = kVar2.j0;
                    int top3 = (((View) gVar.N.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    int bottom2 = ((View) gVar.N.getParent()).getBottom();
                    boolean z13 = false;
                    if (i11 >= 0) {
                        if (!z12) {
                            if (i11 > 0) {
                                zk0 currentListView4 = gVar.N.getCurrentListView();
                                if (gVar.c.getHeight() - bottom2 >= 0 && currentListView4 != null && !currentListView4.canScrollVertically(1)) {
                                    iArr[1] = i11;
                                    gVar.c.B0();
                                    break;
                                }
                            }
                        } else {
                            zk0 currentListView5 = gVar.N.getCurrentListView();
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
                            zk0 currentListView6 = gVar.N.getCurrentListView();
                            int L02 = ((f2.k0) currentListView6.getLayoutManager()).L0();
                            if (L02 != -1) {
                                f2.o1 K2 = currentListView6.K(L02);
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

    @Override // org.telegram.ui.Components.xb0, r0.m
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        int i15 = this.G0;
    }

    @Override // org.telegram.ui.Components.xb0, r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        switch (this.G0) {
            case 0:
                oa oaVar = (oa) this.I0;
                try {
                    if (viewGroup == oaVar.c && oaVar.N.isAttachedToWindow()) {
                        zk0 currentListView = oaVar.N.getCurrentListView();
                        if ((oaVar.c.getHeight() - oaVar.c.getPaddingBottom()) - ((View) oaVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                    AndroidUtilities.runOnUIThread(new y9(this, 0));
                    return;
                }
                break;
            default:
                mh.g gVar = (mh.g) this.I0;
                try {
                    if (viewGroup == gVar.c && gVar.N.isAttachedToWindow()) {
                        zk0 currentListView2 = gVar.N.getCurrentListView();
                        if (gVar.c.getHeight() - ((View) gVar.N.getParent()).getBottom() >= 0) {
                            iArr[1] = i13;
                            currentListView2.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new kh.c(this, 28));
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        int i10 = this.G0;
    }

    @Override // org.telegram.ui.Components.xb0, r0.m
    public final void p(int i10, View view) {
        switch (this.G0) {
            case 0:
                this.H0.a = 0;
                break;
            default:
                this.H0.a = 0;
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0, r0.m
    public final boolean q(View view, View view2, int i10, int i11) {
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

    @Override // org.telegram.ui.Components.xb0, r0.m
    public final void t(View view, View view2, int i10, int i11) {
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
    public z9(oa oaVar, Activity activity) {
        super(oaVar, activity);
        this.I0 = oaVar;
        this.H0 = new d5.p();
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
