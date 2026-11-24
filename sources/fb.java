// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0456  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean z;
        final byte b = 0;
        final byte b2 = 1;
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.b;
                FrameLayout frameLayout = gbVar.a;
                int height = frameLayout.getHeight();
                int i = height - gbVar.i();
                int i2 = gbVar.i;
                if (i != i2 - gbVar.k && height != i2 && gbVar.m == null) {
                    if (gbVar.b() && Math.abs(gbVar.i - height) >= gm.L(20.0f)) {
                        if (gbVar.i != -1 && gbVar.j == gbVar.c.getHeight()) {
                            boolean z2 = height < gbVar.c.getBottom();
                            gbVar.s = z2;
                            int i3 = gbVar.i;
                            if (gbVar.v) {
                                gbVar.v = false;
                            } else if (gbVar.u) {
                                ValueAnimator valueAnimator = gbVar.m;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                int i4 = gbVar.i();
                                ArrayList arrayList = gbVar.o;
                                arrayList.clear();
                                View view = frameLayout;
                                while (view != null) {
                                    arrayList.add(view);
                                    if (view != gbVar.d) {
                                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                                    } else {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        int expandedHeight = (launchActivity != null || launchActivity.O() == null) ? 0 : LaunchActivity.H1.O().getExpandedHeight();
                                        z = gbVar instanceof j92;
                                        if (!z) {
                                            gbVar.h(Math.max(i3, height + expandedHeight));
                                        }
                                        gbVar.d.requestLayout();
                                        gbVar.g(height, z2);
                                        float f = height - i3;
                                        gbVar.f = true;
                                        if (height <= i3) {
                                            float f2 = f - i4;
                                            if (!z) {
                                                frameLayout.setTranslationY(-f2);
                                            }
                                            gbVar.e(f2, 1.0f, z2);
                                            gbVar.p = -f2;
                                            gbVar.q = -expandedHeight;
                                            gbVar.r = true;
                                        } else {
                                            if (!z) {
                                                frameLayout.setTranslationY(gbVar.k);
                                            }
                                            gbVar.e(-gbVar.k, 0.0f, z2);
                                            gbVar.q = -gbVar.k;
                                            gbVar.p = f;
                                            gbVar.r = false;
                                        }
                                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        gbVar.m = ofFloat;
                                        gbVar.e = false;
                                        ofFloat.addUpdateListener(new f0(gbVar, (byte) 4));
                                        gbVar.m.addListener(new g0(gbVar, (byte) 5));
                                        gbVar.m.setDuration(250L);
                                        gbVar.m.setInterpolator(gb.w);
                                        gbVar.n.d();
                                        if (gbVar.g) {
                                            gbVar.m.start();
                                        } else {
                                            gbVar.g = false;
                                            SystemClock.elapsedRealtime();
                                            gm.d3(gbVar.h, 100L);
                                        }
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 != null) {
                                }
                                z = gbVar instanceof j92;
                                if (!z) {
                                }
                                gbVar.d.requestLayout();
                                gbVar.g(height, z2);
                                float f3 = height - i3;
                                gbVar.f = true;
                                if (height <= i3) {
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                gbVar.m = ofFloat2;
                                gbVar.e = false;
                                ofFloat2.addUpdateListener(new f0(gbVar, (byte) 4));
                                gbVar.m.addListener(new g0(gbVar, (byte) 5));
                                gbVar.m.setDuration(250L);
                                gbVar.m.setInterpolator(gb.w);
                                gbVar.n.d();
                                if (gbVar.g) {
                                }
                            }
                            gbVar.i = height;
                            gbVar.j = gbVar.c.getHeight();
                            gbVar.k = gbVar.i();
                            break;
                        } else {
                            gbVar.i = height;
                            gbVar.j = gbVar.c.getHeight();
                            gbVar.k = gbVar.i();
                            break;
                        }
                    } else {
                        gbVar.i = height;
                        gbVar.j = gbVar.c.getHeight();
                        gbVar.k = gbVar.i();
                        gbVar.e = false;
                    }
                } else if (gbVar.m == null) {
                    gbVar.i = height;
                    gbVar.j = gbVar.c.getHeight();
                    gbVar.k = gbVar.i();
                    gbVar.e = false;
                }
                break;
            case 1:
                w81 w81Var = (w81) this.b;
                FrameLayout frameLayout2 = w81Var.c;
                if (!w81Var.E) {
                    float max = Math.max(0.0f, w81Var.y - w81Var.getY());
                    if (frameLayout2.getTranslationY() != max) {
                        frameLayout2.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 2:
                ((uv3) this.b).a.m1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                ((a91) this.b).invalidate();
                break;
            case 4:
                oa5 oa5Var = (oa5) this.b;
                ra5 ra5Var = oa5Var.f;
                z81 z81Var = oa5Var.e;
                z81Var.getViewTreeObserver().removeOnPreDrawListener(this);
                z81Var.getLocationOnScreen(oa5Var.I);
                float f4 = oa5Var.s.x + oa5Var.S;
                ta5 ta5Var = oa5Var.W;
                float measuredWidth = ((ta5Var.getMeasuredWidth() / 2.0f) + f4) - r0[0];
                float measuredWidth2 = ((ta5Var.getMeasuredWidth() / 2.0f) + (oa5Var.s.y + oa5Var.T)) - r0[1];
                boolean z3 = measuredWidth2 - ((float) gm.L(61.0f)) > 0.0f && ((float) gm.L(61.0f)) + measuredWidth2 < ((float) z81Var.getMeasuredHeight());
                if (gm.L(61.0f) + measuredWidth + ra5Var.getMeasuredWidth() < z81Var.getMeasuredWidth() - gm.L(16.0f) && z3) {
                    ra5Var.setTranslationX(gm.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / z81Var.getMeasuredHeight();
                    float L = gm.L(40.0f) / ra5Var.getMeasuredHeight();
                    ra5Var.setTranslationY((int) (measuredWidth2 - (ra5Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    ra5Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - gm.L(61.0f)) - ra5Var.getMeasuredWidth() > gm.L(16.0f) && z3) {
                    float L2 = gm.L(40.0f) / ra5Var.getMeasuredHeight();
                    float max2 = Math.max(L2, Math.min(measuredWidth2 / z81Var.getMeasuredHeight(), 1.0f - L2));
                    ra5Var.setTranslationX((int) ((measuredWidth - gm.L(61.0f)) - ra5Var.getMeasuredWidth()));
                    ra5Var.setTranslationY((int) (measuredWidth2 - (ra5Var.getMeasuredHeight() * max2)));
                    ra5Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= z81Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / z81Var.getMeasuredWidth();
                    float L3 = gm.L(40.0f) / ra5Var.getMeasuredWidth();
                    ra5Var.setTranslationX((int) (measuredWidth - (ra5Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    ra5Var.setTranslationY((int) (gm.L(61.0f) + measuredWidth2));
                    ra5Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / z81Var.getMeasuredWidth();
                    float L4 = gm.L(40.0f) / ra5Var.getMeasuredWidth();
                    ra5Var.setTranslationX((int) (measuredWidth - (ra5Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    ra5Var.setTranslationY((int) ((measuredWidth2 - ra5Var.getMeasuredHeight()) - gm.L(61.0f)));
                    ra5Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 5:
                View view2 = ((xl5) this.b).fragmentView;
                if (view2 != null) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((xl5) this.b).f.setOrientation(0);
                    } else {
                        ((xl5) this.b).f.setOrientation(1);
                    }
                    View view3 = ((xl5) this.b).fragmentView;
                    view3.setPadding(view3.getPaddingLeft(), 0, ((xl5) this.b).fragmentView.getPaddingRight(), ((xl5) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 6:
                ((a91) this.b).invalidate();
                break;
            case 7:
                j68 j68Var = (j68) this.b;
                if (j68Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    j68Var.f = (byte) 2;
                    if (!gm.O1() && (rotation2 == 3 || rotation2 == 1)) {
                        j68Var.f = (byte) 4;
                    }
                    j68Var.n.f();
                }
                r59 r59Var = ((j68) this.b).h;
                if (r59Var != null) {
                    r59Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        gm.d3(new Runnable(this) { // from class: za8
                            public final /* synthetic */ fb b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b;
                                fb fbVar = this.b;
                                switch (b3) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) fbVar.b;
                                        photoViewer2.x3.setVisibility(4);
                                        photoViewer2.x3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.C3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.C3 = null;
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) fbVar.b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.O();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.x3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                    }
                }
                gm.c3(new Runnable(this) { // from class: za8
                    public final /* synthetic */ fb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        fb fbVar = this.b;
                        switch (b3) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) fbVar.b;
                                photoViewer2.x3.setVisibility(4);
                                photoViewer2.x3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.C3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.C3 = null;
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) fbVar.b;
                                if (photoViewer3.J3) {
                                    photoViewer3.O();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.G3 = (byte) 0;
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.e7;
                    profileActivity.H1();
                    profileActivity.Q2(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 10:
                tob tobVar = (tob) ((rm3) this.b).b;
                tobVar.getViewTreeObserver().removeOnPreDrawListener(this);
                tobVar.getTransitionParams().e();
                tobVar.getTransitionParams().a();
                tobVar.getTransitionParams().h = true;
                tobVar.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new rha(this, (byte) 25));
                ofFloat3.addListener(new q7b(this, (byte) 5));
                ofFloat3.start();
                break;
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (gm.O1()) {
                        wallpapersListActivity.O = (byte) 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.O = (byte) 5;
                    } else {
                        wallpapersListActivity.O = (byte) 3;
                    }
                    wallpapersListActivity.H0();
                }
                r59 r59Var2 = ((WallpapersListActivity) this.b).G;
                if (r59Var2 != null) {
                    r59Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                tvc tvcVar = (tvc) ((tr5) this.b).b;
                tvcVar.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView2 = tvcVar.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                    tvcVar.e.setImageDrawable(null);
                    Bitmap bitmap2 = tvcVar.h;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        tvcVar.h = null;
                    }
                }
                gm.c3(new cpc(this, (byte) 11));
                tvcVar.r = (byte) 0;
                break;
        }
        return true;
    }
}
