package ag;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.yh;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bx;
import org.telegram.ui.gy;
import org.telegram.ui.vx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d2 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int p1;
    public final /* synthetic */ Object q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Object obj, Context context, int i10) {
        super(context, null);
        this.p1 = i10;
        this.q1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.p1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.q1;
                super.D(i10, z10);
                if (!z10 && (imageView2 = profileActivity.U0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.E0 && (imageView = this.e) != null) {
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
        switch (this.p1) {
            case 4:
                return super.N(view) || view == ((gy) this.q1).i0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.p1) {
            case 4:
                super.O(viewArr, zArr);
                ((gy) this.q1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.p1) {
            case 4:
                gy gyVar = (gy) this.q1;
                vx vxVar = gyVar.T;
                if (vxVar == null || vxVar.getAlpha() <= 0.0f || !gyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void h(boolean z10) {
        switch (this.p1) {
            case 4:
                gy gyVar = (gy) this.q1;
                gyVar.T.r.getText().clear();
                if (z10 && gyVar.T.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(gyVar.T.r);
                }
                gyVar.T.r.clearFocus();
                gyVar.U.b(false);
                break;
            default:
                super.h(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.ActionBar.k, android.view.View
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

    @Override // org.telegram.ui.ActionBar.k
    public void s() {
        switch (this.p1) {
            case 4:
                super.s();
                ((gy) this.q1).h.a(false, true);
                break;
            default:
                super.s();
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
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup = ((org.telegram.ui.ActionBar.e3) ((g2) this.q1)).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((b8) this.q1)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                gi giVar = (gi) this.q1;
                ih ihVar = giVar.z0;
                TextView textView = giVar.f1;
                ih ihVar2 = giVar.t1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    gi.M(giVar);
                    viewGroup3 = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                    viewGroup3.invalidate();
                    if (ihVar != null && ihVar2 != null) {
                        if (ihVar.getTag() != null) {
                            if (giVar.u0 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (ihVar2.getAlpha() != f12) {
                                    ihVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            yh yhVar = giVar.u0;
                            if (yhVar == null || yhVar.J()) {
                                ihVar2.setAlpha(1.0f - f10);
                                ihVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            ihVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 3:
                super.setAlpha(f10);
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) ((cg0) this.q1)).containerView;
                viewGroup4.invalidate();
                break;
            case 4:
            case 6:
            default:
                super.setAlpha(f10);
                break;
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.q1).a0.invalidate();
                break;
            case 7:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.p1) {
            case 0:
                super.setTag(obj);
                g2 g2Var = (g2) this.q1;
                d2 d2Var = g2Var.J;
                if (d2Var != null && d2Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(g2Var, i0.b.f(g2Var.getThemedColor(g6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var = g2Var.b;
                    if (n2Var != null) {
                        AndroidUtilities.setLightStatusBar(g2Var, n2Var.isLightStatusBar());
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
            case 4:
                if (f10 != getTranslationY() && (view = ((gy) this.q1).fragmentView) != null) {
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
    public void setVisibility(int i10) {
        switch (this.p1) {
            case 2:
                super.setVisibility(i10);
                gi.M((gi) this.q1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean v() {
        switch (this.p1) {
            case 4:
                bx bxVar = ((gy) this.q1).B3;
                return bxVar != null && bxVar.c();
            default:
                return super.v();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void w(boolean z10) {
        switch (this.p1) {
            case 4:
                bx bxVar = ((gy) this.q1).B3;
                if (bxVar != null && bxVar.c() && getBackButton() != null) {
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
    public /* synthetic */ d2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, c6 c6Var, int i10) {
        super(context, c6Var);
        this.p1 = i10;
        this.q1 = notificationCenterDelegate;
    }
}
