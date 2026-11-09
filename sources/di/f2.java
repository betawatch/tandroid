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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l41;
import org.telegram.ui.m41;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                j4 j4Var = (j4) obj2;
                q9 q9Var = (q9) obj;
                w1 w1Var = j4Var.i3;
                if (w1Var != null) {
                    org.telegram.messenger.g0.r(w1Var);
                    j4Var.i3 = null;
                }
                iz.H(true);
                fi.m3 m3Var = j4Var.q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ji0 ji0Var = j4Var.a3;
                if (ji0Var == null) {
                    ji0 ji0Var2 = new ji0(2, j4Var.l2, j4Var.getContext(), LaunchActivity.Q(), new m2(4, j4Var.k0));
                    j4Var.a3 = ji0Var2;
                    ji0Var2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(22.0f));
                    j4Var.addView(j4Var.a3, j4Var.getChildCount() - 1, ha.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    j4Var.a3.setVisibility(8);
                    j4Var.a3.setDelegate(new i3(j4Var));
                    j4Var.a3.p(null, null, true);
                } else {
                    j4Var.bringChildToFront(ji0Var);
                    j4Var.a3.n();
                }
                j4Var.a3.setFragment(LaunchActivity.Q());
                q9Var.s.dispatchTouchEvent(org.telegram.messenger.g0.R());
                j4Var.Z0(true);
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
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.G8, v0Var, (org.telegram.ui.ActionBar.g6) obj);
                b8Var.a1(false);
                org.telegram.ui.ActionBar.r0 r0Var = b8Var.L1;
                r0Var.setDimMenu(0.15f);
                r0Var.U(v0Var, null);
                qp.f1().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                l60 l60Var = (l60) obj2;
                ((m51) obj).run();
                if (l60Var.J) {
                    l60Var.u();
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
                RectF rectF = ProfileActivity.V6;
                org.telegram.ui.ActionBar.g1 b10 = org.telegram.ui.Components.d9.b(profileActivity, imageView, profileActivity.a(), profileActivity.f1, profileActivity.z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.yt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i11;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i12) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.V6;
                                    profileActivity2.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.V6;
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
                RectF rectF2 = ProfileActivity.V6;
                org.telegram.ui.ActionBar.g1 b11 = org.telegram.ui.Components.d9.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f1, profileActivity2.z0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.yt0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i12 = i10;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i12) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.V6;
                                    profileActivity22.X3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.V6;
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
                l41 l41Var = (l41) obj2;
                ng.f fVar = (ng.f) obj;
                m41 m41Var = l41Var.d;
                lz lzVar = l41Var.a;
                if (lzVar.c) {
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
                    lzVar.setChecked(true);
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
