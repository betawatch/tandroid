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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int p1;
    public final /* synthetic */ Object q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(Object obj, Context context, int i9) {
        super(context, null);
        this.p1 = i9;
        this.q1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void C(int i9, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.p1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.q1;
                super.C(i9, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.C(i9, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean M(View view) {
        switch (this.p1) {
            case 3:
                return super.M(view) || view == ((org.telegram.ui.dy) this.q1).i0;
            default:
                return super.M(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void N(View[] viewArr, boolean[] zArr) {
        switch (this.p1) {
            case 3:
                super.N(viewArr, zArr);
                ((org.telegram.ui.dy) this.q1).h.a(true, true);
                break;
            default:
                super.N(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.p1) {
            case 3:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.q1;
                org.telegram.ui.sx sxVar = dyVar.T;
                if (sxVar == null || sxVar.getAlpha() <= 0.0f || !dyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void h(boolean z10) {
        switch (this.p1) {
            case 3:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.q1;
                dyVar.T.r.getText().clear();
                if (z10 && dyVar.T.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(dyVar.T.r);
                }
                dyVar.T.r.clearFocus();
                dyVar.U.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.p1) {
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                ((ProfileActivity) this.q1).l5(false);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.p1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.q1;
                org.telegram.ui.m0 m0Var = profileActivity.U;
                Rect rect = profileActivity.H2;
                m0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void r() {
        switch (this.p1) {
            case 3:
                super.r();
                ((org.telegram.ui.dy) this.q1).h.a(false, true);
                break;
            default:
                super.r();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.p1) {
            case 0:
                super.setAlpha(f10);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((c8) this.q1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                ki kiVar = (ki) this.q1;
                mh mhVar = kiVar.z0;
                TextView textView = kiVar.f1;
                mh mhVar2 = kiVar.t1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    ki.L(kiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                    viewGroup2.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() != null) {
                            if (kiVar.u0 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (mhVar2.getAlpha() != f12) {
                                    mhVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            ci ciVar = kiVar.u0;
                            if (ciVar == null || ciVar.I()) {
                                mhVar2.setAlpha(1.0f - f10);
                                mhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            mhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f10);
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((ag0) this.q1)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f10);
                break;
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.q1).a0.invalidate();
                break;
            case 6:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
            case 7:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((zf.x0) this.q1)).containerView;
                    viewGroup4.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.p1) {
            case 7:
                super.setTag(obj);
                zf.x0 x0Var = (zf.x0) this.q1;
                r7 r7Var = x0Var.J;
                if (r7Var != null && r7Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(x0Var, i0.a.f(x0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var = x0Var.b;
                    if (o2Var != null) {
                        AndroidUtilities.setLightStatusBar(x0Var, o2Var.isLightStatusBar());
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
        switch (this.p1) {
            case 3:
                if (f10 != getTranslationY() && (view = ((org.telegram.ui.dy) this.q1).fragmentView) != null) {
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
    public void setVisibility(int i9) {
        switch (this.p1) {
            case 1:
                super.setVisibility(i9);
                ki.L((ki) this.q1);
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean u() {
        switch (this.p1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.dy) this.q1).B3;
                return ywVar != null && ywVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void v(boolean z10) {
        switch (this.p1) {
            case 3:
                org.telegram.ui.yw ywVar = ((org.telegram.ui.dy) this.q1).B3;
                if (ywVar != null && ywVar.c() && getBackButton() != null) {
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
    public /* synthetic */ r7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.p1 = i9;
        this.q1 = notificationCenterDelegate;
    }
}
