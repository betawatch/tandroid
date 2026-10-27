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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int x1;
    public final /* synthetic */ Object y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(Object obj, Context context, int i10) {
        super(context, null);
        this.x1 = i10;
        this.y1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean J(View view) {
        switch (this.x1) {
            case 3:
                return super.J(view) || view == ((org.telegram.ui.ey) this.y1).m0;
            default:
                return super.J(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void K(View[] viewArr, boolean[] zArr) {
        switch (this.x1) {
            case 3:
                super.K(viewArr, zArr);
                ((org.telegram.ui.ey) this.y1).h.a(true, true);
                break;
            default:
                super.K(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.x1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.y1;
                org.telegram.ui.rx rxVar = eyVar.X;
                if (rxVar == null || rxVar.getAlpha() <= 0.0f || !eyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void g(boolean z10) {
        switch (this.x1) {
            case 3:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.y1;
                eyVar.X.r.getText().clear();
                if (z10 && eyVar.X.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(eyVar.X.r);
                }
                eyVar.X.r.clearFocus();
                eyVar.Y.b(false);
                break;
            default:
                super.g(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.x1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ProfileActivity profileActivity = (ProfileActivity) this.y1;
                int i14 = ProfileActivity.R6;
                profileActivity.x5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.x1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.y1;
                org.telegram.ui.k0 k0Var = profileActivity.X;
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
    public void p() {
        switch (this.x1) {
            case 3:
                super.p();
                ((org.telegram.ui.ey) this.y1).h.a(false, true);
                break;
            default:
                super.p();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean s() {
        switch (this.x1) {
            case 3:
                org.telegram.ui.vw vwVar = ((org.telegram.ui.ey) this.y1).G3;
                return vwVar != null && vwVar.c();
            default:
                return super.s();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.x1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((m8) this.y1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                ti tiVar = (ti) this.y1;
                th thVar = tiVar.G0;
                TextView textView = tiVar.m1;
                th thVar2 = tiVar.A1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    ti.I(tiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                    viewGroup2.invalidate();
                    if (thVar != null && thVar2 != null) {
                        if (thVar.getTag() != null) {
                            if (tiVar.B0 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (thVar2.getAlpha() != f11) {
                                    thVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            li liVar = tiVar.B0;
                            if (liVar == null || liVar.L()) {
                                thVar2.setAlpha(1.0f - f7);
                                thVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            thVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f7);
                viewGroup3 = ((org.telegram.ui.ActionBar.k3) ((oh0) this.y1)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                break;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.y1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.y1;
                secretMediaViewer.r.setAlpha(f7);
                secretMediaViewer.n.setAlpha(f7);
                break;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup4 = ((org.telegram.ui.ActionBar.k3) ((tg.y0) this.y1)).containerView;
                    viewGroup4.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.x1) {
            case 7:
                super.setTag(obj);
                tg.y0 y0Var = (tg.y0) this.y1;
                b8 b8Var = y0Var.N;
                if (b8Var != null && b8Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(y0Var, i0.a.h(y0Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.r2 r2Var = y0Var.b;
                    if (r2Var != null) {
                        AndroidUtilities.setLightStatusBar(y0Var, r2Var.isLightStatusBar());
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
        switch (this.x1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.ey) this.y1).fragmentView) != null) {
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
        switch (this.x1) {
            case 1:
                super.setVisibility(i10);
                ti.I((ti) this.y1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void t(boolean z10) {
        switch (this.x1) {
            case 3:
                org.telegram.ui.vw vwVar = ((org.telegram.ui.ey) this.y1).G3;
                if (vwVar != null && vwVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.t(z10);
                break;
            default:
                super.t(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void y(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.x1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.y1;
                super.y(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.y(i10, z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.x1 = i10;
        this.y1 = notificationCenterDelegate;
    }
}
