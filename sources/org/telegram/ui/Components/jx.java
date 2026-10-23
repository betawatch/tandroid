package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class jx implements z4.f {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ tz b;

    public jx(tz tzVar, boolean z10) {
        this.b = tzVar;
        this.a = z10;
    }

    @Override // z4.f
    public final void a(int i10) {
        tz tzVar = this.b;
        gx gxVar = tzVar.h;
        boolean z10 = false;
        if (gxVar != null) {
            int currentItem = gxVar.getCurrentItem();
            int i11 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (tzVar.A1 != i11) {
                tzVar.A1 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i11).commit();
            }
        }
        tzVar.L(i10 == 0, true);
        if (i10 == 2 && (this.a || tzVar.v0)) {
            z10 = true;
        }
        tzVar.Q(z10, true);
        if (tzVar.t1.z()) {
            if (i10 == 0) {
                rw rwVar = tzVar.V;
                if (rwVar != null) {
                    rwVar.d.requestFocus();
                    return;
                }
                return;
            }
            if (i10 == 1) {
                xw xwVar = tzVar.o0;
                if (xwVar != null) {
                    xwVar.d.requestFocus();
                    return;
                }
                return;
            }
            dx dxVar = tzVar.G0;
            if (dxVar != null) {
                dxVar.d.requestFocus();
            }
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        float f10;
        tz tzVar = this.b;
        gz gzVar = tzVar.G0;
        gz gzVar2 = tzVar.o0;
        gz gzVar3 = tzVar.V;
        fx fxVar = tzVar.C0;
        ax axVar = tzVar.D0;
        yx yxVar = tzVar.p0;
        uw uwVar = tzVar.h0;
        ey eyVar = tzVar.P;
        boolean z10 = true;
        if (tzVar.x0 == null || tzVar.g0 == null) {
            f10 = 0.0f;
        } else {
            if (i10 == 0) {
                eyVar.setVisibility(0);
                f10 = 0.0f;
                uwVar.setVisibility(f7 == 0.0f ? 8 : 0);
                yxVar.setVisibility(f7 == 0.0f ? 8 : 0);
                axVar.setVisibility(8);
                if (fxVar != null) {
                    fxVar.setVisibility(8);
                }
            } else {
                f10 = 0.0f;
                if (i10 == 1) {
                    eyVar.setVisibility(8);
                    uwVar.setVisibility(0);
                    yxVar.setVisibility(0);
                    axVar.setVisibility(f7 == 0.0f ? 8 : 0);
                    if (fxVar != null) {
                        fxVar.setVisibility(f7 != 0.0f ? 0 : 8);
                    }
                } else if (i10 == 2) {
                    eyVar.setVisibility(8);
                    uwVar.setVisibility(8);
                    yxVar.setVisibility(8);
                    axVar.setVisibility(0);
                    if (fxVar != null) {
                        fxVar.setVisibility(0);
                    }
                }
            }
        }
        tzVar.getMeasuredWidth();
        tzVar.getPaddingLeft();
        tzVar.getPaddingRight();
        uy uyVar = tzVar.t1;
        if (uyVar != null) {
            if (i10 == 1) {
                uyVar.s(i11 == 0 ? 0 : 2);
            } else if (i10 == 2) {
                uyVar.s(3);
            } else {
                uyVar.s(0);
            }
        }
        tzVar.M(true);
        int currentItem = tzVar.h.getCurrentItem();
        gz gzVar4 = currentItem == 0 ? gzVar3 : currentItem == 1 ? gzVar2 : gzVar;
        String obj = gzVar4.d.getText().toString();
        int i12 = 0;
        while (i12 < 3) {
            gz gzVar5 = i12 == 0 ? gzVar3 : i12 == 1 ? gzVar2 : gzVar;
            if (gzVar5 != null) {
                sq sqVar = gzVar5.d;
                if (gzVar5 != gzVar4 && sqVar != null && !sqVar.getText().toString().equals(obj)) {
                    sqVar.setText(obj);
                    sqVar.setSelection(obj.length());
                }
            }
            i12++;
        }
        if ((i10 != 0 || f7 <= f10) && i10 != 1) {
            z10 = false;
        }
        tz.a(tzVar, z10);
        tzVar.Y();
    }

    @Override // z4.f
    public final void c(int i10) {
    }
}
