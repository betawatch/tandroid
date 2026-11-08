package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class tt0 extends km0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ tt0(int i7, View view) {
        this.d = i7;
        this.e = view;
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean a() {
        return i() > 0;
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean b() {
        return i() < h();
    }

    @Override // org.telegram.ui.Components.km0
    public final void c(boolean z9) {
        int i7;
        int max;
        switch (this.d) {
            case 1:
                i7 = 5;
                break;
            default:
                i7 = 1;
                break;
        }
        if (z9) {
            i7 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i7));
        switch (this.d) {
            case 0:
                ((vt0) this.e).setOption(min);
                break;
            case 1:
                mm0 mm0Var = ((org.telegram.ui.u90) this.e).h;
                float f10 = min / 100.0f;
                mm0Var.y.l(true, f10);
                mm0Var.setProgress(f10);
                break;
            default:
                if (((org.telegram.ui.xq0) this.e).s.Y7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.xq0) this.e).s.Y7 - 1, min))) != ((org.telegram.ui.xq0) this.e).s.X7) {
                    org.telegram.ui.xq0 xq0Var = (org.telegram.ui.xq0) this.e;
                    xq0Var.r = xq0Var.s.X7;
                    ((org.telegram.ui.xq0) this.e).s.X7 = max;
                    ((org.telegram.ui.xq0) this.e).s.L0();
                    ((org.telegram.ui.xq0) this.e).invalidate();
                    int i10 = ((org.telegram.ui.xq0) this.e).s.X7;
                    org.telegram.ui.xq0 xq0Var2 = (org.telegram.ui.xq0) this.e;
                    if (i10 != xq0Var2.r) {
                        xq0Var2.s.m2(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.km0
    public CharSequence d() {
        switch (this.d) {
            case 0:
                vt0 vt0Var = (vt0) this.e;
                int i7 = vt0Var.I;
                String[] strArr = vt0Var.F;
                if (i7 < strArr.length) {
                    return strArr[i7];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.id.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.xq0) this.e).s.Y7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.xq0) this.e).s.X7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.xq0) this.e).s.Y7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.xq0) this.e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.xq0) this.e).n);
                return sb2.toString();
        }
    }

    @Override // org.telegram.ui.Components.km0
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
                return ((vt0) this.e).F.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.xq0) this.e).s.Y7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((vt0) this.e).I;
            case 1:
                return org.telegram.messenger.sc.c();
            default:
                return ((org.telegram.ui.xq0) this.e).s.X7;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131748869, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.sc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.id.M0(2131748877, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.id.M0(2131748876, null));
                } else {
                    sb2.append(org.telegram.messenger.id.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.u90) this.e).setContentDescription(sb2);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
