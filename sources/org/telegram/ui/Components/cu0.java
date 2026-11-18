package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cu0 extends wm0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ cu0(int i7, View view) {
        this.d = i7;
        this.e = view;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean a() {
        return i() > 0;
    }

    @Override // org.telegram.ui.Components.wm0
    public final boolean b() {
        return i() < h();
    }

    @Override // org.telegram.ui.Components.wm0
    public final void c(boolean z10) {
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
        if (z10) {
            i7 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i7));
        switch (this.d) {
            case 0:
                ((eu0) this.e).setOption(min);
                break;
            case 1:
                ym0 ym0Var = ((org.telegram.ui.w90) this.e).h;
                float f10 = min / 100.0f;
                ym0Var.y.n(true, f10);
                ym0Var.setProgress(f10);
                break;
            default:
                if (((org.telegram.ui.xq0) this.e).s.Z7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.xq0) this.e).s.Z7 - 1, min))) != ((org.telegram.ui.xq0) this.e).s.Y7) {
                    org.telegram.ui.xq0 xq0Var = (org.telegram.ui.xq0) this.e;
                    xq0Var.r = xq0Var.s.Y7;
                    ((org.telegram.ui.xq0) this.e).s.Y7 = max;
                    ((org.telegram.ui.xq0) this.e).s.L0();
                    ((org.telegram.ui.xq0) this.e).invalidate();
                    int i10 = ((org.telegram.ui.xq0) this.e).s.Y7;
                    org.telegram.ui.xq0 xq0Var2 = (org.telegram.ui.xq0) this.e;
                    if (i10 != xq0Var2.r) {
                        xq0Var2.s.n2(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wm0
    public CharSequence d() {
        switch (this.d) {
            case 0:
                eu0 eu0Var = (eu0) this.e;
                int i7 = eu0Var.J;
                String[] strArr = eu0Var.G;
                if (i7 < strArr.length) {
                    return strArr[i7];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.gd.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.xq0) this.e).s.Z7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.xq0) this.e).s.Y7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.xq0) this.e).s.Z7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.xq0) this.e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.xq0) this.e).n);
                return sb2.toString();
        }
    }

    @Override // org.telegram.ui.Components.wm0
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
                return ((eu0) this.e).G.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.xq0) this.e).s.Z7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((eu0) this.e).J;
            case 1:
                return org.telegram.messenger.pc.c();
            default:
                return ((org.telegram.ui.xq0) this.e).s.Y7;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.M0(2131748676, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.pc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.gd.M0(2131748684, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.gd.M0(2131748683, null));
                } else {
                    sb2.append(org.telegram.messenger.gd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.w90) this.e).setContentDescription(sb2);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
