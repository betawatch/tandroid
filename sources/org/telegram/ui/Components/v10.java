package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class v10 extends nj0 {
    public boolean r;
    public boolean s;
    public final u10 v;
    public final u10 w;
    public final /* synthetic */ FragmentContextView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Components.u10] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Components.u10] */
    public v10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.x = fragmentContextView;
        final int i10 = 0;
        this.v = new Runnable(this) { // from class: org.telegram.ui.Components.u10
            public final /* synthetic */ v10 b;

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
                            if (fragmentContextView2.y.P(fragmentContextView2.O ? 15 : 29)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.y.M(0);
                                } else {
                                    fragmentContextView2.y.M(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        v10 v10Var = this.b;
                        FragmentContextView fragmentContextView3 = v10Var.x;
                        if (v10Var.r && VoIPService.getSharedInstance() != null) {
                            v10Var.r = false;
                            v10Var.s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
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
        this.w = new Runnable(this) { // from class: org.telegram.ui.Components.u10
            public final /* synthetic */ v10 b;

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
                            if (fragmentContextView2.y.P(fragmentContextView2.O ? 15 : 29)) {
                                if (fragmentContextView2.O) {
                                    fragmentContextView2.y.M(0);
                                } else {
                                    fragmentContextView2.y.M(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        v10 v10Var = this.b;
                        FragmentContextView fragmentContextView3 = v10Var.x;
                        if (v10Var.r && VoIPService.getSharedInstance() != null) {
                            v10Var.r = false;
                            v10Var.s = true;
                            fragmentContextView3.O = false;
                            AndroidUtilities.runOnUIThread(v10Var.v, 90L);
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
        accessibilityNodeInfo.setText(LocaleController.getString(this.x.O ? R.string.VoipUnmute : R.string.VoipMute));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.x;
        int i10 = fragmentContextView.T;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        u10 u10Var = this.v;
        u10 u10Var2 = this.w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(u10Var2);
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(u10Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(u10Var);
            if (this.r) {
                AndroidUtilities.cancelRunOnUIThread(u10Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.O = true;
                if (fragmentContextView.y.P(15)) {
                    if (fragmentContextView.O) {
                        fragmentContextView.y.M(0);
                    } else {
                        fragmentContextView.y.M(14);
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
                org.telegram.ui.ActionBar.h6.D0().c(true);
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
