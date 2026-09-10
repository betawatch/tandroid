package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mj1 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public mj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.a;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 == i11 || i10 == wallpapersListActivity.r || i10 == wallpapersListActivity.b || i10 == wallpapersListActivity.h) {
            return 0;
        }
        if (i10 == wallpapersListActivity.c || i10 == wallpapersListActivity.f) {
            return 1;
        }
        return (i10 == wallpapersListActivity.n || i10 == wallpapersListActivity.s) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.Y * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (r9.f == r3.X) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        long j3;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.e0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                s8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                s8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i10 == wallpapersListActivity.h) {
                s8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.r) {
                    s8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    s8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == wallpapersListActivity.n) {
                f9Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.s) {
                    f9Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) view;
        int i13 = i10 - wallpapersListActivity.d;
        int i14 = wallpapersListActivity.R;
        int i15 = i13 * i14;
        gbVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.e - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.R; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = org.telegram.ui.ActionBar.j6.I.i0;
                obj = (wallpapersListActivity.S.equals(tL_wallPaper.slug) && (!wallpapersListActivity.S.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.T == org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color) && wallpapersListActivity.U == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.V == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.W == org.telegram.ui.ActionBar.j6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.U == 0 || wallpapersListActivity.V != 0 || wallpapersListActivity.X == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.j6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.Y) <= 0.001f)))) ? tL_wallPaper : null;
                j3 = tL_wallPaper.id;
            } else if (obj2 instanceof kj1) {
                kj1 kj1Var = (kj1) obj2;
                if (!"d".equals(kj1Var.a) || (str = wallpapersListActivity.S) == null || !str.equals(kj1Var.a)) {
                    if (kj1Var.b == wallpapersListActivity.T) {
                        int i18 = kj1Var.c;
                        int i19 = wallpapersListActivity.U;
                        if (i18 == i19) {
                            if (kj1Var.d == wallpapersListActivity.V) {
                                if (kj1Var.e == wallpapersListActivity.W) {
                                    if (i19 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.S)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.S)) {
                                        if (TextUtils.equals(wallpapersListActivity.S, kj1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = kj1Var.l;
                    if (wallPaper != null) {
                        j3 = wallPaper.id;
                    }
                    j3 = 0;
                }
                obj = obj2;
                wallPaper = kj1Var.l;
                if (wallPaper != null) {
                }
                j3 = 0;
            } else if (obj2 instanceof lj1) {
                obj = wallpapersListActivity.S.equals(((lj1) obj2).a) ? obj2 : null;
                j3 = 0;
            } else {
                j3 = 0;
                obj = null;
            }
            gbVar.e(wallpapersListActivity.v, obj2, obj, i16);
            lVar = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).actionBar;
            if (lVar.s()) {
                gbVar.c(i16, wallpapersListActivity.i0.indexOfKey(j3) >= 0, !wallpapersListActivity.j0);
            } else {
                gbVar.c(i16, false, !wallpapersListActivity.j0);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.fl0(i10 != 0 ? i10 != 1 ? i10 != 3 ? new org.telegram.ui.Components.lj(this, context, 1) : new org.telegram.ui.Cells.f9(context) : new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null) : new org.telegram.ui.Cells.s8(context));
    }
}
