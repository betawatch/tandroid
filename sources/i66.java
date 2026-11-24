// default package

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i66 extends yu9 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ View e;

    public /* synthetic */ i66(View view, byte b) {
        this.d = b;
        this.e = view;
    }

    @Override // yu9
    public final boolean a() {
        return i() > 0;
    }

    @Override // yu9
    public final boolean b() {
        return i() < h();
    }

    @Override // yu9
    public final void c(boolean z) {
        int i;
        int max;
        switch (this.d) {
            case 0:
                i = 5;
                break;
            default:
                i = 1;
                break;
        }
        if (z) {
            i *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i));
        switch (this.d) {
            case 0:
                av9 av9Var = ((k66) this.e).h;
                float f = min / 100.0f;
                av9Var.y.j(true, f);
                av9Var.setProgress(f);
                break;
            case 1:
                if (((q98) this.e).s.e8 > 0 && (max = Math.max(0, Math.min(((q98) this.e).s.e8 - 1, min))) != ((q98) this.e).s.d8) {
                    q98 q98Var = (q98) this.e;
                    q98Var.r = q98Var.s.d8;
                    ((q98) this.e).s.d8 = max;
                    ((q98) this.e).s.O();
                    ((q98) this.e).invalidate();
                    int i2 = ((q98) this.e).s.d8;
                    q98 q98Var2 = (q98) this.e;
                    if (i2 != q98Var2.r) {
                        q98Var2.s.x1(1);
                        break;
                    }
                }
                break;
            default:
                ((fja) this.e).setOption(min);
                break;
        }
    }

    @Override // yu9
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(k96.M0(2131754734, "AccDescrVideoQuality"));
                if (((q98) this.e).s.e8 > 0) {
                    sb.append(", ");
                    sb.append(((q98) this.e).s.d8 + 1);
                    sb.append(" / ");
                    sb.append(((q98) this.e).s.e8);
                }
                sb.append(", ");
                sb.append(((q98) this.e).h);
                sb.append(" – ");
                sb.append(((q98) this.e).n);
                return sb.toString();
            case 2:
                fja fjaVar = (fja) this.e;
                int i = fjaVar.J;
                String[] strArr = fjaVar.G;
                if (i < strArr.length) {
                    return strArr[i];
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // yu9
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.d) {
            case 0:
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
                return 100;
            case 1:
                return Math.max(0, ((q98) this.e).s.e8 - 1);
            default:
                return ((fja) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return e66.c();
            case 1:
                return ((q98) this.e).s.d8;
            default:
                return ((fja) this.e).J;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(k96.M0(2131748676, null));
                sb.append(", ");
                int c = e66.c();
                if (c <= 0) {
                    sb.append(k96.M0(2131748684, null));
                } else if (c >= 100) {
                    sb.append(k96.M0(2131748683, null));
                } else {
                    sb.append(k96.a0(null, null, 2131754848, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((k66) this.e).setContentDescription(sb);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
