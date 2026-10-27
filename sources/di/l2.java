package di;

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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h91;
import org.telegram.ui.i91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                q4 q4Var = (q4) obj2;
                y9 y9Var = (y9) obj;
                c2 c2Var = q4Var.o3;
                if (c2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    q4Var.o3 = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                fi.v3 v3Var = q4Var.w0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                gl0 gl0Var = q4Var.g3;
                if (gl0Var == null) {
                    gl0 gl0Var2 = new gl0(2, q4Var.r2, q4Var.getContext(), LaunchActivity.R(), new s2(4, q4Var.q0));
                    q4Var.g3 = gl0Var2;
                    gl0Var2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    q4Var.addView(q4Var.g3, q4Var.getChildCount() - 1, kb1.h(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    q4Var.g3.setVisibility(8);
                    q4Var.g3.setDelegate(new p3(q4Var));
                    q4Var.g3.p(null, null, true);
                } else {
                    q4Var.bringChildToFront(gl0Var);
                    q4Var.g3.n();
                }
                q4Var.g3.setFragment(LaunchActivity.R());
                y9Var.s.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                q4Var.Z0(true);
                break;
            case 1:
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                fi.d5 d5Var = ((org.telegram.ui.Components.d0) obj2).n;
                if (d5Var != null) {
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj2;
                m8Var.getClass();
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(true);
                org.telegram.ui.ActionBar.c1 c1Var = m8Var.W;
                c1Var.e(playbackSpeed, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, c1Var, (org.telegram.ui.ActionBar.u6) obj);
                m8Var.L0(false);
                org.telegram.ui.ActionBar.w0 w0Var = m8Var.U;
                w0Var.setDimMenu(0.15f);
                w0Var.U(c1Var, null);
                MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", -15).apply();
                break;
            case 3:
                l80 l80Var = (l80) obj2;
                ((d71) obj).run();
                if (l80Var.J) {
                    l80Var.u();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                b bVar = (b) obj;
                MessageObject messageObject = photoViewer.T4;
                if (messageObject != null) {
                    if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
                        new wc(lb.a(photoViewer.E), bVar).k(false).j();
                    }
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                ImageView imageView = (ImageView) obj;
                int i11 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.o1 b10 = org.telegram.ui.Components.q9.b(profileActivity, imageView, profileActivity.a(), profileActivity.g1, profileActivity.z0);
                if (b10 != null) {
                    b10.setOnDismissListener(new org.telegram.ui.e0(profileActivity, 3));
                    profileActivity.w0 = imageView;
                    profileActivity.Q3(0.3f);
                    UndoView undoView = profileActivity.L;
                    if (undoView != null) {
                        undoView.d(1, true);
                    }
                    break;
                }
                break;
            default:
                h91 h91Var = (h91) obj2;
                mg.f fVar = (mg.f) obj;
                i91 i91Var = h91Var.d;
                a10 a10Var = h91Var.a;
                if (a10Var.c) {
                    i91Var.f();
                    ArrayList arrayList = i91Var.n;
                    kg.h hVar = i91Var.c;
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((h91) arrayList.get(i12)).a.setChecked(false);
                        ((h91) arrayList.get(i12)).b.n = false;
                        if (i91Var.r.c > 0 && i12 < hVar.d.size()) {
                            ((mg.f) hVar.d.get(i12)).n = false;
                        }
                    }
                    a10Var.setChecked(true);
                    fVar.n = true;
                    i91Var.b.z();
                    if (i91Var.r.c > 0) {
                        ((mg.f) hVar.d.get(h91Var.c)).n = true;
                        hVar.z();
                    }
                    break;
                }
                break;
        }
        return true;
    }
}
