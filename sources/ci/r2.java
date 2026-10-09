package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class r2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public hg.h E;
    public Utilities.CallbackReturn F;
    public String b;
    public int c;
    public final f1 d;
    public final g1 e;
    public final h1 f;
    public final q2 h;
    public float n;
    public final boolean r;
    public final boolean s;
    public boolean v;
    public bi.v w;
    public float x;
    public Utilities.Callback3Return y;

    public r2(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(1, context, e6Var, true);
        this.b = null;
        this.c = -1;
        this.d = new f1();
        this.e = new g1();
        this.n = -1.0f;
        this.r = z10;
        this.s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new j1(this, context);
        h1 h1Var = new h1(this, context, 0);
        this.f = h1Var;
        h1Var.b = z10 ? 0 : G;
        h1Var.setAdapter(new i1(this, z10, context));
        this.containerView.addView(h1Var, w7.x5.e(-1, -1, 87));
        new h4(this.containerView, false, new d1(this, 0));
        if (!z10) {
            q2 q2Var = new q2(context);
            this.h = q2Var;
            q2Var.G = new d1(this, 1);
            q2Var.F = h1Var.b;
            q2Var.invalidate();
            this.containerView.addView(q2Var, w7.x5.e(-1, -2, 87));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
        FileLog.disableGson(true);
        if (!z10) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
        }
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(7, false, true, false);
    }

    public static /* synthetic */ void o(r2 r2Var) {
        boolean z10 = r2Var.v;
        boolean z11 = r2Var.keyboardVisible;
        if (z10 != z11) {
            r2Var.v = z11;
            r2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (r2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = r2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - r2Var.x, (-i11) / 3.0f));
            }
            r2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return this.f.getTranslationY() >= ((float) ((int) this.n));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.stickersDidLoad || i10 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f.getViewPages()) {
                if (view instanceof d2) {
                    d2 d2Var = (d2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((d2Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (d2Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        c2 c2Var = d2Var.c;
                        if (c2Var.H == null) {
                            c2Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        p0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.f.getY());
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(Integer num) {
        return true;
    }

    public boolean o0(Runnable runnable) {
        return true;
    }

    public final void p0() {
        k2 k2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
        for (View view : this.f.getViewPages()) {
            if (view instanceof d2) {
                k2 k2Var2 = ((d2) view).f;
                if (k2Var2 != null) {
                    AndroidUtilities.hideKeyboard(k2Var2.d);
                }
            } else if ((view instanceof y1) && (k2Var = ((y1) view).d) != null) {
                AndroidUtilities.hideKeyboard(k2Var.d);
            }
        }
    }

    public final void q0(int i10) {
        if (m0(Integer.valueOf(i10))) {
            if ((i10 != 1 || o0(new ai.p8(this, i10, 4))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void r0(Utilities.CallbackReturn callbackReturn) {
        this.F = callbackReturn;
        for (View view : this.f.getViewPages()) {
            if (view instanceof d2) {
                c2 c2Var = ((d2) view).c;
                if (c2Var.H == null) {
                    c2Var.D(null);
                }
            }
        }
    }
}
