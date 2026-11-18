package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i7 = 0;
        final int i10 = 1;
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                FrameLayout frameLayout = s7Var.c;
                if (!s7Var.E) {
                    float max = Math.max(0.0f, s7Var.y - s7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 1:
                ((hi.m5) this.b).invalidate();
                break;
            case 2:
                View view = ((q50) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((q50) this.b).f.setOrientation(0);
                    } else {
                        ((q50) this.b).f.setOrientation(1);
                    }
                    View view2 = ((q50) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((q50) this.b).fragmentView.getPaddingRight(), ((q50) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                qm0 qm0Var = (qm0) this.b;
                if (qm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    qm0Var.f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        qm0Var.f = 4;
                    }
                    qm0Var.n.f();
                }
                org.telegram.ui.Components.ck0 ck0Var = ((qm0) this.b).h;
                if (ck0Var != null) {
                    ck0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.fq0
                            public final /* synthetic */ d7 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i7) {
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
                                            photoViewer3.M0();
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
                org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.fq0
                    public final /* synthetic */ d7 b;

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
                                    photoViewer3.M0();
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
                    RectF rectF = ProfileActivity.Z6;
                    profileActivity.O3();
                    profileActivity.B4(true);
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
                org.telegram.ui.Components.ck0 ck0Var2 = ((WallpapersListActivity) this.b).G;
                if (ck0Var2 != null) {
                    ck0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
