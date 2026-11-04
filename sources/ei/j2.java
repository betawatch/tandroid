package ei;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a41;
import org.telegram.ui.b41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i3 = this.a;
        final int i10 = 0;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                j4 j4Var = (j4) obj2;
                r9 r9Var = (r9) obj;
                a2 a2Var = j4Var.j3;
                if (a2Var != null) {
                    org.telegram.messenger.g0.r(a2Var);
                    j4Var.j3 = null;
                }
                az.H(true);
                gi.l3 l3Var = j4Var.r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                li0 li0Var = j4Var.b3;
                if (li0Var == null) {
                    li0 li0Var2 = new li0(2, j4Var.m2, j4Var.getContext(), LaunchActivity.Q(), new q2(4, j4Var.l0));
                    j4Var.b3 = li0Var2;
                    li0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    j4Var.addView(j4Var.b3, j4Var.getChildCount() - 1, mf.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    j4Var.b3.setVisibility(8);
                    j4Var.b3.setDelegate(new l3(j4Var));
                    j4Var.b3.p(null, null, true);
                } else {
                    j4Var.bringChildToFront(li0Var);
                    j4Var.b3.n();
                }
                j4Var.b3.setFragment(LaunchActivity.Q());
                r9Var.s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.Z0(true);
                break;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                gi.s4 s4Var = ((org.telegram.ui.Components.d0) obj2).n;
                if (s4Var != null) {
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) obj2;
                float f10 = MediaController.B().r0;
                org.telegram.ui.ActionBar.u0 u0Var = z7Var.O1;
                u0Var.e(false, f10);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, u0Var, (org.telegram.ui.ActionBar.e6) obj);
                z7Var.a1(false);
                org.telegram.ui.ActionBar.q0 q0Var = z7Var.M1;
                q0Var.setDimMenu(0.15f);
                q0Var.U(u0Var, null);
                hp.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                f60 f60Var = (f60) obj2;
                ((p11) obj).run();
                if (f60Var.J) {
                    f60Var.u();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                zi ziVar = photoViewer.U4;
                if (ziVar != null) {
                    if (org.telegram.messenger.g0.g(ziVar.R0)) {
                        new fc(wa.a(photoViewer.F), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.T6;
                org.telegram.ui.ActionBar.f1 b10 = org.telegram.ui.Components.b9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.A0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.mt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i11;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i12) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.T6;
                                    profileActivity2.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.T6;
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
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.ui.ActionBar.f1 b11 = org.telegram.ui.Components.b9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.g1, profileActivity2.A0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.mt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i10;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i12) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.T6;
                                    profileActivity22.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.T6;
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
                a41 a41Var = (a41) obj2;
                og.f fVar = (og.f) obj;
                b41 b41Var = a41Var.d;
                hz hzVar = a41Var.a;
                if (hzVar.c) {
                    b41Var.f();
                    ArrayList arrayList = b41Var.n;
                    mg.g gVar = b41Var.c;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((a41) arrayList.get(i12)).a.setChecked(false);
                        ((a41) arrayList.get(i12)).b.n = false;
                        if (b41Var.r.c > 0 && i12 < gVar.d.size()) {
                            ((og.f) gVar.d.get(i12)).n = false;
                        }
                    }
                    hzVar.setChecked(true);
                    fVar.n = true;
                    b41Var.b.z();
                    if (b41Var.r.c > 0) {
                        ((og.f) gVar.d.get(a41Var.c)).n = true;
                        gVar.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
