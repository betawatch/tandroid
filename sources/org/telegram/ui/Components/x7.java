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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class x7 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int u1;
    public final /* synthetic */ Object v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(Object obj, Context context, int i10) {
        super(context, null);
        this.u1 = i10;
        this.v1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void B(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.u1) {
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.v1;
                super.B(i10, z10);
                if (!z10 && (imageView2 = profileActivity.Y0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.I0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.B(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean N(View view) {
        switch (this.u1) {
            case 3:
                return super.N(view) || view == ((org.telegram.ui.uy) this.v1).m0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.u1) {
            case 3:
                super.O(viewArr, zArr);
                ((org.telegram.ui.uy) this.v1).h.a(true, true);
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
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.v1;
                org.telegram.ui.ky kyVar = uyVar.X;
                if (kyVar == null || kyVar.getAlpha() <= 0.0f || !uyVar.b.f) {
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
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.v1;
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
                org.telegram.ui.j0 j0Var = profileActivity.Y;
                Rect rect = profileActivity.L2;
                j0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void r() {
        switch (this.u1) {
            case 3:
                super.r();
                ((org.telegram.ui.uy) this.v1).h.a(false, true);
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
        switch (this.u1) {
            case 0:
                super.setAlpha(f7);
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((i8) this.v1)).containerView;
                viewGroup.invalidate();
                break;
            case 1:
                vi viVar = (vi) this.v1;
                xh xhVar = viVar.D0;
                TextView textView = viVar.j1;
                xh xhVar2 = viVar.x1;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    vi.M(viVar);
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                    viewGroup2.invalidate();
                    if (xhVar != null && xhVar2 != null) {
                        if (xhVar.getTag() != null) {
                            if (viVar.y0 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (xhVar2.getAlpha() != f11) {
                                    xhVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            ni niVar = viVar.y0;
                            if (niVar == null || niVar.J()) {
                                xhVar2.setAlpha(1.0f - f7);
                                xhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f7);
                            }
                            xhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f7);
                            break;
                        }
                    }
                }
                break;
            case 2:
                super.setAlpha(f7);
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((ch0) this.v1)).containerView;
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
                    viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((rg.x0) this.v1)).containerView;
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
                rg.x0 x0Var = (rg.x0) this.v1;
                x7 x7Var = x0Var.N;
                if (x7Var != null && x7Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(x0Var, i0.a.f(x0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var = x0Var.b;
                    if (n2Var != null) {
                        AndroidUtilities.setLightStatusBar(x0Var, n2Var.isLightStatusBar());
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
                if (f7 != getTranslationY() && (view = ((org.telegram.ui.uy) this.v1).fragmentView) != null) {
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
                vi.M((vi) this.v1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean u() {
        switch (this.u1) {
            case 3:
                org.telegram.ui.ox oxVar = ((org.telegram.ui.uy) this.v1).F3;
                return oxVar != null && oxVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void v(boolean z10) {
        switch (this.u1) {
            case 3:
                org.telegram.ui.ox oxVar = ((org.telegram.ui.uy) this.v1).F3;
                if (oxVar != null && oxVar.c() && getBackButton() != null) {
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
    public /* synthetic */ x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.u1 = i10;
        this.v1 = notificationCenterDelegate;
    }
}
