package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dq0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ fq0 d;

    public dq0(fq0 fq0Var, Context context) {
        this.d = fq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        fq0 fq0Var = this.d;
        if (fq0Var.G == null) {
            return TextUtils.isEmpty(fq0Var.v) ? l1Var.f == 3 : l1Var.b() < fq0Var.f.size();
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        fq0 fq0Var = this.d;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!fq0Var.f.isEmpty()) {
            return fq0Var.f.size() + (!fq0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(fq0Var.v) || fq0Var.n.isEmpty()) {
            return 0;
        }
        return fq0Var.n.size() + 2;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        fq0 fq0Var = this.d;
        if (fq0Var.V) {
            return 2;
        }
        if (fq0Var.G != null) {
            return 0;
        }
        return fq0Var.f.isEmpty() ? i10 == fq0Var.n.size() ? 4 : 3 : i10 < fq0Var.f.size() ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean L1;
        fq0 fq0Var = this.d;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        ArrayList arrayList = fq0Var.n;
        ArrayList arrayList2 = fq0Var.c;
        HashMap hashMap = fq0Var.b;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.setItemSize(fq0Var.O);
            org.telegram.ui.Components.p9 imageView = t5Var.getImageView();
            t5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                t5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                t5Var.b(fq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) fq0Var.f.get(i10);
                t5Var.e(searchImage);
                t5Var.getVideoInfoContainer().setVisibility(4);
                t5Var.b(fq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            t5Var.getCheckBox().setVisibility((fq0Var.Q != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = fq0Var.O;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            i7Var.setPhotoEntry(photoEntry2);
            i7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            i7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
        if (i10 < arrayList.size()) {
            o8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            o8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        fq0 fq0Var = this.d;
        boolean z4 = fq0Var.o0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, k7.b6.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                c3Var.setForceDarkTheme(z4);
                viewGroup3 = c3Var;
            } else {
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(23, context, true);
                o8Var.setLayoutParams(new f2.w0(-1, -2));
                viewGroup2 = o8Var;
                if (z4) {
                    o8Var.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, fq0Var.s0, false));
                    o8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = o8Var;
                }
            }
            return new org.telegram.ui.Components.el0(viewGroup3);
        }
        org.telegram.ui.Cells.t5 t5Var = new org.telegram.ui.Cells.t5(context, null);
        t5Var.setDelegate(new cq0(this));
        t5Var.getCheckFrame().setVisibility(fq0Var.Q != 0 ? 8 : 0);
        viewGroup2 = t5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.el0(viewGroup3);
    }
}
