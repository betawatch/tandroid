// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cy0 extends m74 {
    public final /* synthetic */ byte o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(gy0 gy0Var, gy0 gy0Var2) {
        super(gy0Var2);
        this.q = gy0Var;
        this.p = new Rect();
    }

    @Override // m74
    public final int g(float f, float f2) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                if (gy0Var.W >= 0.5f) {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var == null || !hf0Var.getBounds().contains((int) f, (int) f2)) {
                        int size = arrayList.size() - 1;
                        while (size >= 0) {
                            fy0 fy0Var = (fy0) arrayList.get(size);
                            float f3 = fy0Var.i;
                            RectF rectF = fy0Var.a;
                            if (Math.abs(f3) < 0.4f && rectF.contains(f, f2)) {
                                Rect bounds = fy0Var.d.l.getBounds();
                                if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - hl.L(24.0f)))) {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                size--;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                u59 u59Var = (u59) view;
                if (Math.abs(f - u59Var.l0) > hl.L(30.0f) || Math.abs(f2 - u59Var.k0) > hl.L(30.0f) || u59Var.b() || u59Var.v0) {
                    if (Math.abs(f - u59Var.m0) > hl.L(30.0f) || Math.abs(f2 - u59Var.k0) > hl.L(30.0f) || u59Var.b() || u59Var.v0) {
                        if (Math.abs(f - u59Var.j0) > hl.L(60.0f) || Math.abs(f2 - u59Var.k0) > hl.L(60.0f)) {
                        }
                    }
                }
                break;
        }
        return 1;
    }

    @Override // m74
    public final void h(ArrayList arrayList) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList2 = gy0Var.S;
                if (gy0Var.W >= 0.5f) {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var != null && !hf0Var.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        fy0 fy0Var = (fy0) arrayList2.get(i);
                        if (Math.abs(fy0Var.i) < 0.4f && !fy0Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i + 1000));
                            if (!fy0Var.d.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i + 2000));
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                u59 u59Var = (u59) view;
                if (!u59Var.b() && !u59Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!u59Var.b() && !u59Var.v0) {
                    arrayList.add(2);
                    break;
                }
                break;
        }
    }

    @Override // m74
    public final boolean k(int i, int i2) {
        int i3;
        boolean z;
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                if (i2 == 16) {
                    if (i == 1) {
                        yx0 yx0Var = gy0Var.a;
                        if (yx0Var != null) {
                            yx0Var.f();
                        }
                        gy0Var.a(false);
                    } else {
                        if (i >= 2000) {
                            i3 = i - 2000;
                            z = true;
                        } else if (i >= 1000) {
                            i3 = i - 1000;
                            z = false;
                        }
                        if (i3 >= 0 && i3 < arrayList.size()) {
                            fy0 fy0Var = (fy0) arrayList.get(i3);
                            yx0 yx0Var2 = gy0Var.a;
                            if (z) {
                                if (yx0Var2 != null) {
                                    yx0Var2.g(fy0Var.c, new y0(this, fy0Var, (byte) 10));
                                }
                            } else if (yx0Var2 != null) {
                                gy0Var.a(false);
                                fy0Var.getClass();
                                gy0Var.a.e(fy0Var.c);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                u59 u59Var = (u59) view;
                if (u59Var.a != null && !u59Var.v0 && i2 == 16) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2 && !u59Var.b()) {
                                u59Var.d(180.0f);
                                ((rab) u59Var.a).b();
                            }
                        } else if (u59Var.b()) {
                            ((rab) u59Var.a).a();
                        } else if (u59Var.s0) {
                            u59Var.s0 = false;
                            u59Var.A0 = false;
                            u59Var.w0 = SystemClock.elapsedRealtime();
                            u59Var.v0 = true;
                            ((rab) u59Var.a).e(false);
                            u59Var.invalidate();
                        } else {
                            boolean z2 = u59Var.p0;
                            t59 t59Var = u59Var.a;
                            if (!z2) {
                                ((rab) t59Var).d();
                            } else if (((rab) t59Var).a.Y()) {
                                u59Var.S = 0L;
                                u59Var.R = System.currentTimeMillis();
                                u59Var.B0 = false;
                                ((rab) u59Var.a).f(new uk8(this, (byte) 28), false);
                            }
                        }
                    } else if (!u59Var.b()) {
                        if (u59Var.s0 && u59Var.B0) {
                            u59Var.A0 = false;
                            u59Var.H0.e(true, 1.0f);
                            hg5 hg5Var = ((rab) u59Var.a).a.U0;
                            hg5Var.a.t(ob6.M0(2131744315, null), true, true);
                            hg5Var.invalidate();
                            u59Var.invalidate();
                        } else {
                            ((rab) u59Var.a).c();
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @Override // m74
    public final void l(int i, v4 v4Var) {
        int i2;
        boolean z;
        boolean z2;
        byte b = this.o;
        String str = "";
        View view = this.q;
        Rect rect = this.p;
        switch (b) {
            case 0:
                gy0 gy0Var = (gy0) view;
                ArrayList arrayList = gy0Var.S;
                v4Var.i("android.widget.Button");
                v4Var.b(s4.e);
                if (i != 1) {
                    if (i < 2000) {
                        if (i < 1000) {
                            rect.set(0, 0, 1, 1);
                            v4Var.h(rect);
                            v4Var.p(false);
                            break;
                        } else {
                            i2 = i - 1000;
                            z = false;
                        }
                    } else {
                        i2 = i - 2000;
                        z = true;
                    }
                    if (i2 >= 0 && i2 < arrayList.size()) {
                        fy0 fy0Var = (fy0) arrayList.get(i2);
                        xx0 xx0Var = fy0Var.c;
                        RectF rectF = fy0Var.a;
                        if (xx0Var != null && xx0Var.b() != null) {
                            str = fy0Var.c.b();
                        }
                        if (!z) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            v4Var.h(rect);
                            v4Var.j(TextUtils.isEmpty(str) ? ob6.M0(2131747544, null) : c00.k(new StringBuilder(ob6.M0(2131747544, null)), ", ", str));
                            break;
                        } else {
                            Rect bounds = fy0Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + hl.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + hl.L(24.0f) + bounds.bottom));
                            v4Var.h(rect);
                            v4Var.j(TextUtils.isEmpty(str) ? ob6.M0(2131752006, null) : c00.k(new StringBuilder(ob6.M0(2131752006, null)), ", ", str));
                            break;
                        }
                    } else {
                        rect.set(0, 0, 1, 1);
                        v4Var.h(rect);
                        v4Var.p(false);
                        break;
                    }
                } else {
                    hf0 hf0Var = gy0Var.j0;
                    if (hf0Var != null) {
                        rect.set(hf0Var.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        v4Var.p(false);
                    }
                    v4Var.h(rect);
                    v4Var.j(ob6.M0(2131753092, null));
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
                u59 u59Var = (u59) view;
                v4Var.i("android.widget.Button");
                if (i == 0) {
                    int L = hl.L(22.0f);
                    float f = u59Var.l0;
                    float f2 = L;
                    float f3 = u59Var.k0;
                    rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                    v4Var.h(rect);
                    v4Var.j((u59Var.s0 && u59Var.B0) ? ob6.M0(2131754841, null) : ob6.M0(2131754908, null));
                    z2 = (u59Var.v0 || u59Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z2);
                    if (z2) {
                        v4Var.b(s4.e);
                        break;
                    }
                } else if (i == 1) {
                    int L2 = hl.L(40.0f);
                    float f4 = u59Var.j0;
                    float f5 = L2;
                    float f6 = u59Var.k0;
                    rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    v4Var.h(rect);
                    v4Var.j(u59Var.b() ? ob6.M0(2131745368, null) : u59Var.s0 ? ob6.M0(2131754749, null) : u59Var.p0 ? ob6.M0(2131754753, null) : ob6.M0(2131754742, null));
                    accessibilityNodeInfo.setEnabled(!u59Var.v0);
                    if (!u59Var.v0) {
                        v4Var.b(s4.e);
                        break;
                    }
                } else if (i == 2) {
                    int L3 = hl.L(22.0f);
                    float f7 = u59Var.m0;
                    float f8 = L3;
                    float f9 = u59Var.k0;
                    rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
                    v4Var.h(rect);
                    v4Var.j(ob6.M0(2131754747, null));
                    z2 = (u59Var.v0 || u59Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z2);
                    if (z2) {
                        v4Var.b(s4.e);
                        break;
                    }
                } else {
                    rect.set(0, 0, 1, 1);
                    v4Var.h(rect);
                    v4Var.p(false);
                    v4Var.j("");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(u59 u59Var, u59 u59Var2) {
        super(u59Var2);
        this.q = u59Var;
        this.p = new Rect();
    }
}
