package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class st0 extends nm0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public /* synthetic */ st0(int i3, View view) {
        this.d = i3;
        this.e = view;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean a() {
        return i() > 0;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean b() {
        return i() < h();
    }

    @Override // org.telegram.ui.Components.nm0
    public final void c(boolean z10) {
        int i3;
        int max;
        switch (this.d) {
            case 1:
                i3 = 5;
                break;
            default:
                i3 = 1;
                break;
        }
        if (z10) {
            i3 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i3));
        switch (this.d) {
            case 0:
                ((ut0) this.e).setOption(min);
                break;
            case 1:
                pm0 pm0Var = ((org.telegram.ui.r90) this.e).h;
                float f10 = min / 100.0f;
                pm0Var.y.k(true, f10);
                pm0Var.setProgress(f10);
                break;
            default:
                if (((org.telegram.ui.nq0) this.e).s.a8 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.nq0) this.e).s.a8 - 1, min))) != ((org.telegram.ui.nq0) this.e).s.Z7) {
                    org.telegram.ui.nq0 nq0Var = (org.telegram.ui.nq0) this.e;
                    nq0Var.r = nq0Var.s.Z7;
                    ((org.telegram.ui.nq0) this.e).s.Z7 = max;
                    ((org.telegram.ui.nq0) this.e).s.S0();
                    ((org.telegram.ui.nq0) this.e).invalidate();
                    int i10 = ((org.telegram.ui.nq0) this.e).s.Z7;
                    org.telegram.ui.nq0 nq0Var2 = (org.telegram.ui.nq0) this.e;
                    if (i10 != nq0Var2.r) {
                        nq0Var2.s.s2(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public CharSequence d() {
        switch (this.d) {
            case 0:
                ut0 ut0Var = (ut0) this.e;
                int i3 = ut0Var.J;
                String[] strArr = ut0Var.G;
                if (i3 < strArr.length) {
                    return strArr[i3];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.bd.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.nq0) this.e).s.a8 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.nq0) this.e).s.Z7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.nq0) this.e).s.a8);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.nq0) this.e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.nq0) this.e).n);
                return sb2.toString();
        }
    }

    @Override // org.telegram.ui.Components.nm0
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
                return ((ut0) this.e).G.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.nq0) this.e).s.a8 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((ut0) this.e).J;
            case 1:
                return org.telegram.messenger.lc.c();
            default:
                return ((org.telegram.ui.nq0) this.e).s.Z7;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131748876, null));
                sb2.append(", ");
                int c2 = org.telegram.messenger.lc.c();
                if (c2 <= 0) {
                    sb2.append(org.telegram.messenger.bd.M0(2131748884, null));
                } else if (c2 >= 100) {
                    sb2.append(org.telegram.messenger.bd.M0(2131748883, null));
                } else {
                    sb2.append(org.telegram.messenger.bd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c2))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.r90) this.e).setContentDescription(sb2);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
