// default package

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m86 extends sy9 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ View e;

    public /* synthetic */ m86(View view, byte b) {
        this.d = b;
        this.e = view;
    }

    @Override // sy9
    public final boolean a() {
        return i() > 0;
    }

    @Override // sy9
    public final boolean b() {
        return i() < h();
    }

    @Override // sy9
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
                uy9 uy9Var = ((o86) this.e).h;
                float f = min / 100.0f;
                uy9Var.y.o(true, f);
                uy9Var.setProgress(f);
                break;
            case 1:
                if (((gd8) this.e).s.e8 > 0 && (max = Math.max(0, Math.min(((gd8) this.e).s.e8 - 1, min))) != ((gd8) this.e).s.d8) {
                    gd8 gd8Var = (gd8) this.e;
                    gd8Var.r = gd8Var.s.d8;
                    ((gd8) this.e).s.d8 = max;
                    ((gd8) this.e).s.N();
                    ((gd8) this.e).invalidate();
                    int i2 = ((gd8) this.e).s.d8;
                    gd8 gd8Var2 = (gd8) this.e;
                    if (i2 != gd8Var2.r) {
                        gd8Var2.s.x1(1);
                        break;
                    }
                }
                break;
            default:
                ((zma) this.e).setOption(min);
                break;
        }
    }

    @Override // sy9
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(ob6.M0(2131754730, "AccDescrVideoQuality"));
                if (((gd8) this.e).s.e8 > 0) {
                    sb.append(", ");
                    sb.append(((gd8) this.e).s.d8 + 1);
                    sb.append(" / ");
                    sb.append(((gd8) this.e).s.e8);
                }
                sb.append(", ");
                sb.append(((gd8) this.e).h);
                sb.append(" – ");
                sb.append(((gd8) this.e).n);
                return sb.toString();
            case 2:
                zma zmaVar = (zma) this.e;
                int i = zmaVar.J;
                String[] strArr = zmaVar.G;
                if (i < strArr.length) {
                    return strArr[i];
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // sy9
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
                return Math.max(0, ((gd8) this.e).s.e8 - 1);
            default:
                return ((zma) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return i86.c();
            case 1:
                return ((gd8) this.e).s.d8;
            default:
                return ((zma) this.e).J;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(ob6.M0(2131748622, null));
                sb.append(", ");
                int c = i86.c();
                if (c <= 0) {
                    sb.append(ob6.M0(2131748630, null));
                } else if (c >= 100) {
                    sb.append(ob6.M0(2131748629, null));
                } else {
                    sb.append(ob6.a0(null, null, 2131754844, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((o86) this.e).setContentDescription(sb);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
