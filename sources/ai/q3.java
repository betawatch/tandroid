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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.cu;
import org.telegram.ui.da1;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                e6 e6Var = (e6) this.b;
                jc jcVar = (jc) this.c;
                c3 c3Var = e6Var.z3;
                if (c3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    e6Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.e4 e4Var = e6Var.H0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                sk0 sk0Var = e6Var.r3;
                if (sk0Var == null) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    sk0 sk0Var2 = new sk0(2, e6Var.C2, e6Var.getContext(), R, new x3(4, e6Var.B0));
                    e6Var.r3 = sk0Var2;
                    sk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    e6Var.addView(e6Var.r3, e6Var.getChildCount() - 1, w7.z5.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    e6Var.r3.setVisibility(8);
                    e6Var.r3.setDelegate(new z4(e6Var));
                    e6Var.r3.p(null, null, true);
                } else {
                    e6Var.bringChildToFront(sk0Var);
                    e6Var.r3.n();
                }
                e6Var.r3.setFragment(LaunchActivity.R());
                jcVar.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                e6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                ci.o5 o5Var = d0Var.n;
                if (o5Var != null) {
                    return ((Boolean) o5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = j8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var));
                j8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                b80 b80Var = (b80) this.b;
                ((cu) this.c).run();
                if (!b80Var.J) {
                    return true;
                }
                b80Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                d dVar = (d) this.c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new yc(org.telegram.ui.Components.mb.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.o9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.z0);
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
                ca1 ca1Var = (ca1) this.b;
                kg.f fVar = (kg.f) this.c;
                da1 da1Var = ca1Var.d;
                v00 v00Var = ca1Var.a;
                boolean z10 = false;
                if (v00Var.c) {
                    da1Var.f();
                    ArrayList arrayList = da1Var.n;
                    ig.g gVar = da1Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ca1) arrayList.get(i10)).a.setChecked(false);
                        ((ca1) arrayList.get(i10)).b.n = false;
                        if (da1Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    v00Var.setChecked(true);
                    fVar.n = true;
                    da1Var.b.z();
                    if (da1Var.r.c > 0) {
                        ((kg.f) gVar.d.get(ca1Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
