package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mc1 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public mc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.a;
    }

    @Override // u4.h0
    public final int d(int i3) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i3 == i10 || i3 == wallpapersListActivity.h || i3 == wallpapersListActivity.b || i3 == wallpapersListActivity.e) {
            return 0;
        }
        return (i3 == wallpapersListActivity.f || i3 == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x015b, code lost:
    
        if (((int) (r10.h * 100.0f)) == ((int) (r3.V * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        if (r10.f == r3.U) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013d, code lost:
    
        if (r10.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.y4 y4Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            i10 = wallpapersListActivity.uploadImageRow;
            if (i3 == i10) {
                l8Var.o(R.drawable.msg_photos, org.telegram.messenger.bd.M0(2131745666, null), true);
                return;
            }
            if (i3 == wallpapersListActivity.b) {
                l8Var.o(R.drawable.msg_palette, org.telegram.messenger.bd.M0(2131745548, null), false);
                return;
            }
            if (i3 == wallpapersListActivity.e) {
                l8Var.k(org.telegram.messenger.bd.M0(2131746118, null), false);
                return;
            } else {
                if (i3 == wallpapersListActivity.h) {
                    l8Var.o(R.drawable.msg_background, "Choose from gallery", false);
                    l8Var.j(10);
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == wallpapersListActivity.f) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131746115, null));
                return;
            } else {
                if (i3 == wallpapersListActivity.n) {
                    y8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
        int i12 = i3 - wallpapersListActivity.c;
        int i13 = wallpapersListActivity.O;
        int i14 = i12 * i13;
        taVar.d(i13, i14 == 0, i14 / i13 == wallpapersListActivity.d - 1);
        for (int i15 = 0; i15 < wallpapersListActivity.O; i15++) {
            int i16 = i14 + i15;
            Object obj2 = i16 < arrayList.size() ? arrayList.get(i16) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.k6.I.j0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == org.telegram.ui.ActionBar.k6.a1(wallPaperSettings.background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == org.telegram.ui.ActionBar.k6.a1(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == org.telegram.messenger.g0.s1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.k6.U0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else {
                j10 = 0;
                if (obj2 instanceof kc1) {
                    kc1 kc1Var = (kc1) obj2;
                    if (!"d".equals(kc1Var.a) || (str = wallpapersListActivity.P) == null || !str.equals(kc1Var.a)) {
                        if (kc1Var.b == wallpapersListActivity.Q) {
                            int i17 = kc1Var.c;
                            int i18 = wallpapersListActivity.R;
                            if (i17 == i18) {
                                if (kc1Var.d == wallpapersListActivity.S) {
                                    if (kc1Var.e == wallpapersListActivity.T) {
                                        if (i18 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.P)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.P)) {
                                            if (TextUtils.equals(wallpapersListActivity.P, kc1Var.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = kc1Var.l;
                        if (wallPaper != null) {
                            j10 = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = kc1Var.l;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof lc1) && wallpapersListActivity.P.equals(((lc1) obj2).a)) ? obj2 : null;
                }
            }
            taVar.e(wallpapersListActivity.r, obj2, obj, i15);
            y4Var = ((org.telegram.ui.ActionBar.d2) wallpapersListActivity).simpleActionBar;
            if (y4Var.s()) {
                taVar.c(i15, wallpapersListActivity.f0.indexOfKey(j10) >= 0, !wallpapersListActivity.g0);
            } else {
                taVar.c(i15, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View l8Var;
        Context context = this.c;
        if (i3 == 0) {
            l8Var = new org.telegram.ui.Cells.l8(context);
        } else if (i3 != 3) {
            l8Var = new org.telegram.ui.Components.pi(this, context, 1);
            l8Var.setTag(-33024);
        } else {
            l8Var = new org.telegram.ui.Cells.y8(context);
        }
        return new org.telegram.ui.Components.bj0(l8Var);
    }
}
