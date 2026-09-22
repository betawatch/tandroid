package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ei implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ei(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.b;
                pj pjVar = boVar.a1;
                if (pjVar != null) {
                    pjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 1:
                ((ci.s6) this.b).invalidate();
                break;
            case 2:
                View view = ((w70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((w70) this.b).f.setOrientation(0);
                    } else {
                        ((w70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((w70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((w70) this.b).fragmentView.getPaddingRight(), ((w70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 3:
                jq0 jq0Var = (jq0) this.b;
                if (jq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    jq0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        jq0Var.f = 4;
                    }
                    jq0Var.n.l();
                }
                org.telegram.ui.Components.ll0 ll0Var = ((jq0) this.b).h;
                if (ll0Var != null) {
                    ll0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ku0
                            public final /* synthetic */ ei b;

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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ku0
                    public final /* synthetic */ ei b;

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
                org.telegram.ui.Components.ll0 ll0Var2 = ((WallpapersListActivity) this.b).H;
                if (ll0Var2 != null) {
                    ll0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
