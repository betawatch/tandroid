package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yv implements c5.g {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gy b;

    public yv(gy gyVar, boolean z9) {
        this.b = gyVar;
        this.a = z9;
    }

    @Override // c5.g
    public final void a(int i7) {
        gy gyVar = this.b;
        vv vvVar = gyVar.h;
        boolean z9 = false;
        if (vvVar != null) {
            int currentItem = vvVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (gyVar.A1 != i10) {
                gyVar.A1 = i10;
                org.telegram.messenger.qp.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        gyVar.L(i7 == 0, true);
        if (i7 == 2 && (this.a || gyVar.v0)) {
            z9 = true;
        }
        gyVar.Q(z9, true);
        if (gyVar.t1.z()) {
            if (i7 == 0) {
                hv hvVar = gyVar.V;
                if (hvVar != null) {
                    hvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                mv mvVar = gyVar.o0;
                if (mvVar != null) {
                    mvVar.d.requestFocus();
                    return;
                }
                return;
            }
            sv svVar = gyVar.G0;
            if (svVar != null) {
                svVar.d.requestFocus();
            }
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        float f11;
        gy gyVar = this.b;
        tx txVar = gyVar.G0;
        tx txVar2 = gyVar.o0;
        tx txVar3 = gyVar.V;
        uv uvVar = gyVar.C0;
        pv pvVar = gyVar.D0;
        nw nwVar = gyVar.p0;
        kv kvVar = gyVar.h0;
        sw swVar = gyVar.P;
        boolean z9 = true;
        if (gyVar.x0 == null || gyVar.g0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                swVar.setVisibility(0);
                f11 = 0.0f;
                kvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                nwVar.setVisibility(f10 == 0.0f ? 8 : 0);
                pvVar.setVisibility(8);
                if (uvVar != null) {
                    uvVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    swVar.setVisibility(8);
                    kvVar.setVisibility(0);
                    nwVar.setVisibility(0);
                    pvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (uvVar != null) {
                        uvVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    swVar.setVisibility(8);
                    kvVar.setVisibility(8);
                    nwVar.setVisibility(8);
                    pvVar.setVisibility(0);
                    if (uvVar != null) {
                        uvVar.setVisibility(0);
                    }
                }
            }
        }
        gyVar.getMeasuredWidth();
        gyVar.getPaddingLeft();
        gyVar.getPaddingRight();
        hx hxVar = gyVar.t1;
        if (hxVar != null) {
            if (i7 == 1) {
                hxVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                hxVar.s(3);
            } else {
                hxVar.s(0);
            }
        }
        gyVar.M(true);
        int currentItem = gyVar.h.getCurrentItem();
        tx txVar4 = currentItem == 0 ? txVar3 : currentItem == 1 ? txVar2 : txVar;
        String obj = txVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            tx txVar5 = i11 == 0 ? txVar3 : i11 == 1 ? txVar2 : txVar;
            if (txVar5 != null) {
                rp rpVar = txVar5.d;
                if (txVar5 != txVar4 && rpVar != null && !rpVar.getText().toString().equals(obj)) {
                    rpVar.setText(obj);
                    rpVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z9 = false;
        }
        gy.a(gyVar, z9);
        gyVar.Z();
    }

    @Override // c5.g
    public final void c(int i7) {
    }
}
