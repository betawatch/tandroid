package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj;
                i iVar = ((f0) obj2).n;
                if (iVar != null) {
                    break;
                }
                break;
            case 1:
                w7 w7Var = (w7) obj2;
                float f7 = MediaController.B().q0;
                org.telegram.ui.ActionBar.x0 x0Var = w7Var.N1;
                x0Var.e(false, f7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, x0Var, (org.telegram.ui.ActionBar.p6) obj);
                w7Var.a1(false);
                org.telegram.ui.ActionBar.t0 t0Var = w7Var.L1;
                t0Var.setDimMenu(0.15f);
                t0Var.U(x0Var, null);
                org.telegram.messenger.vp.e1().edit().putInt("speedhint", -15).apply();
                break;
            case 2:
                z60 z60Var = (z60) obj2;
                ((org.telegram.ui.xs) obj).run();
                if (z60Var.J) {
                    z60Var.u();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                th.b bVar = (th.b) obj;
                org.telegram.messenger.jj jjVar = photoViewer.T4;
                if (jjVar != null) {
                    if (org.telegram.messenger.i0.g(jjVar.R0)) {
                        new cc(ra.a(photoViewer.E), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 4:
                final ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                RectF rectF = ProfileActivity.R6;
                org.telegram.ui.ActionBar.k1 b10 = y8.b(profileActivity, imageView, profileActivity.a(), profileActivity.f1, profileActivity.z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.fv0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i13 = i12;
                            ProfileActivity profileActivity2 = profileActivity;
                            switch (i13) {
                                case 0:
                                    RectF rectF2 = ProfileActivity.R6;
                                    profileActivity2.W3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.R6;
                                    profileActivity2.W3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity.w0 = imageView;
                    profileActivity.W3(0.3f);
                    UndoView undoView = profileActivity.L;
                    if (undoView != null) {
                        undoView.d(1, true);
                    }
                    break;
                }
                break;
            case 5:
                final ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                View view2 = (View) obj;
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.k1 b11 = y8.b(profileActivity2, view2, profileActivity2.a(), profileActivity2.f1, profileActivity2.z0);
                if (b11 != null) {
                    b11.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.fv0
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            int i13 = i11;
                            ProfileActivity profileActivity22 = profileActivity2;
                            switch (i13) {
                                case 0:
                                    RectF rectF22 = ProfileActivity.R6;
                                    profileActivity22.W3(0.0f);
                                    break;
                                default:
                                    RectF rectF3 = ProfileActivity.R6;
                                    profileActivity22.W3(0.0f);
                                    break;
                            }
                        }
                    });
                    profileActivity2.w0 = view2;
                    profileActivity2.W3(0.3f);
                    UndoView undoView2 = profileActivity2.L;
                    if (undoView2 != null) {
                        undoView2.d(1, true);
                    }
                    break;
                }
                break;
            case 6:
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) obj2;
                dg.g gVar = (dg.g) obj;
                org.telegram.ui.e61 e61Var = d61Var.d;
                yz yzVar = d61Var.a;
                if (yzVar.c) {
                    e61Var.f();
                    ArrayList arrayList = e61Var.n;
                    bg.i iVar2 = e61Var.c;
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((org.telegram.ui.d61) arrayList.get(i13)).a.setChecked(false);
                        ((org.telegram.ui.d61) arrayList.get(i13)).b.n = false;
                        if (e61Var.r.c > 0 && i13 < iVar2.d.size()) {
                            ((dg.g) iVar2.d.get(i13)).n = false;
                        }
                    }
                    yzVar.setChecked(true);
                    gVar.n = true;
                    e61Var.b.z();
                    if (e61Var.r.c > 0) {
                        ((dg.g) iVar2.d.get(d61Var.c)).n = true;
                        iVar2.z();
                    }
                    break;
                }
                break;
            default:
                th.z2 z2Var = (th.z2) obj2;
                th.o7 o7Var = (th.o7) obj;
                th.i1 i1Var = z2Var.i3;
                if (i1Var != null) {
                    org.telegram.messenger.i0.r(i1Var);
                    z2Var.i3 = null;
                }
                org.telegram.messenger.tz.H(true);
                vh.p2 p2Var = z2Var.q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                mj0 mj0Var = z2Var.a3;
                if (mj0Var == null) {
                    mj0 mj0Var2 = new mj0(2, z2Var.l2, z2Var.getContext(), LaunchActivity.Q(), new org.telegram.ui.web.a0(5, z2Var.k0));
                    z2Var.a3 = mj0Var2;
                    mj0Var2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(22.0f));
                    z2Var.addView(z2Var.a3, z2Var.getChildCount() - 1, w7.b6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    z2Var.a3.setVisibility(8);
                    z2Var.a3.setDelegate(new th.f2(z2Var));
                    z2Var.a3.p(null, null, true);
                } else {
                    z2Var.bringChildToFront(mj0Var);
                    z2Var.a3.n();
                }
                z2Var.a3.setFragment(LaunchActivity.Q());
                o7Var.s.dispatchTouchEvent(org.telegram.messenger.i0.R());
                z2Var.Z0(true);
                break;
        }
        return true;
    }
}
