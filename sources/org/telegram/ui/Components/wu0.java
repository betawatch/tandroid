package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wu0 extends ln0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ wu0(int i10, View view) {
        this.d = i10;
        this.e = view;
    }

    @Override // org.telegram.ui.Components.ln0
    public final boolean a() {
        return i() > 0;
    }

    @Override // org.telegram.ui.Components.ln0
    public final boolean b() {
        return i() < h();
    }

    @Override // org.telegram.ui.Components.ln0
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
                ((yu0) this.e).setOption(min);
                break;
            case 1:
                nn0 nn0Var = ((org.telegram.ui.za0) this.e).h;
                float f7 = min / 100.0f;
                nn0Var.y.k(true, f7);
                nn0Var.setProgress(f7);
                break;
            default:
                if (((org.telegram.ui.hs0) this.e).s.Z7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.hs0) this.e).s.Z7 - 1, min))) != ((org.telegram.ui.hs0) this.e).s.Y7) {
                    org.telegram.ui.hs0 hs0Var = (org.telegram.ui.hs0) this.e;
                    hs0Var.r = hs0Var.s.Y7;
                    ((org.telegram.ui.hs0) this.e).s.Y7 = max;
                    ((org.telegram.ui.hs0) this.e).s.S0();
                    ((org.telegram.ui.hs0) this.e).invalidate();
                    int i11 = ((org.telegram.ui.hs0) this.e).s.Y7;
                    org.telegram.ui.hs0 hs0Var2 = (org.telegram.ui.hs0) this.e;
                    if (i11 != hs0Var2.r) {
                        hs0Var2.s.s2(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ln0
    public CharSequence d() {
        switch (this.d) {
            case 0:
                yu0 yu0Var = (yu0) this.e;
                int i10 = yu0Var.I;
                String[] strArr = yu0Var.F;
                if (i10 < strArr.length) {
                    return strArr[i10];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.cd.L0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.hs0) this.e).s.Z7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.hs0) this.e).s.Y7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.hs0) this.e).s.Z7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.hs0) this.e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.hs0) this.e).n);
                return sb2.toString();
        }
    }

    @Override // org.telegram.ui.Components.ln0
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
                return ((yu0) this.e).F.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.hs0) this.e).s.Z7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((yu0) this.e).I;
            case 1:
                return org.telegram.messenger.sc.c();
            default:
                return ((org.telegram.ui.hs0) this.e).s.Y7;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131748878, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.sc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.cd.L0(2131748886, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.cd.L0(2131748885, null));
                } else {
                    sb2.append(org.telegram.messenger.cd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.za0) this.e).setContentDescription(sb2);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
