package fg;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.fy;
import org.telegram.ui.kx;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int q1;
    public final /* synthetic */ Object r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, Context context, int i10) {
        super(context, null);
        this.q1 = i10;
        this.r1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public void C(int i10, boolean z4) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.r1;
                super.C(i10, z4);
                if (!z4 && (imageView2 = profileActivity.V0) != null) {
                    imageView2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
                if (profileActivity.F0 && (imageView = this.e) != null) {
                    imageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    break;
                }
                break;
            default:
                super.C(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean N(View view) {
        switch (this.q1) {
            case 4:
                return super.N(view) || view == ((py) this.r1).j0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.q1) {
            case 4:
                super.O(viewArr, zArr);
                ((py) this.r1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.q1) {
            case 4:
                py pyVar = (py) this.r1;
                fy fyVar = pyVar.U;
                if (fyVar == null || fyVar.getAlpha() <= 0.0f || !pyVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void h(boolean z4) {
        switch (this.q1) {
            case 4:
                py pyVar = (py) this.r1;
                pyVar.U.r.getText().clear();
                if (z4 && pyVar.U.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(pyVar.U.r);
                }
                pyVar.U.r.clearFocus();
                pyVar.V.b(false);
                break;
            default:
                super.h(z4);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.q1) {
            case 6:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.r1).l5(false);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.q1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.r1;
                org.telegram.ui.l0 l0Var = profileActivity.V;
                Rect rect = profileActivity.I2;
                l0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.k
    public void r() {
        switch (this.q1) {
            case 4:
                super.r();
                ((py) this.r1).h.a(false, true);
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
        switch (this.q1) {
            case 0:
                if (getAlpha() != f10) {
                    super.setAlpha(f10);
                    viewGroup = ((h3) ((n1) this.r1)).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                viewGroup2 = ((h3) ((c8) this.r1)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                mi miVar = (mi) this.r1;
                mh mhVar = miVar.A0;
                TextView textView = miVar.g1;
                mh mhVar2 = miVar.u1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    mi.M(miVar);
                    viewGroup3 = ((h3) miVar).containerView;
                    viewGroup3.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() != null) {
                            if (miVar.v0 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (mhVar2.getAlpha() != f12) {
                                    mhVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            ei eiVar = miVar.v0;
                            if (eiVar == null || eiVar.I()) {
                                mhVar2.setAlpha(1.0f - f10);
                                mhVar2.setTranslationY(AndroidUtilities.dp(44.0f) * f10);
                            }
                            mhVar.setTranslationY(AndroidUtilities.dp(48.0f) * f10);
                            break;
                        }
                    }
                }
                break;
            case 3:
                super.setAlpha(f10);
                viewGroup4 = ((h3) ((xg0) this.r1)).containerView;
                viewGroup4.invalidate();
                break;
            case 4:
            case 6:
            default:
                super.setAlpha(f10);
                break;
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.r1).b0.invalidate();
                break;
            case 7:
                super.setAlpha(f10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.r1;
                secretMediaViewer.r.setAlpha(f10);
                secretMediaViewer.n.setAlpha(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.q1) {
            case 0:
                super.setTag(obj);
                n1 n1Var = (n1) this.r1;
                k1 k1Var = n1Var.K;
                if (k1Var != null && k1Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(n1Var, i0.a.f(n1Var.getThemedColor(k6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var = n1Var.b;
                    if (p2Var != null) {
                        AndroidUtilities.setLightStatusBar(n1Var, p2Var.isLightStatusBar());
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
        switch (this.q1) {
            case 4:
                if (f10 != getTranslationY() && (view = ((py) this.r1).fragmentView) != null) {
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
        switch (this.q1) {
            case 2:
                super.setVisibility(i10);
                mi.M((mi) this.r1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public boolean u() {
        switch (this.q1) {
            case 4:
                kx kxVar = ((py) this.r1).C3;
                return kxVar != null && kxVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void v(boolean z4) {
        switch (this.q1) {
            case 4:
                kx kxVar = ((py) this.r1).C3;
                if (kxVar != null && kxVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z4 ? 1.0f : 0.0f).start();
                }
                super.v(z4);
                break;
            default:
                super.v(z4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, g6 g6Var, int i10) {
        super(context, g6Var);
        this.q1 = i10;
        this.r1 = notificationCenterDelegate;
    }
}
