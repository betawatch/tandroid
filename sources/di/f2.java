package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k41;
import org.telegram.ui.l41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                i4 i4Var = (i4) obj2;
                p9 p9Var = (p9) obj;
                w1 w1Var = i4Var.i3;
                if (w1Var != null) {
                    org.telegram.messenger.g0.r(w1Var);
                    i4Var.i3 = null;
                }
                iz.H(true);
                fi.m3 m3Var = i4Var.q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ii0 ii0Var = i4Var.a3;
                if (ii0Var == null) {
                    ii0 ii0Var2 = new ii0(2, i4Var.l2, i4Var.getContext(), LaunchActivity.Q(), new m2(4, i4Var.k0));
                    i4Var.a3 = ii0Var2;
                    ii0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    i4Var.addView(i4Var.a3, i4Var.getChildCount() - 1, ha.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    i4Var.a3.setVisibility(8);
                    i4Var.a3.setDelegate(new i3(i4Var));
                    i4Var.a3.p(null, null, true);
                } else {
                    i4Var.bringChildToFront(ii0Var);
                    i4Var.a3.n();
                }
                i4Var.a3.setFragment(LaunchActivity.Q());
                p9Var.s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                i4Var.Z0(true);
                break;
            case 1:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                fi.u4 u4Var = ((org.telegram.ui.Components.f0) obj2).n;
                if (u4Var != null) {
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) obj2;
                float f10 = MediaController.B().q0;
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.N1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, v0Var, (org.telegram.ui.ActionBar.f6) obj);
                b8Var.a1(false);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.L1;
                r0Var.setDimMenu(0.15f);
                r0Var.U(v0Var, null);
                qp.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                k60 k60Var = (k60) obj2;
                ((g51) obj).run();
                if (k60Var.J) {
                    k60Var.u();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                ij ijVar = photoViewer.S4;
                if (ijVar != null) {
                    if (org.telegram.messenger.g0.g(ijVar.R0)) {
                        new hc(xa.a(photoViewer.E), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.S6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.d9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f1, profileActivity.z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.vt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i11;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i12) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.S6;
                                    profileActivity2.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.S6;
                                    profileActivity2.X3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity.w0 = imageView;
                    profileActivity.X3(0.3f);
                    UndoView undoView = profileActivity.L;
                    if (undoView != null) {
                        undoView.d(1, true);
                    }
                    break;
                }
                break;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.d9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f1, profileActivity2.z0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.vt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i10;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i12) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.S6;
                                    profileActivity22.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.S6;
                                    profileActivity22.X3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity2.w0 = view2;
                    profileActivity2.X3(0.3f);
                    UndoView undoView2 = profileActivity2.L;
                    if (undoView2 != null) {
                        undoView2.d(1, true);
                    }
                    break;
                }
                break;
            default:
                k41 k41Var = (k41) obj2;
                ng.f fVar = (ng.f) obj;
                l41 l41Var = k41Var.d;
                kz kzVar = k41Var.a;
                if (kzVar.c) {
                    l41Var.f();
                    ArrayList arrayList = l41Var.n;
                    lg.g gVar = l41Var.c;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((k41) arrayList.get(i12)).a.setChecked(false);
                        ((k41) arrayList.get(i12)).b.n = false;
                        if (l41Var.r.c > 0 && i12 < gVar.d.size()) {
                            ((ng.f) gVar.d.get(i12)).n = false;
                        }
                    }
                    kzVar.setChecked(true);
                    fVar.n = true;
                    l41Var.b.z();
                    if (l41Var.r.c > 0) {
                        ((ng.f) gVar.d.get(k41Var.c)).n = true;
                        gVar.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
