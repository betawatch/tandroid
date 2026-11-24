// default package

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i86 extends bx9 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ View e;

    public /* synthetic */ i86(View view, byte b) {
        this.d = b;
        this.e = view;
    }

    @Override // bx9
    public final boolean a() {
        return i() > 0;
    }

    @Override // bx9
    public final boolean b() {
        return i() < h();
    }

    @Override // bx9
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
                dx9 dx9Var = ((k86) this.e).h;
                float f = min / 100.0f;
                dx9Var.y.n(true, f);
                dx9Var.setProgress(f);
                break;
            case 1:
                if (((rb8) this.e).s.e8 > 0 && (max = Math.max(0, Math.min(((rb8) this.e).s.e8 - 1, min))) != ((rb8) this.e).s.d8) {
                    rb8 rb8Var = (rb8) this.e;
                    rb8Var.r = rb8Var.s.d8;
                    ((rb8) this.e).s.d8 = max;
                    ((rb8) this.e).s.N();
                    ((rb8) this.e).invalidate();
                    int i2 = ((rb8) this.e).s.d8;
                    rb8 rb8Var2 = (rb8) this.e;
                    if (i2 != rb8Var2.r) {
                        rb8Var2.s.x1(1);
                        break;
                    }
                }
                break;
            default:
                ((hla) this.e).setOption(min);
                break;
        }
    }

    @Override // bx9
    public final CharSequence d() {
        switch (this.d) {
            case 1:
                StringBuilder sb = new StringBuilder(jb6.M0(2131754734, "AccDescrVideoQuality"));
                if (((rb8) this.e).s.e8 > 0) {
                    sb.append(", ");
                    sb.append(((rb8) this.e).s.d8 + 1);
                    sb.append(" / ");
                    sb.append(((rb8) this.e).s.e8);
                }
                sb.append(", ");
                sb.append(((rb8) this.e).h);
                sb.append(" – ");
                sb.append(((rb8) this.e).n);
                return sb.toString();
            case 2:
                hla hlaVar = (hla) this.e;
                int i = hlaVar.J;
                String[] strArr = hlaVar.G;
                if (i < strArr.length) {
                    return strArr[i];
                }
                return null;
            default:
                return super.d();
        }
    }

    @Override // bx9
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
                return Math.max(0, ((rb8) this.e).s.e8 - 1);
            default:
                return ((hla) this.e).G.length - 1;
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return e86.c();
            case 1:
                return ((rb8) this.e).s.d8;
            default:
                return ((hla) this.e).J;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 0:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(jb6.M0(2131748625, null));
                sb.append(", ");
                int c = e86.c();
                if (c <= 0) {
                    sb.append(jb6.M0(2131748633, null));
                } else if (c >= 100) {
                    sb.append(jb6.M0(2131748632, null));
                } else {
                    sb.append(jb6.a0(null, null, 2131754848, Integer.valueOf(Math.round(c))));
                }
                accessibilityEvent.setContentDescription(sb);
                ((k86) this.e).setContentDescription(sb);
                break;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                break;
        }
    }
}
