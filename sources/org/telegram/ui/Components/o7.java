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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int G1;
    public final /* synthetic */ Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(int i7, Context context, Object obj) {
        super(context, null);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void A(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uv uvVar = ((org.telegram.ui.yw) this.H1).H3;
                if (uvVar != null && uvVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.A(z10);
                break;
            default:
                super.A(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void H(int i7, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.H(i7, z10);
                if (!z10) {
                    profileActivity.G5 = i7;
                    profileActivity.D5();
                }
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.J0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.H(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean Q(View view) {
        switch (this.G1) {
            case 3:
                return super.Q(view) || view == ((org.telegram.ui.yw) this.H1).n0;
            default:
                return super.Q(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void R(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 3:
                super.R(viewArr, zArr);
                ((org.telegram.ui.yw) this.H1).h.a(true, true);
                break;
            default:
                super.R(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.H1;
                org.telegram.ui.nw nwVar = ywVar.Y;
                if (nwVar == null || nwVar.getAlpha() <= 0.0f || !ywVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void n(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.H1;
                ywVar.Y.r.getText().clear();
                if (z10 && ywVar.Y.r.isFocused()) {
                    org.telegram.messenger.g0.v1(ywVar.Y.r);
                }
                ywVar.Y.r.clearFocus();
                ywVar.Z.b(false);
                break;
            default:
                super.n(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.G1) {
            case 5:
                super.onLayout(z10, i7, i10, i11, i12);
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                RectF rectF = ProfileActivity.X6;
                profileActivity.O5(false);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                org.telegram.ui.k0 k0Var = profileActivity.Y;
                Rect rect = profileActivity.M2;
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
        switch (this.G1) {
            case 0:
                super.setAlpha(f10);
                ((y7) this.H1).b.invalidate();
                break;
            case 1:
                ki kiVar = (ki) this.H1;
                kh khVar = kiVar.B2;
                TextView textView = kiVar.h3;
                kh khVar2 = kiVar.v3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    ki.I0(kiVar);
                    kiVar.b.invalidate();
                    if (khVar != null && khVar2 != null) {
                        if (khVar.getTag() != null) {
                            if (kiVar.w2 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (khVar2.getAlpha() != f12) {
                                    khVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            ci ciVar = kiVar.w2;
                            if (ciVar == null || ciVar.N()) {
                                khVar2.setAlpha(1.0f - f10);
                                khVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            khVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                ((te0) this.H1).b.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.H1).f0.invalidate();
                break;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.H1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    ((ug.x0) this.H1).b.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.G1) {
            case 7:
                super.setTag(obj);
                ug.x0 x0Var = (ug.x0) this.H1;
                o7 o7Var = x0Var.I1;
                if (o7Var != null && o7Var.getTag() != null) {
                    org.telegram.messenger.g0.q3(x0Var, i0.a.h(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, x0Var.J0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.e2 e2Var = x0Var.m1;
                    if (e2Var != null) {
                        org.telegram.messenger.g0.q3(x0Var, e2Var.isLightStatusBar());
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
        switch (this.G1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.yw) this.H1).fragmentView) != null) {
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
        switch (this.G1) {
            case 1:
                super.setVisibility(i7);
                ki.I0((ki) this.H1);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void w() {
        switch (this.G1) {
            case 3:
                super.w();
                ((org.telegram.ui.yw) this.H1).h.a(false, true);
                break;
            default:
                super.w();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean z() {
        switch (this.G1) {
            case 3:
                org.telegram.ui.uv uvVar = ((org.telegram.ui.yw) this.H1).H3;
                return uvVar != null && uvVar.c();
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(org.telegram.messenger.is isVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.G1 = i7;
        this.H1 = isVar;
    }
}
