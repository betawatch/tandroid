package cg;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ph;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ax;
import org.telegram.ui.fy;
import org.telegram.ui.ux;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m1 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ int p1;
    public final /* synthetic */ Object q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Object obj, Context context, int i10) {
        super(context, null);
        this.p1 = i10;
        this.q1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.l
    public void C(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.q1;
                super.C(i10, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.e) != null) {
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
    public boolean M(View view) {
        switch (this.p1) {
            case 4:
                return super.M(view) || view == ((fy) this.q1).i0;
            default:
                return super.M(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.p1) {
            case 4:
                super.O(viewArr, zArr);
                ((fy) this.q1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.p1) {
            case 4:
                fy fyVar = (fy) this.q1;
                ux uxVar = fyVar.T;
                if (uxVar == null || uxVar.getAlpha() <= 0.0f || !fyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.l
    public void h(boolean z10) {
        switch (this.p1) {
            case 4:
                fy fyVar = (fy) this.q1;
                fyVar.T.r.getText().clear();
                if (z10 && fyVar.T.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(fyVar.T.r);
                }
                fyVar.T.r.clearFocus();
                fyVar.U.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.p1) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.q1).l5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.q1;
                org.telegram.ui.n0 n0Var = profileActivity.U;
                Rect rect = profileActivity.H2;
                n0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.l
    public void r() {
        switch (this.p1) {
            case 4:
                super.r();
                ((fy) this.q1).h.a(false, true);
                break;
            default:
                super.r();
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.p1) {
            case 0:
                if (getAlpha() != f9) {
                    super.setAlpha(f9);
                    viewGroup = ((f3) ((p1) this.q1)).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 1:
                super.setAlpha(f9);
                viewGroup2 = ((f3) ((g8) this.q1)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                ni niVar = (ni) this.q1;
                ph phVar = niVar.z0;
                TextView textView = niVar.f1;
                ph phVar2 = niVar.t1;
                float alpha = getAlpha();
                super.setAlpha(f9);
                if (alpha != f9) {
                    if (textView != null) {
                        float f10 = 1.0f - f9;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    ni.L(niVar);
                    viewGroup3 = ((f3) niVar).containerView;
                    viewGroup3.invalidate();
                    if (phVar != null && phVar2 != null) {
                        if (phVar.getTag() != null) {
                            if (niVar.u0 == null) {
                                float f11 = f9 == 0.0f ? 1.0f : 0.0f;
                                if (phVar2.getAlpha() != f11) {
                                    phVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            fi fiVar = niVar.u0;
                            if (fiVar == null || fiVar.I()) {
                                phVar2.setAlpha(1.0f - f9);
                                phVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f9);
                            }
                            phVar.setTranslationY(AndroidUtilities.dp(48.0f) * f9);
                            break;
                        }
                    }
                }
                break;
            case 3:
                super.setAlpha(f9);
                viewGroup4 = ((f3) ((lg0) this.q1)).containerView;
                viewGroup4.invalidate();
                break;
            case 4:
            case 6:
            default:
                super.setAlpha(f9);
                break;
            case 5:
                super.setAlpha(f9);
                ((PhotoViewer) this.q1).a0.invalidate();
                break;
            case 7:
                super.setAlpha(f9);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q1;
                secretMediaViewer.r.setAlpha(f9);
                secretMediaViewer.n.setAlpha(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.p1) {
            case 0:
                super.setTag(obj);
                p1 p1Var = (p1) this.q1;
                m1 m1Var = p1Var.J;
                if (m1Var != null && m1Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(p1Var, i0.a.f(p1Var.getThemedColor(g6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 o2Var = p1Var.b;
                    if (o2Var != null) {
                        AndroidUtilities.setLightStatusBar(p1Var, o2Var.isLightStatusBar());
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
    public void setTranslationY(float f9) {
        View view;
        switch (this.p1) {
            case 4:
                if (f9 != getTranslationY() && (view = ((fy) this.q1).fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f9);
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.p1) {
            case 2:
                super.setVisibility(i10);
                ni.L((ni) this.q1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean u() {
        switch (this.p1) {
            case 4:
                ax axVar = ((fy) this.q1).B3;
                return axVar != null && axVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void v(boolean z10) {
        switch (this.p1) {
            case 4:
                ax axVar = ((fy) this.q1).B3;
                if (axVar != null && axVar.c() && getBackButton() != null) {
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
    public /* synthetic */ m1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, c6 c6Var, int i10) {
        super(context, c6Var);
        this.p1 = i10;
        this.q1 = notificationCenterDelegate;
    }
}
