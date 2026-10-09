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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int u1;
    public final /* synthetic */ Object v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(Object obj, Context context, int i10) {
        super(context, null);
        this.u1 = i10;
        this.v1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.v1;
                super.D(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.D(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean N(View view) {
        switch (this.u1) {
            case 3:
                return super.N(view) || view == ((org.telegram.ui.ty) this.v1).m0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.u1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.ty) this.v1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.u1) {
            case 3:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.v1;
                org.telegram.ui.jy jyVar = tyVar.X;
                if (jyVar == null || jyVar.getAlpha() <= 0.0f || !tyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void h(boolean z10) {
        switch (this.u1) {
            case 3:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.v1;
                tyVar.X.r.getText().clear();
                if (z10 && tyVar.X.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(tyVar.X.r);
                }
                tyVar.X.r.clearFocus();
                tyVar.Y.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.u1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.v1).l5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.v1;
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
    public void s() {
        switch (this.u1) {
            case 3:
                super.s();
                ((org.telegram.ui.ty) this.v1).h.a(false, true);
                break;
            default:
                super.s();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.u1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((l8) this.v1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                yi yiVar = (yi) this.v1;
                ai aiVar = yiVar.G0;
                TextView textView = yiVar.m1;
                ai aiVar2 = yiVar.A1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    yi.O(yiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                    viewGroup2.invalidate();
                    if (aiVar != null && aiVar2 != null) {
                        if (aiVar.getTag() != null) {
                            if (yiVar.B0 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (aiVar2.getAlpha() != f11) {
                                    aiVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            qi qiVar = yiVar.B0;
                            if (qiVar == null || qiVar.L()) {
                                aiVar2.setAlpha(1.0f - f7);
                                aiVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            aiVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f7);
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((sh0) this.v1)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                break;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.v1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.v1;
                secretMediaViewer.r.setAlpha(f7);
                secretMediaViewer.n.setAlpha(f7);
                break;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((rg.y0) this.v1)).containerView;
                    viewGroup4.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.u1) {
            case 7:
                super.setTag(obj);
                rg.y0 y0Var = (rg.y0) this.v1;
                a8 a8Var = y0Var.N;
                if (a8Var != null && a8Var.getTag() != null) {
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
        switch (this.u1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ty) this.v1).fragmentView) != null) {
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
        switch (this.u1) {
            case 1:
                super.setVisibility(i10);
                yi.O((yi) this.v1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean v() {
        switch (this.u1) {
            case 3:
                org.telegram.ui.nx nxVar = ((org.telegram.ui.ty) this.v1).F3;
                return nxVar != null && nxVar.c();
            default:
                return super.v();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void w(boolean z10) {
        switch (this.u1) {
            case 3:
                org.telegram.ui.nx nxVar = ((org.telegram.ui.ty) this.v1).F3;
                if (nxVar != null && nxVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.w(z10);
                break;
            default:
                super.w(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.u1 = i10;
        this.v1 = notificationCenterDelegate;
    }
}
