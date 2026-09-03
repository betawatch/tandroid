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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ mq0 d;

    public kq0(mq0 mq0Var, Context context) {
        this.d = mq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        mq0 mq0Var = this.d;
        if (mq0Var.G == null) {
            return TextUtils.isEmpty(mq0Var.v) ? l1Var.f == 3 : l1Var.b() < mq0Var.f.size();
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        mq0 mq0Var = this.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (albumEntry != null) {
            return albumEntry.photos.size();
        }
        if (!mq0Var.f.isEmpty()) {
            return mq0Var.f.size() + (!mq0Var.s ? 1 : 0);
        }
        if (!TextUtils.isEmpty(mq0Var.v) || mq0Var.n.isEmpty()) {
            return 0;
        }
        return mq0Var.n.size() + 2;
    }

    @Override // f2.o0
    public final long i(int i10) {
        return i10;
    }

    @Override // f2.o0
    public final int j(int i10) {
        mq0 mq0Var = this.d;
        if (mq0Var.V) {
            return 2;
        }
        if (mq0Var.G != null) {
            return 0;
        }
        return mq0Var.f.isEmpty() ? i10 == mq0Var.n.size() ? 4 : 3 : i10 < mq0Var.f.size() ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean L1;
        mq0 mq0Var = this.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        ArrayList arrayList = mq0Var.n;
        ArrayList arrayList2 = mq0Var.c;
        HashMap hashMap = mq0Var.b;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.setItemSize(mq0Var.O);
            org.telegram.ui.Components.p9 imageView = s5Var.getImageView();
            s5Var.setTag(Integer.valueOf(i10));
            imageView.q(0, true);
            if (albumEntry != null) {
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                s5Var.d(photoEntry, arrayList2.size() > 1, true, false, false);
                s5Var.b(mq0Var.e ? arrayList2.indexOf(Integer.valueOf(photoEntry.imageId)) : -1, hashMap.containsKey(Integer.valueOf(photoEntry.imageId)), false);
                L1 = PhotoViewer.L1(photoEntry.path);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f.get(i10);
                s5Var.e(searchImage);
                s5Var.getVideoInfoContainer().setVisibility(4);
                s5Var.b(mq0Var.e ? arrayList2.indexOf(searchImage.id) : -1, hashMap.containsKey(searchImage.id), false);
                L1 = PhotoViewer.L1(searchImage.getPathToAttach());
            }
            imageView.getImageReceiver().setVisible(!L1, true);
            s5Var.getCheckBox().setVisibility((mq0Var.Q != 0 || L1) ? 8 : 0);
            return;
        }
        if (i11 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = mq0Var.O;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i11 == 2) {
            MediaController.PhotoEntry photoEntry2 = albumEntry.photos.get(i10);
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            h7Var.setPhotoEntry(photoEntry2);
            h7Var.b(hashMap.containsKey(Integer.valueOf(photoEntry2.imageId)), false);
            h7Var.setTag(Integer.valueOf(i10));
            return;
        }
        if (i11 != 3) {
            return;
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        if (i10 < arrayList.size()) {
            n8Var.m(R.drawable.msg_recent, (CharSequence) arrayList.get(i10), false);
        } else {
            n8Var.m(R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearRecentHistory), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        mq0 mq0Var = this.d;
        boolean z4 = mq0Var.o0;
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
                viewGroup3 = new org.telegram.ui.Cells.h7(context, 1, null);
            } else if (i10 != 3) {
                org.telegram.ui.Cells.b3 b3Var = new org.telegram.ui.Cells.b3(context, null);
                b3Var.setForceDarkTheme(z4);
                viewGroup3 = b3Var;
            } else {
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(23, context, true);
                n8Var.setLayoutParams(new f2.w0(-1, -2));
                viewGroup2 = n8Var;
                if (z4) {
                    n8Var.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, mq0Var.s0, false));
                    n8Var.e.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.rg, false), PorterDuff.Mode.MULTIPLY));
                    viewGroup2 = n8Var;
                }
            }
            return new org.telegram.ui.Components.dl0(viewGroup3);
        }
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context, null);
        s5Var.setDelegate(new jq0(this));
        s5Var.getCheckFrame().setVisibility(mq0Var.Q != 0 ? 8 : 0);
        viewGroup2 = s5Var;
        viewGroup3 = viewGroup2;
        return new org.telegram.ui.Components.dl0(viewGroup3);
    }
}
