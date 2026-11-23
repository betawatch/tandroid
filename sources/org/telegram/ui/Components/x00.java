package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x00 extends rh0 {
    public boolean r;
    public boolean s;
    public final w00 w;
    public final w00 x;
    public final /* synthetic */ FragmentContextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Components.w00] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Components.w00] */
    public x00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        final int i7 = 0;
        this.w = new Runnable(this) { // from class: org.telegram.ui.Components.w00
            public final /* synthetic */ x00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.b.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.F.P(fragmentContextView2.Q ? 15 : 29)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        x00 x00Var = this.b;
                        FragmentContextView fragmentContextView3 = x00Var.y;
                        if (x00Var.r && VoIPService.getSharedInstance() != null) {
                            x00Var.r = false;
                            x00Var.s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(x00Var.w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.x = new Runnable(this) { // from class: org.telegram.ui.Components.w00
            public final /* synthetic */ x00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.b.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.F.P(fragmentContextView2.Q ? 15 : 29)) {
                                if (fragmentContextView2.Q) {
                                    fragmentContextView2.F.M(0);
                                } else {
                                    fragmentContextView2.F.M(14);
                                }
                            }
                            fragmentContextView2.E.d();
                            org.telegram.ui.ActionBar.m6.G0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        x00 x00Var = this.b;
                        FragmentContextView fragmentContextView3 = x00Var.y;
                        if (x00Var.r && VoIPService.getSharedInstance() != null) {
                            x00Var.r = false;
                            x00Var.s = true;
                            fragmentContextView3.Q = false;
                            org.telegram.messenger.g0.h3(x00Var.w, 90L);
                            try {
                                fragmentContextView3.E.performHapticFeedback(3, 2);
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
        accessibilityNodeInfo.setText(org.telegram.messenger.hd.N0(this.y.Q ? 2131742985 : 2131743048, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i7 = fragmentContextView.V;
        if (i7 != 3 && i7 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        w00 w00Var = this.w;
        w00 w00Var2 = this.x;
        if (sharedInstance == null) {
            org.telegram.messenger.g0.r(w00Var2);
            org.telegram.messenger.g0.r(w00Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.g0.h3(w00Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.g0.r(w00Var);
            if (this.r) {
                org.telegram.messenger.g0.r(w00Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.Q = true;
                if (fragmentContextView.F.P(15)) {
                    if (fragmentContextView.Q) {
                        fragmentContextView.F.M(0);
                    } else {
                        fragmentContextView.F.M(14);
                    }
                }
                fragmentContextView.E.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.E.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.s = false;
                org.telegram.ui.ActionBar.m6.G0().c(true);
                fragmentContextView.a.h(true);
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
