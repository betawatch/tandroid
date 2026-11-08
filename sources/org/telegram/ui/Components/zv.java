package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class zv implements c5.g {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hy b;

    public zv(hy hyVar, boolean z9) {
        this.b = hyVar;
        this.a = z9;
    }

    @Override // c5.g
    public final void a(int i7) {
        hy hyVar = this.b;
        wv wvVar = hyVar.h;
        boolean z9 = false;
        if (wvVar != null) {
            int currentItem = wvVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (hyVar.A1 != i10) {
                hyVar.A1 = i10;
                org.telegram.messenger.qp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        hyVar.L(i7 == 0, true);
        if (i7 == 2 && (this.a || hyVar.v0)) {
            z9 = true;
        }
        hyVar.Q(z9, true);
        if (hyVar.t1.z()) {
            if (i7 == 0) {
                iv ivVar = hyVar.V;
                if (ivVar != null) {
                    ivVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                nv nvVar = hyVar.o0;
                if (nvVar != null) {
                    nvVar.d.requestFocus();
                    return;
                }
                return;
            }
            tv tvVar = hyVar.G0;
            if (tvVar != null) {
                tvVar.d.requestFocus();
            }
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        float f11;
        hy hyVar = this.b;
        ux uxVar = hyVar.G0;
        ux uxVar2 = hyVar.o0;
        ux uxVar3 = hyVar.V;
        vv vvVar = hyVar.C0;
        qv qvVar = hyVar.D0;
        ow owVar = hyVar.p0;
        lv lvVar = hyVar.h0;
        tw twVar = hyVar.P;
        boolean z9 = true;
        if (hyVar.x0 == null || hyVar.g0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                twVar.setVisibility(0);
                f11 = 0.0f;
                lvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                owVar.setVisibility(f10 == 0.0f ? 8 : 0);
                qvVar.setVisibility(8);
                if (vvVar != null) {
                    vvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    twVar.setVisibility(8);
                    lvVar.setVisibility(0);
                    owVar.setVisibility(0);
                    qvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (vvVar != null) {
                        vvVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    twVar.setVisibility(8);
                    lvVar.setVisibility(8);
                    owVar.setVisibility(8);
                    qvVar.setVisibility(0);
                    if (vvVar != null) {
                        vvVar.setVisibility(0);
                    }
                }
            }
        }
        hyVar.getMeasuredWidth();
        hyVar.getPaddingLeft();
        hyVar.getPaddingRight();
        ix ixVar = hyVar.t1;
        if (ixVar != null) {
            if (i7 == 1) {
                ixVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                ixVar.s(3);
            } else {
                ixVar.s(0);
            }
        }
        hyVar.M(true);
        int currentItem = hyVar.h.getCurrentItem();
        ux uxVar4 = currentItem == 0 ? uxVar3 : currentItem == 1 ? uxVar2 : uxVar;
        String obj = uxVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            ux uxVar5 = i11 == 0 ? uxVar3 : i11 == 1 ? uxVar2 : uxVar;
            if (uxVar5 != null) {
                rp rpVar = uxVar5.d;
                if (uxVar5 != uxVar4 && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z9 = false;
        }
        hy.a(hyVar, z9);
        hyVar.Z();
    }

    @Override // c5.g
    public final void c(int i7) {
    }
}
