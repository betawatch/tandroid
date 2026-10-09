package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.eb {
    public final hv X;
    public final r6 Y;
    public final n6.t Z;
    public k6 a0;
    public final org.telegram.ui.Components.dz0[] b0;
    public final org.telegram.ui.Cells.a2[] c0;
    public final LinearLayout d0;
    public final v6 e0;
    public final long f0;
    public final zh.b g0;

    public iv(y6 y6Var, r6 r6Var, zh.b bVar, n6.t tVar) {
        super((org.telegram.ui.ActionBar.n2) y6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.b0 = new org.telegram.ui.Components.dz0[8];
        this.c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = tVar;
        this.Y = r6Var;
        this.g0 = bVar;
        this.f0 = r6Var.a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        hv hvVar = new hv(getContext(), r6Var.a, tVar);
        this.X = hvVar;
        linearLayout.addView(hvVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.i6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.i6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.i6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.i6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.i6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.i6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.i6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.i6.pj;
            }
            String str = string;
            int i13 = i10;
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j3 = 0;
                j10 = s6Var.a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.dz0[] dz0VarArr = this.b0;
                org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0();
                Paint paint = new Paint(1);
                dz0Var.e = paint;
                dz0Var.c = true;
                dz0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                dz0VarArr[i11] = dz0Var;
                org.telegram.ui.Components.dz0 dz0Var2 = this.b0[i11];
                dz0Var2.a = j10;
                dz0Var2.b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                this.d0.addView(a2Var2, w7.x5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.k7;
                org.telegram.ui.Components.dq dqVar = a2Var2.r;
                if (dqVar != null) {
                    dqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.ut(29, this, bVar));
                this.c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.b0[i11] = null;
                this.c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        hv hvVar2 = this.X;
        org.telegram.ui.Components.dz0[] dz0VarArr2 = this.b0;
        hvVar2.b = dz0VarArr2;
        hvVar2.F = bVar;
        hvVar2.invalidate();
        hvVar2.c = new float[dz0VarArr2.length];
        hvVar2.d = new float[dz0VarArr2.length];
        hvVar2.e = new float[dz0VarArr2.length];
        hvVar2.c(false);
        if (hvVar2.y > 1) {
            hvVar2.f = 0.0f;
        } else {
            hvVar2.f = 1.0f;
        }
        v6 v6Var = new v6(this, getContext(), y6Var, 1);
        this.e0 = v6Var;
        v6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        v6Var.setCacheModel(bVar);
        v6Var.setDelegate(new org.telegram.ui.ActionBar.b5(4, this, bVar));
        org.telegram.ui.Components.ya yaVar = this.s;
        if (yaVar != null) {
            yaVar.setChildLayout(v6Var);
        } else {
            S();
            this.d0.addView(this.a0, w7.x5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        return this.n.getMessagesController().getFullName(this.f0);
    }

    @Override // org.telegram.ui.Components.eb
    public final void H(org.telegram.ui.Components.sw0 sw0Var) {
        this.d.j(new i3(this, 9));
        if (this.s != null) {
            S();
            sw0Var.addView(this.a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void S() {
        k6 k6Var = new k6(getContext());
        this.a0 = k6Var;
        k6Var.a.setOnClickListener(new a(this, 18));
        hv hvVar = this.X;
        if (hvVar != null) {
            this.a0.a(hvVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final org.telegram.ui.Components.pm0 x(org.telegram.ui.Components.qm0 qm0Var) {
        return new gv(this);
    }
}
