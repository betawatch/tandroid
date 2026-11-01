package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xu0 extends mn0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ xu0(int i10, View view) {
        this.d = i10;
        this.e = view;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean a() {
        return i() > 0;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean b() {
        return i() < h();
    }

    @Override // org.telegram.ui.Components.mn0
    public final void c(boolean z10) {
        int i10;
        int max;
        switch (this.d) {
            case 1:
                i10 = 5;
                break;
            default:
                i10 = 1;
                break;
        }
        if (z10) {
            i10 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i10));
        switch (this.d) {
            case 0:
                ((zu0) this.e).setOption(min);
                break;
            case 1:
                on0 on0Var = ((org.telegram.ui.ya0) this.e).h;
                float f7 = min / 100.0f;
                on0Var.y.k(true, f7);
                on0Var.setProgress(f7);
                break;
            default:
                if (((org.telegram.ui.gs0) this.e).s.Z7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.gs0) this.e).s.Z7 - 1, min))) != ((org.telegram.ui.gs0) this.e).s.Y7) {
                    org.telegram.ui.gs0 gs0Var = (org.telegram.ui.gs0) this.e;
                    gs0Var.r = gs0Var.s.Y7;
                    ((org.telegram.ui.gs0) this.e).s.Y7 = max;
                    ((org.telegram.ui.gs0) this.e).s.S0();
                    ((org.telegram.ui.gs0) this.e).invalidate();
                    int i11 = ((org.telegram.ui.gs0) this.e).s.Y7;
                    org.telegram.ui.gs0 gs0Var2 = (org.telegram.ui.gs0) this.e;
                    if (i11 != gs0Var2.r) {
                        gs0Var2.s.s2(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence d() {
        switch (this.d) {
            case 0:
                zu0 zu0Var = (zu0) this.e;
                int i10 = zu0Var.I;
                String[] strArr = zu0Var.F;
                if (i10 < strArr.length) {
                    return strArr[i10];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.dd.L0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.gs0) this.e).s.Z7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.gs0) this.e).s.Y7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.gs0) this.e).s.Z7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.gs0) this.e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.gs0) this.e).n);
                return sb2.toString();
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.d) {
            case 1:
                super.e(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setEnabled(true);
                break;
            default:
                super.e(view, accessibilityNodeInfo);
                break;
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return ((zu0) this.e).F.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.gs0) this.e).s.Z7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((zu0) this.e).I;
            case 1:
                return org.telegram.messenger.tc.c();
            default:
                return ((org.telegram.ui.gs0) this.e).s.Y7;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.dd.L0(2131748878, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.tc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.dd.L0(2131748886, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.dd.L0(2131748885, null));
                } else {
                    sb2.append(org.telegram.messenger.dd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.ya0) this.e).setContentDescription(sb2);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
