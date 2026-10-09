package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class iw0 extends org.telegram.ui.Components.f91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.f91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((b41) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                ci1 ci1Var = (ci1) obj;
                SparseArray sparseArray = ci1Var.a;
                ai1 ai1Var = (ai1) sparseArray.get(i10);
                if (ai1Var != null) {
                    n2Var = ai1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = ci1Var.V(i10);
                    ai1 ai1Var2 = new ai1(V);
                    sparseArray.put(i10, ai1Var2);
                    n2Var = V;
                    ai1Var = ai1Var2;
                }
                if (!ai1Var.b) {
                    n2Var.onFragmentCreate();
                    ai1Var.b = true;
                }
                n2Var.setParentLayout(ci1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(ci1Var.n, ci1Var.r, ci1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.d(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout);
                ci1Var.checkSystemBarColors();
                ci1Var.U();
                break;
            case 4:
                break;
            default:
                yh.s3 s3Var = (yh.s3) obj;
                if (i11 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var2 = s3Var.c0;
                    if (n2Var2 != null) {
                        t5Var = n2Var2.Y;
                    }
                } else if (i11 == 2) {
                    yh.s3.k1(s3Var, true);
                    xh.n2 n2Var3 = s3Var.d0;
                    if (n2Var3 != null) {
                        t5Var = n2Var3.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.f91
    public final View d(int i10) {
        t5 t5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new m60(this, 22));
                return frameLayout;
            case 1:
                return new b41((c41) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new p41(this, 6));
                return frameLayout2;
            case 3:
                return new w51((Context) this.b, 7);
            case 4:
                return i10 == 0 ? ((tg.a0) this.b).getContainerView() : ((tg.z0) this.c).getContainerView();
            default:
                yh.s3 s3Var = (yh.s3) this.c;
                if (i10 == 0) {
                    yh.s3.k1(s3Var, false);
                    xh.n2 n2Var = s3Var.c0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        yh.s3.k1(s3Var, true);
                        xh.n2 n2Var2 = s3Var.d0;
                        if (n2Var2 != null) {
                            t5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                t5Var = s3Var.Y;
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.f91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ci1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.s3 s3Var = (yh.s3) this.c;
                return (s3Var.M1(true) ? 1 : 0) + (s3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.f91
    public int h(int i10) {
        switch (this.a) {
            case 1:
                return i10 == 0 ? 0 : 1;
            case 2:
            case 3:
            default:
                return super.h(i10);
            case 4:
                return i10;
            case 5:
                return (i10 - (((yh.s3) this.c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public iw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.a = 4;
        this.b = a0Var;
        this.c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
