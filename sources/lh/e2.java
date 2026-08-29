package lh;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c91;
import org.telegram.ui.d91;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                i9 i9Var = (i9) this.c;
                v1 v1Var = d4Var.v3;
                if (v1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(v1Var);
                    d4Var.v3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                nh.t3 t3Var = d4Var.D0;
                if (t3Var != null) {
                    t3Var.e(true);
                }
                fk0 fk0Var = d4Var.n3;
                if (fk0Var == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    fk0 fk0Var2 = new fk0(2, d4Var.y2, d4Var.getContext(), R, new l2(4, d4Var.x0));
                    d4Var.n3 = fk0Var2;
                    fk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    d4Var.addView(d4Var.n3, d4Var.getChildCount() - 1, i7.f6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    d4Var.n3.setVisibility(8);
                    d4Var.n3.setDelegate(new g3(d4Var));
                    d4Var.n3.p(null, null, true);
                } else {
                    d4Var.bringChildToFront(fk0Var);
                    d4Var.n3.n();
                }
                d4Var.n3.setFragment(LaunchActivity.R());
                i9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                d4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) this.b;
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.c;
                nh.v4 v4Var = f0Var.n;
                if (v4Var != null) {
                    return ((Boolean) v4Var.run(e0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = g8Var.T;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
                g8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.R;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                j70 j70Var = (j70) this.b;
                ((org.telegram.ui.Components.voip.o) this.c).run();
                if (!j70Var.J) {
                    return true;
                }
                j70Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                b bVar = (b) this.c;
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new tc(hb.a(photoViewer.A), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.l9.b(profileActivity, imageView, profileActivity.a(), profileActivity.c1, profileActivity.v0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.h0(profileActivity, 3));
                profileActivity.s0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.I;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                c91 c91Var = (c91) this.b;
                vf.f fVar = (vf.f) this.c;
                d91 d91Var = c91Var.d;
                o00 o00Var = c91Var.a;
                boolean z10 = false;
                if (o00Var.c) {
                    d91Var.f();
                    ArrayList arrayList = d91Var.n;
                    tf.g gVar = d91Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c91) arrayList.get(i10)).a.setChecked(false);
                        ((c91) arrayList.get(i10)).b.n = false;
                        if (d91Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((vf.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    o00Var.setChecked(true);
                    fVar.n = true;
                    d91Var.b.z();
                    if (d91Var.r.c > 0) {
                        ((vf.f) gVar.d.get(c91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
