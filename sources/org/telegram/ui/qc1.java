package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qc1 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public qc1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.a;
    }

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        WallpapersListActivity wallpapersListActivity = this.d;
        i10 = wallpapersListActivity.uploadImageRow;
        if (i7 == i10 || i7 == wallpapersListActivity.h || i7 == wallpapersListActivity.b || i7 == wallpapersListActivity.e) {
            return 0;
        }
        return (i7 == wallpapersListActivity.f || i7 == wallpapersListActivity.n) ? 3 : 2;
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        long j3;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.w4 w4Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.b0;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            i10 = wallpapersListActivity.uploadImageRow;
            if (i7 == i10) {
                l8Var.o(R.drawable.msg_photos, org.telegram.messenger.hd.M0(2131745656, null), true);
                return;
            }
            if (i7 == wallpapersListActivity.b) {
                l8Var.o(R.drawable.msg_palette, org.telegram.messenger.hd.M0(2131745538, null), false);
                return;
            }
            if (i7 == wallpapersListActivity.e) {
                l8Var.k(org.telegram.messenger.hd.M0(2131746108, null), false);
                return;
            } else {
                if (i7 == wallpapersListActivity.h) {
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
            if (i7 == wallpapersListActivity.f) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131746105, null));
                return;
            } else {
                if (i7 == wallpapersListActivity.n) {
                    y8Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) view;
        int i12 = i7 - wallpapersListActivity.c;
        int i13 = wallpapersListActivity.O;
        int i14 = i12 * i13;
        taVar.d(i13, i14 == 0, i14 / i13 == wallpapersListActivity.d - 1);
        for (int i15 = 0; i15 < wallpapersListActivity.O; i15++) {
            int i16 = i14 + i15;
            Object obj2 = i16 < arrayList.size() ? arrayList.get(i16) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = org.telegram.ui.ActionBar.j6.I.j0;
                obj = (wallpapersListActivity.P.equals(tL_wallPaper.slug) && (!wallpapersListActivity.P.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.Q == org.telegram.ui.ActionBar.j6.a1(wallPaperSettings.background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.j6.a1(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.j6.a1(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.T == org.telegram.ui.ActionBar.j6.a1(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.R == 0 || wallpapersListActivity.S != 0 || wallpapersListActivity.U == org.telegram.messenger.g0.s1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.j6.U0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.V) <= 0.001f)))) ? tL_wallPaper : null;
                j3 = tL_wallPaper.id;
            } else {
                j3 = 0;
                if (obj2 instanceof oc1) {
                    oc1 oc1Var = (oc1) obj2;
                    if (!"d".equals(oc1Var.a) || (str = wallpapersListActivity.P) == null || !str.equals(oc1Var.a)) {
                        if (oc1Var.b == wallpapersListActivity.Q) {
                            int i17 = oc1Var.c;
                            int i18 = wallpapersListActivity.R;
                            if (i17 == i18) {
                                if (oc1Var.d == wallpapersListActivity.S) {
                                    if (oc1Var.e == wallpapersListActivity.T) {
                                        if (i18 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.P)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.P)) {
                                            if (TextUtils.equals(wallpapersListActivity.P, oc1Var.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = oc1Var.l;
                        if (wallPaper != null) {
                            j3 = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = oc1Var.l;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof pc1) && wallpapersListActivity.P.equals(((pc1) obj2).a)) ? obj2 : null;
                }
            }
            taVar.e(wallpapersListActivity.r, obj2, obj, i15);
            w4Var = ((org.telegram.ui.ActionBar.e2) wallpapersListActivity).simpleActionBar;
            if (w4Var.v()) {
                taVar.c(i15, wallpapersListActivity.f0.indexOfKey(j3) >= 0, !wallpapersListActivity.g0);
            } else {
                taVar.c(i15, false, !wallpapersListActivity.g0);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View l8Var;
        Context context = this.c;
        if (i7 == 0) {
            l8Var = new org.telegram.ui.Cells.l8(context);
        } else if (i7 != 3) {
            l8Var = new org.telegram.ui.Components.xi(this, context, 1);
            l8Var.setTag(-33024);
        } else {
            l8Var = new org.telegram.ui.Cells.y8(context);
        }
        return new org.telegram.ui.Components.cj0(l8Var);
    }
}
