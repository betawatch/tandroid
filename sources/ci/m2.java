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
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a91;
import org.telegram.ui.b91;
import org.telegram.ui.nt;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                aa aaVar = (aa) this.c;
                d2 d2Var = q4Var.z3;
                if (d2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d2Var);
                    q4Var.z3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ei.x3 x3Var = q4Var.H0;
                if (x3Var != null) {
                    x3Var.e(true);
                }
                cl0 cl0Var = q4Var.r3;
                if (cl0Var == null) {
                    cl0 cl0Var2 = new cl0(2, q4Var.C2, q4Var.getContext(), LaunchActivity.R(), new t2(4, q4Var.B0));
                    q4Var.r3 = cl0Var2;
                    cl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.r3, q4Var.getChildCount() - 1, w7.z5.a(74.0f, 0.0f, 0.0f, 12.0f, 64.0f, -2, 53));
                    q4Var.r3.setVisibility(8);
                    q4Var.r3.setDelegate(new q3(q4Var));
                    q4Var.r3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(cl0Var);
                    q4Var.r3.n();
                }
                q4Var.r3.setFragment(LaunchActivity.R());
                aaVar.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.b1(true);
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
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.a1 a1Var = k8Var.X;
                a1Var.d(playbackSpeed, false);
                a1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, d6Var));
                k8Var.F0(false);
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.V;
                u0Var.setDimMenu(0.15f);
                u0Var.M(a1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                i80 i80Var = (i80) this.b;
                ((nt) this.c).run();
                if (!i80Var.J) {
                    return true;
                }
                i80Var.u();
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
                b10.setOnDismissListener(new org.telegram.ui.f0(profileActivity, 3));
                profileActivity.x0 = imageView;
                profileActivity.H3(0.3f);
                UndoView undoView = profileActivity.M;
                if (undoView == null) {
                    return true;
                }
                undoView.e(1, true);
                return true;
            default:
                a91 a91Var = (a91) this.b;
                lg.f fVar = (lg.f) this.c;
                b91 b91Var = a91Var.d;
                a10 a10Var = a91Var.a;
                boolean z10 = false;
                if (a10Var.c) {
                    b91Var.f();
                    ArrayList arrayList = b91Var.n;
                    jg.g gVar = b91Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((a91) arrayList.get(i10)).a.setChecked(false);
                        ((a91) arrayList.get(i10)).b.n = false;
                        if (b91Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z10 = true;
                    a10Var.setChecked(true);
                    fVar.n = true;
                    b91Var.b.z();
                    if (b91Var.r.c > 0) {
                        ((lg.f) gVar.d.get(a91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z10;
        }
    }
}
