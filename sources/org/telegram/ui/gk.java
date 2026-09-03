package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.l81 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.l81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.Q) {
            case 0:
                jk jkVar = ((zn) this.R).m1;
                return jkVar != null && jkVar.b > 0.5f;
            case 7:
                ph.e8 e8Var = (ph.e8) this.R;
                View currentView = e8Var.b.getCurrentView();
                if (!(currentView instanceof ph.y7)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    e8Var.f1();
                    return true;
                }
                ph.y7 y7Var = (ph.y7) currentView;
                ArrayList arrayList = y7Var.I;
                org.telegram.ui.Components.rl0 rl0Var = y7Var.f;
                if (y7Var.a == 0 && motionEvent != null && (E = rl0Var.E(motionEvent.getX(), motionEvent.getY() - y7Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    ph.o7 o7Var = (ph.o7) arrayList.get(R);
                    if (o7Var.a == 3 && !o7Var.n) {
                        boolean z4 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z4 ? x10 > AndroidUtilities.dp(100.0f) : x10 < y7Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = o7Var.i;
                            if (i10 != -1) {
                                e8Var.J = i10;
                                if (i10 == 3) {
                                    if (!e8Var.n.isEmpty() && !e8Var.r.isEmpty()) {
                                        e8Var.K = i10;
                                    }
                                } else if (i10 != 4) {
                                    e8Var.K = i10;
                                } else if (!e8Var.d.isEmpty() && !e8Var.e.isEmpty()) {
                                    e8Var.K = i10;
                                }
                                y7Var.f(true);
                                y7Var.e(true);
                            }
                            if (i10 != -1) {
                                e8Var.f1();
                            }
                            return i10 == -1;
                        }
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                }
                if (i10 != -1) {
                }
                if (i10 == -1) {
                }
                break;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public boolean j(MotionEvent motionEvent) {
        switch (this.Q) {
            case 8:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public boolean k(MotionEvent motionEvent) {
        switch (this.Q) {
            case 3:
                return false;
            case 8:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                oa1.Y((oa1) this.R);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void t(View view, View view2, int i10, int i11) {
        boolean z4;
        switch (this.Q) {
            case 7:
                ph.e8 e8Var = (ph.e8) this.R;
                z4 = ((org.telegram.ui.ActionBar.g3) e8Var).keyboardVisible;
                if (z4) {
                    e8Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void u() {
        switch (this.Q) {
            case 4:
                oa1 oa1Var = (oa1) this.R;
                oa1Var.m0(oa1Var.f0.getCurrentPosition(), true);
                oa1Var.n0(0.0f, false);
                oa1.W(oa1Var);
                break;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((sh.i0) this.R).v.d.V2.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void v() {
        o31 o31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof p31) && (o31Var = ((p31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(o31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.Q) {
            case 0:
                zn znVar = (zn) this.R;
                znVar.U0.getClass();
                znVar.U0.getClass();
                znVar.l7();
                znVar.q9(1);
                break;
            case 1:
                np0 np0Var = (np0) this.R;
                float positionAnimated = np0Var.F.getPositionAnimated();
                np0Var.J.setSelected(positionAnimated);
                np0Var.e.setProgressToGradient(1.0f - k7.n.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                np0Var.G0();
                hp0 C0 = np0Var.C0();
                ph.d dVar = np0Var.N;
                if (dVar != null && C0 != null && C0 != np0Var.O) {
                    np0Var.O = C0;
                    n7.qa qaVar = C0.e;
                    dVar.g((CharSequence) qaVar.b, true, true);
                    np0Var.N.f((SpannableStringBuilder) qaVar.c, true);
                }
                np0Var.D0(1);
                break;
            case 2:
                ((yv0) this.R).e();
                break;
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.g3) ((q31) this.R)).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                oa1 oa1Var = (oa1) this.R;
                float positionAnimated2 = oa1Var.f0.getPositionAnimated();
                oa1Var.n0(positionAnimated2, !z4);
                if (!z4) {
                    oa1Var.m0(Math.round(positionAnimated2), true);
                }
                oa1.W(oa1Var);
                oa1.Y(oa1Var);
                break;
            case 5:
                ((yd1) this.R).e();
                break;
            case 6:
                ph.y1 y1Var = (ph.y1) this.R;
                gk gkVar = y1Var.f;
                ph.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = gkVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup2.invalidate();
                invalidate();
                ph.y1.D = gkVar.getCurrentPosition();
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) ((ph.e8) this.R)).containerView;
                viewGroup3.invalidate();
                break;
            default:
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) ((sh.i0) this.R)).containerView;
                viewGroup4.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void z(int i10) {
        switch (this.Q) {
            case 0:
                if (i10 == 0) {
                    zn znVar = (zn) this.R;
                    if (znVar.p1) {
                        znVar.p1 = false;
                        znVar.n1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(Context context, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(context, f6Var);
        this.Q = 0;
        this.R = znVar;
    }
}
