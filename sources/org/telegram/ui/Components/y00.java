package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y00 extends ei0 {
    public boolean r;
    public boolean s;
    public final x00 w;
    public final x00 x;
    public final /* synthetic */ FragmentContextView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.ui.Components.x00] */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.telegram.ui.Components.x00] */
    public y00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.y = fragmentContextView;
        final int i10 = 0;
        this.w = new Runnable(this) { // from class: org.telegram.ui.Components.x00
            public final /* synthetic */ y00 b;

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
                            if (fragmentContextView2.E.P(fragmentContextView2.P ? 15 : 29)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        y00 y00Var = this.b;
                        FragmentContextView fragmentContextView3 = y00Var.y;
                        if (y00Var.r && VoIPService.getSharedInstance() != null) {
                            y00Var.r = false;
                            y00Var.s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.i0.h3(y00Var.w, 90L);
                            try {
                                fragmentContextView3.D.performHapticFeedback(3, 2);
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
        this.x = new Runnable(this) { // from class: org.telegram.ui.Components.x00
            public final /* synthetic */ y00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        FragmentContextView fragmentContextView2 = this.b.y;
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setMicMute(false, true, false);
                            if (fragmentContextView2.E.P(fragmentContextView2.P ? 15 : 29)) {
                                if (fragmentContextView2.P) {
                                    fragmentContextView2.E.M(0);
                                } else {
                                    fragmentContextView2.E.M(14);
                                }
                            }
                            fragmentContextView2.D.d();
                            org.telegram.ui.ActionBar.t6.G0().c(true);
                            fragmentContextView2.a.h(true);
                            break;
                        }
                        break;
                    default:
                        y00 y00Var = this.b;
                        FragmentContextView fragmentContextView3 = y00Var.y;
                        if (y00Var.r && VoIPService.getSharedInstance() != null) {
                            y00Var.r = false;
                            y00Var.s = true;
                            fragmentContextView3.P = false;
                            org.telegram.messenger.i0.h3(y00Var.w, 90L);
                            try {
                                fragmentContextView3.D.performHapticFeedback(3, 2);
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
        accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(this.y.P ? 2131743256 : 2131743319, null));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FragmentContextView fragmentContextView = this.y;
        int i10 = fragmentContextView.U;
        if (i10 != 3 && i10 != 1) {
            return super.onTouchEvent(motionEvent);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        x00 x00Var = this.w;
        x00 x00Var2 = this.x;
        if (sharedInstance == null) {
            org.telegram.messenger.i0.r(x00Var2);
            org.telegram.messenger.i0.r(x00Var);
            this.r = false;
            this.s = false;
            return true;
        }
        if (motionEvent.getAction() == 0 && sharedInstance.isMicMute()) {
            org.telegram.messenger.i0.h3(x00Var2, 300L);
            this.r = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            org.telegram.messenger.i0.r(x00Var);
            if (this.r) {
                org.telegram.messenger.i0.r(x00Var2);
                this.r = false;
            } else if (this.s) {
                fragmentContextView.P = true;
                if (fragmentContextView.E.P(15)) {
                    if (fragmentContextView.P) {
                        fragmentContextView.E.M(0);
                    } else {
                        fragmentContextView.E.M(14);
                    }
                }
                fragmentContextView.D.d();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        fragmentContextView.D.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.s = false;
                org.telegram.ui.ActionBar.t6.G0().c(true);
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
