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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ar0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ cr0 d;

    public ar0(cr0 cr0Var, Context context) {
        this.d = cr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        cr0 cr0Var = this.d;
        if (cr0Var.J == null) {
            return TextUtils.isEmpty(cr0Var.v) ? c1Var.f == 3 : c1Var.b() < cr0Var.f.size();
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        cr0 cr0Var = this.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!cr0Var.f.isEmpty()) {
            return cr0Var.f.size() + (!cr0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(cr0Var.v) || cr0Var.n.isEmpty()) {
            return 0;
        }
        return cr0Var.n.size() + 2;
    }

    @Override // s4.h0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.h0
    public final int j(int i10) {
        cr0 cr0Var = this.d;
        if (cr0Var.Y) {
            return 2;
        }
        if (cr0Var.J != null) {
            return 0;
        }
        return cr0Var.f.isEmpty() ? i10 == cr0Var.n.size() ? 4 : 3 : i10 < cr0Var.f.size() ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean L1;
        cr0 cr0Var = this.d;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        ArrayList arrayList = cr0Var.n;
        ArrayList arrayList2 = cr0Var.c;
        HashMap hashMap = cr0Var.b;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.setItemSize(cr0Var.R);
            org.telegram.ui.Components.u9 imageView = s5Var.getImageView();
            s5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                s5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                s5Var.b(cr0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) cr0Var.f.get(i10);
                s5Var.e(searchImage);
                s5Var.getVideoInfoContainer().setVisibility(4);
                s5Var.b(cr0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            s5Var.getCheckBox().setVisibility((cr0Var.T != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = cr0Var.R;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            j7Var.setPhotoEntry(photoEntry2);
            j7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            j7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        if (i10 < arrayList.size()) {
            r8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            r8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        cr0 cr0Var = this.d;
        boolean z10 = cr0Var.r0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.p0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.x5.c(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.j7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                c3Var.setForceDarkTheme(z10);
                viewGroup3 = c3Var;
            } else {
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(23, context, true);
                r8Var.setLayoutParams(new s4.p0(-1, -2));
                viewGroup2 = r8Var;
                if (z10) {
                    r8Var.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.v0, false));
                    r8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = r8Var;
                }
            }
            return new org.telegram.ui.Components.wk0(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new zq0(this));
        s5Var.getCheckFrame().setVisibility(cr0Var.T != 0 ? 8 : 0);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.wk0(viewGroup3);
    }
}
