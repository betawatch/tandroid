package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ci implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.b;
                nj njVar = znVar.X0;
                if (njVar != null) {
                    njVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 1:
                ((eg.i0) this.b).invalidate();
                break;
            case 2:
                View view = ((q70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((q70) this.b).f.setOrientation(0);
                    } else {
                        ((q70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((q70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((q70) this.b).fragmentView.getPaddingRight(), ((q70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                wp0 wp0Var = (wp0) this.b;
                if (wp0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    wp0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        wp0Var.f = 4;
                    }
                    wp0Var.n.l();
                }
                org.telegram.ui.Components.rl0 rl0Var = ((wp0) this.b).h;
                if (rl0Var != null) {
                    rl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.t3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.u3;
                if (imageView != null) {
                    if (photoViewer.G3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.wt0
                            public final /* synthetic */ ci b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                        photoViewer2.u3.setVisibility(4);
                                        photoViewer2.u3.setImageDrawable(null);
                                        Bitmap bitmap = photoViewer2.z3;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            photoViewer2.z3 = null;
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                        if (photoViewer3.G3) {
                                            photoViewer3.S0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                    } else {
                        imageView.setVisibility(4);
                        photoViewer.u3.setImageDrawable(null);
                        Bitmap bitmap = photoViewer.z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.z3 = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.wt0
                    public final /* synthetic */ ci b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                PhotoViewer photoViewer2 = (PhotoViewer) this.b.b;
                                photoViewer2.u3.setVisibility(4);
                                photoViewer2.u3.setImageDrawable(null);
                                Bitmap bitmap2 = photoViewer2.z3;
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                    photoViewer2.z3 = null;
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer3 = (PhotoViewer) this.b.b;
                                if (photoViewer3.G3) {
                                    photoViewer3.S0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                photoViewer.D3 = 0;
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                int[][] iArr = WallpapersListActivity.h0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.O = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.O = 5;
                    } else {
                        wallpapersListActivity.O = 3;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.rl0 rl0Var2 = ((WallpapersListActivity) this.b).E;
                if (rl0Var2 != null) {
                    rl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
