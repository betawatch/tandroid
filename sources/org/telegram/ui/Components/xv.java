package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xv implements b5.h {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ey b;

    public xv(ey eyVar, boolean z10) {
        this.b = eyVar;
        this.a = z10;
    }

    @Override // b5.h
    public final void a(int i3) {
        ey eyVar = this.b;
        uv uvVar = eyVar.h;
        boolean z10 = false;
        if (uvVar != null) {
            int currentItem = uvVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (eyVar.B1 != i10) {
                eyVar.B1 = i10;
                org.telegram.messenger.hp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        eyVar.L(i3 == 0, true);
        if (i3 == 2 && (this.a || eyVar.w0)) {
            z10 = true;
        }
        eyVar.Q(z10, true);
        if (eyVar.u1.z()) {
            if (i3 == 0) {
                gv gvVar = eyVar.W;
                if (gvVar != null) {
                    gvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i3 == 1) {
                lv lvVar = eyVar.p0;
                if (lvVar != null) {
                    lvVar.d.requestFocus();
                    return;
                }
                return;
            }
            rv rvVar = eyVar.H0;
            if (rvVar != null) {
                rvVar.d.requestFocus();
            }
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        float f11;
        ey eyVar = this.b;
        rx rxVar = eyVar.H0;
        rx rxVar2 = eyVar.p0;
        rx rxVar3 = eyVar.W;
        tv tvVar = eyVar.D0;
        ov ovVar = eyVar.E0;
        mw mwVar = eyVar.q0;
        jv jvVar = eyVar.i0;
        rw rwVar = eyVar.Q;
        boolean z10 = true;
        if (eyVar.y0 == null || eyVar.h0 == null) {
            f11 = 0.0f;
        } else {
            if (i3 == 0) {
                rwVar.setVisibility(0);
                f11 = 0.0f;
                jvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                mwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                ovVar.setVisibility(8);
                if (tvVar != null) {
                    tvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i3 == 1) {
                    rwVar.setVisibility(8);
                    jvVar.setVisibility(0);
                    mwVar.setVisibility(0);
                    ovVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (tvVar != null) {
                        tvVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i3 == 2) {
                    rwVar.setVisibility(8);
                    jvVar.setVisibility(8);
                    mwVar.setVisibility(8);
                    ovVar.setVisibility(0);
                    if (tvVar != null) {
                        tvVar.setVisibility(0);
                    }
                }
            }
        }
        eyVar.getMeasuredWidth();
        eyVar.getPaddingLeft();
        eyVar.getPaddingRight();
        fx fxVar = eyVar.u1;
        if (fxVar != null) {
            if (i3 == 1) {
                fxVar.s(i10 == 0 ? 0 : 2);
            } else if (i3 == 2) {
                fxVar.s(3);
            } else {
                fxVar.s(0);
            }
        }
        eyVar.M(true);
        int currentItem = eyVar.h.getCurrentItem();
        rx rxVar4 = currentItem == 0 ? rxVar3 : currentItem == 1 ? rxVar2 : rxVar;
        String obj = rxVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            rx rxVar5 = i11 == 0 ? rxVar3 : i11 == 1 ? rxVar2 : rxVar;
            if (rxVar5 != null) {
                rp rpVar = rxVar5.d;
                if (rxVar5 != rxVar4 && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i3 != 0 || f10 <= f11) && i3 != 1) {
            z10 = false;
        }
        ey.a(eyVar, z10);
        eyVar.Z();
    }

    @Override // b5.h
    public final void c(int i3) {
    }
}
