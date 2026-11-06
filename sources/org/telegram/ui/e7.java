package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i7 = 0;
        final int i10 = 1;
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
                ((fi.p5) this.b).invalidate();
                break;
            case 2:
                View view = ((p50) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((p50) this.b).f.setOrientation(0);
                    } else {
                        ((p50) this.b).f.setOrientation(1);
                    }
                    View view2 = ((p50) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((p50) this.b).fragmentView.getPaddingRight(), ((p50) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                mm0 mm0Var = (mm0) this.b;
                if (mm0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                    mm0Var.f = 2;
                    if (!org.telegram.messenger.g0.Q1() && (rotation2 == 3 || rotation2 == 1)) {
                        mm0Var.f = 4;
                    }
                    mm0Var.n.f();
                }
                org.telegram.ui.Components.pj0 pj0Var = ((mm0) this.b).h;
                if (pj0Var != null) {
                    pj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.v3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.w3;
                if (imageView != null) {
                    if (photoViewer.I3) {
                        org.telegram.messenger.g0.i3(new Runnable(this) { // from class: org.telegram.ui.dq0
                            public final /* synthetic */ e7 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                        photoViewer2.w3.setVisibility(4);
                                        photoViewer2.w3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.B3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.B3 = null;
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                        if (photoViewer3.I3) {
                                            photoViewer3.M0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.w3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.B3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.B3 = null;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.dq0
                    public final /* synthetic */ e7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                photoViewer2.w3.setVisibility(4);
                                photoViewer2.w3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.B3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.B3 = null;
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                if (photoViewer3.I3) {
                                    photoViewer3.M0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.F3 = 0;
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    RectF rectF = ProfileActivity.S6;
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
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.N = 5;
                    } else {
                        wallpapersListActivity.N = 3;
                    }
                    wallpapersListActivity.H0();
                }
                org.telegram.ui.Components.pj0 pj0Var2 = ((WallpapersListActivity) this.b).F;
                if (pj0Var2 != null) {
                    pj0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
