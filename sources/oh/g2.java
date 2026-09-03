package oh;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;
import org.telegram.ui.x91;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                i9 i9Var = (i9) this.c;
                w1 w1Var = f4Var.w3;
                if (w1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    f4Var.w3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                qh.e3 e3Var = f4Var.E0;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                qk0 qk0Var = f4Var.o3;
                if (qk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    qk0 qk0Var2 = new qk0(2, f4Var.z2, f4Var.getContext(), R, new n2(4, f4Var.y0));
                    f4Var.o3 = qk0Var2;
                    qk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f4Var.addView(f4Var.o3, f4Var.getChildCount() - 1, k7.c6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    f4Var.o3.setVisibility(8);
                    f4Var.o3.setDelegate(new i3(f4Var));
                    f4Var.o3.p(null, null, true);
                } else {
                    f4Var.bringChildToFront(qk0Var);
                    f4Var.o3.n();
                }
                f4Var.o3.setFragment(LaunchActivity.R());
                i9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.b;
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.c;
                org.telegram.ui.Components.i iVar = e0Var.n;
                if (iVar != null) {
                    return ((Boolean) iVar.run(d0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var));
                c8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.S;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                q70 q70Var = (q70) this.b;
                ((q51) this.c).run();
                if (!q70Var.J) {
                    return true;
                }
                q70Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                b bVar = (b) this.c;
                MessageObject messageObject = photoViewer.Q4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new qc(cb.a(photoViewer.B), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.p1 b10 = org.telegram.ui.Components.h9.b(profileActivity, imageView, profileActivity.a(), profileActivity.d1, profileActivity.w0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.g0(profileActivity, 3));
                profileActivity.t0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.J;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                w91 w91Var = (w91) this.b;
                yf.f fVar = (yf.f) this.c;
                x91 x91Var = w91Var.d;
                t00 t00Var = w91Var.a;
                boolean z4 = false;
                if (t00Var.c) {
                    x91Var.f();
                    ArrayList arrayList = x91Var.n;
                    wf.g gVar = x91Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((w91) arrayList.get(i10)).a.setChecked(false);
                        ((w91) arrayList.get(i10)).b.n = false;
                        if (x91Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((yf.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z4 = true;
                    t00Var.setChecked(true);
                    fVar.n = true;
                    x91Var.b.z();
                    if (x91Var.r.c > 0) {
                        ((yf.f) gVar.d.get(w91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z4;
        }
    }
}
