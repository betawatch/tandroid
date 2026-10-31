package kg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.us;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.w7;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ay;
import org.telegram.ui.px;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g1 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ int E1;
    public final /* synthetic */ Object F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Object obj, Context context, int i10) {
        super(context, null);
        this.E1 = i10;
        this.F1 = obj;
    }

    @Override // org.telegram.ui.ActionBar.l
    public void D(int i10, boolean z10) {
        ImageView imageView;
        ImageView imageView2;
        switch (this.E1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.F1;
                super.D(i10, z10);
                if (!z10) {
                    profileActivity.C5 = i10;
                    profileActivity.z5();
                }
                if (!z10 && (imageView2 = profileActivity.X0) != null) {
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

    @Override // org.telegram.ui.ActionBar.l
    public boolean N(View view) {
        switch (this.E1) {
            case 4:
                return super.N(view) || view == ((ay) this.F1).m0;
            default:
                return super.N(view);
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void O(View[] viewArr, boolean[] zArr) {
        switch (this.E1) {
            case 4:
                super.O(viewArr, zArr);
                ((ay) this.F1).h.a(true, true);
                break;
            default:
                super.O(viewArr, zArr);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.E1) {
            case 4:
                ay ayVar = (ay) this.F1;
                px pxVar = ayVar.X;
                if (pxVar == null || pxVar.getAlpha() <= 0.0f || !ayVar.b.f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.ActionBar.l
    public void k(boolean z10) {
        switch (this.E1) {
            case 4:
                ay ayVar = (ay) this.F1;
                ayVar.X.r.getText().clear();
                if (z10 && ayVar.X.r.isFocused()) {
                    org.telegram.messenger.i0.v1(ayVar.X.r);
                }
                ayVar.X.r.clearFocus();
                ayVar.Y.b(false);
                break;
            default:
                super.k(z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.E1) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                ProfileActivity profileActivity = (ProfileActivity) this.F1;
                RectF rectF = ProfileActivity.R6;
                profileActivity.K5(false);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.E1) {
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.F1;
                org.telegram.ui.l0 l0Var = profileActivity.X;
                Rect rect = profileActivity.K2;
                l0Var.getHitRect(rect);
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.E1) {
            case 0:
                if (getAlpha() != f7) {
                    super.setAlpha(f7);
                    ((i1) this.F1).b.invalidate();
                    break;
                }
                break;
            case 1:
                super.setAlpha(f7);
                ((w7) this.F1).b.invalidate();
                break;
            case 2:
                bi biVar = (bi) this.F1;
                ah ahVar = biVar.x2;
                TextView textView = biVar.d3;
                ah ahVar2 = biVar.r3;
                float alpha = getAlpha();
                super.setAlpha(f7);
                if (alpha != f7) {
                    if (textView != null) {
                        float f10 = 1.0f - f7;
                        textView.setAlpha(f10);
                        textView.setVisibility(f10 > 0.0f ? 0 : 8);
                    }
                    bi.I0(biVar);
                    biVar.b.invalidate();
                    if (ahVar != null && ahVar2 != null) {
                        if (ahVar.getTag() != null) {
                            if (biVar.s2 == null) {
                                float f11 = f7 == 0.0f ? 1.0f : 0.0f;
                                if (ahVar2.getAlpha() != f11) {
                                    ahVar2.setAlpha(f11);
                                    break;
                                }
                            }
                        } else {
                            uh uhVar = biVar.s2;
                            if (uhVar == null || uhVar.L()) {
                                ahVar2.setAlpha(1.0f - f7);
                                ahVar2.setTranslationY(org.telegram.messenger.i0.L(44.0f) * f7);
                            }
                            ahVar.setTranslationY(org.telegram.messenger.i0.L(48.0f) * f7);
                            break;
                        }
                    }
                }
                break;
            case 3:
                super.setAlpha(f7);
                ((tf0) this.F1).b.invalidate();
                break;
            case 4:
            case 6:
            default:
                super.setAlpha(f7);
                break;
            case 5:
                super.setAlpha(f7);
                ((PhotoViewer) this.F1).e0.invalidate();
                break;
            case 7:
                super.setAlpha(f7);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.F1;
                secretMediaViewer.r.setAlpha(f7);
                secretMediaViewer.n.setAlpha(f7);
                break;
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        switch (this.E1) {
            case 0:
                super.setTag(obj);
                i1 i1Var = (i1) this.F1;
                g1 g1Var = i1Var.E1;
                if (g1Var != null && g1Var.getTag() != null) {
                    org.telegram.messenger.i0.p3(i1Var, i0.b.h(t6.w0(t6.h5, i1Var.I0)) > 0.699999988079071d);
                    break;
                } else {
                    org.telegram.ui.ActionBar.k2 k2Var = i1Var.i1;
                    if (k2Var != null) {
                        org.telegram.messenger.i0.p3(i1Var, k2Var.isLightStatusBar());
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
        switch (this.E1) {
            case 4:
                if (f7 != getTranslationY() && (view = ((ay) this.F1).fragmentView) != null) {
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
        switch (this.E1) {
            case 2:
                super.setVisibility(i10);
                bi.I0((bi) this.F1);
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void t() {
        switch (this.E1) {
            case 4:
                super.t();
                ((ay) this.F1).h.a(false, true);
                break;
            default:
                super.t();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public boolean x() {
        switch (this.E1) {
            case 4:
                xw xwVar = ((ay) this.F1).F3;
                return xwVar != null && xwVar.c();
            default:
                return super.x();
        }
    }

    @Override // org.telegram.ui.ActionBar.l
    public void y(boolean z10) {
        switch (this.E1) {
            case 4:
                xw xwVar = ((ay) this.F1).F3;
                if (xwVar != null && xwVar.c() && getBackButton() != null) {
                    getBackButton().animate().alpha(z10 ? 1.0f : 0.0f).start();
                }
                super.y(z10);
                break;
            default:
                super.y(z10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(us usVar, Context context, p6 p6Var, int i10) {
        super(context, p6Var);
        this.E1 = i10;
        this.F1 = usVar;
    }
}
