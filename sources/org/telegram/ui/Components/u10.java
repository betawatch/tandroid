package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u10 extends kj0 {
    public boolean r;
    public boolean s;
    public final t10 v;
    public final t10 w;
    public final /* synthetic */ FragmentContextView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Components.t10] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Components.t10] */
    public u10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.x = fragmentContextView;
        final int i10 = 0;
        this.v = new Runnable(this) { // from class: org.telegram.ui.Components.t10
            public final /* synthetic */ u10 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.b.x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.y.N(fragmentContextView2.L ? 15 : 29)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.y.K(0);
                                } else {
                                    fragmentContextView2.y.K(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        u10 u10Var = this.b;
                        FragmentContextView fragmentContextView3 = u10Var.x;
                        if (u10Var.r && VoIPService.getSharedInstance() != null) {
                            u10Var.r = false;
                            u10Var.s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.w = new Runnable(this) { // from class: org.telegram.ui.Components.t10
            public final /* synthetic */ u10 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.b.x;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.y.N(fragmentContextView2.L ? 15 : 29)) {
                                if (fragmentContextView2.L) {
                                    fragmentContextView2.y.K(0);
                                } else {
                                    fragmentContextView2.y.K(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.k6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        u10 u10Var = this.b;
                        FragmentContextView fragmentContextView3 = u10Var.x;
                        if (u10Var.r && VoIPService.getSharedInstance() != null) {
                            u10Var.r = false;
                            u10Var.s = true;
                            fragmentContextView3.L = false;
                            AndroidUtilities.runOnUIThread(u10Var.v, 90L);
                            try {
                                fragmentContextView3.x.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        accessibilityNodeInfo.setText(LocaleController.getString(this.x.L ? R.string.VoipUnmute : R.string.VoipMute));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.x;
        int i10 = fragmentContextView.Q;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        t10 t10Var = this.v;
        t10 t10Var2 = this.w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(t10Var2);
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(t10Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(t10Var);
            if (this.r) {
                AndroidUtilities.cancelRunOnUIThread(t10Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.L = true;
                if (fragmentContextView.y.N(15)) {
                    if (fragmentContextView.L) {
                        fragmentContextView.y.K(0);
                    } else {
                        fragmentContextView.y.K(14);
                    }
                }
                fragmentContextView.x.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.x.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.s = false;
                org.telegram.ui.ActionBar.k6.D0().c(true);
                fragmentContextView.a.f(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
