// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bz0 extends b84 {
    public final /* synthetic */ byte o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(fz0 fz0Var, fz0 fz0Var2) {
        super(fz0Var2);
        this.q = fz0Var;
        this.p = new Rect();
    }

    @Override // b84
    public final int g(float f, float f2) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                if (fz0Var.W >= 0.5f) {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var == null || !fg0Var.getBounds().contains((int) f, (int) f2)) {
                        int size = arrayList.size() - 1;
                        while (size >= 0) {
                            ez0 ez0Var = (ez0) arrayList.get(size);
                            float f3 = ez0Var.i;
                            RectF rectF = ez0Var.a;
                            if (Math.abs(f3) < 0.4f && rectF.contains(f, f2)) {
                                Rect bounds = ez0Var.d.l.getBounds();
                                if (!bounds.isEmpty() && bounds.contains((int) (f - rectF.left), (int) ((f2 - rectF.top) - gm.L(24.0f)))) {
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
                j49 j49Var = (j49) view;
                if (Math.abs(f - j49Var.l0) > gm.L(30.0f) || Math.abs(f2 - j49Var.k0) > gm.L(30.0f) || j49Var.b() || j49Var.v0) {
                    if (Math.abs(f - j49Var.m0) > gm.L(30.0f) || Math.abs(f2 - j49Var.k0) > gm.L(30.0f) || j49Var.b() || j49Var.v0) {
                        if (Math.abs(f - j49Var.j0) > gm.L(60.0f) || Math.abs(f2 - j49Var.k0) > gm.L(60.0f)) {
                        }
                    }
                }
                break;
        }
        return 1;
    }

    @Override // b84
    public final void h(ArrayList arrayList) {
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList2 = fz0Var.S;
                if (fz0Var.W >= 0.5f) {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var != null && !fg0Var.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i = 0; i < arrayList2.size(); i++) {
                        ez0 ez0Var = (ez0) arrayList2.get(i);
                        if (Math.abs(ez0Var.i) < 0.4f && !ez0Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i + 1000));
                            if (!ez0Var.d.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i + 2000));
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                j49 j49Var = (j49) view;
                if (!j49Var.b() && !j49Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!j49Var.b() && !j49Var.v0) {
                    arrayList.add(2);
                    break;
                }
                break;
        }
    }

    @Override // b84
    public final boolean k(int i, int i2) {
        int i3;
        boolean z;
        byte b = this.o;
        View view = this.q;
        switch (b) {
            case 0:
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                if (i2 == 16) {
                    if (i == 1) {
                        xy0 xy0Var = fz0Var.a;
                        if (xy0Var != null) {
                            xy0Var.f();
                        }
                        fz0Var.a(false);
                    } else {
                        if (i >= 2000) {
                            i3 = i - 2000;
                            z = true;
                        } else if (i >= 1000) {
                            i3 = i - 1000;
                            z = false;
                        }
                        if (i3 >= 0 && i3 < arrayList.size()) {
                            ez0 ez0Var = (ez0) arrayList.get(i3);
                            xy0 xy0Var2 = fz0Var.a;
                            if (z) {
                                if (xy0Var2 != null) {
                                    xy0Var2.g(ez0Var.c, new x0(this, ez0Var, (byte) 11));
                                }
                            } else if (xy0Var2 != null) {
                                fz0Var.a(false);
                                ez0Var.getClass();
                                fz0Var.a.e(ez0Var.c);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                j49 j49Var = (j49) view;
                if (j49Var.a != null && !j49Var.v0 && i2 == 16) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2 && !j49Var.b()) {
                                j49Var.d(180.0f);
                                ((v8b) j49Var.a).b();
                            }
                        } else if (j49Var.b()) {
                            ((v8b) j49Var.a).a();
                        } else if (j49Var.s0) {
                            j49Var.s0 = false;
                            j49Var.A0 = false;
                            j49Var.w0 = SystemClock.elapsedRealtime();
                            j49Var.v0 = true;
                            ((v8b) j49Var.a).e(false);
                            j49Var.invalidate();
                        } else {
                            boolean z2 = j49Var.p0;
                            i49 i49Var = j49Var.a;
                            if (!z2) {
                                ((v8b) i49Var).d();
                            } else if (((v8b) i49Var).a.Y()) {
                                j49Var.S = 0L;
                                j49Var.R = System.currentTimeMillis();
                                j49Var.B0 = false;
                                ((v8b) j49Var.a).f(new pp8(this, (byte) 20), false);
                            }
                        }
                    } else if (!j49Var.b()) {
                        if (j49Var.s0 && j49Var.B0) {
                            j49Var.A0 = false;
                            j49Var.H0.e(true, 1.0f);
                            eg5 eg5Var = ((v8b) j49Var.a).a.U0;
                            eg5Var.a.t(jb6.M0(2131744347, null), true, true);
                            eg5Var.invalidate();
                            j49Var.invalidate();
                        } else {
                            ((v8b) j49Var.a).c();
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @Override // b84
    public final void l(int i, u4 u4Var) {
        int i2;
        boolean z;
        boolean z2;
        byte b = this.o;
        String str = "";
        View view = this.q;
        Rect rect = this.p;
        switch (b) {
            case 0:
                fz0 fz0Var = (fz0) view;
                ArrayList arrayList = fz0Var.S;
                u4Var.i("android.widget.Button");
                u4Var.b(r4.d);
                if (i != 1) {
                    if (i < 2000) {
                        if (i < 1000) {
                            rect.set(0, 0, 1, 1);
                            u4Var.h(rect);
                            u4Var.p(false);
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
                        ez0 ez0Var = (ez0) arrayList.get(i2);
                        wy0 wy0Var = ez0Var.c;
                        RectF rectF = ez0Var.a;
                        if (wy0Var != null && wy0Var.b() != null) {
                            str = ez0Var.c.b();
                        }
                        if (!z) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            u4Var.h(rect);
                            u4Var.j(TextUtils.isEmpty(str) ? jb6.M0(2131747550, null) : b10.j(new StringBuilder(jb6.M0(2131747550, null)), ", ", str));
                            break;
                        } else {
                            Rect bounds = ez0Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + gm.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + gm.L(24.0f) + bounds.bottom));
                            u4Var.h(rect);
                            u4Var.j(TextUtils.isEmpty(str) ? jb6.M0(2131751978, null) : b10.j(new StringBuilder(jb6.M0(2131751978, null)), ", ", str));
                            break;
                        }
                    } else {
                        rect.set(0, 0, 1, 1);
                        u4Var.h(rect);
                        u4Var.p(false);
                        break;
                    }
                } else {
                    fg0 fg0Var = fz0Var.j0;
                    if (fg0Var != null) {
                        rect.set(fg0Var.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        u4Var.p(false);
                    }
                    u4Var.h(rect);
                    u4Var.j(jb6.M0(2131753064, null));
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                j49 j49Var = (j49) view;
                u4Var.i("android.widget.Button");
                if (i == 0) {
                    int L = gm.L(22.0f);
                    float f = j49Var.l0;
                    float f2 = L;
                    float f3 = j49Var.k0;
                    rect.set((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2));
                    u4Var.h(rect);
                    u4Var.j((j49Var.s0 && j49Var.B0) ? jb6.M0(2131754845, null) : jb6.M0(2131754912, null));
                    z2 = (j49Var.v0 || j49Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z2);
                    if (z2) {
                        u4Var.b(r4.d);
                        break;
                    }
                } else if (i == 1) {
                    int L2 = gm.L(40.0f);
                    float f4 = j49Var.j0;
                    float f5 = L2;
                    float f6 = j49Var.k0;
                    rect.set((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    u4Var.h(rect);
                    u4Var.j(j49Var.b() ? jb6.M0(2131745374, null) : j49Var.s0 ? jb6.M0(2131754753, null) : j49Var.p0 ? jb6.M0(2131754757, null) : jb6.M0(2131754746, null));
                    accessibilityNodeInfo.setEnabled(!j49Var.v0);
                    if (!j49Var.v0) {
                        u4Var.b(r4.d);
                        break;
                    }
                } else if (i == 2) {
                    int L3 = gm.L(22.0f);
                    float f7 = j49Var.m0;
                    float f8 = L3;
                    float f9 = j49Var.k0;
                    rect.set((int) (f7 - f8), (int) (f9 - f8), (int) (f7 + f8), (int) (f9 + f8));
                    u4Var.h(rect);
                    u4Var.j(jb6.M0(2131754751, null));
                    z2 = (j49Var.v0 || j49Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z2);
                    if (z2) {
                        u4Var.b(r4.d);
                        break;
                    }
                } else {
                    rect.set(0, 0, 1, 1);
                    u4Var.h(rect);
                    u4Var.p(false);
                    u4Var.j("");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz0(j49 j49Var, j49 j49Var2) {
        super(j49Var2);
        this.q = j49Var;
        this.p = new Rect();
    }
}
