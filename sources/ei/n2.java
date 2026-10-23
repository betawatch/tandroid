package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public class n2 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static int G = 1;
    public ig.g E;
    public Utilities.CallbackReturn F;
    public String b;
    public int c;
    public final f1 d;
    public final g1 e;
    public final h1 f;
    public final m2 h;
    public float n;
    public final boolean r;
    public final boolean s;
    public boolean v;
    public ai.q w;
    public float x;
    public Utilities.Callback3Return y;

    public n2(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(1, context, d6Var, true);
        this.b = null;
        this.c = -1;
        this.d = new f1();
        this.e = new g1();
        this.n = -1.0f;
        this.r = z10;
        this.s = z11;
        this.useSmoothKeyboard = true;
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        this.occupyNavigationBar = true;
        setUseLightStatusBar(false);
        this.containerView = new j1(this, context);
        h1 h1Var = new h1(this, context, 0);
        this.f = h1Var;
        h1Var.b = z10 ? 0 : G;
        h1Var.setAdapter(new i1(this, z10, context));
        this.containerView.addView(h1Var, w7.z5.e(-1, -1, 87));
        new b4(this.containerView, false, new d1(this, 0));
        if (!z10) {
            m2 m2Var = new m2(context);
            this.h = m2Var;
            m2Var.G = new d1(this, 1);
            m2Var.F = h1Var.b;
            m2Var.invalidate();
            this.containerView.addView(m2Var, w7.z5.e(-1, -2, 87));
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

    public static /* synthetic */ void n(n2 n2Var) {
        boolean z10 = n2Var.v;
        boolean z11 = n2Var.keyboardVisible;
        if (z10 != z11) {
            n2Var.v = z11;
            n2Var.container.clearAnimation();
            float f7 = 0.0f;
            if (n2Var.keyboardVisible) {
                int i10 = AndroidUtilities.displaySize.y;
                int i11 = n2Var.keyboardHeight;
                f7 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - n2Var.x, (-i11) / 3.0f));
            }
            n2Var.container.animate().translationY(f7).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
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
                if (view instanceof b2) {
                    b2 b2Var = (b2) view;
                    if (i10 == NotificationCenter.groupStickersDidLoad || ((b2Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (b2Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        a2 a2Var = b2Var.c;
                        if (a2Var.H == null) {
                            a2Var.D(null);
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
        h2 h2Var;
        this.keyboardVisible = false;
        this.container.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
        for (View view : this.f.getViewPages()) {
            if (view instanceof b2) {
                h2 h2Var2 = ((b2) view).f;
                if (h2Var2 != null) {
                    AndroidUtilities.hideKeyboard(h2Var2.d);
                }
            } else if ((view instanceof v1) && (h2Var = ((v1) view).d) != null) {
                AndroidUtilities.hideKeyboard(h2Var.d);
            }
        }
    }

    public final void q0(int i10) {
        if (m0(Integer.valueOf(i10))) {
            if ((i10 != 1 || o0(new ah.g(this, i10, 7))) && ((Boolean) this.F.run(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void r0(Utilities.CallbackReturn callbackReturn) {
        this.F = callbackReturn;
        for (View view : this.f.getViewPages()) {
            if (view instanceof b2) {
                a2 a2Var = ((b2) view).c;
                if (a2Var.H == null) {
                    a2Var.D(null);
                }
            }
        }
    }
}
