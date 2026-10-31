package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.b;
                FrameLayout frameLayout = t7Var.c;
                if (!t7Var.D) {
                    float max = Math.max(0.0f, t7Var.y - t7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 1:
                ((kg.f0) this.b).invalidate();
                break;
            case 2:
                View view = ((n60) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((n60) this.b).f.setOrientation(0);
                    } else {
                        ((n60) this.b).f.setOrientation(1);
                    }
                    View view2 = ((n60) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((n60) this.b).fragmentView.getPaddingRight(), ((n60) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                yn0 yn0Var = (yn0) this.b;
                if (yn0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    yn0Var.f = 2;
                    if (!org.telegram.messenger.i0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        yn0Var.f = 4;
                    }
                    yn0Var.n.f();
                }
                org.telegram.ui.Components.tk0 tk0Var = ((yn0) this.b).h;
                if (tk0Var != null) {
                    tk0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.i0.h3(new Runnable(this) { // from class: org.telegram.ui.pr0
                            public final /* synthetic */ e7 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
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
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                        if (photoViewer3.J3) {
                                            photoViewer3.T0();
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
                org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.pr0
                    public final /* synthetic */ e7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
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
                                PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                if (photoViewer3.J3) {
                                    photoViewer3.T0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.G3 = 0;
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.R6;
                    profileActivity.N3();
                    profileActivity.x4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (org.telegram.messenger.i0.Q1()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.N = 5;
                    } else {
                        wallpapersListActivity.N = 3;
                    }
                    wallpapersListActivity.G0();
                }
                org.telegram.ui.Components.tk0 tk0Var2 = ((WallpapersListActivity) this.b).F;
                if (tk0Var2 != null) {
                    tk0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
