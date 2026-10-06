package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int v1;
    public final /* synthetic */ Object w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(Object obj, Context context, int i10) {
        super(context, null);
        this.v1 = i10;
        this.w1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void A(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.v1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.w1;
                super.A(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.A(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean K(View view) {
        switch (this.v1) {
            case 3:
                return super.K(view) || view == ((org.telegram.ui.uy) this.w1).m0;
            default:
                return super.K(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void L(View[] viewArr, boolean[] zArr) {
        switch (this.v1) {
            case 3:
                super.L(viewArr, zArr);
                ((org.telegram.ui.uy) this.w1).h.a(true, true);
                break;
            default:
                super.L(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.v1) {
            case 3:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.w1;
                org.telegram.ui.iy iyVar = uyVar.X;
                if (iyVar == null || iyVar.getAlpha() <= 0.0f || !uyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void h(boolean z10) {
        switch (this.v1) {
            case 3:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.w1;
                uyVar.X.r.getText().clear();
                if (z10 && uyVar.X.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(uyVar.X.r);
                }
                uyVar.X.r.clearFocus();
                uyVar.Y.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.v1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.w1).l5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.v1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.w1;
                org.telegram.ui.k0 k0Var = profileActivity.Y;
                Rect rect = profileActivity.L2;
                k0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void r() {
        switch (this.v1) {
            case 3:
                super.r();
                ((org.telegram.ui.uy) this.w1).h.a(false, true);
                break;
            default:
                super.r();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.v1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((j8) this.w1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                xi xiVar = (xi) this.w1;
                wh whVar = xiVar.D0;
                TextView textView = xiVar.j1;
                wh whVar2 = xiVar.x1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    xi.D(xiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                    viewGroup2.invalidate();
                    if (whVar != null && whVar2 != null) {
                        if (whVar.getTag() != null) {
                            if (xiVar.y0 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (whVar2.getAlpha() != f11) {
                                    whVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            pi piVar = xiVar.y0;
                            if (piVar == null || piVar.H()) {
                                whVar2.setAlpha(1.0f - f7);
                                whVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            whVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f7);
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((ch0) this.w1)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                break;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.w1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.w1;
                secretMediaViewer.r.setAlpha(f7);
                secretMediaViewer.n.setAlpha(f7);
                break;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((rg.y0) this.w1)).containerView;
                    viewGroup4.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.v1) {
            case 7:
                super.setTag(obj);
                rg.y0 y0Var = (rg.y0) this.w1;
                y7 y7Var = y0Var.N;
                if (y7Var != null && y7Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, i0.a.f(y0Var.getThemedColor(org.telegram.ui.ActionBar.i6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var = y0Var.b;
                    if (n2Var != null) {
                        AndroidUtilities.setLightStatusBar(y0Var, n2Var.isLightStatusBar());
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
    public void setTranslationY(float f7) {
        View view;
        switch (this.v1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.uy) this.w1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f7);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.v1) {
            case 1:
                super.setVisibility(i10);
                xi.D((xi) this.w1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean u() {
        switch (this.v1) {
            case 3:
                org.telegram.ui.mx mxVar = ((org.telegram.ui.uy) this.w1).F3;
                return mxVar != null && mxVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void v(boolean z10) {
        switch (this.v1) {
            case 3:
                org.telegram.ui.mx mxVar = ((org.telegram.ui.uy) this.w1).F3;
                if (mxVar != null && mxVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.v(z10);
                break;
            default:
                super.v(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.v1 = i10;
        this.w1 = notificationCenterDelegate;
    }
}
