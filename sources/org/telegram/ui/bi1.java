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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public bi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.a;
    }

    @Override // f2.p0
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
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        if (r9.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.l lVar;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                m8Var.m(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                m8Var.m(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), true);
                return;
            }
            if (i10 == wallpapersListActivity.h) {
                m8Var.i(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.r) {
                    m8Var.m(R.drawable.msg_background, "Choose from gallery", false);
                    m8Var.h(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == wallpapersListActivity.n) {
                y8Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.s) {
                    y8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        int i13 = i10 - wallpapersListActivity.d;
        int i14 = wallpapersListActivity.N;
        int i15 = i13 * i14;
        waVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.e - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.N; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.z5 z5Var = org.telegram.ui.ActionBar.g6.I.e0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.g6.X0(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.g6.X0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.g6.R0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else if (obj2 instanceof zh1) {
                zh1 zh1Var = (zh1) obj2;
                if (!"d".equals(zh1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(zh1Var.a)) {
                    if (zh1Var.b == wallpapersListActivity.P) {
                        int i18 = zh1Var.c;
                        int i19 = wallpapersListActivity.Q;
                        if (i18 == i19) {
                            if (zh1Var.d == wallpapersListActivity.R) {
                                if (zh1Var.e == wallpapersListActivity.S) {
                                    if (i19 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.O)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.O)) {
                                        if (TextUtils.equals(wallpapersListActivity.O, zh1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = zh1Var.l;
                    if (wallPaper != null) {
                        j10 = wallPaper.id;
                    }
                    j10 = 0;
                }
                obj = obj2;
                wallPaper = zh1Var.l;
                if (wallPaper != null) {
                }
                j10 = 0;
            } else if (obj2 instanceof ai1) {
                obj = wallpapersListActivity.O.equals(((ai1) obj2).a) ? obj2 : null;
                j10 = 0;
            } else {
                j10 = 0;
                obj = null;
            }
            waVar.e(wallpapersListActivity.v, obj2, obj, i16);
            lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (lVar.s()) {
                waVar.c(i16, wallpapersListActivity.e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f0);
            } else {
                waVar.c(i16, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.vk0(i10 != 0 ? i10 != 1 ? i10 != 3 ? new org.telegram.ui.Components.aj(this, context, 1) : new org.telegram.ui.Cells.y8(context) : new org.telegram.ui.Cells.x6(context, (b) null) : new org.telegram.ui.Cells.m8(context));
    }
}
