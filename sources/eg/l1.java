package eg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.gy;
import org.telegram.ui.lx;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int q1;
    public final /* synthetic */ Object r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, Context context, int i10) {
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
                return super.N(view) || view == ((qy) this.r1).j0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.q1) {
            case 4:
                super.O(viewArr, zArr);
                ((qy) this.r1).h.a(true, true);
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
                qy qyVar = (qy) this.r1;
                gy gyVar = qyVar.U;
                if (gyVar == null || gyVar.getAlpha() <= 0.0f || !qyVar.b.f) {
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
                qy qyVar = (qy) this.r1;
                qyVar.U.r.getText().clear();
                if (z4 && qyVar.U.r.isFocused()) {
                    AndroidUtilities.hideKeyboard(qyVar.U.r);
                }
                qyVar.U.r.clearFocus();
                qyVar.V.b(false);
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
                org.telegram.ui.n0 n0Var = profileActivity.V;
                Rect rect = profileActivity.I2;
                n0Var.getHitRect(rect);
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
                ((qy) this.r1).h.a(false, true);
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
                    viewGroup = ((g3) ((o1) this.r1)).containerView;
                    viewGroup.invalidate();
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                viewGroup2 = ((g3) ((c8) this.r1)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                li liVar = (li) this.r1;
                mh mhVar = liVar.A0;
                TextView textView = liVar.g1;
                mh mhVar2 = liVar.u1;
                float alpha = getAlpha();
                super.setAlpha(f10);
                if (alpha != f10) {
                    if (textView != null) {
                        float f11 = 1.0f - f10;
                        textView.setAlpha(f11);
                        textView.setVisibility(f11 > 0.0f ? 0 : 8);
                    }
                    li.M(liVar);
                    viewGroup3 = ((g3) liVar).containerView;
                    viewGroup3.invalidate();
                    if (mhVar != null && mhVar2 != null) {
                        if (mhVar.getTag() != null) {
                            if (liVar.v0 == null) {
                                float f12 = f10 == 0.0f ? 1.0f : 0.0f;
                                if (mhVar2.getAlpha() != f12) {
                                    mhVar2.setAlpha(f12);
                                    break;
                                }
                            }
                        } else {
                            di diVar = liVar.v0;
                            if (diVar == null || diVar.I()) {
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
                viewGroup4 = ((g3) ((wg0) this.r1)).containerView;
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
                o1 o1Var = (o1) this.r1;
                l1 l1Var = o1Var.K;
                if (l1Var != null && l1Var.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(o1Var, i0.a.f(o1Var.getThemedColor(j6.h5)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 p2Var = o1Var.b;
                    if (p2Var != null) {
                        AndroidUtilities.setLightStatusBar(o1Var, p2Var.isLightStatusBar());
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
                if (f10 != getTranslationY() && (view = ((qy) this.r1).fragmentView) != null) {
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
                li.M((li) this.r1);
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
                lx lxVar = ((qy) this.r1).C3;
                return lxVar != null && lxVar.c();
            default:
                return super.u();
        }
    }

    @Override // org.telegram.ui.ActionBar.k
    public void v(boolean z4) {
        switch (this.q1) {
            case 4:
                lx lxVar = ((qy) this.r1).C3;
                if (lxVar != null && lxVar.c() && getBackButton() != null) {
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
    public /* synthetic */ l1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, f6 f6Var, int i10) {
        super(context, f6Var);
        this.q1 = i10;
        this.r1 = notificationCenterDelegate;
    }
}
