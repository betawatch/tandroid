package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i7 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final int i10 = 0;
        final int i11 = 1;
        switch (this.a) {
            case 0:
                x7 x7Var = (x7) this.b;
                FrameLayout frameLayout = x7Var.c;
                if (!x7Var.y) {
                    float max = Math.max(0.0f, x7Var.x - x7Var.getY());
                    if (frameLayout.getTranslationY() != max) {
                        frameLayout.setTranslationY(max);
                        break;
                    }
                }
                break;
            case 1:
                un unVar = (un) this.b;
                ij ijVar = unVar.m1;
                if (ijVar != null) {
                    ijVar.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                break;
            case 2:
                ((fi.f6) this.b).invalidate();
                break;
            case 3:
                View view = ((i70) this.b).fragmentView;
                if (view != null) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation == 3 || rotation == 1) {
                        ((i70) this.b).f.setOrientation(0);
                    } else {
                        ((i70) this.b).f.setOrientation(1);
                    }
                    View view2 = ((i70) this.b).fragmentView;
                    view2.setPadding(view2.getPaddingLeft(), 0, ((i70) this.b).fragmentView.getPaddingRight(), ((i70) this.b).fragmentView.getPaddingBottom());
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.r71 r71Var = (org.telegram.ui.Components.r71) this.b;
                r71Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < r71Var.getChildCount(); i12++) {
                    arrayList.add(r71Var.getChildAt(i12));
                }
                Collections.sort(arrayList, new bv(4));
                while (i10 < arrayList.size()) {
                    View view3 = (View) arrayList.get(i10);
                    view3.animate().cancel();
                    view3.setAlpha(0.0f);
                    view3.setTranslationY(AndroidUtilities.dp(24.0f));
                    view3.animate().alpha(1.0f).translationY(0.0f).setStartDelay(i10 * 40).setDuration(360L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                    i10++;
                }
                break;
            case 5:
                aq0 aq0Var = (aq0) this.b;
                if (aq0Var.getParentActivity() != null) {
                    int rotation2 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    aq0Var.f = 2;
                    if (!AndroidUtilities.isTablet() && (rotation2 == 3 || rotation2 == 1)) {
                        aq0Var.f = 4;
                    }
                    aq0Var.n.l();
                }
                org.telegram.ui.Components.mm0 mm0Var = ((aq0) this.b).h;
                if (mm0Var != null) {
                    mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                photoViewer.w3.getViewTreeObserver().removeOnPreDrawListener(this);
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    if (photoViewer.J3) {
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.xt0
                            public final /* synthetic */ i7 b;

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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.xt0
                    public final /* synthetic */ i7 b;

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
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.fragmentView != null) {
                    int i13 = ProfileActivity.R6;
                    profileActivity.I3();
                    profileActivity.r4(true);
                    profileActivity.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
            default:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                int[][] iArr = WallpapersListActivity.g0;
                if (wallpapersListActivity.getParentActivity() != null) {
                    int rotation3 = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (AndroidUtilities.isTablet()) {
                        wallpapersListActivity.N = 3;
                    } else if (rotation3 == 3 || rotation3 == 1) {
                        wallpapersListActivity.N = 5;
                    } else {
                        wallpapersListActivity.N = 3;
                    }
                    wallpapersListActivity.D0();
                }
                org.telegram.ui.Components.mm0 mm0Var2 = ((WallpapersListActivity) this.b).F;
                if (mm0Var2 != null) {
                    mm0Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
