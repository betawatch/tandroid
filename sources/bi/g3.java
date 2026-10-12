package bi;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qa1;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.b;
                sb sbVar = (sb) this.c;
                r2 r2Var = q5Var.z3;
                if (r2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(r2Var);
                    q5Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                di.d4 d4Var = q5Var.H0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                gl0 gl0Var = q5Var.r3;
                if (gl0Var == null) {
                    gl0 gl0Var2 = new gl0(2, q5Var.C2, q5Var.getContext(), LaunchActivity.R(), new n3(4, q5Var.B0));
                    q5Var.r3 = gl0Var2;
                    gl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q5Var.addView(q5Var.r3, q5Var.getChildCount() - 1, w7.a6.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    q5Var.r3.setVisibility(8);
                    q5Var.r3.setDelegate(new n4(q5Var));
                    q5Var.r3.p(null, null, true);
                } else {
                    q5Var.bringChildToFront(gl0Var);
                    q5Var.r3.n();
                }
                q5Var.r3.setFragment(LaunchActivity.R());
                sbVar.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q5Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                di.n5 n5Var = d0Var.n;
                if (n5Var != null) {
                    return ((Boolean) n5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = m8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                m8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                m80 m80Var = (m80) this.b;
                ((k31) this.c).run();
                if (!m80Var.J) {
                    return true;
                }
                m80Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                b bVar = (b) this.c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new zc(org.telegram.ui.Components.nb.a(photoViewer.E), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.m1 b10 = org.telegram.ui.Components.r9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.z0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                profileActivity.w0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                qa1 qa1Var = (qa1) this.b;
                lg.f fVar = (lg.f) this.c;
                ra1 ra1Var = qa1Var.d;
                e10 e10Var = qa1Var.a;
                boolean z10 = false;
                if (e10Var.c) {
                    ra1Var.f();
                    ArrayList arrayList = ra1Var.n;
                    jg.g gVar = ra1Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((qa1) arrayList.get(i10)).a.setChecked(false);
                        ((qa1) arrayList.get(i10)).b.n = false;
                        if (ra1Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    e10Var.setChecked(true);
                    fVar.n = true;
                    ra1Var.b.z();
                    if (ra1Var.r.c > 0) {
                        ((lg.f) gVar.d.get(qa1Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
