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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0454  */
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
                    if (gbVar.b() && Math.abs(gbVar.i - height) >= gl.L(20.0f)) {
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
                                        z = gbVar instanceof y72;
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
                                            gl.d3(gbVar.h, 100L);
                                        }
                                    }
                                }
                                LaunchActivity launchActivity2 = LaunchActivity.H1;
                                if (launchActivity2 != null) {
                                }
                                z = gbVar instanceof y72;
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
                o71 o71Var = (o71) this.b;
                FrameLayout frameLayout2 = o71Var.c;
                if (!o71Var.E) {
                    float max = Math.max(0.0f, o71Var.y - o71Var.getY());
                    if (frameLayout2.getTranslationY() != max) {
                        frameLayout2.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 2:
                ((ju3) this.b).a.m1.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            case 3:
                ((s71) this.b).invalidate();
                break;
            case 4:
                o85 o85Var = (o85) this.b;
                r85 r85Var = o85Var.f;
                r71 r71Var = o85Var.e;
                r71Var.getViewTreeObserver().removeOnPreDrawListener(this);
                r71Var.getLocationOnScreen(o85Var.I);
                float f4 = o85Var.s.x + o85Var.S;
                t85 t85Var = o85Var.W;
                float measuredWidth = ((t85Var.getMeasuredWidth() / 2.0f) + f4) - r0[0];
                float measuredWidth2 = ((t85Var.getMeasuredWidth() / 2.0f) + (o85Var.s.y + o85Var.T)) - r0[1];
                boolean z3 = measuredWidth2 - ((float) gl.L(61.0f)) > 0.0f && ((float) gl.L(61.0f)) + measuredWidth2 < ((float) r71Var.getMeasuredHeight());
                if (gl.L(61.0f) + measuredWidth + r85Var.getMeasuredWidth() < r71Var.getMeasuredWidth() - gl.L(16.0f) && z3) {
                    r85Var.setTranslationX(gl.L(61.0f) + measuredWidth);
                    float measuredHeight = measuredWidth2 / r71Var.getMeasuredHeight();
                    float L = gl.L(40.0f) / r85Var.getMeasuredHeight();
                    r85Var.setTranslationY((int) (measuredWidth2 - (r85Var.getMeasuredHeight() * Math.max(L, Math.min(measuredHeight, 1.0f - L)))));
                    r85Var.a(measuredWidth, measuredWidth2, 0);
                    break;
                } else if ((measuredWidth - gl.L(61.0f)) - r85Var.getMeasuredWidth() > gl.L(16.0f) && z3) {
                    float L2 = gl.L(40.0f) / r85Var.getMeasuredHeight();
                    float max2 = Math.max(L2, Math.min(measuredWidth2 / r71Var.getMeasuredHeight(), 1.0f - L2));
                    r85Var.setTranslationX((int) ((measuredWidth - gl.L(61.0f)) - r85Var.getMeasuredWidth()));
                    r85Var.setTranslationY((int) (measuredWidth2 - (r85Var.getMeasuredHeight() * max2)));
                    r85Var.a(measuredWidth, measuredWidth2, 1);
                    break;
                } else if (measuredWidth2 <= r71Var.getMeasuredHeight() * 0.3f) {
                    float measuredWidth3 = measuredWidth / r71Var.getMeasuredWidth();
                    float L3 = gl.L(40.0f) / r85Var.getMeasuredWidth();
                    r85Var.setTranslationX((int) (measuredWidth - (r85Var.getMeasuredWidth() * Math.max(L3, Math.min(measuredWidth3, 1.0f - L3)))));
                    r85Var.setTranslationY((int) (gl.L(61.0f) + measuredWidth2));
                    r85Var.a(measuredWidth, measuredWidth2, 2);
                    break;
                } else {
                    float measuredWidth4 = measuredWidth / r71Var.getMeasuredWidth();
                    float L4 = gl.L(40.0f) / r85Var.getMeasuredWidth();
                    r85Var.setTranslationX((int) (measuredWidth - (r85Var.getMeasuredWidth() * Math.max(L4, Math.min(measuredWidth4, 1.0f - L4)))));
                    r85Var.setTranslationY((int) ((measuredWidth2 - r85Var.getMeasuredHeight()) - gl.L(61.0f)));
                    r85Var.a(measuredWidth, measuredWidth2, 3);
                    break;
                }
                break;
            case 5:
                View view2 = ((xj5) this.b).fragmentView;
                if (view2 != null) {
                    view2.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((xj5) this.b).f.setOrientation(0);
                    } else {
                        ((xj5) this.b).f.setOrientation(1);
                    }
                    View view3 = ((xj5) this.b).fragmentView;
                    view3.setPadding(view3.getPaddingLeft(), 0, ((xj5) this.b).fragmentView.getPaddingRight(), ((xj5) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 6:
                ((s71) this.b).invalidate();
                break;
            case 7:
                g48 g48Var = (g48) this.b;
                if (g48Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    g48Var.f = (byte) 2;
                    if (!gl.O1() && (rotation2 == 3 || rotation2 == 1)) {
                        g48Var.f = (byte) 4;
                    }
                    g48Var.n.f();
                }
                o39 o39Var = ((g48) this.b).h;
                if (o39Var != null) {
                    o39Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        gl.d3(new Runnable(this) { // from class: y88
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
                                            photoViewer3.P();
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
                gl.c3(new Runnable(this) { // from class: y88
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
                                    photoViewer3.P();
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
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.F1();
                    profileActivity.N2(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 10:
                smb smbVar = (smb) ((gl3) this.b).b;
                smbVar.getViewTreeObserver().removeOnPreDrawListener(this);
                smbVar.getTransitionParams().e();
                smbVar.getTransitionParams().a();
                smbVar.getTransitionParams().h = true;
                smbVar.getTransitionParams().L1 = 0.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.addUpdateListener(new gja(this, (byte) 23));
                ofFloat3.addListener(new iab(this, (byte) 3));
                ofFloat3.start();
                break;
            case 11:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (gl.O1()) {
                        wallpapersListActivity.O = (byte) 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.O = (byte) 5;
                    } else {
                        wallpapersListActivity.O = (byte) 3;
                    }
                    wallpapersListActivity.G0();
                }
                o39 o39Var2 = ((WallpapersListActivity) this.b).G;
                if (o39Var2 != null) {
                    o39Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                stc stcVar = (stc) ((up5) this.b).b;
                stcVar.n.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView2 = stcVar.e;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                    stcVar.e.setImageDrawable(null);
                    Bitmap bitmap2 = stcVar.h;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        stcVar.h = null;
                    }
                }
                gl.c3(new frc(this, (byte) 3));
                stcVar.r = (byte) 0;
                break;
        }
        return true;
    }
}
