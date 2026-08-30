package nh;

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
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p91;
import org.telegram.ui.q91;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f2(int i10, Object obj, Object obj2) {
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
                w1 w1Var = d4Var.w3;
                if (w1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    d4Var.w3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                ph.f3 f3Var = d4Var.E0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                pk0 pk0Var = d4Var.o3;
                if (pk0Var == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    pk0 pk0Var2 = new pk0(2, d4Var.z2, d4Var.getContext(), R, new m2(4, d4Var.y0));
                    d4Var.o3 = pk0Var2;
                    pk0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    d4Var.addView(d4Var.o3, d4Var.getChildCount() - 1, k7.b6.d(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    d4Var.o3.setVisibility(8);
                    d4Var.o3.setDelegate(new h3(d4Var));
                    d4Var.o3.p(null, null, true);
                } else {
                    d4Var.bringChildToFront(pk0Var);
                    d4Var.o3.n();
                }
                d4Var.o3.setFragment(LaunchActivity.R());
                i9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                d4Var.b1(true);
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
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = c8Var.U;
                c1Var.d(playbackSpeed, false);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var));
                c8Var.F0(false);
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.S;
                w0Var.setDimMenu(0.15f);
                w0Var.M(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                return true;
            case 3:
                o70 o70Var = (o70) this.b;
                ((k41) this.c).run();
                if (!o70Var.J) {
                    return true;
                }
                o70Var.u();
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
                p91 p91Var = (p91) this.b;
                xf.f fVar = (xf.f) this.c;
                q91 q91Var = p91Var.d;
                s00 s00Var = p91Var.a;
                boolean z4 = false;
                if (s00Var.c) {
                    q91Var.f();
                    ArrayList arrayList = q91Var.n;
                    vf.g gVar = q91Var.c;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((p91) arrayList.get(i10)).a.setChecked(false);
                        ((p91) arrayList.get(i10)).b.n = false;
                        if (q91Var.r.c > 0 && i10 < gVar.d.size()) {
                            ((xf.f) gVar.d.get(i10)).n = false;
                        }
                    }
                    z4 = true;
                    s00Var.setChecked(true);
                    fVar.n = true;
                    q91Var.b.z();
                    if (q91Var.r.c > 0) {
                        ((xf.f) gVar.d.get(p91Var.c)).n = true;
                        gVar.z();
                    }
                }
                return z4;
        }
    }
}
