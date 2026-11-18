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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int G1;
    public final /* synthetic */ Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(int i7, Context context, Object obj) {
        super(context, null);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean A() {
        switch (this.G1) {
            case 3:
                org.telegram.ui.xv xvVar = ((org.telegram.ui.cx) this.H1).H3;
                return xvVar != null && xvVar.c();
            default:
                return super.A();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void B(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.xv xvVar = ((org.telegram.ui.cx) this.H1).H3;
                if (xvVar != null && xvVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.B(z10);
                break;
            default:
                super.B(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void I(int i7, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.G1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                super.I(i7, z10);
                if (!z10) {
                    profileActivity.I5 = i7;
                    profileActivity.E5();
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
                super.I(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean R(View view) {
        switch (this.G1) {
            case 3:
                return super.R(view) || view == ((org.telegram.ui.cx) this.H1).n0;
            default:
                return super.R(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void S(View[] viewArr, boolean[] zArr) {
        switch (this.G1) {
            case 3:
                super.S(viewArr, zArr);
                ((org.telegram.ui.cx) this.H1).h.a(true, true);
                break;
            default:
                super.S(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.H1;
                org.telegram.ui.qw qwVar = cxVar.Y;
                if (qwVar == null || qwVar.getAlpha() <= 0.0f || !cxVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void o(boolean z10) {
        switch (this.G1) {
            case 3:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.H1;
                cxVar.Y.r.getText().clear();
                if (z10 && cxVar.Y.r.isFocused()) {
                    org.telegram.messenger.g0.v1(cxVar.Y.r);
                }
                cxVar.Y.r.clearFocus();
                cxVar.Z.b(false);
                break;
            default:
                super.o(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.G1) {
            case 5:
                super.onLayout(z10, i7, i10, i11, i12);
                ProfileActivity profileActivity = (ProfileActivity) this.H1;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.P5(false);
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
                ((g8) this.H1).b.invalidate();
                break;
            case 1:
                si siVar = (si) this.H1;
                sh shVar = siVar.B2;
                TextView textView = siVar.h3;
                sh shVar2 = siVar.v3;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    si.J0(siVar);
                    siVar.b.invalidate();
                    if (shVar != null && shVar2 != null) {
                        if (shVar.getTag() != null) {
                            if (siVar.w2 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (shVar2.getAlpha() != f12) {
                                    shVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            ki kiVar = siVar.w2;
                            if (kiVar == null || kiVar.N()) {
                                shVar2.setAlpha(1.0f - f10);
                                shVar2.setTranslationY(org.telegram.messenger.g0.L(44.0f) * f10);
                            }
                            shVar.setTranslationY(org.telegram.messenger.g0.L(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                ((df0) this.H1).b.invalidate();
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
                    ((ug.z0) this.H1).b.invalidate();
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
                ug.z0 z0Var = (ug.z0) this.H1;
                v7 v7Var = z0Var.I1;
                if (v7Var != null && v7Var.getTag() != null) {
                    org.telegram.messenger.g0.p3(z0Var, i0.a.h(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, z0Var.J0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.h2 h2Var = z0Var.m1;
                    if (h2Var != null) {
                        org.telegram.messenger.g0.p3(z0Var, h2Var.isLightStatusBar());
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
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.cx) this.H1).fragmentView) != null) {
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
                si.J0((si) this.H1);
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void x() {
        switch (this.G1) {
            case 3:
                super.x();
                ((org.telegram.ui.cx) this.H1).h.a(false, true);
                break;
            default:
                super.x();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(org.telegram.messenger.fs fsVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.G1 = i7;
        this.H1 = fsVar;
    }
}
