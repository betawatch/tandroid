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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fi1 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public fi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
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
        if (i10 == i11 || i10 == wallpapersListActivity.h || i10 == wallpapersListActivity.b || i10 == wallpapersListActivity.e) {
            return 0;
        }
        return (i10 == wallpapersListActivity.f || i10 == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0155, code lost:
    
        if (((int) (r9.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012a, code lost:
    
        if (r9.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0139, code lost:
    
        if (r9.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.r5 r5Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                v8Var.o(R.drawable.msg_photos, LocaleController.getString(R.string.SelectFromGallery), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                v8Var.o(R.drawable.msg_palette, LocaleController.getString(R.string.SetColor), false);
                return;
            }
            if (i10 == wallpapersListActivity.e) {
                v8Var.k(LocaleController.getString(R.string.ResetChatBackgrounds), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.h) {
                    v8Var.o(R.drawable.msg_background, "Choose from gallery", false);
                    v8Var.j(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == wallpapersListActivity.f) {
                i9Var.setText(LocaleController.getString(R.string.ResetChatBackgroundsInfo));
                return;
            } else {
                if (i10 == wallpapersListActivity.n) {
                    i9Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) view;
        int i13 = i10 - wallpapersListActivity.c;
        int i14 = wallpapersListActivity.N;
        int i15 = i13 * i14;
        fbVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.d - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.N; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.y6.I.i0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.y6.Z0(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.y6.Z0(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == AndroidUtilities.getWallpaperRotation(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.y6.T0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else if (obj2 instanceof di1) {
                di1 di1Var = (di1) obj2;
                if (!"d".equals(di1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(di1Var.a)) {
                    if (di1Var.b == wallpapersListActivity.P) {
                        int i18 = di1Var.c;
                        int i19 = wallpapersListActivity.Q;
                        if (i18 == i19) {
                            if (di1Var.d == wallpapersListActivity.R) {
                                if (di1Var.e == wallpapersListActivity.S) {
                                    if (i19 != 0) {
                                    }
                                    if ("c".equals(wallpapersListActivity.O)) {
                                    }
                                    if (!"c".equals(wallpapersListActivity.O)) {
                                        if (TextUtils.equals(wallpapersListActivity.O, di1Var.a)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    wallPaper = di1Var.l;
                    if (wallPaper != null) {
                        j10 = wallPaper.id;
                    }
                    j10 = 0;
                }
                obj = obj2;
                wallPaper = di1Var.l;
                if (wallPaper != null) {
                }
                j10 = 0;
            } else if (obj2 instanceof ei1) {
                obj = wallpapersListActivity.O.equals(((ei1) obj2).a) ? obj2 : null;
                j10 = 0;
            } else {
                j10 = 0;
                obj = null;
            }
            fbVar.e(wallpapersListActivity.r, obj2, obj, i16);
            r5Var = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
            if (r5Var.o()) {
                fbVar.c(i16, wallpapersListActivity.e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f0);
            } else {
                fbVar.c(i16, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View v8Var;
        Context context = this.c;
        if (i10 == 0) {
            v8Var = new org.telegram.ui.Cells.v8(context);
        } else if (i10 != 3) {
            v8Var = new org.telegram.ui.Components.hj(this, context, 1);
            v8Var.setTag(-33024);
        } else {
            v8Var = new org.telegram.ui.Cells.i9(context);
        }
        return new org.telegram.ui.Components.wl0(v8Var);
    }
}
