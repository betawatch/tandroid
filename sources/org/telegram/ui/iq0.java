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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        kq0 kq0Var = this.d;
        if (kq0Var.J == null) {
            return TextUtils.isEmpty(kq0Var.v) ? b1Var.f == 3 : b1Var.b() < kq0Var.f.size();
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        kq0 kq0Var = this.d;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!kq0Var.f.isEmpty()) {
            return kq0Var.f.size() + (!kq0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(kq0Var.v) || kq0Var.n.isEmpty()) {
            return 0;
        }
        return kq0Var.n.size() + 2;
    }

    @Override // s4.g0
    public final long i(int i10) {
        return i10;
    }

    @Override // s4.g0
    public final int j(int i10) {
        kq0 kq0Var = this.d;
        if (kq0Var.Y) {
            return 2;
        }
        if (kq0Var.J != null) {
            return 0;
        }
        return kq0Var.f.isEmpty() ? i10 == kq0Var.n.size() ? 4 : 3 : i10 < kq0Var.f.size() ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean M1;
        kq0 kq0Var = this.d;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        ArrayList arrayList = kq0Var.n;
        ArrayList arrayList2 = kq0Var.c;
        HashMap hashMap = kq0Var.b;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.setItemSize(kq0Var.R);
            org.telegram.ui.Components.w9 imageView = s5Var.getImageView();
            s5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                s5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                s5Var.b(kq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                M1 = PhotoViewer.M1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) kq0Var.f.get(i10);
                s5Var.e(searchImage);
                s5Var.getVideoInfoContainer().setVisibility(4);
                s5Var.b(kq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                M1 = PhotoViewer.M1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!M1, true);
            s5Var.getCheckBox().setVisibility((kq0Var.T != 0 || M1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = kq0Var.R;
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
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        if (i10 < arrayList.size()) {
            q8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            q8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        kq0 kq0Var = this.d;
        boolean z10 = kq0Var.r0;
        Context context = this.c;
        if (i10 != 0) {
            if (i10 == 1) {
                ViewGroup frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                radialProgressView.setProgressColor(-11371101);
                frameLayout.addView(radialProgressView, w7.z5.d(-1.0f, -1));
                viewGroup3 = frameLayout;
            } else if (i10 == 2) {
                viewGroup3 = new org.telegram.ui.Cells.i7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.c3 c3Var = new org.telegram.ui.Cells.c3(context, null);
                c3Var.setForceDarkTheme(z10);
                viewGroup3 = c3Var;
            } else {
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(23, context, true);
                q8Var.setLayoutParams(new s4.o0(-1, -2));
                viewGroup2 = q8Var;
                if (z10) {
                    q8Var.a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, kq0Var.v0, false));
                    q8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = q8Var;
                }
            }
            return new org.telegram.ui.Components.sl0(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new hq0(this));
        s5Var.getCheckFrame().setVisibility(kq0Var.T != 0 ? 8 : 0);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.sl0(viewGroup3);
    }
}
