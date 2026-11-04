package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f7(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i3 = 0;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                u7 u7Var = (u7) this.b;
                FrameLayout frameLayout = u7Var.c;
                if (!u7Var.E) {
                    float max = Math.max(0.0f, u7Var.y - u7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 1:
                ((gi.n5) this.b).invalidate();
                break;
            case 2:
                View view = ((j50) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((j50) this.b).f.setOrientation(0);
                    } else {
                        ((j50) this.b).f.setOrientation(1);
                    }
                    View view2 = ((j50) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((j50) this.b).fragmentView.getPaddingRight(), ((j50) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                hm0 hm0Var = (hm0) this.b;
                if (hm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    hm0Var.f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        hm0Var.f = 4;
                    }
                    hm0Var.n.f();
                }
                org.telegram.ui.Components.tj0 tj0Var = ((hm0) this.b).h;
                if (tj0Var != null) {
                    tj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.x3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.y3;
                if (imageView != null) {
                    if (photoViewer.K3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.vp0
                            public final /* synthetic */ f7 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                        photoViewer2.y3.setVisibility(4);
                                        photoViewer2.y3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.D3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.D3 = null;
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                        if (photoViewer3.K3) {
                                            photoViewer3.T0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.y3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.D3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.D3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.vp0
                    public final /* synthetic */ f7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                photoViewer2.y3.setVisibility(4);
                                photoViewer2.y3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.D3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.D3 = null;
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                if (photoViewer3.K3) {
                                    photoViewer3.T0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.H3 = 0;
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.T6;
                    profileActivity.O3();
                    profileActivity.y4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.g0.Q1()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.O = 5;
                    } else {
                        wallpapersListActivity.O = 3;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.tj0 tj0Var2 = ((WallpapersListActivity) this.b).G;
                if (tj0Var2 != null) {
                    tj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
