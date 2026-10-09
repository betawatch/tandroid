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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ka1;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                kc kcVar = (kc) this.c;
                d3 d3Var = f6Var.z3;
                if (d3Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d3Var);
                    f6Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ci.d4 d4Var = f6Var.H0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                kl0 kl0Var = f6Var.r3;
                if (kl0Var == null) {
                    kl0 kl0Var2 = new kl0(2, f6Var.C2, f6Var.getContext(), LaunchActivity.R(), new y3(4, f6Var.B0));
                    f6Var.r3 = kl0Var2;
                    kl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    f6Var.addView(f6Var.r3, f6Var.getChildCount() - 1, w7.x5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    f6Var.r3.setVisibility(8);
                    f6Var.r3.setDelegate(new a5(f6Var));
                    f6Var.r3.p(null, null, true);
                } else {
                    f6Var.bringChildToFront(kl0Var);
                    f6Var.r3.n();
                }
                f6Var.r3.setFragment(LaunchActivity.R());
                kcVar.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                f6Var.b1(true);
                return true;
            case 1:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) this.c;
                ci.n5 n5Var = d0Var.n;
                if (n5Var != null) {
                    return ((Boolean) n5Var.run(c0Var)).booleanValue();
                }
                return false;
            case 2:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.b1 b1Var = l8Var.X;
                b1Var.d(playbackSpeed, false);
                b1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, e6Var));
                l8Var.F0(false);
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.V;
                v0Var.setDimMenu(0.15f);
                v0Var.M(b1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                p80 p80Var = (p80) this.b;
                ((ea1) this.c).run();
                if (!p80Var.J) {
                    return true;
                }
                p80Var.u();
                return true;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                d dVar = (d) this.c;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                    new ad(org.telegram.ui.Components.ob.a(photoViewer.E), dVar).k(false).j();
                }
                return true;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                ImageView imageView = (ImageView) this.c;
                org.telegram.ui.ActionBar.n1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.z0);
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
                ka1 ka1Var = (ka1) this.b;
                kg.f fVar = (kg.f) this.c;
                la1 la1Var = ka1Var.d;
                i10 i10Var = ka1Var.a;
                boolean z10 = false;
                if (i10Var.c) {
                    la1Var.f();
                    ArrayList arrayList = la1Var.n;
                    ig.g gVar = la1Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ka1) arrayList.get(i10)).a.setChecked(false);
                        ((ka1) arrayList.get(i10)).b.n = false;
                        if (la1Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    i10Var.setChecked(true);
                    fVar.n = true;
                    la1Var.b.z();
                    if (la1Var.r.c > 0) {
                        ((kg.f) gVar.d.get(ka1Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
