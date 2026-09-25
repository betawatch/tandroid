package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bi implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bi(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                mj mjVar = wnVar.a1;
                if (mjVar != null) {
                    mjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 1:
                ((ci.r6) this.b).invalidate();
                break;
            case 2:
                View view = ((r70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((r70) this.b).f.setOrientation(0);
                    } else {
                        ((r70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((r70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((r70) this.b).fragmentView.getPaddingRight(), ((r70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                cq0 cq0Var = (cq0) this.b;
                if (cq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    cq0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        cq0Var.f = 4;
                    }
                    cq0Var.n.l();
                }
                org.telegram.ui.Components.wl0 wl0Var = ((cq0) this.b).h;
                if (wl0Var != null) {
                    wl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.cu0
                            public final /* synthetic */ bi b;

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
                                            photoViewer3.S0();
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.cu0
                    public final /* synthetic */ bi b;

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
                                    photoViewer3.S0();
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
                    profileActivity.A3();
                    profileActivity.k4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                int[][] iArr = WallpapersListActivity.k0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.R = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.R = 5;
                    } else {
                        wallpapersListActivity.R = 3;
                    }
                    wallpapersListActivity.C0();
                }
                org.telegram.ui.Components.wl0 wl0Var2 = ((WallpapersListActivity) this.b).H;
                if (wl0Var2 != null) {
                    wl0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
