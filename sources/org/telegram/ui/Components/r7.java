package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class r7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int F1;
    public final /* synthetic */ Object G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(int i7, Context context, Object obj) {
        super(context, null);
        this.F1 = i7;
        this.G1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void D(int i7, boolean z9) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                super.D(i7, z9);
                if (!z9) {
                    profileActivity.C5 = i7;
                    profileActivity.A5();
                }
                if (!z9 && (imageView2 = profileActivity.X0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.D(i7, z9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean N(View view) {
        switch (this.F1) {
            case 3:
                return super.N(view) || view == ((org.telegram.ui.ww) this.G1).m0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.F1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.ww) this.G1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.G1;
                org.telegram.ui.lw lwVar = wwVar.X;
                if (lwVar == null || lwVar.getAlpha() <= 0.0f || !wwVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void l(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.G1;
                wwVar.X.r.getText().clear();
                if (z9 && wwVar.X.r.isFocused()) {
                    org.telegram.messenger.g0.v1(wwVar.X.r);
                }
                wwVar.X.r.clearFocus();
                wwVar.Y.b(false);
                break;
            default:
                super.l(z9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.F1) {
            case 5:
                super.onLayout(z9, i7, i10, i11, i12);
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                RectF rectF = ProfileActivity.S6;
                profileActivity.L5(false);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.F1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.G1;
                org.telegram.ui.k0 k0Var = profileActivity.X;
                Rect rect = profileActivity.K2;
                k0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.F1) {
            case 0:
                super.setAlpha(f10);
                ((b8) this.G1).b.invalidate();
                break;
            case 1:
                di diVar = (di) this.G1;
                dh dhVar = diVar.x2;
                TextView textView = diVar.d3;
                dh dhVar2 = diVar.r3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    di.I0(diVar);
                    diVar.b.invalidate();
                    if (dhVar != null && dhVar2 != null) {
                        if (dhVar.getTag() != null) {
                            if (diVar.s2 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (dhVar2.getAlpha() != f12) {
                                    dhVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            vh vhVar = diVar.s2;
                            if (vhVar == null || vhVar.M()) {
                                dhVar2.setAlpha(1.0f - f10);
                                dhVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            dhVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                ((qe0) this.G1).b.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.G1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.G1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.w0) this.G1).b.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.F1) {
            case 7:
                super.setTag(obj);
                ug.w0 w0Var = (ug.w0) this.G1;
                r7 r7Var = w0Var.E1;
                if (r7Var != null && r7Var.getTag() != null) {
                    org.telegram.messenger.g0.q3(w0Var, i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, w0Var.I0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.f2 f2Var = w0Var.i1;
                    if (f2Var != null) {
                        org.telegram.messenger.g0.q3(w0Var, f2Var.isLightStatusBar());
                        break;
                    }
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public void setTranslationY(float f10) {
        View view;
        switch (this.F1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.ww) this.G1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.F1) {
            case 1:
                super.setVisibility(i7);
                di.I0((di) this.G1);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void u() {
        switch (this.F1) {
            case 3:
                super.u();
                ((org.telegram.ui.ww) this.G1).h.a(false, true);
                break;
            default:
                super.u();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean x() {
        switch (this.F1) {
            case 3:
                org.telegram.ui.sv svVar = ((org.telegram.ui.ww) this.G1).F3;
                return svVar != null && svVar.c();
            default:
                return super.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void y(boolean z9) {
        switch (this.F1) {
            case 3:
                org.telegram.ui.sv svVar = ((org.telegram.ui.ww) this.G1).F3;
                if (svVar != null && svVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z9 ? 1.0f : 0.0f).start();
                }
                super.y(z9);
                break;
            default:
                super.y(z9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(org.telegram.messenger.ls lsVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.F1 = i7;
        this.G1 = lsVar;
    }
}
