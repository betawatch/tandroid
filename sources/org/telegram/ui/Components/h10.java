package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h10 extends ri0 {
    public boolean r;
    public boolean s;
    public final g10 v;
    public final g10 w;
    public final /* synthetic */ FragmentContextView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Components.g10] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Components.g10] */
    public h10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.x = fragmentContextView;
        final int i10 = 0;
        this.v = new Runnable(this) { // from class: org.telegram.ui.Components.g10
            public final /* synthetic */ h10 b;

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
                            if (fragmentContextView2.y.N(fragmentContextView2.K ? 15 : 29)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.y.K(0);
                                } else {
                                    fragmentContextView2.y.K(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        h10 h10Var = this.b;
                        FragmentContextView fragmentContextView3 = h10Var.x;
                        if (h10Var.r && VoIPService.getSharedInstance() != null) {
                            h10Var.r = false;
                            h10Var.s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(h10Var.v, 90L);
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
        this.w = new Runnable(this) { // from class: org.telegram.ui.Components.g10
            public final /* synthetic */ h10 b;

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
                            if (fragmentContextView2.y.N(fragmentContextView2.K ? 15 : 29)) {
                                if (fragmentContextView2.K) {
                                    fragmentContextView2.y.K(0);
                                } else {
                                    fragmentContextView2.y.K(14);
                                }
                            }
                            fragmentContextView2.x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView2.a.f(true);
                            break;
                        }
                        break;
                    default:
                        h10 h10Var = this.b;
                        FragmentContextView fragmentContextView3 = h10Var.x;
                        if (h10Var.r && VoIPService.getSharedInstance() != null) {
                            h10Var.r = false;
                            h10Var.s = true;
                            fragmentContextView3.K = false;
                            AndroidUtilities.runOnUIThread(h10Var.v, 90L);
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
        accessibilityNodeInfo.setText(LocaleController.getString(this.x.K ? R.string.VoipUnmute : R.string.VoipMute));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.x;
        int i10 = fragmentContextView.P;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        g10 g10Var = this.v;
        g10 g10Var2 = this.w;
        if (sharedInstance == null) {
            AndroidUtilities.cancelRunOnUIThread(g10Var2);
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            AndroidUtilities.runOnUIThread(g10Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(g10Var);
            if (this.r) {
                AndroidUtilities.cancelRunOnUIThread(g10Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.K = true;
                if (fragmentContextView.y.N(15)) {
                    if (fragmentContextView.K) {
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
                org.telegram.ui.ActionBar.g6.D0().c(true);
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
