package ci;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d91;
import org.telegram.ui.e91;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                z9 z9Var = (z9) this.c;
                c2 c2Var = p4Var.z3;
                if (c2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    p4Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ei.x3 x3Var = p4Var.H0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                gl0 gl0Var = p4Var.r3;
                if (gl0Var == null) {
                    gl0 gl0Var2 = new gl0(2, p4Var.C2, p4Var.getContext(), LaunchActivity.R(), new s2(4, p4Var.B0));
                    p4Var.r3 = gl0Var2;
                    gl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    p4Var.addView(p4Var.r3, p4Var.getChildCount() - 1, w7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    p4Var.r3.setVisibility(8);
                    p4Var.r3.setDelegate(new p3(p4Var));
                    p4Var.r3.p(null, null, true);
                } else {
                    p4Var.bringChildToFront(gl0Var);
                    p4Var.r3.n();
                }
                p4Var.r3.setFragment(LaunchActivity.R());
                z9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                p4Var.a1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                ei.e5 e5Var = d0Var.n;
                if (e5Var != null) {
                    return ((Boolean) e5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = k8Var.W;
                a1Var.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, a1Var, g6Var);
                k8Var.L0(false);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.U;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                j80 j80Var = (j80) this.b;
                ((ot) this.c).run();
                if (!j80Var.J) {
                    return true;
                }
                j80Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                b bVar = (b) this.c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(lb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.h1, profileActivity.A0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                profileActivity.x0 = imageView;
                profileActivity.J3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView == null) {
                    return true;
                }
                undoView.d(1, true);
                return true;
            default:
                d91 d91Var = (d91) this.b;
                lg.f fVar = (lg.f) this.c;
                e91 e91Var = d91Var.d;
                a10 a10Var = d91Var.a;
                boolean z10 = false;
                if (a10Var.c) {
                    e91Var.f();
                    ArrayList arrayList = e91Var.n;
                    jg.g gVar = e91Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((d91) arrayList.get(i10)).a.setChecked(false);
                        ((d91) arrayList.get(i10)).b.n = false;
                        if (e91Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    a10Var.setChecked(true);
                    fVar.n = true;
                    e91Var.b.z();
                    if (e91Var.r.c > 0) {
                        ((lg.f) gVar.d.get(d91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
