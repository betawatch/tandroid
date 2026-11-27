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
import java.util.Collections;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04c8  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean z;
        Object[] objArr = 0;
        final byte b = 1;
        switch (this.a) {
            case 0:
                hb hbVar = (hb) this.b;
                FrameLayout frameLayout = hbVar.a;
                int height = frameLayout.getHeight();
                int i = height - hbVar.i();
                int i2 = hbVar.i;
                if (i == i2 - hbVar.k || height == i2 || hbVar.m != null) {
                    if (hbVar.m == null) {
                        hbVar.i = height;
                        hbVar.j = hbVar.c.getHeight();
                        hbVar.k = hbVar.i();
                        hbVar.e = false;
                    }
                } else if (!hbVar.b() || Math.abs(hbVar.i - height) < hl.L(20.0f)) {
                    hbVar.i = height;
                    hbVar.j = hbVar.c.getHeight();
                    hbVar.k = hbVar.i();
                    hbVar.e = false;
                } else if (hbVar.i == -1 || hbVar.j != hbVar.c.getHeight()) {
                    hbVar.i = height;
                    hbVar.j = hbVar.c.getHeight();
                    hbVar.k = hbVar.i();
                    break;
                } else {
                    boolean z2 = height < hbVar.c.getBottom();
                    hbVar.s = z2;
                    int i3 = hbVar.i;
                    if (hbVar.v) {
                        hbVar.v = false;
                    } else if (hbVar.u) {
                        ValueAnimator valueAnimator = hbVar.m;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int i4 = hbVar.i();
                        ArrayList arrayList = hbVar.o;
                        arrayList.clear();
                        View view = frameLayout;
                        while (view != null) {
                            arrayList.add(view);
                            if (view != hbVar.d) {
                                view = view.getParent() instanceof View ? (View) view.getParent() : null;
                            } else {
                                LaunchActivity launchActivity = LaunchActivity.H1;
                                int expandedHeight = (launchActivity != null || launchActivity.O() == null) ? 0 : LaunchActivity.H1.O().getExpandedHeight();
                                z = hbVar instanceof p82;
                                if (!z) {
                                    hbVar.h(Math.max(i3, height + expandedHeight));
                                }
                                hbVar.d.requestLayout();
                                hbVar.g(height, z2);
                                float f = height - i3;
                                hbVar.f = true;
                                if (height <= i3) {
                                    float f2 = f - i4;
                                    if (!z) {
                                        frameLayout.setTranslationY(-f2);
                                    }
                                    hbVar.e(f2, 1.0f, z2);
                                    hbVar.p = -f2;
                                    hbVar.q = -expandedHeight;
                                    hbVar.r = true;
                                } else {
                                    if (!z) {
                                        frameLayout.setTranslationY(hbVar.k);
                                    }
                                    hbVar.e(-hbVar.k, 0.0f, z2);
                                    hbVar.q = -hbVar.k;
                                    hbVar.p = f;
                                    hbVar.r = false;
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                hbVar.m = ofFloat;
                                hbVar.e = false;
                                ofFloat.addUpdateListener(new g0(hbVar, (byte) 4));
                                hbVar.m.addListener(new h0(hbVar, (byte) 5));
                                hbVar.m.setDuration(250L);
                                hbVar.m.setInterpolator(hb.w);
                                hbVar.n.d();
                                if (hbVar.g) {
                                    hbVar.m.start();
                                } else {
                                    hbVar.g = false;
                                    SystemClock.elapsedRealtime();
                                    hl.d3(hbVar.h, 100L);
                                }
                            }
                        }
                        LaunchActivity launchActivity2 = LaunchActivity.H1;
                        if (launchActivity2 != null) {
                        }
                        z = hbVar instanceof p82;
                        if (!z) {
                        }
                        hbVar.d.requestLayout();
                        hbVar.g(height, z2);
                        float f3 = height - i3;
                        hbVar.f = true;
                        if (height <= i3) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        hbVar.m = ofFloat2;
                        hbVar.e = false;
                        ofFloat2.addUpdateListener(new g0(hbVar, (byte) 4));
                        hbVar.m.addListener(new h0(hbVar, (byte) 5));
                        hbVar.m.setDuration(250L);
                        hbVar.m.setInterpolator(hb.w);
                        hbVar.n.d();
                        if (hbVar.g) {
                        }
                    }
                    hbVar.i = height;
                    hbVar.j = hbVar.c.getHeight();
                    hbVar.k = hbVar.i();
                    break;
                }
                break;
            case 1:
                w71 w71Var = (w71) this.b;
                FrameLayout frameLayout2 = w71Var.c;
                if (!w71Var.E) {
                    float max = Math.max(0.0f, w71Var.y - w71Var.getY());
                    if (frameLayout2.getTranslationY() != max) {
                        frameLayout2.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 2:
                ((dv3) this.b).a.m1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                ((a81) this.b).invalidate();
                break;
            case 4:
                ra5 ra5Var = (ra5) this.b;
                va5 va5Var = ra5Var.f;
                z71 z71Var = ra5Var.e;
                z71Var.getViewTreeObserver().removeOnPreDrawListener(this);
                z71Var.getLocationOnScreen(ra5Var.I);
                float f4 = ra5Var.s.x + ra5Var.S;
                xa5 xa5Var = ra5Var.W;
                float measuredWidth = ((xa5Var.getMeasuredWidth() / 2.0f) + f4) - r0[0];
                float measuredWidth2 = ((xa5Var.getMeasuredWidth() / 2.0f) + (ra5Var.s.y + ra5Var.T)) - r0[1];
                Object[] objArr2 = measuredWidth2 - ((float) hl.L(61.0f)) > 0.0f && ((float) hl.L(61.0f)) + measuredWidth2 < ((float) z71Var.getMeasuredHeight());
                if (hl.L(61.0f) + measuredWidth + va5Var.getMeasuredWidth() >= z71Var.getMeasuredWidth() - hl.L(16.0f) || objArr2 != true) {
                    if ((measuredWidth - hl.L(61.0f)) - va5Var.getMeasuredWidth() <= hl.L(16.0f) || objArr2 != true) {
                        if (measuredWidth2 > z71Var.getMeasuredHeight() * 0.3f) {
                            float measuredWidth3 = measuredWidth / z71Var.getMeasuredWidth();
                            float L = hl.L(40.0f) / va5Var.getMeasuredWidth();
                            va5Var.setTranslationX((int) (measuredWidth - (va5Var.getMeasuredWidth() * Math.max(L, Math.min(measuredWidth3, 1.0f - L)))));
                            va5Var.setTranslationY((int) ((measuredWidth2 - va5Var.getMeasuredHeight()) - hl.L(61.0f)));
                            va5Var.a(measuredWidth, measuredWidth2, 3);
                            break;
                        } else {
                            float measuredWidth4 = measuredWidth / z71Var.getMeasuredWidth();
                            float L2 = hl.L(40.0f) / va5Var.getMeasuredWidth();
                            va5Var.setTranslationX((int) (measuredWidth - (va5Var.getMeasuredWidth() * Math.max(L2, Math.min(measuredWidth4, 1.0f - L2)))));
                            va5Var.setTranslationY((int) (hl.L(61.0f) + measuredWidth2));
                            va5Var.a(measuredWidth, measuredWidth2, 2);
                            break;
                        }
                    } else {
                        float L3 = hl.L(40.0f) / va5Var.getMeasuredHeight();
                        float max2 = Math.max(L3, Math.min(measuredWidth2 / z71Var.getMeasuredHeight(), 1.0f - L3));
                        va5Var.setTranslationX((int) ((measuredWidth - hl.L(61.0f)) - va5Var.getMeasuredWidth()));
                        va5Var.setTranslationY((int) (measuredWidth2 - (va5Var.getMeasuredHeight() * max2)));
                        va5Var.a(measuredWidth, measuredWidth2, 1);
                        break;
                    }
                } else {
                    va5Var.setTranslationX(hl.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / z71Var.getMeasuredHeight();
                    float L4 = hl.L(40.0f) / va5Var.getMeasuredHeight();
                    va5Var.setTranslationY((int) (measuredWidth2 - (va5Var.getMeasuredHeight() * Math.max(L4, Math.min(measuredHeight, 1.0f - L4)))));
                    va5Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                }
                break;
            case 5:
                View view2 = ((am5) this.b).fragmentView;
                if (view2 != null) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((am5) this.b).f.setOrientation(0);
                    } else {
                        ((am5) this.b).f.setOrientation(1);
                    }
                    View view3 = ((am5) this.b).fragmentView;
                    view3.setPadding(view3.getPaddingLeft(), 0, ((am5) this.b).fragmentView.getPaddingRight(), ((am5) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 6:
                ((a81) this.b).invalidate();
                break;
            case 7:
                im7 im7Var = (im7) this.b;
                im7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < im7Var.getChildCount(); i5++) {
                    arrayList2.add(im7Var.getChildAt(i5));
                }
                Collections.sort(arrayList2, new vk6((byte) 29));
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    View view4 = (View) arrayList2.get(i6);
                    view4.animate().cancel();
                    view4.setAlpha(0.0f);
                    view4.setTranslationY(hl.L(24.0f));
                    view4.animate().alpha(1.0f).translationY(0.0f).setStartDelay(i6 * 40).setDuration(360L).setInterpolator(k43.h).start();
                }
                break;
            case 8:
                w78 w78Var = (w78) this.b;
                if (w78Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    w78Var.f = (byte) 2;
                    if (!hl.O1() && (rotation2 == 3 || rotation2 == 1)) {
                        w78Var.f = (byte) 4;
                    }
                    w78Var.n.f();
                }
                d79 d79Var = ((w78) this.b).h;
                if (d79Var != null) {
                    d79Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        final Object[] objArr3 = objArr == true ? 1 : 0;
                        hl.d3(new Runnable(this) { // from class: oc8
                            public final /* synthetic */ gb b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = objArr3;
                                gb gbVar = this.b;
                                switch (b2) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) gbVar.b;
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
                                        PhotoViewer photoViewer3 = (PhotoViewer) gbVar.b;
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
                hl.c3(new Runnable(this) { // from class: oc8
                    public final /* synthetic */ gb b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        gb gbVar = this.b;
                        switch (b2) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) gbVar.b;
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
                                PhotoViewer photoViewer3 = (PhotoViewer) gbVar.b;
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
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.G1();
                    profileActivity.O2(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 11:
                rqb rqbVar = (rqb) ((yl3) this.b).b;
                rqbVar.getViewTreeObserver().removeOnPreDrawListener(this);
                rqbVar.getTransitionParams().e();
                rqbVar.getTransitionParams().a();
                rqbVar.getTransitionParams().h = true;
                rqbVar.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new ija(this, (byte) 25));
                ofFloat3.addListener(new omb(this, (byte) 2));
                ofFloat3.start();
                break;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (hl.O1()) {
                        wallpapersListActivity.O = (byte) 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.O = (byte) 5;
                    } else {
                        wallpapersListActivity.O = (byte) 3;
                    }
                    wallpapersListActivity.H0();
                }
                d79 d79Var2 = ((WallpapersListActivity) this.b).G;
                if (d79Var2 != null) {
                    d79Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                hyc hycVar = (hyc) ((wr5) this.b).b;
                hycVar.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView2 = hycVar.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                    hycVar.e.setImageDrawable(null);
                    Bitmap bitmap2 = hycVar.h;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        hycVar.h = null;
                    }
                }
                hl.c3(new olc(this, (byte) 20));
                hycVar.r = (byte) 0;
                break;
        }
        return true;
    }
}
