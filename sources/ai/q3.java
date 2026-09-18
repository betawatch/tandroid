package ai;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu;
import org.telegram.ui.ia1;
import org.telegram.ui.ja1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                jc jcVar = (jc) this.c;
                c3 c3Var = f6Var.z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    f6Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.f4 f4Var = f6Var.H0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                qk0 qk0Var = f6Var.r3;
                if (qk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    qk0 qk0Var2 = new qk0(2, f6Var.C2, f6Var.getContext(), R, new x3(4, f6Var.B0));
                    f6Var.r3 = qk0Var2;
                    qk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.r3, f6Var.getChildCount() - 1, w7.y5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f6Var.r3.setVisibility(8);
                    f6Var.r3.setDelegate(new z4(f6Var));
                    f6Var.r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(qk0Var);
                    f6Var.r3.n();
                }
                f6Var.r3.setFragment(LaunchActivity.R());
                jcVar.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                ci.p5 p5Var = d0Var.n;
                if (p5Var != null) {
                    return ((Boolean) p5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = j8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, e6Var));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                w70 w70Var = (w70) this.b;
                ((cu) this.c).run();
                if (!w70Var.J) {
                    return true;
                }
                w70Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                d dVar = (d) this.c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new xc(org.telegram.ui.Components.lb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.z0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                profileActivity.w0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                ia1 ia1Var = (ia1) this.b;
                kg.f fVar = (kg.f) this.c;
                ja1 ja1Var = ia1Var.d;
                s00 s00Var = ia1Var.a;
                boolean z10 = false;
                if (s00Var.c) {
                    ja1Var.f();
                    ArrayList arrayList = ja1Var.n;
                    ig.g gVar = ja1Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ia1) arrayList.get(i10)).a.setChecked(false);
                        ((ia1) arrayList.get(i10)).b.n = false;
                        if (ja1Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    s00Var.setChecked(true);
                    fVar.n = true;
                    ja1Var.b.z();
                    if (ja1Var.r.c > 0) {
                        ((kg.f) gVar.d.get(ia1Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
