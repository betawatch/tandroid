package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class n2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int C = 1;
    public pf.h A;
    public Utilities.CallbackReturn B;
    public String b;
    public int c;
    public final h1 d;
    public final i1 e;
    public final j1 f;
    public final m2 h;
    public float n;
    public final boolean r;
    public final boolean s;
    public boolean v;
    public yf.w0 w;
    public float x;
    public Utilities.Callback3Return y;

    public n2(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context, b6Var, true, false);
        this.b = null;
        this.c = -1;
        this.d = new h1();
        this.e = new i1();
        this.n = -1.0f;
        this.r = z10;
        this.s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new l1(this, context);
        j1 j1Var = new j1(this, context, 0);
        this.f = j1Var;
        j1Var.b = z10 ? 0 : C;
        j1Var.setAdapter(new k1(this, z10, context));
        this.containerView.addView(j1Var, g7.e6.e(-1, -1, 87));
        new b4(this.containerView, false, new e1(this, 0));
        if (!z10) {
            m2 m2Var = new m2(context);
            this.h = m2Var;
            m2Var.C = new e1(this, 1);
            m2Var.B = j1Var.b;
            m2Var.invalidate();
            this.containerView.addView(m2Var, g7.e6.e(-1, -2, 87));
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

    public static /* synthetic */ void m(n2 n2Var) {
        boolean z10 = n2Var.v;
        boolean z11 = n2Var.keyboardVisible;
        if (z10 != z11) {
            n2Var.v = z11;
            n2Var.container.clearAnimation();
            float f10 = 0.0f;
            if (n2Var.keyboardVisible) {
                int i9 = AndroidUtilities.displaySize.y;
                int i10 = n2Var.keyboardHeight;
                f10 = Math.min(0.0f, Math.max(((i9 - i10) * 0.3f) - n2Var.x, (-i10) / 3.0f));
            }
            n2Var.container.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return this.f.getTranslationY() >= ((float) ((int) this.n));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.stickersDidLoad || i9 == NotificationCenter.groupStickersDidLoad) {
            for (View view : this.f.getViewPages()) {
                if (view instanceof b2) {
                    b2 b2Var = (b2) view;
                    if (i9 == NotificationCenter.groupStickersDidLoad || ((b2Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (b2Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        a2 a2Var = b2Var.c;
                        if (a2Var.D == null) {
                            a2Var.D(null);
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
        n0();
        super.dismiss();
        FileLog.disableGson(false);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() <= 0 ? AndroidUtilities.displaySize.y : (int) (this.containerView.getMeasuredHeight() - this.f.getY());
    }

    public boolean k0(Integer num) {
        return true;
    }

    public boolean l0(Integer num) {
        return true;
    }

    public boolean m0(bg.c2 c2Var) {
        return true;
    }

    public final void n0() {
        g2 g2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
        for (View view : this.f.getViewPages()) {
            if (view instanceof b2) {
                g2 g2Var2 = ((b2) view).f;
                if (g2Var2 != null) {
                    AndroidUtilities.hideKeyboard(g2Var2.d);
                }
            } else if ((view instanceof w1) && (g2Var = ((w1) view).d) != null) {
                AndroidUtilities.hideKeyboard(g2Var.d);
            }
        }
    }

    public final void o0(int i9) {
        if (k0(Integer.valueOf(i9))) {
            if ((i9 != 1 || m0(new bg.c2(this, i9, 9))) && ((Boolean) this.B.run(Integer.valueOf(i9))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void p0(Utilities.CallbackReturn callbackReturn) {
        this.B = callbackReturn;
        for (View view : this.f.getViewPages()) {
            if (view instanceof b2) {
                a2 a2Var = ((b2) view).c;
                if (a2Var.D == null) {
                    a2Var.D(null);
                }
            }
        }
    }
}
