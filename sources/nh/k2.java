package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class k2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int C = 1;
    public sf.h A;
    public Utilities.CallbackReturn B;
    public String b;
    public int c;
    public final e1 d;
    public final f1 e;
    public final g1 f;
    public final j2 h;
    public float n;
    public final boolean r;
    public final boolean s;
    public boolean v;
    public t4 w;
    public float x;
    public Utilities.Callback3Return y;

    public k2(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, c6Var, true, false);
        this.b = null;
        this.c = -1;
        this.d = new e1();
        this.e = new f1();
        this.n = -1.0f;
        this.r = z10;
        this.s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new i1(this, context);
        g1 g1Var = new g1(this, context, 0);
        this.f = g1Var;
        g1Var.b = z10 ? 0 : C;
        g1Var.setAdapter(new h1(this, z10, context));
        this.containerView.addView(g1Var, i7.f6.e(-1, -1, 87));
        new w3(this.containerView, false, new d1(this, 0));
        if (!z10) {
            j2 j2Var = new j2(context);
            this.h = j2Var;
            j2Var.C = new d1(this, 1);
            j2Var.B = g1Var.b;
            j2Var.invalidate();
            this.containerView.addView(j2Var, i7.f6.e(-1, -2, 87));
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

    public static /* synthetic */ void m(k2 k2Var) {
        boolean z10 = k2Var.v;
        boolean z11 = k2Var.keyboardVisible;
        if (z10 != z11) {
            k2Var.v = z11;
            k2Var.container.clearAnimation();
            float f9 = 0.0f;
            if (k2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = k2Var.keyboardHeight;
                f9 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - k2Var.x, (-i11) / 3.0f));
            }
            k2Var.container.animate().translationY(f9).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
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
                if (view instanceof y1) {
                    y1 y1Var = (y1) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((y1Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (y1Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        x1 x1Var = y1Var.c;
                        if (x1Var.D == null) {
                            x1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        o0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.f.getY());
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(Integer num) {
        return true;
    }

    public boolean n0(bg.f fVar) {
        return true;
    }

    public final void o0() {
        d2 d2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
        for (View view : this.f.getViewPages()) {
            if (view instanceof y1) {
                d2 d2Var2 = ((y1) view).f;
                if (d2Var2 != null) {
                    AndroidUtilities.hideKeyboard(d2Var2.d);
                }
            } else if ((view instanceof t1) && (d2Var = ((t1) view).d) != null) {
                AndroidUtilities.hideKeyboard(d2Var.d);
            }
        }
    }

    public final void p0(int i10) {
        if (l0(Integer.valueOf(i10))) {
            if ((i10 != 1 || n0(new bg.f(this, i10, 12))) && ((Boolean) this.B.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void q0(Utilities.CallbackReturn callbackReturn) {
        this.B = callbackReturn;
        for (View view : this.f.getViewPages()) {
            if (view instanceof y1) {
                x1 x1Var = ((y1) view).c;
                if (x1Var.D == null) {
                    x1Var.D(null);
                }
            }
        }
    }
}
