package fi;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ta;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i41;
import org.telegram.ui.j41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i7, Object obj, Object obj2) {
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
                b4 b4Var = (b4) obj2;
                i9 i9Var = (i9) obj;
                t1 t1Var = b4Var.j3;
                if (t1Var != null) {
                    org.telegram.messenger.g0.r(t1Var);
                    b4Var.j3 = null;
                }
                gz.H(true);
                hi.l3 l3Var = b4Var.r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                mi0 mi0Var = b4Var.b3;
                if (mi0Var == null) {
                    mi0 mi0Var2 = new mi0(2, b4Var.m2, b4Var.getContext(), LaunchActivity.Q(), new i2(4, b4Var.l0));
                    b4Var.b3 = mi0Var2;
                    mi0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    b4Var.addView(b4Var.b3, b4Var.getChildCount() - 1, ja.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    b4Var.b3.setVisibility(8);
                    b4Var.b3.setDelegate(new d3(b4Var));
                    b4Var.b3.p(null, null, true);
                } else {
                    b4Var.bringChildToFront(mi0Var);
                    b4Var.b3.n();
                }
                b4Var.b3.setFragment(LaunchActivity.Q());
                i9Var.s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                b4Var.Z0(true);
                break;
            case 1:
                org.telegram.ui.Components.b0 b0Var = (org.telegram.ui.Components.b0) obj;
                hi.s4 s4Var = ((org.telegram.ui.Components.c0) obj2).n;
                if (s4Var != null) {
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) obj2;
                float f10 = MediaController.B().r0;
                org.telegram.ui.ActionBar.v0 v0Var = y7Var.R1;
                v0Var.e(false, f10);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, v0Var, (org.telegram.ui.ActionBar.e6) obj);
                y7Var.a1(false);
                org.telegram.ui.ActionBar.q0 q0Var = y7Var.P1;
                q0Var.setDimMenu(0.15f);
                q0Var.V(v0Var, null);
                np.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                m60 m60Var = (m60) obj2;
                ((org.telegram.ui.Components.voip.u) obj).run();
                if (m60Var.J) {
                    m60Var.u();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                gj gjVar = photoViewer.T4;
                if (gjVar != null) {
                    if (org.telegram.messenger.g0.g(gjVar.T0)) {
                        new cc(ta.a(photoViewer.F), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.X6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.a9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.tt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i11;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i12) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.X6;
                                    profileActivity2.W3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.X6;
                                    profileActivity2.W3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity.x0 = imageView;
                    profileActivity.W3(0.3f);
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
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.a9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.tt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i10;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i12) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.X6;
                                    profileActivity22.W3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.X6;
                                    profileActivity22.W3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity2.x0 = view2;
                    profileActivity2.W3(0.3f);
                    UndoView undoView2 = profileActivity2.M;
                    if (undoView2 != null) {
                        undoView2.d(1, true);
                    }
                    break;
                }
                break;
            default:
                i41 i41Var = (i41) obj2;
                ng.f fVar = (ng.f) obj;
                j41 j41Var = i41Var.d;
                oz ozVar = i41Var.a;
                if (ozVar.c) {
                    j41Var.f();
                    ArrayList arrayList = j41Var.n;
                    lg.g gVar = j41Var.c;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((i41) arrayList.get(i12)).a.setChecked(false);
                        ((i41) arrayList.get(i12)).b.n = false;
                        if (j41Var.r.c > 0 && i12 < gVar.d.size()) {
                            ((ng.f) gVar.d.get(i12)).n = false;
                        }
                    }
                    ozVar.setChecked(true);
                    fVar.n = true;
                    j41Var.b.z();
                    if (j41Var.r.c > 0) {
                        ((ng.f) gVar.d.get(i41Var.c)).n = true;
                        gVar.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
