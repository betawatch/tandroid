package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l41;
import org.telegram.ui.m41;
import org.telegram.ui.vs;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z1(int i7, Object obj, Object obj2) {
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
                z3 z3Var = (z3) obj2;
                f9 f9Var = (f9) obj;
                r1 r1Var = z3Var.j3;
                if (r1Var != null) {
                    org.telegram.messenger.g0.r(r1Var);
                    z3Var.j3 = null;
                }
                bz.H(true);
                hi.m3 m3Var = z3Var.r0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                vi0 vi0Var = z3Var.b3;
                if (vi0Var == null) {
                    vi0 vi0Var2 = new vi0(2, z3Var.m2, z3Var.getContext(), LaunchActivity.Q(), new g2(4, z3Var.l0));
                    z3Var.b3 = vi0Var2;
                    vi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    z3Var.addView(z3Var.b3, z3Var.getChildCount() - 1, ma.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z3Var.b3.setVisibility(8);
                    z3Var.b3.setDelegate(new b3(z3Var));
                    z3Var.b3.p(null, null, true);
                } else {
                    z3Var.bringChildToFront(vi0Var);
                    z3Var.b3.n();
                }
                z3Var.b3.setFragment(LaunchActivity.Q());
                f9Var.s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                z3Var.Z0(true);
                break;
            case 1:
                org.telegram.ui.Components.k0 k0Var = (org.telegram.ui.Components.k0) obj;
                hi.q4 q4Var = ((org.telegram.ui.Components.l0) obj2).w;
                if (q4Var != null) {
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) obj2;
                float f10 = MediaController.B().r0;
                org.telegram.ui.ActionBar.v0 v0Var = g8Var.R1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, v0Var, (org.telegram.ui.ActionBar.i6) obj);
                g8Var.b1(false);
                org.telegram.ui.ActionBar.r0 r0Var = g8Var.P1;
                r0Var.setDimMenu(0.15f);
                r0Var.V(v0Var, null);
                mp.h1().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                y60 y60Var = (y60) obj2;
                ((vs) obj).run();
                if (y60Var.J) {
                    y60Var.v();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                fj fjVar = photoViewer.T4;
                if (fjVar != null) {
                    if (org.telegram.messenger.g0.g(fjVar.T0)) {
                        new lc(cb.a(photoViewer.F), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.h1 b10 = org.telegram.ui.Components.i9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.xt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i11;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i12) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.Z6;
                                    profileActivity2.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    profileActivity2.X3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity.x0 = imageView;
                    profileActivity.X3(0.3f);
                    UndoView undoView = profileActivity.M;
                    if (undoView != null) {
                        undoView.d(1, true);
                    }
                    break;
                }
                break;
            case 6:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.ui.ActionBar.h1 b11 = org.telegram.ui.Components.i9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.xt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i10;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i12) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.Z6;
                                    profileActivity22.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.Z6;
                                    profileActivity22.X3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity2.x0 = view2;
                    profileActivity2.X3(0.3f);
                    UndoView undoView2 = profileActivity2.M;
                    if (undoView2 != null) {
                        undoView2.d(1, true);
                    }
                    break;
                }
                break;
            default:
                l41 l41Var = (l41) obj2;
                ng.f fVar = (ng.f) obj;
                m41 m41Var = l41Var.d;
                vz vzVar = l41Var.a;
                if (vzVar.c) {
                    m41Var.f();
                    ArrayList arrayList = m41Var.n;
                    lg.g gVar = m41Var.c;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((l41) arrayList.get(i12)).a.setChecked(false);
                        ((l41) arrayList.get(i12)).b.n = false;
                        if (m41Var.r.c > 0 && i12 < gVar.d.size()) {
                            ((ng.f) gVar.d.get(i12)).n = false;
                        }
                    }
                    vzVar.setChecked(true);
                    fVar.n = true;
                    m41Var.b.z();
                    if (m41Var.r.c > 0) {
                        ((ng.f) gVar.d.get(l41Var.c)).n = true;
                        gVar.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
