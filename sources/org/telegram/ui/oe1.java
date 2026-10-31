package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oe1 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ WallpapersListActivity d;

    public oe1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.a;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        WallpapersListActivity wallpapersListActivity = this.d;
        i11 = wallpapersListActivity.uploadImageRow;
        if (i10 == i11 || i10 == wallpapersListActivity.h || i10 == wallpapersListActivity.b || i10 == wallpapersListActivity.e) {
            return 0;
        }
        return (i10 == wallpapersListActivity.f || i10 == wallpapersListActivity.n) ? 3 : 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x015b, code lost:
    
        if (((int) (r10.h * 100.0f)) == ((int) (r3.U * 100.0f))) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        if (r10.f == r3.T) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013d, code lost:
    
        if (r10.a == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        long j10;
        Object obj;
        TLRPC.WallPaper wallPaper;
        String str;
        org.telegram.ui.ActionBar.i5 i5Var;
        TLRPC.WallPaperSettings wallPaperSettings;
        WallpapersListActivity wallpapersListActivity = this.d;
        ArrayList arrayList = wallpapersListActivity.a0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            i11 = wallpapersListActivity.uploadImageRow;
            if (i10 == i11) {
                p8Var.o(R.drawable.msg_photos, org.telegram.messenger.cd.L0(2131745673, null), true);
                return;
            }
            if (i10 == wallpapersListActivity.b) {
                p8Var.o(R.drawable.msg_palette, org.telegram.messenger.cd.L0(2131745555, null), false);
                return;
            }
            if (i10 == wallpapersListActivity.e) {
                p8Var.k(org.telegram.messenger.cd.L0(2131746125, null), false);
                return;
            } else {
                if (i10 == wallpapersListActivity.h) {
                    p8Var.o(R.drawable.msg_background, "Choose from gallery", false);
                    p8Var.j(10);
                    return;
                }
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == wallpapersListActivity.f) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746122, null));
                return;
            } else {
                if (i10 == wallpapersListActivity.n) {
                    b9Var.setText("Upload your own background for the channel.");
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
        int i13 = i10 - wallpapersListActivity.c;
        int i14 = wallpapersListActivity.N;
        int i15 = i13 * i14;
        uaVar.d(i14, i15 == 0, i15 / i14 == wallpapersListActivity.d - 1);
        for (int i16 = 0; i16 < wallpapersListActivity.N; i16++) {
            int i17 = i15 + i16;
            Object obj2 = i17 < arrayList.size() ? arrayList.get(i17) : null;
            if (obj2 instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj2;
                org.telegram.ui.ActionBar.m6 m6Var = org.telegram.ui.ActionBar.t6.I.i0;
                obj = (wallpapersListActivity.O.equals(tL_wallPaper.slug) && (!wallpapersListActivity.O.equals(tL_wallPaper.slug) || (wallPaperSettings = tL_wallPaper.settings) == null || (wallpapersListActivity.P == org.telegram.ui.ActionBar.t6.a1(wallPaperSettings.background_color) && wallpapersListActivity.Q == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.second_background_color) && wallpapersListActivity.R == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.third_background_color) && wallpapersListActivity.S == org.telegram.ui.ActionBar.t6.a1(tL_wallPaper.settings.fourth_background_color) && (wallpapersListActivity.Q == 0 || wallpapersListActivity.R != 0 || wallpapersListActivity.T == org.telegram.messenger.i0.s1(tL_wallPaper.settings.rotation, false) || !tL_wallPaper.pattern || Math.abs(org.telegram.ui.ActionBar.t6.U0(((float) tL_wallPaper.settings.intensity) / 100.0f) - wallpapersListActivity.U) <= 0.001f)))) ? tL_wallPaper : null;
                j10 = tL_wallPaper.id;
            } else {
                j10 = 0;
                if (obj2 instanceof me1) {
                    me1 me1Var = (me1) obj2;
                    if (!"d".equals(me1Var.a) || (str = wallpapersListActivity.O) == null || !str.equals(me1Var.a)) {
                        if (me1Var.b == wallpapersListActivity.P) {
                            int i18 = me1Var.c;
                            int i19 = wallpapersListActivity.Q;
                            if (i18 == i19) {
                                if (me1Var.d == wallpapersListActivity.R) {
                                    if (me1Var.e == wallpapersListActivity.S) {
                                        if (i19 != 0) {
                                        }
                                        if ("c".equals(wallpapersListActivity.O)) {
                                        }
                                        if (!"c".equals(wallpapersListActivity.O)) {
                                            if (TextUtils.equals(wallpapersListActivity.O, me1Var.a)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        wallPaper = me1Var.l;
                        if (wallPaper != null) {
                            j10 = wallPaper.id;
                        }
                    }
                    obj = obj2;
                    wallPaper = me1Var.l;
                    if (wallPaper != null) {
                    }
                } else {
                    obj = ((obj2 instanceof ne1) && wallpapersListActivity.O.equals(((ne1) obj2).a)) ? obj2 : null;
                }
            }
            uaVar.e(wallpapersListActivity.r, obj2, obj, i16);
            i5Var = ((org.telegram.ui.ActionBar.k2) wallpapersListActivity).simpleActionBar;
            if (i5Var.s()) {
                uaVar.c(i16, wallpapersListActivity.e0.indexOfKey(j10) >= 0, !wallpapersListActivity.f0);
            } else {
                uaVar.c(i16, false, !wallpapersListActivity.f0);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p8Var;
        Context context = this.c;
        if (i10 == 0) {
            p8Var = new org.telegram.ui.Cells.p8(context);
        } else if (i10 != 3) {
            p8Var = new org.telegram.ui.Components.pi(this, context, 1);
            p8Var.setTag(-33024);
        } else {
            p8Var = new org.telegram.ui.Cells.b9(context);
        }
        return new org.telegram.ui.Components.ck0(p8Var);
    }
}
