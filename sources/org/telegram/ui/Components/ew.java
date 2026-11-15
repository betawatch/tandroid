package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ew implements c5.h {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ly b;

    public ew(ly lyVar, boolean z10) {
        this.b = lyVar;
        this.a = z10;
    }

    @Override // c5.h
    public final void a(int i7) {
        ly lyVar = this.b;
        bw bwVar = lyVar.h;
        boolean z10 = false;
        if (bwVar != null) {
            int currentItem = bwVar.getCurrentItem();
            int i10 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (lyVar.B1 != i10) {
                lyVar.B1 = i10;
                org.telegram.messenger.np.d1().edit().putInt("selected_page", i10).commit();
            }
        }
        lyVar.M(i7 == 0, true);
        if (i7 == 2 && (this.a || lyVar.w0)) {
            z10 = true;
        }
        lyVar.R(z10, true);
        if (lyVar.u1.z()) {
            if (i7 == 0) {
                nv nvVar = lyVar.W;
                if (nvVar != null) {
                    nvVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i7 == 1) {
                sv svVar = lyVar.p0;
                if (svVar != null) {
                    svVar.d.requestFocus();
                    return;
                }
                return;
            }
            yv yvVar = lyVar.H0;
            if (yvVar != null) {
                yvVar.d.requestFocus();
            }
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        float f11;
        ly lyVar = this.b;
        yx yxVar = lyVar.H0;
        yx yxVar2 = lyVar.p0;
        yx yxVar3 = lyVar.W;
        aw awVar = lyVar.D0;
        vv vvVar = lyVar.E0;
        tw twVar = lyVar.q0;
        qv qvVar = lyVar.i0;
        yw ywVar = lyVar.Q;
        boolean z10 = true;
        if (lyVar.y0 == null || lyVar.h0 == null) {
            f11 = 0.0f;
        } else {
            if (i7 == 0) {
                ywVar.setVisibility(0);
                f11 = 0.0f;
                qvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                twVar.setVisibility(f10 == 0.0f ? 8 : 0);
                vvVar.setVisibility(8);
                if (awVar != null) {
                    awVar.setVisibility(8);
                }
            } else {
                f11 = 0.0f;
                if (i7 == 1) {
                    ywVar.setVisibility(8);
                    qvVar.setVisibility(0);
                    twVar.setVisibility(0);
                    vvVar.setVisibility(f10 == 0.0f ? 8 : 0);
                    if (awVar != null) {
                        awVar.setVisibility(f10 != 0.0f ? 0 : 8);
                    }
                } else if (i7 == 2) {
                    ywVar.setVisibility(8);
                    qvVar.setVisibility(8);
                    twVar.setVisibility(8);
                    vvVar.setVisibility(0);
                    if (awVar != null) {
                        awVar.setVisibility(0);
                    }
                }
            }
        }
        lyVar.getMeasuredWidth();
        lyVar.getPaddingLeft();
        lyVar.getPaddingRight();
        mx mxVar = lyVar.u1;
        if (mxVar != null) {
            if (i7 == 1) {
                mxVar.s(i10 == 0 ? 0 : 2);
            } else if (i7 == 2) {
                mxVar.s(3);
            } else {
                mxVar.s(0);
            }
        }
        lyVar.N(true);
        int currentItem = lyVar.h.getCurrentItem();
        yx yxVar4 = currentItem == 0 ? yxVar3 : currentItem == 1 ? yxVar2 : yxVar;
        String obj = yxVar4.d.getText().toString();
        int i11 = 0;
        while (i11 < 3) {
            yx yxVar5 = i11 == 0 ? yxVar3 : i11 == 1 ? yxVar2 : yxVar;
            if (yxVar5 != null) {
                zp zpVar = yxVar5.d;
                if (yxVar5 != yxVar4 && zpVar != null && !zpVar.getText().toString().equals(obj)) {
                    zpVar.setText(obj);
                    zpVar.setSelection(obj.length());
                }
            }
            i11++;
        }
        if ((i7 != 0 || f10 <= f11) && i7 != 1) {
            z10 = false;
        }
        ly.a(lyVar, z10);
        lyVar.Z();
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
