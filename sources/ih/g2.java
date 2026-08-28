package ih;

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
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b91;
import org.telegram.ui.c91;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                m9 m9Var = (m9) this.c;
                x1 x1Var = i4Var.v3;
                if (x1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(x1Var);
                    i4Var.v3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                kh.x3 x3Var = i4Var.D0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                uj0 uj0Var = i4Var.n3;
                if (uj0Var == null) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    uj0 uj0Var2 = new uj0(2, i4Var.y2, i4Var.getContext(), R, new n2(4, i4Var.x0));
                    i4Var.n3 = uj0Var2;
                    uj0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    i4Var.addView(i4Var.n3, i4Var.getChildCount() - 1, g7.e6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    i4Var.n3.setVisibility(8);
                    i4Var.n3.setDelegate(new k3(i4Var));
                    i4Var.n3.p(null, null, true);
                } else {
                    i4Var.bringChildToFront(uj0Var);
                    i4Var.n3.n();
                }
                i4Var.n3.setFragment(LaunchActivity.R());
                m9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                i4Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                kh.f5 f5Var = d0Var.n;
                if (f5Var != null) {
                    return ((Boolean) f5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.c8 c8Var = (org.telegram.ui.Components.c8) this.b;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.T;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var));
                c8Var.E0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.R;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                x60 x60Var = (x60) this.b;
                ((p61) this.c).run();
                if (!x60Var.J) {
                    return true;
                }
                x60Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                b bVar = (b) this.c;
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new oc(cb.a(photoViewer.A), bVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.g9.b(profileActivity, imageView, profileActivity.a(), profileActivity.c1, profileActivity.v0);
                if (b10 == null) {
                    return false;
                }
                b10.setOnDismissListener(new org.telegram.ui.g0(profileActivity, 3));
                profileActivity.s0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.I;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                b91 b91Var = (b91) this.b;
                sf.f fVar = (sf.f) this.c;
                c91 c91Var = b91Var.d;
                d00 d00Var = b91Var.a;
                boolean z10 = false;
                if (d00Var.c) {
                    c91Var.f();
                    ArrayList arrayList = c91Var.n;
                    qf.g gVar = c91Var.c;
                    int size = arrayList.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((b91) arrayList.get(i9)).a.setChecked(false);
                        ((b91) arrayList.get(i9)).b.n = false;
                        if (c91Var.r.c > 0 && i9 < gVar.d.size()) {
                            ((sf.f) gVar.d.get(i9)).n = false;
                        }
                    }
                    z10 = true;
                    d00Var.setChecked(true);
                    fVar.n = true;
                    c91Var.b.z();
                    if (c91Var.r.c > 0) {
                        ((sf.f) gVar.d.get(b91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
