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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class y7 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ int t1;
    public final /* synthetic */ Object u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7(Object obj, Context context, int i10) {
        super(context, null);
        this.t1 = i10;
        this.u1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.l
    public void C(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.t1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.u1;
                super.C(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.C(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean N(View view) {
        switch (this.t1) {
            case 3:
                return super.N(view) || view == ((org.telegram.ui.wy) this.u1).m0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.t1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.wy) this.u1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.t1) {
            case 3:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.u1;
                org.telegram.ui.my myVar = wyVar.X;
                if (myVar == null || myVar.getAlpha() <= 0.0f || !wyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.l
    public void h(boolean z10) {
        switch (this.t1) {
            case 3:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.u1;
                wyVar.X.r.getText().clear();
                if (z10 && wyVar.X.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(wyVar.X.r);
                }
                wyVar.X.r.clearFocus();
                wyVar.Y.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.t1) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.u1).l5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.t1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.u1;
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

    @Override // org.telegram.ui.ActionBar.l
    public void r() {
        switch (this.t1) {
            case 3:
                super.r();
                ((org.telegram.ui.wy) this.u1).h.a(false, true);
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
        switch (this.t1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((j8) this.u1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                yi yiVar = (yi) this.u1;
                ai aiVar = yiVar.D0;
                TextView textView = yiVar.j1;
                ai aiVar2 = yiVar.x1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    yi.M(yiVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                    viewGroup2.invalidate();
                    if (aiVar != null && aiVar2 != null) {
                        if (aiVar.getTag() != null) {
                            if (yiVar.y0 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (aiVar2.getAlpha() != f11) {
                                    aiVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            qi qiVar = yiVar.y0;
                            if (qiVar == null || qiVar.J()) {
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
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((zg0) this.u1)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
            case 5:
            default:
                super.setAlpha(f7);
                break;
            case 4:
                super.setAlpha(f7);
                ((PhotoViewer) this.u1).e0.invalidate();
                break;
            case 6:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.u1;
                secretMediaViewer.r.setAlpha(f7);
                secretMediaViewer.n.setAlpha(f7);
                break;
            case 7:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    viewGroup4 = ((org.telegram.ui.ActionBar.h3) ((qg.a1) this.u1)).containerView;
                    viewGroup4.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.t1) {
            case 7:
                super.setTag(obj);
                qg.a1 a1Var = (qg.a1) this.u1;
                y7 y7Var = a1Var.N;
                if (y7Var != null && y7Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(a1Var, i0.a.f(a1Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var = a1Var.b;
                    if (p2Var != null) {
                        AndroidUtilities.setLightStatusBar(a1Var, p2Var.isLightStatusBar());
                        break;
                    }
                }
                break;
            default:
                super.setTag(obj);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public void setTranslationY(float f7) {
        View view;
        switch (this.t1) {
            case 3:
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.wy) this.u1).fragmentView) != null) {
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
        switch (this.t1) {
            case 1:
                super.setVisibility(i10);
                yi.M((yi) this.u1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean u() {
        switch (this.t1) {
            case 3:
                org.telegram.ui.qx qxVar = ((org.telegram.ui.wy) this.u1).F3;
                return qxVar != null && qxVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void v(boolean z10) {
        switch (this.t1) {
            case 3:
                org.telegram.ui.qx qxVar = ((org.telegram.ui.wy) this.u1).F3;
                if (qxVar != null && qxVar.c() && getBackButton() != null) {
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
    public /* synthetic */ y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.t1 = i10;
        this.u1 = notificationCenterDelegate;
    }
}
